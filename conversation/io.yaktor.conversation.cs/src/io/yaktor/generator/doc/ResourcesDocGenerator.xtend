package io.yaktor.generator.doc

import io.yaktor.access.RestService
import io.yaktor.conversation.Conversation

import static extension io.yaktor.generator.util.CommentExtractorExtensions.*
import io.yaktor.access.RestAccess
import io.yaktor.access.RestDocumentType
import static extension io.yaktor.generator.js.JsSchema.*
import static extension io.yaktor.generator.js.JsTypesExtensions.*

class ResourcesDocGenerator {
	def genResourcesDoc(RestService rs, Conversation c) {
		'''
			= «c.name»::«rs.refType.name» on path «rs.url»

			:author: Yaktor
			:doctype: book
			:toc:
			:icons:
			:data-uri:
			:lang: en
			:encoding: UTF-8

			== Introduction

			This document describes the resource API defined by the conversation *«c.name»*.
			The resource is defined over the data type *«rs.refType.name»*.

			«rs.bareComments.join('\n')»

			.How to access this resource

			[options="header"]
			|===================================================
			|Property|Value/discussion
			|Root URL| «rs.url»
			|Supported actions|«FOR v : rs.methods»«v.getName» «ENDFOR»
			|Supported interchanges| «FOR v : rs.supportedDocumentTypes»«v.getName» «ENDFOR»
			|Data type exchanged| «rs.refType.name»
			|Access requirement|«FOR ac : rs.accessGroups»«ac.accessRequirement.getName» «ENDFOR»
			|===================================================

			== The Data Projection

			The data projection used has been named *«c.name».«rs.refType.name»*.
			«IF rs.supportedDocumentTypes.contains(RestDocumentType.JSON)»

				=== JSON Schema for «c.name».«rs.refType.name»

				[source, js]
				--------------------------------
				{
				  «rs.refType.schemafy»
				}
				--------------------------------

			«ENDIF»

			«IF rs.methods.contains(RestAccess.GET)»«rs.expandGetDescription»«ENDIF»
			«IF rs.methods.contains(RestAccess.FIND)»«rs.expandFindDescription»«ENDIF»
			«IF rs.methods.contains(RestAccess.PUT)»«rs.expandPutDescription»«ENDIF»
			«IF rs.methods.contains(RestAccess.POST)»«rs.expandPostDescription»«ENDIF»
			«IF rs.methods.contains(RestAccess.DELETE)»«rs.expandDeleteDescription»«ENDIF»
		 '''
	}
	def expandGetDescription(RestService r) {'''
		== Using Get

		You may retrieve data according to the rules defined by the type +«r.refType.name»+ by simply knowing its ID.

		To retrieve the object, simply use the path followed by / (slash) then the id.

		Say for example that we want to retrieve an object with the id +MY_ID+.
		Such an object could be obtained (given that you have the proper access) by performing an HTTP GET request at the the URL:

			http://HOST_NAME[:PORT]«r.url»/MY_ID

		For example, say we are running in a standard node mode (localhost port 3000) on a developer machine, we could now obtain the resource identified as MY_ID on the url:

			http://localhost:3000/«r.url»/MY_ID

	'''
	}

	def expandFindDescription(RestService r) {'''
		== Using Find

		You may lookup data according to the rules defined by the type +«r.refType.name»+.

		To search for objects, simply use the path followed by / (slash) then the id.

		The find patterns depends (somewhat) on what the developers makes available.

		The URL for find is based around the URL:

			http://HOST_NAME[:PORT]«r.url»

	'''
	}

	def expandPutDescription(RestService r) {'''
		== Using Put

		You may update the server data using a PUT command

	'''
	}
	def expandPostDescription(RestService r) {'''
		== Using Post

		You may update the server data using a PUT command

	'''
	}
	def expandDeleteDescription(RestService r) {'''
		== Using Post

		You may update the server data using a PUT command

	'''
	}
}
