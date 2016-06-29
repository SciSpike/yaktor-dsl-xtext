package io.yaktor.generator.js

import io.yaktor.access.RestAccess
import io.yaktor.conversation.Agent
import io.yaktor.conversation.Conversation
import io.yaktor.conversation.PrivatePubSub
import io.yaktor.conversation.PublishableByMe
import io.yaktor.conversation.State
import io.yaktor.domain.DomainFactory
import io.yaktor.domain.Entity
import java.util.HashMap
import java.util.LinkedList
import java.util.List

import static extension io.yaktor.generator.util.CommentExtractorExtensions.*
import static extension io.yaktor.generator.dot.DotGenerator.*
import static extension io.yaktor.generator.js.JsData.*
import static extension io.yaktor.generator.js.JsExtensions.*
import static extension io.yaktor.generator.js.JsSchema.*
import static extension io.yaktor.generator.js.JsTypesExtensions.*

class JsGenerator {
  static val Entity EMPTY_TYPE = {
    var e =DomainFactory.eINSTANCE.createEntity
    e.model = DomainFactory.eINSTANCE.createDomainModel
    e
  }
  
  def genRoot(Conversation c,String subPath) {
    '''
      var path = require("path");
      
      var my = module.exports = {
        name:"«c.name»",
        agents : {
          «var agents = c.reachableAgents.sortBy[agent|agent.name]»
          «FOR agent : agents SEPARATOR ','»
            «var cName = agent.parent.name»
            "«cName».«agent.name»": require(path.resolve("«subPath»","«agent?.parent?.name»","«agent.name»"))
          «ENDFOR»
        }
      };
    '''
  }


  def eventName(State state) {
    var agent = state?.parent?.parent
    if(agent == null){
      return state.name
    }
    var conversation = agent.parent
    '''«conversation.name».«agent.name»:state:«state.name»'''
  }

  def genStates(Agent agent) {
    '''
      «var myConversation = agent.parent»
      var my = module.exports = {
        «FOR s : agent.stateMachine.allStates SEPARATOR ','»
          «s.name» : {
            name : "«s.name»",
            transitions : {
              «FOR t : s.transitions SEPARATOR ','»
                «var causedBy = t.causedBy ?: t.exCausedBy»
                «var triggers = t.triggers ?: t.exTriggers»
                "«causedBy.getEventDescription(agent, myConversation)»" : {
                  on : "«causedBy.getEventLabel»",
                  «IF t.fieldMapping != null»
                    «var rootP = t.fieldMapping.rootProjection»
                    mapping: function(meta, data) { 
                      return «IF causedBy!= null && rootP == causedBy.refType»data«ELSE»meta.agentData«ENDIF».«t.fieldMapping.fullName»;
                    },
                  «ENDIF»
                  handler:null,
                  get to () { return my.«t.toState.name»;},
                  causeName: "«t.causeDescription»",
                  «IF triggers != null»
                    triggers : "«triggers.getEventLabel»",
                    triggerName : "«triggers.getEventDescription(agent,myConversation)»",
                  «ENDIF»
                  description : "«t.description»"
                }
              «ENDFOR»
            }
          }
        «ENDFOR»
      };
    '''
  }

