package io.yaktor.ui

import io.yaktor.conversation.Agent
import org.eclipse.emf.ecore.EObject

class Utils {
  static def Agent findAgent(EObject o){
    if(o instanceof Agent){
      o as Agent;
    } else if (o.eContainer != null) {
      o.eContainer.findAgent
    } else {
      null
    }
  }
}
