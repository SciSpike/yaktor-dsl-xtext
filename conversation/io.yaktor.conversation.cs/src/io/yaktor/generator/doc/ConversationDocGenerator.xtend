package io.yaktor.generator.doc

import com.google.inject.Inject
import io.yaktor.conversation.Agent
import io.yaktor.conversation.Conversation
import io.yaktor.conversation.Event
import io.yaktor.conversation.PublishableByMe
import io.yaktor.conversation.State
import io.yaktor.conversation.SubscribableByMe
import io.yaktor.conversation.SubscribableByOthers
import io.yaktor.conversation.Transition
import io.yaktor.generator.dot.DotGenerator
import java.util.HashMap
import java.util.HashSet
import java.util.Map

import static io.yaktor.generator.dot.DotGenerator.*

import static extension io.yaktor.generator.util.CommentExtractorExtensions.*
import io.yaktor.types.Projection
import io.yaktor.generator.umldoc.PlantUMLGenerator

class ConversationDocGenerator {
  @Inject DotGenerator dotGen
  @Inject PlantUMLGenerator umlGen

  static def label(Agent agent) {
    '''«agent.parent.name»_«agent.name»'''
  }

  def genConversationDoc(Conversation c) {'''
	= Conversation «c.name»

	:author: Yaktor
	:doctype: book
	:toc:
	:icons:
	:data-uri:
	:lang: en
	:encoding: UTF-8

	== Introduction

	This file describes the conversation named «c.name».
	We will describe the conversation primarily by discussing the various agents and their state models.

	«c.bareComments.join('\n')»

	.Overview diagram for «c.name»

	«dotHeader("conversation_" + c.name)»
	«dotGen.genConversationDiagram(c)»
	«dotFooter»

	«c.genConversationObject»

	«c.genEventTypesUsed»

	«var agents = c.agents.sortBy[a|a.name]»
  	«FOR a : agents»

		== Agent: «a.name»

		=== Introduction

		«a.bareComments.join('\n')»

		=== Relevant events for «a.name»
		«a.genEventTable»

		=== Behavior for «a.name»

		«IF !a.stateMachine.bareComments.empty»
			«a.stateMachine.bareComments.join('\n')»

		«ENDIF»

		=== States for «a.name»
		«umlGen.genUmlStateDiagram(a)»

		«a.genStateEventTable»

		«var states = a.stateMachine.states.sortBy[s|s.name]»
		«FOR s : states»
		==== State: «a.name»::«s.name»

		«IF !s.bareComments.empty»
			«s.bareComments.join('\n')»

		«ENDIF»
		«IF s.transitions.empty»
			The «s.name» state is an end state. That means, that the «a.name» agent will not participate in the conversation «c.name» when it enters this state.
		«ELSE»
			The following diagram shows the possible transitions that «a.name» may take out of the state «s.name».

			«umlGen.generateFocusedStateGraph(s)»

			The above diagram simple states that the «a.name», when in the state +«s.name»+, will react to the following events:

			«var transitions = s.transitions.sortBy[t|t.transitionLabel]»
			«FOR t : transitions»
				+«t.transitionLabel»+::
				  «IF s == t.toState»Does not change the the state.«ELSE»Changes the state to +«t.toState.name»+.«ENDIF»
				  «IF t.triggers != null» When making this transition, the «a.name» will produce the event +«t.triggers.name»+ that may be subscribed to by other agents.«ENDIF»
				  «t.bareComments.join('\n')»
			«ENDFOR»
		«ENDIF»

		«ENDFOR»
  	«ENDFOR»
  '''
  }

  def genConversationObject(Conversation c) {'''
	== Conversation Types

	All conversations are held together by a conversation object.
	The conversation object is defined to be of a specified type.

	«var cts = c.allConversationTypes.sortBy[e|e.name]»
	«IF cts.empty»
	*No conversation types have been sepcified for the conversation +«c.name»+.
	«ELSEIF cts.size == 1»
	«var theCT= cts.iterator.next»
	All agents specified for the conversation converses over the same type +«theCT.name»+.

	«theCT.name»::
		«IF theCT.bareComments.empty»No documenation provided.«ELSE»«theCT.bareComments.join('\n')»«ENDIF»
	«ELSE»
	The conversation +«c.name»+ converses over multiple kinds of objects.
	This requires that the conversation types can be derived from each other.
	It is up to the programmer to ensure that such a derivation can be achived.

	«FOR theCT : cts»
	«theCT.name»::
		«IF theCT.bareComments.empty»No documenation provided.«ELSE»«theCT.bareComments.join('\n')»«ENDIF»
	«ENDFOR»
	«ENDIF»

  	'''
  }
  def genEventTypesUsed(Conversation c) {'''
  	«var ets = c.allEventTypes.sortBy[e|e.name]»
  	== Event Types

  	«IF ets.empty»
  	None of the agents fire events containing information.
  	«ELSE»
  	The following data type«IF ets.size>1»s are«ELSE» is«ENDIF» used to carry information along with the events.
  	In this section we'll simply list them with the documentation provided in the +yc+ files.
  	For further details (that is, for full schema and documenation of the individual fields), see the implementation documentation.

  	«FOR et : ets»
  		«et.name»::
  			«IF et.bareComments.empty»No documenation provided.«ELSE»«et.bareComments.join('\n')»«ENDIF»
  	«ENDFOR»
  	«ENDIF»

  '''
  }
  def genStateDiagram(Agent a) {'''
	.State Model for agent «a.name»

	'''
  }