  def genHtmlTest(Conversation c) {
    var agents = c.reachableAgents.sortBy[agent|agent.name]
    '''
      <head>
        <style>
          .graph svg {
            width:100%;
            height:500px;
          }
          .graphContainer {height:100%;}
          .buttonContainer { vertical-align:top;width:300px;}
          .agent {border: solid black 1px; width:100%;}
        </style>
      </head>
      <script src="/libs/resources/resources.js"></script>
      <script src="/libs/resources/build.js"></script>
      <script src="/libs/resources/libs.js"></script>
      <script src="/libs/resources/viz.js"></script>
      <script>
        require("jquery");
        var token = require('qs').parse(location.hash.substr(1)).access_token;
        var sessionId = "<%=sId%>";
        var tokenFunction = function(cb){
          cb(null,token);
        };
        var client;
        var EventEmitter = require('emitter-component');
        var emitter = new EventEmitter();
      </script>
      <table>
        <tr>
          <td><button name="connect" onclick="DoConnect()">connect</button></td>
          <td><button name="initAll" onclick="DoInitAll()">Init All</button></td>
          
          <td><a href="#" onclick="location.href='/auth/authorize?response_type=token&client_id=1&redirect_uri='+location.href">Login</a></td>
          
        </tr>
      </table>
      «FOR agent : agents.filter[agent|agent.projection!=null]»
        <script type="text/vnd.graphviz" id="«agent.parent.name»_«agent.name»_diag">
          «agent.genAgentDiagram»
        </script>
        <script>
        
        (function(){
          var agentApi = require('«agent.parent.name»/«agent.name»');
          var socketApi = require('socketApi');
          var inited=false;
          var doRender = function(state) {
            $('#«agent.parent.name»_«agent.name»_diag_target').html(Viz($('#«agent.parent.name»_«agent.name»_diag').html().replace('XXX'+state+'XXX=""',"style=filled, fontcolor=white"), 'svg'))
          }
          var eventMatrix= agentApi.stateMatrix;
          DoConnect = function(){
            client= socketApi.connect(sessionId,tokenFunction,true,function(){});
            client.on('message', function (topic, payload) {
              var body = JSON.parse(payload.toString());
              emitter.emit(topic, body);
             });
          };
          DoDisconnect =function() {
            socketApi.disconnect(sessionId);
          };
          DoInitAll = function() {
            $("[name=\"init\"]").click();
          }
          «agent.name»DoInit = function() {
            var json = JSON.parse($('#«agent.parent.name»_«agent.name»_init_input').val());
            if(!inited){
              inited=true;
              for(var onV in eventMatrix){
                (function(on){
                  emitter.on(on.replace(/:/g,"/")+"/"+json._id,function(body){
                    var stateName =on.replace(/.*:state:/,"");
                    doRender(stateName);
                    $(".eventButton.«agent.parent.name»_«agent.name»").attr("disabled", "disabled");
                    for(var e in eventMatrix[on]){
                      $(".eventButton.«agent.parent.name»_«agent.name»." +e).removeAttr("disabled");
                    }
                  });
                })(onV);
              }
            }
            client.subscribe('«agent.parent.name».«agent.name»/state/+/'+json._id,{qos:2});
          }
          «agent.name»DoEvent = function(eventName){
            var initJson = JSON.parse($('#«agent.parent.name»_«agent.name»_init_input').val());
            var json = JSON.parse($('#«agent.parent.name»_«agent.name»_'+eventName+'_input').val());
            client.publish('«agent.parent.name».«agent.name»/'+eventName,JSON.stringify({agentData:initJson,data:json}));
          }
        })();
        </script>
        <table class="agent" id="«agent.parent.name»_«agent.name»">
          <tr>
            <td class="buttonContainer">
              <table>
                <tr><th colspan="3">«agent.parent.name» «agent.name»</th></tr>
                <tr>
                  <td>JSON:</td>
                  <td><textArea id="«agent.parent.name»_«agent.name»_init_input">
                  «var entity = agent.projection.entity»
                  «IF entity == null»
                    «agent.projection.entity =EMPTY_TYPE »
                  «ENDIF»
«IF agent.projection != null»«agent.projection.genData»«ENDIF»</textArea></td>
                  «IF entity != agent.projection.entity»
                    «agent.projection.entity =entity»
                  «ENDIF»
                  <td><button name="init" onclick="«agent.name»DoInit()">init</button>
                </tr>
                «FOR event : agent.events.filter(PrivatePubSub)»
                  <tr>
                    <td>JSON:</td>
                    <td><textArea id="«agent.parent.name»_«agent.name»_«event.name»_input">
«event.genData»</textArea></td>
                    <td><button class="eventButton «agent.parent.name»_«agent.name» «event.name»" onclick="«agent.
        name»DoEvent('«event.name»')">«event.name»</button>
                  </tr>
                «ENDFOR»
              </table>
            </td>
            <td class="graphContainer">
              <div class="graph" id="«agent.parent.name»_«agent.name»_diag_target">
              </div>
            </td>
          </tr>
        </table>
      «ENDFOR»
    '''
  }
  
  

