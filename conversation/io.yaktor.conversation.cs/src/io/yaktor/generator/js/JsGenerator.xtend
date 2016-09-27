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
    var quote = "'"
    '''
      var path = require('path')
      
      module.exports = {
        «quote»name«quote»: «quote»«c.name»«quote»,
        «quote»agents«quote»: {
          «var agents = c.reachableAgents.sortBy[agent|agent.name]»
          «FOR agent : agents SEPARATOR ','»
            «var cName = agent.parent.name»
            «quote»«cName».«agent.name»«quote»: require(path.resolve(«quote»«subPath»«quote», «quote»«agent?.parent?.name»«quote», «quote»«agent.name»«quote»))
          «ENDFOR»
        }
      }
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
    var quote = "'"
    '''
      «var myConversation = agent.parent»
      var my = module.exports = {
        «FOR s : agent.stateMachine.allStates SEPARATOR ','»
          «quote»«s.name»«quote»: {
            «quote»name«quote»: «quote»«s.name»«quote»,
            «quote»transitions«quote»: {
              «FOR t : s.transitions SEPARATOR ','»
                «var causedBy = t.causedBy ?: t.exCausedBy»
                «var triggers = t.triggers ?: t.exTriggers»
                «quote»«causedBy.getEventDescription(agent, myConversation)»«quote»: {
                  «quote»on«quote»: «quote»«causedBy.getEventLabel»«quote»,
                  «IF t.fieldMapping != null»
                    «var rootP = t.fieldMapping.rootProjection»
                   «quote»mapping«quote»: function(meta, data) { 
                      return «IF causedBy!= null && rootP == causedBy.refType»data«ELSE»meta.agentData«ENDIF».«t.fieldMapping.fullName»;
                    },
                  «ENDIF»
                  «quote»handler«quote»: null,
                  get to () {
                    return my.«t.toState.name»
                  },
                  «quote»causeName«quote»: «quote»«t.causeDescription»«quote»,
                  «IF triggers != null»
                    «quote»triggers«quote»: «quote»«triggers.getEventLabel»«quote»,
                    «quote»triggerName«quote»: «quote»«triggers.getEventDescription(agent,myConversation)»«quote»,
                  «ENDIF»
                  «quote»description«quote»: «quote»«t.description»«quote»
                }
              «ENDFOR»
            }
          }
        «ENDFOR»
      }
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
        require('jquery')
        var token = require('qs').parse(location.hash.substr(1)).access_token
        var sessionId = '<%=sId%>'
        var tokenFunction = function (cb) {
          cb(null,token)
        }
        var client
        var EventEmitter = require('emitter-component')
        var emitter = new EventEmitter()
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
        
        (function () {
          var agentApi = require('«agent.parent.name»/«agent.name»');
          var socketApi = require('socketApi');
          var inited=false;
          var doRender = function(state) {
            $('#«agent.parent.name»_«agent.name»_diag_target').html(Viz($('#«agent.parent.name»_«agent.name»_diag').html().replace('XXX'+state+'XXX=""',"style=filled, fontcolor=white"), 'svg'))
          }
          var eventMatrix= agentApi.stateMatrix
          DoConnect = function () {
            client = socketApi.connect(sessionId, tokenFunction, true, function () {})
            client.on('message', function (topic, payload) {
              var body = JSON.parse(payload.toString())
              emitter.emit(topic, body)
             })
          }
          DoDisconnect = function () {
            socketApi.disconnect(sessionId)
          }
          DoInitAll = function () {
            $('[name="init"]').click()
          }
          «agent.name»DoInit = function() {
            var json = JSON.parse($('#«agent.parent.name»_«agent.name»_init_input').val());
            if(!inited){
              inited=true;
              for(var onV in eventMatrix){
                (function(on){
                  emitter.on(on.replace(/:/g,'/')+'/'+json._id, function (body) {
                    var stateName = on.replace(/.*:state:/, '');
                    doRender(stateName);
                    $('.eventButton.«agent.parent.name»_«agent.name»').attr('disabled', 'disabled')
                    for (var e in eventMatrix[on]) {
                      $('.eventButton.«agent.parent.name»_«agent.name».' +e).removeAttr('disabled')
                    }
                  })
                })(onV)
              }
            }
            client.subscribe('«agent.parent.name».«agent.name»/state/+/'+json._id, { qos: 2 })
          }
          «agent.name»DoEvent = function(eventName){
            var initJson = JSON.parse($('#«agent.parent.name»_«agent.name»_init_input').val());
            var json = JSON.parse($('#«agent.parent.name»_«agent.name»_'+eventName+'_input').val());
            client.publish('«agent.parent.name».«agent.name»/'+eventName,JSON.stringify({ agentData: initJson, data: json}))
          }
        })()
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
«IF agent.projection != null»«agent.projection.genData('"')»«ENDIF»</textArea></td>
                  «IF entity != agent.projection.entity»
                    «agent.projection.entity =entity»
                  «ENDIF»
                  <td><button name="init" onclick="«agent.name»DoInit()">init</button>
                </tr>
                «FOR action : agent.agentPrivatelyReceivables»
                  <tr>
                    <td>JSON:</td>
                    <td><textArea id="«agent.parent.name»_«agent.name»_«action.name»_input">
