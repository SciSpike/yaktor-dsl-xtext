package io.yaktor.generator.js

import io.yaktor.conversation.Agent
import io.yaktor.conversation.Event
import io.yaktor.conversation.PrivatePubSub
import io.yaktor.conversation.PublishableByMe
import io.yaktor.conversation.State
import io.yaktor.types.Projection
import java.util.HashMap
import java.util.LinkedList
import java.util.List

import static extension io.yaktor.generator.js.JsExtensions.*
import static extension io.yaktor.generator.js.JsTypesExtensions.*
import static extension io.yaktor.generator.util.CommentExtractorExtensions.*

class JsGgpGenerator {
  /*
   * This is a stub def.js file to be used if you have nothing better yet.
   */
  def genRoot(String name) {
    '''
      var util = require('util');
      var my = module.exports = require("./«name».gen.js");
      util._extend(my,{
        
      });
    '''
  }

  def genAgentIndex(Agent agent) {
    var c = agent.parent;
    var cName = c?.name;
    '''
      var async = require('async');
      var yaktor = require("yaktor");
      var AgentConversation = require('mongoose').model("AgentConversation");
      var path = require('path');
      var logger = require('yaktor/logger')
      var my = module.exports= {
        init: function(meta,callback){
          var iAc = null;
          var conversationId = meta.conversationId;
          var agentConversations={};
          var agent = "«cName».«agent.name»";
          var a = new AgentConversation({
            conversationId:require("node-uuid").v1(),
            agentDataId:meta.agentDataId,
            disposition:"1",
            agent:agent,
            state:my.initialState || "null"
          });
          a.save(function(err,data){
            if (err && err.message.search("duplicate")>=0) {
              logger.warn("failed to init conversation as one is already present %s",JSON.stringify(a));
              err=null;
            } else if (err){
              return logger.error(err.stack);
            }
            
            AgentConversation.findOne({agentDataId:meta.agentDataId,
              disposition:"1",
              agent:agent},function(err, a) {
                agentConversations[agent] = a;
                callback(agentConversations);
              });
          });              
        },
        name:"«cName».«agent.name»",
        conversationName:"«cName»",
        isConnectable:«agent.projection!=null»,
        /*
         * specify an auth function
         * args (user, event, meta, reqData, cb)
         */
        messageAuth:null,
        internalEvents:[
          «FOR e : agent.events.filter(PrivatePubSub) SEPARATOR ','»
            "«e.eventLabel»"
          «ENDFOR»
        ],
        transitionEvents: {
          «var daMap = agent.stateMachine.allStates.fold(new HashMap<Event,List<State>>,[map,state|state.transitions.forEach[tran|
            var cause = tran.causedBy?:tran.exCausedBy;
            var set = map.get(cause);
            if(set == null){
              set = new LinkedList<State>
              map.put(cause,set)
            }
            set.add(state)
          ];map;])»
          «FOR entry: daMap.entrySet.sortWith[e1,e2|e1.key.eventLabel.toString().compareTo(e2.key.eventLabel.toString())] SEPARATOR ','»
            «var e = entry.key»
            "«e.getEventDescription(agent, c)»":{
              label: "«e.eventLabel»",
              states: [
                «FOR state:entry.value SEPARATOR ','»
                  "«state.name»"
                «ENDFOR»
              ] 
            }
          «ENDFOR»
        },
        states:require(path.join(__dirname,"lib","states.js")),
        «IF agent.stateMachine.initialState != null»initialState: "«agent.stateMachine.initialState.name»"«ENDIF»
      };
    '''
  }


  def qName(Projection t) {
    t.fullName
  }

  def genStates(Agent agent) {
    '''
      (function(){
        "use strict";
        var util = require('util');
        var my = module.exports = require("./states.gen.js");
        util._extend(my,{
          
        });
        «IF agent.stateMachine != null && agent.stateMachine.allStates != null && agent.stateMachine.states.size > 0»
          «FOR state : agent.stateMachine.allStates.sortBy[state|state.name]»
            «IF state.requiresExecution»
              «state.comments»
              my.«state.name».on=function(meta,data,done){
                var results = {«FOR name : state.transitions.filter[trans|trans.causedBy != null && trans.causedBy instanceof PublishableByMe].map[trans|trans.causedBy.name] SEPARATOR ','»"«name»":"«name»"«ENDFOR»};
                util.deprecate(function(){},"XXX: Missing Business Logic at «agent.parent.name».«agent.name».«state.name»")();
                done(null,data,Object.keys(results)[0]);
              };
            «ENDIF»
            «FOR trans : state.transitions.filter[trans|trans.requiresExecution].sortBy[trans|var trigger = trans.triggers ?: trans.exTriggers;
          (trans.causedBy ?: trans.exCausedBy).name + " " +
            if (trigger != null) {
              trigger.name
            } else {
              ""
            }]»
              «var cause = trans.causedBy ?: trans.exCausedBy»
              /**
              «FOR line : trans.bareComments AFTER ' *\n'»
                «" "»* «line»
              «ENDFOR»
               * While in «state.name».
               * «trans.description»
               */
              my.«state.name».transitions["«cause.getEventDescription(agent, agent.parent)»"].handler=function(causedByEventName,meta,data,done){
                util.deprecate(function(){},"XXX: Missing Business Logic at «trans.description»")();
                done(null,data);
              };
            «ENDFOR»
          «ENDFOR»
        «ENDIF»
      })();
    '''
  }
  
  def genUserFile(String name) {
    '''
      (function(){
        "use strict";
        var util = require('util');
        var my = module.exports = require("./«name».gen.js");
        util._extend(my,require("./«name».def.js"));
      })();
    '''
  }
  
}