  def genTerminalStatesHash (Agent agent){
    '''
      {
        «FOR s : agent.stateMachine.states.filter[state|state.transitions.empty] SEPARATOR ','»
          "«s.eventName»":true
        «ENDFOR»
      }
    '''
  }
  @Deprecated
  def genStateMatrix(Agent agent){
    '''
    «FOR s : agent.stateMachine.allStates SEPARATOR ','»
      "«s.eventName»":{
        
        «IF !s.requiresExecution»
          «FOR t : s.transitions.filter[t|t.causedBy != null && t.causedBy instanceof PublishableByMe] SEPARATOR ','»
            "«t.causedBy.name»":{
              «IF t.causedBy.refType != null»
                "type":{
                  «t.causedBy.refType.schemafy»
                },
              «ENDIF»
              "subPath":"/«t.causedBy.name»"
            }
          «ENDFOR»
        «ENDIF»
      }
    «ENDFOR»
    '''
  }
  def genStateView(Agent agent){
    '''
    «FOR s : agent.stateMachine.allStates.sortWith[s1,s2|(s1.name?:"null").compareTo(s2.name?:"null")] SEPARATOR ','»
      {
        name:"«s.name»",
        endpoint:"ws:///«s.eventName»",
        actions:{
          «IF !s.requiresExecution»
            «FOR t : s.transitions.filter[t|t.causedBy != null && t.causedBy instanceof PublishableByMe].sortWith[t1,t2|t1.description.toString().compareTo(t2.description.toString())] SEPARATOR ','»
              "«t.causedBy.name»":{
                «IF t.causedBy.refType != null»
                  "type":{
                    «t.causedBy.refType.schemafy»
                  },
                «ENDIF»
                "subPath":"/«t.causedBy.name»"
              }
            «ENDFOR»
          «ENDIF»
        }
      }
    «ENDFOR»
    '''
  }
  def genValidators(Agent agent){
//    '''
//    «FOR event : agent.events.filter[event|
//      event instanceof InternalEvent && event instanceof Subscribable && event.definedType != null] SEPARATOR ','»
//      tv4.addSchema('«event.definedType.alias»',«event.definedType.schemafy»);
//    «ENDFOR»
//    «FOR type : agent.definedTypes»
//      tv4.addSchema('«type.fullName»',«type.schemafy»);
//    «ENDFOR»
//    «FOR td : agent.dependencies.filter(TypeDependency)»
//      «IF td.importedType instanceof Projection»
//        «var type = td.importedType as Projection»
//        tv4.addSchema('«type.fullName»',«type.schemafy»);
//      «ENDIF»
//    «ENDFOR»
//    '''
  }
  def genAllInOne(Agent agent){
    '''
«««    var tv4 = require("tv4").tv4;
    
    module.exports={
      stateMatrix:{
        «agent.genStateMatrix»
      },
      terminalStates:«agent.genTerminalStatesHash»
    };
    '''
  }
  def genAgentList(Entity e, Conversation c) {
    '''
    «FOR a : c.reachableAgents.filter[agent| agent?.projection?.entity == e] SEPARATOR ',' »
      "«c.name».«a.name»"
    «ENDFOR»
    '''
  }
  
