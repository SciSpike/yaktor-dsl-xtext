package io.yaktor.generator.umldoc

import io.yaktor.conversation.Agent
import io.yaktor.conversation.State
import io.yaktor.conversation.StateMachineType
import io.yaktor.conversation.Transition

import static extension io.yaktor.generator.js.JsExtensions.*
import io.yaktor.conversation.Decision
import io.yaktor.conversation.Join
import java.util.HashSet

class PlantUMLGenerator {

  static def label(Agent agent) {
    '''«agent.parent.name»_«agent.name»'''
  }

  def genUmlStateDiagram(Agent a) {
    '''
		[plantuml, "uml_«a.name»"]
		------
		@startuml
		state «a.name» {
		«FOR s : a.stateMachine.states.sortBy[s | s.name]»
			«s.genStateDef»
		«ENDFOR»
		«IF a.stateMachine.initialState != null»
			[*] --> «a.stateMachine.initialState.name»
		«ENDIF»
		«IF a.stateMachine.initialTransition != null»
			[*] --> «a.stateMachine.initialTransition.toState.name» : «a.stateMachine.initialTransition.expandTransitionLabel»
		«ENDIF»
		«FOR t : a.stateMachine.eAllContents.filter(Transition).filter[t | t.eContainer != a.stateMachine].toList.sortBy[t | t.causedBy + t.toState.name]»
			«(t.eContainer as State).name» --> «t.toState.name»
		«ENDFOR»
		«IF StateMachineType.FINITE.equals(a.stateMachineType)»
			«FOR s : a.stateMachine.states.filter[s | s.transitions == null || s.transitions.empty]»
				«s.name» --> [*]
			«ENDFOR»
		«ENDIF»
		}
		
		@enduml
		------
		
    '''
  }
  def genStateDef(State s) {'''
  	state «s.name»«IF s instanceof Decision» <<Choice>>«ELSEIF s instanceof Join» <<Join>>«ENDIF»
  '''
  }
  def generateFocusedStateGraph(State s) {'''
	
	[plantuml, "uml_«s.name»"]
	------
	@startuml
	«s.genStateDef»
	«FOR os : s.adjecentStates»
		«os.genStateDef»
	«ENDFOR»
	«FOR t: s.transitions.sortBy[t | t.causeDescription + t.toState.name]»
		«IF t.toState != s»
			«s.name» --> «t.toState.name» : «t.expandTransitionLabel»
		«ENDIF»
	«ENDFOR»		
	@enduml
	------
	
  '''	
  }

  def expandTransitionLabel(Transition t) {
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
  def getAdjecentStates(State s) {
  	var otherStates = new HashSet<State>()
  	for (t : s.transitions) {
  		if (t.toState != s) {
  			otherStates.add(t.toState)
  		}
  	}
  	return otherStates
  }


}