  def CharSequence genFocusedStateDiagram(Agent a, State s) {'''
	.Focused State Model for agent «a.name»
	«dotHeader("fsm_" + a.name + "_" + s.name)»
	«generateFocusedStateGraph(s)»
	«dotFooter»
	'''
  }

  def genEventTable(Agent a) {'''
	.Events defined by «a.name»

	[cols="1,1,1,3", options="header"]
	|===================================================
	|Kind|Name|Datatype|Description
	«var events = a.events.sortBy[e|e.name]»
	«FOR e : events»
		|«e.kind»|«e.name»|«IF e.refType != null»«e.refType.name»«ENDIF»|«e.bareComments.join('\n')»
	«ENDFOR»
	|===================================================
	«var ede = a.externallyUsedEvents.sortBy[e|e.name]»

	«IF ede.empty»
		+«a.name»+ does not depend on any externally published events.
	«ELSE»
		.Events subscribed to by «a.name»

		[options="header"]
		|===================================================
		|External agent|Name|Datatype
		«FOR e : ede»
			|«e.parent.name»|«e.name»|«IF e.refType != null»«e.refType.name»«ENDIF»
		«ENDFOR»
		|===================================================
	«ENDIF»
  '''}

  def genStateEventTable(Agent a) {'''
  	«var states = a.stateMachine.states.sortBy[s|s.name]»
	«var m = a.collectTransitionMatrix»
	«var keyList = m.keySet.sortBy(e|e.name)»
	«var columnCount = states.size»
	.Event-State matrix for «a.name»
	[options="header", cols="header«FOR i : 1..columnCount»,^«ENDFOR»"]
	|===================================================
	|Events \ States«FOR s : states»|«s.name»«ENDFOR»
	«FOR e : keyList»
		|«e.name»«FOR s :states»|«IF m.get(e).containsKey(s)»«m.get(e).get(s).toState.name»«ENDIF»«ENDFOR»
	«ENDFOR»
	|===================================================

  '''
  }

  def collectTransitionMatrix(Agent a) {
  	var transitions = new HashMap<Event, Map<State,Transition>>()
  	for (s : a.stateMachine.states) {
		for (t : s.transitions) {
			if (!transitions.containsKey(t.rootEvent)) {
				transitions.put(t.rootEvent, new HashMap<State, Transition>());
			}
			transitions.get(t.rootEvent).put(s, t);
 	 	}
  	}
  	return transitions
  }

  /**
   * The asciidoc requires a particular header to render a graphviz
   * picture. What it does is to generate a png file. You can
   * specify the name of this file, or you can let asciidoc
   * generate the name
   */
  static def dotHeader(String picName) {'''
	["graphviz", «IF (picName != null)»"«picName»", «ELSE» "",«ENDIF»"png"]
	---------------------------------------------------------------------
  '''
  }
  static def dotFooter() {'''
	---------------------------------------------------------------------
  '''}

  def getKind(Event e) {
  	var retVal = ""
  	if (e instanceof SubscribableByMe) {
  		retVal = "Internal"
  	}
  	else if (e instanceof PublishableByMe) {
  		retVal = "Publishable"
  	}
  	else if (e instanceof SubscribableByOthers) {
  		retVal = "Subscribable"
  	}
  	return retVal
  }

  def getExternallyUsedEvents(Agent a) {
  	var externalEvents = new HashSet<SubscribableByOthers>()
  	for (s : a.stateMachine.states) {
  		for (t : s.transitions) {
  			if (t.exCausedBy != null) {
  				externalEvents.add(t.exCausedBy)
  			}
  		}
  	}
  	return externalEvents;
  }
  def getTransitionLabel(Transition t) {
  	if (t.causedBy != null) {
  		return t.causedBy.name
  	}
  	else if (t.triggers != null) {
  		return t.triggers.name
  	}
  	else if (t.exCausedBy != null) {
  		return t.exCausedBy.parent.name + "::" + t.exCausedBy.name
  	}
  	else if (t.exTriggers != null) {
  		return t.exTriggers.parent.name + "::" + t.exTriggers.name
  	}
  	else {
  		return "Transition not known"
  	}
  }
  def getRootEvent(Transition t) {
  	if (t.causedBy != null) {
  		return t.causedBy
  	}
  	else if (t.triggers != null) {
  		return t.triggers
  	}
  	else if (t.exCausedBy != null) {
  		return t.exCausedBy
  	}
  	else if (t.exTriggers != null) {
  		return t.exTriggers
  	}
  	else {
  		return null
  	}
  }
  def getAllConversationTypes(Conversation c) {
  	var retVal = new HashSet<Projection>();
  	for (a : c.agents) {
  		if (a.projection != null) {
  			retVal.add(a.projection)
  		}
  	}
  	return retVal
  }

  def getAllEventTypes(Conversation c) {
  	var retVal = new HashSet<Projection>()
  	for (a : c.agents) {
  		for (e : a.events) {
  			if (e.refType != null) {
  				retVal.add(e.refType)
  			}
  		}
  	}
  	return retVal
  }
}