  def genSwagger(Conversation c,String server) {
    var s = new HashMap
    '''
    {
      "swagger": "2.0",
      "info": {
        "title": "«server?:'Default'»",
        "description": "Services served by the «server?:'DEFAULT'» server.",
        "version": "1.0.0"
      },
      "host": "<%=host %>",
      "schemes": [
        "<%=proto %>"
      ],
      "basePath": "/",
      "produces": [
        "application/json"
      ],
      "tags": [{
        "name": "«c.name»",
        "description": "«c.name» API"
      }],
      "paths":{
        «FOR r:c.restServices.filter[r | r.server == server] SEPARATOR','»
          «IF r.server == server»
          «
          {
            s.putAll(new JsSchema2(r.refType).docs)
            ''
          }»
          «val a = r.methods.fold(new HashMap<String,List<RestAccess>>,[ss,m|{
            var path = r.url+m.swaggerPath;
            var ms = ss.get(path)
            if(ms == null){
              ms = new LinkedList
              ss.put(path,ms)
            }
            ms.add(m)
            ss
          }])»
          «FOR e:a.entrySet SEPARATOR ','»
          "«e.key»":{
            «FOR m : e.value SEPARATOR ','»
              "«m.swaggerMethod»":{
               "tags": ["«c.name»"],
                «var description = r.bareComments»
                «IF description!=null && description.length>0»
                  "description":"«description.join('\u2424').replace('"','\\"')»",
                «ENDIF»
                "security":[
                  {"implicit":["*"]}
                ],
                "produces": [
                  "application/json"
                ],
                "consumes": [
                  "application/json"
                ],
                "parameters": [
                  «IF m != RestAccess.FIND && m!=RestAccess.POST »
                    {
                      "name":"id",
                      "in":"path",
                      "required":"true",
                      "type":"string"
                    }«IF m == RestAccess.PUT»,«ENDIF»
                  «ENDIF»
                  «IF m == RestAccess.PUT || m == RestAccess.POST»
                    {
                      "name": "body",
                      "in": "body",
                      "required": true,
                      "schema": {
                        "$ref": "#/definitions/«r.refType.fullName»"
                      }
                    }
                  «ENDIF»
                  «IF m == RestAccess.FIND»
                    {
                      "name":"page",
                      "in":"query",
                      "type":"integer",
                      "default":1,
                      "description":"Numeric offset by pageSize of result."
                    },
                    {
                      "name":"pageSize",
                      "in":"query",
                      "type":"integer",
                      "default":10,
                      "description":"Maximum quantity of results to include per page."
                    }
                    «FOR p : s.get(r.refType.fullName).properties.entrySet BEFORE ',' SEPARATOR ','»
                      «val ref = s.get(p.value.ref)»
                      «IF ref != null && ref.typeRef == null && ref.properties.entrySet.filter[ip|ip.value.type!=null].size >0 »
                        «FOR ip :  ref.properties.entrySet.filter[ip|ip.value.type!=null]SEPARATOR ','»
                          {
                            «IF ip.value.format!=null»"format":"«ip.value.format»",«ENDIF»
                            "name":"«p.key»[«ip.key»]",
                            "in":"query",
                            «IF ip.value.description != null»
                              "description":"«ip.value.description»",
                            «ENDIF»
                            "type":"«ip.value.type.name»"
                          }
                        «ENDFOR»
                      «ELSEIF p.value.type != null»
                        {
                          «IF p.value.format!=null»"format":"«p.value.format»",«ENDIF»
                          "name":"«p.key»",
                          «IF p.value.description != null»
                            "description":"«p.value.description»",
                          «ENDIF»
                          "in":"query",
                          "type":"«p.value.type.name»"
                        }
                      «ELSE»
                        {
                          "name":"«p.key»",
                          "in":"query",
                          «IF p.value.description != null»
                            "description":"«p.value.description»",
                          «ELSEIF p.value.ref!=null»
                            "description":"an id ref",
                          «ENDIF»
                          "type":"string"
                        }
                      «ENDIF»
                    «ENDFOR»
                  «ENDIF»
                ],
                "responses": {
                  "200": {
                    "description": "«r.refType.fullName»",
                    "schema": {
                      "$ref": "#/definitions/«r.refType.fullName»"
                    }
                  },
                  "default": {
                    "description": "Unexpected error",
                    "schema": {
                      "$ref": "#/definitions/Errors"
                    }
                  }
                }
              }
            «ENDFOR»
          }
          «ENDFOR»
          «ENDIF»
        «ENDFOR»
      },
      "securityDefinitions": {
        "implicit": {
          "type": "oauth2",
          "x-clientId":"1",
          "authorizationUrl": "<%=proto %>://<%=host %>/auth/authorize",
          "flow": "implicit",
          "scopes":{"*":"All rights"}
        }
      },
      "definitions":{
        «FOR entry : s.entrySet SEPARATOR ','»
          "«entry.key»": {
            «entry.value.schemafy(false)»
          }
        «ENDFOR»
      }
    }
    '''
  }
  
