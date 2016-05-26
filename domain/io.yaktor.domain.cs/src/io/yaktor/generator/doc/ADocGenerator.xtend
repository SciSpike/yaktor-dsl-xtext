package io.yaktor.generator.doc

import com.google.inject.Inject
import io.yaktor.domain.DomainModel
import io.yaktor.domain.Entity
import io.yaktor.domain.TableType
import io.yaktor.domain.Type

import static extension io.yaktor.generator.util.CommentExtensions.*
import static extension io.yaktor.generator.util.DomainModelExtensions.*
import io.yaktor.domain.EnumType
import io.yaktor.domain.Association
import io.yaktor.domain.EntityReferenceField
import io.yaktor.generator.plantuml.PlantUMLGenerator

class ADocGenerator {
    @Inject PlantUMLGenerator puGen
	static def diagramHeader(String picName) {'''
		["plantuml", «IF (picName != null)»"«picName»", «ELSE» "",«ENDIF»alt="Class Diagram"]
		---------------------------------------------------------------------
	'''
	}
	static def diagramFooter() {'''
		---------------------------------------------------------------------
	'''}

	def genADoc(DomainModel dm) {'''
		= «dm.name» Domain Model

		:author: Yaktor
		:doctype: book
		:toc:
		:icons:
		:data-uri:
		:lang: en
		:encoding: UTF-8

		== Introduction

		This document describes the domain model named *«dm.name»*.
		We will primarily focus on the logical structure of the domain model.
		The main notation that we'll use is UML class diagrams.

		We use UML notation, but the domain model does separate two kinds of classes:

		Entity::
		Entities are objects that have individuality.
		This means that it should be possible to retrieve an instance of an entity if one knows its identity
		Type::
		A type is used to define complex data structures. The types do not have individuality and only makes sense in the context of some entity.

		«IF !dm.bareComments.empty»
			== Description

			«dm.bareComments.join('\n')»

		«ENDIF»
		[[main-classes]]
		.UML Class Diagram for «dm.name»
		«diagramHeader("dm_complete_" + dm.name)»
		«puGen.genCompleteUMLClassDiagram(dm)»
		«diagramFooter»
		«IF dm.hasEnums»

			== Enumerated Values
			«var enums = dm.types.filter(typeof(EnumType)).sortBy[e|e.name]»
			«FOR t: enums»
				«t.genEnumDefinition»
			«ENDFOR»
		«ENDIF»
		«IF dm.hasTypes»

			== Data Types
			«var types = dm.types.filter(typeof(Type)).sortBy[t|t.name]»
			«FOR t : types»

				=== «IF t.isAbstract»_abstract_ «ENDIF»«t.name»

				«t.bareComments.join('\n')»
				«IF t.fields.empty»

					«t.genAttributeMatrix»
				«ENDIF»
				«IF t.supertype != null»

					==== Super-type: «t.supertype.name»

					Note that +«t.name»+ is a sub-type of +«t.supertype.name»+ and hence bound by its rules as well.
				«ENDIF»
				«IF !t.subTypes.empty»

					==== Known sub-types

					These are the known subtypes of «t.name»:
					«var subtypes = t.subTypes.sortBy[st|st.name]»
					«FOR st : subtypes»

						* «st.name»
					«ENDFOR»
				«ENDIF»
			«ENDFOR»

		«ENDIF»
		«IF dm.hasEntities»

			== Entities
			«var entities = dm.types.filter(typeof(Entity)).sortBy[e|e.name]»
			«FOR e : entities»

				=== «IF e.isAbstract»_abstract_ «ENDIF»«e.name»

				.Partial UML class diagram for «e.name»
				«diagramHeader("dm_focus_" + e.name)»
				«puGen.genFocusedUMLClassDiagram(e, true)»
				«diagramFooter»

				==== Description

				«e.bareComments.join('\n')»

				«IF !e.fields.empty»
					«e.genAttributeMatrix»
				«ENDIF»
				«IF e.supertype != null»
					==== Super-type «e.supertype.name»

					Note that +«e.name»+ is a sub-type of +«e.supertype.name»+ and hence bound its rules as well.
				«ENDIF»
				«IF !e.subTypes.empty»

					==== Known sub-types

					These are the known subtypes of «e.name»:
					«var subtypes = e.subTypes.sortBy[st|st.name]»
					«FOR st : subtypes»

						* «st.name»
					«ENDFOR»
				«ENDIF»
				«IF !e.fields.filter(typeof(EntityReferenceField)).empty»

					==== Entity References

					«var rfs = e.fields.filter(typeof(EntityReferenceField)).sortBy[rf|rf.name]»
					«FOR rf : rfs»
						«rf.genDescription(e)»
					«ENDFOR»
				«ENDIF»

			«ENDFOR»
		«ENDIF»

		«IF dm.hasAssociations»

			== Associations

			«var associations = dm.types.filter(typeof(Association)).sortBy[a|a.name]»
			«FOR a : associations»
				«a.genDescription»
			«ENDFOR»
		«ENDIF»

	'''}

	def genEnumDefinition(EnumType t) {'''

		=== «t.name»

		«t.bareComments.join('\n')»

		.«t.name» value set
		[cols="1,1,5", options="header"]
		|===================================================
		|Literal|Name|Description
		«var enumValues = t.values.sortBy[ev|ev.name]»
		«FOR ev : enumValues»
			|«ev.value»|«ev.name»| «ev.bareComments.join('\n')»
		«ENDFOR»
		|===================================================
	'''
	}
	def genAttributeMatrix(TableType e) {'''

		.Attributes for «e.name»
		[cols="1,1,1,5", options="header"]
		|===================================================
		|Name|Type|Cardinality|Description
		«var fields = e.fields.sortBy[f|f.name]»
		«FOR f : fields»
			«IF !(f instanceof EntityReferenceField)»
				|«f.name»|«f.stringify»|«f.cardinality.getName»|«f.bareComments.join('\n')»
			«ENDIF»
		«ENDFOR»
		|===================================================

	'''
	}
	def genDescription(Association a) {'''
		=== «a.name»

		«a.bareComments.join('\n')»

		Assciation type:: «IF a.start.references.equals(a.end.references)»Recursive«ELSE»Non recursive«ENDIF»

		Roles::
			«a.start.name»«a.start.cardinality.literal»:«a.start.references.name»;
				«a.start.bareComments.join('\n')»
			«a.end.name»«a.end.cardinality.literal»:«a.end.references.name»;
				«a.end.bareComments.join('\n')»

	'''
	}
	def genDescription(EntityReferenceField rf, Entity e) {'''

		===== «rf.name»

		This association is defined using pointer semantic.
		The database type will determine the implementation of the reverse relationship (from +«rf.refType.name»+ back to +«e.name»+ (if required).

		From a specification point of view, it is a uni-directional association where +«e.name»+ holds a reference to  +«rf.refType.name»+ that we name +«rf.name»+.

		Association type:: «IF rf.refType.equals(e)»Recursive«ELSE»Non-recursive«ENDIF»

		Role::
			*«rf.name»«rf.cardinality.literal»:«rf.refType.name»*.
			«rf.bareComments.join('\n')»

	'''
	}
	def getHasTypes(DomainModel dm) {
		return !(dm.types.filter(typeof(Type))).empty
	}

	def getHasEntities(DomainModel dm) {
		return !(dm.types.filter(typeof(Entity))).empty
	}
	def getHasEnums(DomainModel dm) {
		return !(dm.types.filter(typeof(EnumType))).empty
	}
	def getHasAssociations(DomainModel dm) {
		return !(dm.types.filter(typeof(Association))).empty
	}
}
