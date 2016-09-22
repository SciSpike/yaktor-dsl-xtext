package io.yaktor.generator.js

import io.yaktor.conversation.Agent
import io.yaktor.conversation.Conversation
import io.yaktor.conversation.Event
import io.yaktor.conversation.State
import io.yaktor.conversation.StateMachine
import io.yaktor.conversation.Transition
import java.util.HashSet
import java.util.LinkedList
import java.util.Set
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.EOperation
import org.eclipse.emf.common.util.EList
import java.lang.reflect.InvocationTargetException
import org.eclipse.emf.common.notify.Notification
import org.eclipse.emf.common.util.BasicEList
import io.yaktor.conversation.PrivatePubSub
import io.yaktor.conversation.PubliclySubscribable

class JsExtensions {
  
  static def getParent(Event event) {
    switch event {
      PrivatePubSub: event.transition.toState.parent.parent
      PubliclySubscribable: event.parent
    }
  }
  static def getEventLabel(Event event) {
    var tAgent = event.parent
    
    var tConversation = tAgent.parent
    '''
    «tConversation.name».«tAgent.name»::«event.name»'''
  }
  
  static def allStates (StateMachine sm){
    if (sm.initialTransition != null) {
      var allStates = new LinkedList<State>
      var ss = new SimpleState
      ss.parent=sm
      var iT = sm.initialTransition
      ss.transitions.add(iT)
      allStates.add(ss)
      allStates.addAll(sm.states)
      return allStates
    } else {
      return sm.states
    }
  }

  static def getEventDescription(Event event, Agent agent, Conversation myConversation) {
    var eAgent = event.parent
    var eConversation = eAgent.parent
    '''«IF eAgent != agent»«IF eConversation != myConversation»«eConversation.name».«ENDIF»«eAgent.name».«ENDIF»«event.
      name»'''
  }

  static def getDescription(Transition t) {
    '''«t.causeDescription» -> «t.toState.name»«t.triggerDescription»'''
  }

  static def getTriggerDescription(Transition t) {
    var agent = t.toState.parent.parent
    var myConversation = agent.parent
    var triggers = t.triggers ?: t.exTriggers
    '''«IF triggers != null» > «triggers.getEventDescription(agent, myConversation)»«ENDIF»'''
  }

  static def getCauseDescription(Transition t) {
    var agent = t.toState.parent.parent
    var myConversation = agent.parent
    var causedBy = t.causedBy ?: t.exCausedBy
    '''«causedBy.getEventDescription(agent, myConversation)»'''
  }

  static def Iterable<Agent> getReachableAgents(Conversation c) {
      var Set<Agent> reachable = new HashSet;
      for (a : c.agents) {
        a.reachableAgents(reachable)
      }
      return reachable;
  }

  static def Iterable<Agent> getReachableAgents(Agent agent) {
    var Set<Agent> reachable = new HashSet;
    for (a : agent.parent.agents) {
      a.reachableAgents(reachable)
    }
    return reachable;
  }

  static def protected void reachableAgents(Agent currentAgent, Set<Agent> reachable) {
    if (!reachable.contains(currentAgent)) {
      reachable.add(currentAgent)
      for (imp : currentAgent.parent.importedAgents) {
        imp.agent.reachableAgents(reachable)
      }
    }
  }
}
class SimpleState implements State {
  private var transitions = new BasicEList<Transition>
  private var StateMachine sm;
  override getName() {
    return "null"
  }
  
  override getParent() {
    return sm
  }
  
  override getTransitions() {
    return transitions
  }
  
  override isJoin() {
    return false
  }
  
  override isRequiresExecution() {
    return false
  }
  
  override setJoin(boolean value) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub")
  }
  
  override setName(String value) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub")
  }
  
  override setParent(StateMachine value) {
    sm = value;
  }
  
  override setRequiresExecution(boolean value) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub")
  }
  
  override eAllContents() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub")
  }
  
  override eClass() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub")
  }
  
  override eContainer() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub")
  }
  
  override eContainingFeature() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub")
  }
  
  override eContainmentFeature() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub")
  }
  
  override eContents() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub")
  }
  
  override eCrossReferences() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub")
  }
  
  override eGet(EStructuralFeature feature) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub")
  }
  
  override eGet(EStructuralFeature feature, boolean resolve) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub")
  }
  
  override eInvoke(EOperation operation, EList<?> arguments) throws InvocationTargetException {
    throw new UnsupportedOperationException("TODO: auto-generated method stub")
  }
  
  override eIsProxy() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub")
  }
  
  override eIsSet(EStructuralFeature feature) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub")
  }
  
  override eResource() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub")
  }
  
  override eSet(EStructuralFeature feature, Object newValue) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub")
  }
  
  override eUnset(EStructuralFeature feature) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub")
  }
  
  override eAdapters() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub")
  }
  
  override eDeliver() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub")
  }
  
  override eNotify(Notification notification) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub")
  }
  
  override eSetDeliver(boolean deliver) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub")
  }
  
}