  def genViewJs(Conversation c){
    '''
    module.exports={
      "«c.name»":{
        //the plural of crud is curd?
        crud:[
          «FOR v : c.views SEPARATOR ','»
            {
              name:"«v.url.replaceFirst("/","").replaceAll("/","_s_").replaceAll("\\.","_d_")»",
              "endpoint":"http://«v.backedBy.url»",
              "agents":[
                «v?.backedBy?.refType?.entity?.genAgentList(c)»
              ],
              "actions":{
                «FOR m : v.backedBy.methods.sort SEPARATOR ','»
                  "«m.name()»":{
                    "type":{
                      «v.backedBy.refType.schemafy»
                    },
                    "subPath":"«m.pathFragment»"
                  }
                «ENDFOR»
              }
            }
          «ENDFOR»
        ],
        agents:[
          «FOR agent:c.agents.sortWith[a1,a2|a1.name.compareTo(a2.name)] SEPARATOR ','»
            {
              id:"«agent.parent.name».«agent.name»",
              name:"«agent.name»_of_«agent.parent.name»",
              "endpoint":"ws:///«agent.parent.name».«agent.name»",
              "actions":{
                "init":{
                  type:{
                    «agent.projection.schemafy(true)»
                  },
                  subPath:"/init"
                }
              },
              states:[
                «agent.genStateView»
              ]
            }
          «ENDFOR»
        ]
      }
    };
    '''
  }
  def getPathFragment(RestAccess a){
    switch(a){
      case GET: '/:id'
      case PUT: '/:id'
      case DELETE: '/:id'
      case POST: ''
      case FIND: ''
    }
  }
  def getSwaggerPath(RestAccess a){
    switch(a){
      case GET: '/{id}'
      case PUT: '/{id}'
      case DELETE: '/{id}'
      case POST: ''
      case FIND: ''
    }
  }
  def getSwaggerMethod(RestAccess a){
    switch(a){
      case GET: 'get'
      case PUT: 'put'
      case DELETE: 'delete'
      case POST: 'post'
      case FIND: 'get'
    }
  }
  def genJsIndex(Conversation c){
    '''
      (function(global){
        «FOR agent : c.reachableAgents.sortBy[agent|agent.name]»
          global['«agent.parent.name»']=global['«agent.parent.name»']||{};
          global['«agent.parent.name»'].agents=global['«agent.parent.name»'].agents||{};
          global['«agent.parent.name»'].agents['«agent.name»']={
            path:"«agent.parent.name»/«agent.name»"
          };
«««          «agent.genValidators»
        «ENDFOR»
«««        «FOR type : c.definedTypes»
«««          tv4.addSchema('«type.fullName»',«type.schemafy»);
«««        «ENDFOR»
      })((typeof module !== 'undefined' && module.exports) ? exports : this);
    '''
  }
  
  def genSecurity(Agent agent) {
    '''
      module.exports={
        accessRequirement:"«agent.accessRequirement»"
      }
    '''
  }

}
