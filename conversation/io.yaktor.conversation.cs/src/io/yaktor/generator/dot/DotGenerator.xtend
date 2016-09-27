package io.yaktor.generator.dot

import io.yaktor.conversation.Agent
import io.yaktor.conversation.Conversation
import io.yaktor.conversation.PublicEvent
import io.yaktor.conversation.State
import io.yaktor.conversation.Transition
import static extension io.yaktor.generator.js.JsExtensions.*
import io.yaktor.conversation.StateMachineType
import io.yaktor.conversation.PublishableByMe
import io.yaktor.conversation.Decision

class DotGenerator {
  static val producesBackgroundColor = "#fff2f1"
  static val consumesBackgroundColor = "#bee3ff"
  static val focusColor = "#bee3ff"

  static def label(Agent agent) {
    '''«agent.parent.name»_«agent.name»'''
  }

  def genConversationDiagram(Conversation c) {
    '''
      digraph «c.name» {
        fontname="Arial";
        «var agents = c.reachableAgents.toSet.sortWith[a, b|a.name.compareTo(b.name)]»
      «FOR a : agents»
        «a.stateGraph»
      «ENDFOR»
      «FOR a : agents»
        «a.pubSubGraph»
      «ENDFOR»
      «FOR a : agents»
        «a.genTransitions»
        «a.genEvents»
      «ENDFOR»
      }
    '''
  }

  static def genAgentDiagram(Agent a) {
    '''
      digraph «a.label» {
        fontname="Arial";
        color=black;
        «a.doStates»
        «a.genTransitions»
      }
    '''
  }

  def getConversationAsHtml(Conversation c) {
    '''
      <title>«c.name»</title>
      <style>
        body {
          margin: 0 0 0 0;
          padding: 0 0 0 0;
        }
        svg {
          width:100%;
          height:100%;
        }
      </style>
      <script type='text/javascript' src='http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.2.js'></script>
      <script type='text/javascript' src="http://mdaines.github.io/viz.js/viz.js" ></script>
      <script type="text/vnd.graphviz" id="diag">
      «c.genConversationDiagram»
      </script>
      <script type='text/javascript'>
        document.write(Viz($("#diag").html(), 'svg'))
      </script>
    '''
  }

  static def doStates(Agent agent) {
    '''
      "«agent.label».start__" [label="",color="black", shape=circle, style=filled, width=.33]
      «IF agent.stateMachineType == StateMachineType.FINITE»
        "«agent.label».end__" [label="",color="black", shape=doublecircle, style=filled, width=.33]
      «ENDIF»
      «FOR s : agent.stateMachine.states»
        "«agent.label».«s.name»" [«s.expandShapeType» color=darkgreen, XXX«s.name»XXX=""]
        «IF s.transitions.empty»
          "«agent.label».«s.name»" -> "«agent.label».end__"  [arrowhead=vee]
        «ENDIF»
      «ENDFOR»
      «IF agent.stateMachine.initialState != null»
        "«agent.label».start__" -> "«agent.label».«agent.stateMachine.initialState.name»" [arrowhead=vee]
      «ENDIF»
      «IF agent.stateMachine.initialTransition != null»
        "«agent.label».start__" -> "«agent.label».«agent.stateMachine.initialTransition.toState.name»" [ label="«agent.
        stateMachine.initialTransition.expandTransitionLabel»" arrowhead=vee]
      «ENDIF»
    '''
  }
  
  static def generateFocusedStateGraph(State s) {'''
    digraph «s.name» {
    fontname="Arial";
    «s.name» [style="filled", fillcolor="«focusColor»", «expandShapeType(s)» ]
    «FOR t : s.transitions»
	    «t.toState.name» [fillcolor="white", «expandShapeType(t.toState)» ]
    «ENDFOR»
    «FOR t : s.transitions»
    	«s.name» -> «t.toState.name» [ label="«t.expandTransitionLabel»«IF t.triggers != null» ^ «t.triggers.name»«ENDIF»",arrowhead=vee]
    «ENDFOR»
    }
  '''	
  }