«action.genData('"')»</textArea></td>
                    <td><button class="eventButton «agent.parent.name»_«agent.name» «action.name»" onclick="«agent.
        name»DoEvent('«action.name»')">«action.name»</button>
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
  
  

  def genTerminalStatesHash (Agent agent, String quote){
    '''
      {
        «FOR s : agent.stateMachine.states.filter[state|state.transitions.empty] SEPARATOR ','»
          «quote»«s.eventName»«quote»: true
        «ENDFOR»
      }
    '''
  }
  @Deprecated
  def genStateMatrix(Agent agent, String quote){
    '''
    «FOR s : agent.stateMachine.allStates SEPARATOR ','»
      «quote»«s.eventName»«quote»: {
        «IF !s.requiresExecution»
          «FOR t : s.transitions.filter[t|t.causedBy != null && t.causedBy instanceof PublishableByMe] SEPARATOR ','»
            «quote»«t.causedBy.name»«quote»: {
              «IF t.causedBy.refType != null»
                «quote»type«quote»: {
                  «t.causedBy.refType.schematize(quote)»
                },
              «ENDIF»
              «quote»subPath«quote»: «quote»/«t.causedBy.name»«quote»
            }
          «ENDFOR»
        «ENDIF»
      }
    «ENDFOR»
    '''
  }
  def genStateView(Agent agent, String quote){
    '''
    «FOR s : agent.stateMachine.allStates.sortWith[s1,s2|(s1.name?:"null").compareTo(s2.name?:"null")] SEPARATOR ','»
      {
        «quote»name«quote»: «quote»«s.name»«quote»,
        «quote»endpoint«quote»: «quote»ws:///«s.eventName»«quote»,
        «quote»actions«quote»: {
          «IF !s.requiresExecution»
            «FOR t : s.transitions.filter[t|t.causedBy != null && t.causedBy instanceof PublishableByMe].sortWith[t1,t2|t1.description.toString().compareTo(t2.description.toString())] SEPARATOR ','»
              «quote»«t.causedBy.name»«quote»: {
                «IF t.causedBy.refType != null»
                  «quote»type«quote»: {
                    «t.causedBy.refType.schematize(quote)»
                  },
                «ENDIF»
                «quote»subPath«quote»: «quote»/«t.causedBy.name»«quote»
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
    var quote = "'"
    '''
    module.exports = {
      «quote»stateMatrix«quote»: {
        «agent.genStateMatrix(quote)»
      },
      «quote»terminalStates«quote»: «agent.genTerminalStatesHash(quote)»
    }
    '''
  }
  def genAgentList(Entity e, Conversation c, String quote) {
    '''
    «FOR a : c.reachableAgents.filter[agent| agent?.projection?.entity == e] SEPARATOR ',' »
      «quote»«c.name».«a.name»«quote»
    «ENDFOR»
    '''
  }
  
  def genSwagger(Conversation c,String server) {
    var quote = '"'
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
            s.putAll(new JsSchema2(r.refType,quote).docs)
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
                  "description": "«description.join('\u2424').replace('"','\\"')»",
                «ENDIF»
                "security":[
                  {"implicit": ["*"]}
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
                      "name": "id",
                      "in": "path",
                      "required": true,
                      "type": "string"
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
                      "name": "page",
                      "in": "query",
                      "type": "integer",
                      "default": 1,
                      "description": "Numeric offset by pageSize of result."
                    },
                    {
                      "name": "pageSize",
                      "in": "query",
                      "type": "integer",
                      "default": 10,
                      "description": "Maximum quantity of results to include per page."
                    }
                    «FOR p : s.get(r.refType.fullName).properties.entrySet BEFORE ',' SEPARATOR ','»
                      «val ref = s.get(p.value.ref)»
                      «IF ref != null && ref.typeRef == null && ref.properties.entrySet.filter[ip|ip.value.type!=null].size >0 »
                        «FOR ip :  ref.properties.entrySet.filter[ip|ip.value.type!=null]SEPARATOR ','»
                          {
                            «IF ip.value.format!=null»"format": "«ip.value.format»",«ENDIF»
                            "name": "«p.key»[«ip.key»]",
                            "in": "query",
                            «IF ip.value.description != null»
                              "description": "«ip.value.description»",
                            «ENDIF»
                            "type": "«ip.value.type.name»"
                          }
                        «ENDFOR»
                      «ELSEIF p.value.type != null»
                        {
                          «IF p.value.format!=null»"format": "«p.value.format»",«ENDIF»
                          "name": "«p.key»",
                          «IF p.value.description != null»
                            "description": "«p.value.description»",
                          «ENDIF»
                          «IF p.value.items != null»
                            "items": {
                              «p.value.items.itemize(quote)» 
                            },
                          «ENDIF»
                          "in": "query",
                          "type": "«p.value.type.name»"
                        }
                      «ELSE»
                        {
                          "name": "«p.key»",
                          "in": "query",
                          «IF p.value.description != null»
                            "description": "«p.value.description»",
                          «ELSEIF p.value.ref!=null»
                            "description": "an id ref",
                          «ENDIF»
                          "type": "string"
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
          "x-clientId": "1",
          "authorizationUrl": "<%=proto %>://<%=host %>/auth/authorize",
          "flow": "implicit",
          "scopes": {
            "*": "All rights"
          }
        }
      },
      "definitions": {
        "Errors": {
          "properties": {
            "message": {
              "type": "string"
            }
          }
        } «IF !s.empty»,«ENDIF»
        «FOR entry : s.entrySet SEPARATOR ','»
          "«entry.key»": {
            «entry.value.schematize(quote)»
          }
        «ENDFOR»
      }
    }
    '''
  }
  
  def genViewJs(Conversation c){
    var quote = "'"
    '''
    module.exports = {
      «quote»«c.name»«quote»: {
        «quote»crud«quote»: [
          «FOR v : c.views SEPARATOR ','»
            {
              «quote»name«quote»: «quote»«v.url.replaceFirst("/","").replaceAll("/","_s_").replaceAll("\\.","_d_")»«quote»,
              «quote»endpoint«quote»: «quote»http://«v.backedBy.url»«quote»,
              «quote»agents«quote»: [
                «v?.backedBy?.refType?.entity?.genAgentList(c, quote)»
              ],
              «quote»actions«quote»: {
                «FOR m : v.backedBy.methods.sort SEPARATOR ','»
                  «quote»«m.name()»«quote»: {
                    «quote»type«quote»: {
                      «v.backedBy.refType.schematize(quote)»
                    },
                    «quote»subPath«quote»: «quote»«m.pathFragment»«quote»
                  }
                «ENDFOR»
              }
            }
          «ENDFOR»
        ],
        «quote»agents«quote»: [
          «FOR agent:c.agents.sortWith[a1,a2|a1.name.compareTo(a2.name)] SEPARATOR ','»
            {
              «quote»id«quote»: «quote»«agent.parent.name».«agent.name»«quote»,
              «quote»name«quote»: «quote»«agent.name»_of_«agent.parent.name»«quote»,
              «quote»endpoint«quote»: «quote»ws:///«agent.parent.name».«agent.name»«quote»,
              «quote»actions«quote»: {
                «quote»init«quote»: {
                  «quote»type«quote»: {
                    «agent.projection.schematize(true,quote)»
                  },
                  «quote»subPath«quote»: «quote»/init«quote»
                }
              },
              «quote»states«quote»: [
                «agent.genStateView(quote)»
              ]
            }
          «ENDFOR»
        ]
      }
    }
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
      (function (global) {
        «FOR agent : c.reachableAgents.sortBy[agent|agent.name]»
          global['«agent.parent.name»'] = global['«agent.parent.name»'] || {}
          global['«agent.parent.name»'].agents = global['«agent.parent.name»'].agents || {}
          global['«agent.parent.name»'].agents['«agent.name»'] = {
            path: '«agent.parent.name»/«agent.name»'
          }
«««          «agent.genValidators»
        «ENDFOR»
«««        «FOR type : c.definedTypes»
«««          tv4.addSchema('«type.fullName»',«type.schemafy»);
«««        «ENDFOR»
      })((typeof module !== 'undefined' && module.exports) ? exports : this)
    '''
  }
  
  def genSecurity(Agent agent) {
    '''
      module.exports = {
        accessRequirement: '«agent.accessRequirement»'
      }
    '''
  }

}
