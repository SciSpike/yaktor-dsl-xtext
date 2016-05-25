package io.yaktor.generator

import io.yaktor.domain.Association
import io.yaktor.domain.DomainModel
import io.yaktor.domain.Entity
import io.yaktor.domain.EntityReferenceField
import io.yaktor.domain.SimpleField
import io.yaktor.domain.TableType
import io.yaktor.domain.Type
import io.yaktor.domain.TypeField

import static extension io.yaktor.generator.util.DomainModelExtensions.*

class DotDomainGenerator {    
	def genDotRepresentation(DomainModel model) {'''
	digraph G {
		nodesep=1.5;
		node [fontsize=10];
		edge [fontsize=10];
		«var entities = model.types.filter(typeof(Entity)).sortBy[e|e.name]»
		«FOR e : entities»
			«e.genEntityNode»
		«ENDFOR»
		«var types = model.types.filter(typeof(Type)).sortBy[t|t.name]»
		«FOR e : types»
		 	«e.genTypeNode»
		«ENDFOR»
		«var fes = model.foreignEntities.sortBy[f|f.name]»
		«FOR e : fes»
		  «e.genForeignTypeNode»
		«ENDFOR»
		«var associations = model.types.filter(typeof(Association)).sortBy[a|a.name]»
		«FOR a : associations»
			«a.genAssociationEdge»
		«ENDFOR»
		«FOR t : entities»
		«var tfs = t.fields.filter(typeof(TypeField)).sortBy[tf|tf.name]»
		«FOR f : tfs»
			«f.genTypeReferenceEdge(t)»
		«ENDFOR»
		«var erfs = t.fields.filter(typeof(EntityReferenceField)).sortBy[er|er.name]»
		«FOR f : erfs»
			«f.genEntityRefField(t)»
		«ENDFOR»
		«ENDFOR»
		«FOR t :types»
		«var tfs = t.fields.filter(typeof(TypeField)).sortBy[tf|tf.name]»
		«FOR f : tfs»
			«f.genTypeFieldEdge(t)»
		«ENDFOR»
		«var erfs = t.fields.filter(typeof(EntityReferenceField)).sortBy[er|er.name]»
		«FOR f: erfs»
			«f.genEntityReferenceFieldEdge(t)»
		«ENDFOR»
		«ENDFOR»
	edge [dir = forward, arrowhead = empty, label="", headlabel="", taillabel="", arrowsize=1.5]
		«var tts = model.types.filter(typeof(TableType)).sortBy[tt|tt.name]»
		«FOR e : tts»
		«IF e.supertype != null»
		  «e.name» -> «e.supertype.name»
		«ENDIF»
		«ENDFOR»
	}
	'''
	}
	
	/**
	 * Generates a diagram with the entity and all associated types grayed out
	 */
	def genFocusedUMLClass(Entity e, boolean includeAssociations) {'''
		digraph G {
			nodesep=1.5;
			node [fontsize=10];
			edge [fontsize=10];
			«genEntityNode(e)»
			«IF includeAssociations»
				«var des = e.allDependentEntities.sortBy[d|d.name]»
				«FOR t : des»
					«t.genForeignTypeNode»
				«ENDFOR»
				«var associations = e.allAssociation.sortBy[a|a.name]»
				«FOR a : associations»
					«a.genAssociationEdge»
				«ENDFOR»
				«var erfs = e.fields.filter(typeof(EntityReferenceField)).sortBy[er|er.name]»
				«FOR f: erfs»
					«f.genEntityRefField(e)»
				«ENDFOR»
				«IF e.supertype != null»
					edge [dir = forward, arrowhead = empty, label="", headlabel="", taillabel="", arrowsize=1.5]
					«var superTypes = getAllSupertypes(e).sortBy[s|s.name]»
					«var current = e»
					«FOR s: superTypes»
					  «current.name» -> «s.name»
					  «{current = s;""}»
					«ENDFOR»
				«ENDIF»
			«ENDIF»
		}
	'''
	}
	
	def genEntityNode(Entity e) {'''
		«e.name» [fontname="Arial«IF e.isAbstract» Italic«ENDIF»", shape=record, color=blue, label="{«e.name»«e.genAttrs»}"]
	'''}
	
	def genTypeNode(Type e) {'''
		«e.name» [fontname="Arial«IF e.isAbstract» Italic«ENDIF»", shape=record, color=grey, label="{«e.name»«e.genAttrs»}"]
	'''
	}
	def genForeignTypeNode(TableType e) {'''
		«e.name» [fontname="Arial«IF e.isAbstract» Italic«ENDIF»", shape=record, fillcolor=grey, style=filled]
	'''
	}
	def genAssociationEdge(Association a) {'''
	  edge [fontname="Arial", dir = both, label="«a.name»" arrowhead = «getEdgeType(a.start.isComposition)», arrowtail = «getEdgeType(a.end.isComposition)», headlabel = "«a.start.cardinality.stringify» «a.start.name»", taillabel = "«a.end.cardinality.stringify» «a.end.name» "]
	  «a.end.references.name» -> «a.start.references.name»;
	'''	
	}
	def genTypeReferenceEdge(TypeField f, TableType t) {'''
		  edge [fontname="Arial", dir = both, arrowhead = vee, arrowtail = diamond, headlabel = "«f.cardinality.stringify»", taillabel = ""]
		  «t.name» -> «f.stringify»;
	'''
	}
	def genEntityRefField(EntityReferenceField f, TableType t) {'''
		  edge [fontname="Arial", dir = both, arrowhead = vee, arrowtail = none, headlabel = "«f.cardinality.stringify» «f.name»", taillabel = ""]
		  «t.name» -> «f.stringify»;
	'''
	}
	def genTypeFieldEdge(TypeField f, TableType t) {'''
		  edge [fontname="Arial", dir = both, arrowhead = vee, arrowtail = diamond, headlabel = "«f.cardinality.stringify»", taillabel = ""]
		  «t.name» -> «f.stringify»;
	'''
	}
	def genEntityReferenceFieldEdge(EntityReferenceField f, TableType t) {'''
		  edge [fontname="Arial", dir = both, arrowhead = vee, arrowtail = none, headlabel = "«f.cardinality.stringify»", taillabel = ""]
		  «t.name» -> «f.stringify»;
	'''
	}

	def getEdgeType(boolean isComposition) {
		if (isComposition)
			return "diamond"
		else
			return "none"
	}
	
	def genAttrs(Entity e) {
		var retVal = ""
		if (!e.fields.empty)
			retVal = retVal + "|"
		var sortedFields = e.fields.filter(typeof(SimpleField)).sortBy[f|f.name] 
		for (f : sortedFields) {
			retVal = retVal + f.name + ': ' + f.stringify + '[' + f.cardinality.stringify + ']' + '\\l'
		}
		return retVal
	}
	
	def genAttrs(Type e) {
		var retVal = ""
		if (!e.fields.empty) {
			retVal = retVal + "|"	
		}
		var fs = e.fields.filter(typeof(SimpleField)).sortBy[f|f.name]
		for (f : fs) {
			retVal = retVal + f.name + ': ' + f.stringify + '[' + f.cardinality.stringify + ']' + '\\l'
		}
		return retVal
	}
	
}