  static def stateGraph(Agent agent) {
    '''
      subgraph "cluster_«agent.label»" {
        color=black;
        label="«agent.label»";
        «agent.doStates»
      }
    '''
  }

  static def pubSubGraph(Agent agent) {
    var events = agent.sendables;
    '''
      «IF events.size > 0»
        subgraph "cluster_«agent.label»_e" {
          color=black;
          label="«agent.label»\nEvents";
          "«agent.label».___start.e" [label="", shape=none]
          "«agent.label».___start.e" ->
          «FOR e : events»
            "«agent.label».«e.name».e" [color=white, shape=none]
            "«agent.label».«e.name».e" [label="«agent.name».«e.name»" shape="rectangle", style="filled", color=«IF e instanceof PublishableByMe»red, fillcolor="«producesBackgroundColor»"«ELSE»blue, fillcolor="«consumesBackgroundColor»"«ENDIF»]
            "«agent.label».«e.name».e" ->
          «ENDFOR»
          "«agent.label».___end.e" [color=white, shape=none]
          "«agent.label».___end.e" [ label="",  shape=none]
        }
      «ENDIF»
    '''
  }

  static def genEvents(Agent agent) {
    '''
      «FOR s : agent.stateMachine.states»
        «FOR t : s.transitions»
          «t.genEvent(agent, '''«agent.label».«s.name»''')»
        «ENDFOR»
      «ENDFOR»
      «IF agent.stateMachine.initialTransition != null»
        «agent.stateMachine.initialTransition.genEvent(agent, '''«agent.label».start__''')»
      «ENDIF»
    '''
  }

  static def genEvent(Transition t, Agent agent, String stateLabel) {
    '''
      «IF t.causedBy != null»
        «IF t.causedBy instanceof PublicEvent»
          "«agent.label».«t.causedBy.name».e" -> "«stateLabel»" [color=blue]
        «ENDIF»
      «ENDIF»
      «IF t.exCausedBy != null»
        «var xAgent = t.exCausedBy.parent»
        "«xAgent.label».«t.exCausedBy.name».e" -> "«stateLabel»" [color=blue]
      «ENDIF»
      «IF t.triggers != null»
        «IF t.triggers instanceof PublicEvent»
          "«stateLabel»" -> "«agent.label».«t.triggers.name».e" [label="{«t.expandTransitionLabel»}", fontcolor=red, arrowhead="oboxnormal", color=red]
        «ENDIF»
      «ENDIF»
      «IF t.exTriggers != null»
        «var xAgent = t.exTriggers.parent»
        "«stateLabel»" -> "«xAgent.label».«t.exTriggers.name».e" [label="{«t.expandTransitionLabel»}", fontcolor=red, arrowhead="oboxnormal", color=red]
      «ENDIF»
    '''
  }

  static def genTransitions(Agent agent) {
    '''
      «FOR s : agent.stateMachine.states»
        «FOR t : s.transitions»
          «IF !s.isJoin || t.toState != s»
            "«agent.label».«s.name»" -> "«agent.label».«t.toState.name»" [ label="«IF s instanceof Decision»[«ENDIF»«t.
        expandTransitionLabel»«IF s instanceof Decision»]«ENDIF»",arrowhead=vee]
          «ENDIF»
        «ENDFOR»
      «ENDFOR»
    '''
  }

  static def expandShapeType(State s) {
    if (s.transitions.empty) {
      return '''label="«s.expandStateLabel»",  shape="Mrecord",'''
    } else if (s instanceof Decision) {
      return 'label="", shape="diamond",'
    }
    return '''label="«s.expandStateLabel»",  shape="Mrecord",'''
  }

  static def expandTransitionLabel(Transition t) {
    var retVal = ""
    if (t.causedBy != null) {
      retVal = retVal + t.causedBy.name
    } else if (t.exCausedBy != null) {
      retVal = retVal + t.exCausedBy.parent.name + "." + t.exCausedBy.name
    }

    //		if (t.triggers != null) {
    //			retVal = retVal + " ^ " + t.triggers.name
    //		}
    return retVal
  }

  static def expandStateLabel(State s) {
    var retVal = s.name
    return retVal
  }

}
