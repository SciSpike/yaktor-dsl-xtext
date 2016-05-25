package io.yaktor.generator.plantuml

import io.yaktor.domain.DomainModel
import io.yaktor.domain.Entity
import io.yaktor.domain.SimpleField
import static extension io.yaktor.generator.util.DomainModelExtensions.*
import io.yaktor.domain.Type
import io.yaktor.domain.EnumType
import io.yaktor.domain.NamedType
import io.yaktor.domain.TableType
import io.yaktor.domain.Association
import io.yaktor.domain.TypeField
import java.util.HashMap
import java.util.Set
import java.util.HashSet
import io.yaktor.domain.EntityReferenceField

class PlantUMLGenerator {
	def genCompleteUMLClassDiagramWithStartEndUMLTags(DomainModel dm) {'''
		@startuml
		«dm.genCompleteUMLClassDiagram»
		@enduml
	'''
	}
	def genCompleteUMLClassDiagram(DomainModel dm) {'''
		«IF !dm.domainModelImports.empty»
		«var map = dm.packageEntityMap»
		«FOR key : map.keySet.sort()»
			package «key» #EEEEEE {
				«FOR e : map.get(key).sortBy[k | k.name]»
					«e.genForeignType»
				«ENDFOR»
			}
			«ENDFOR»
		package «dm.name» {
		«ENDIF»
		«FOR t : dm.types.filter(typeof(TableType)).sortBy[t1 | t1.name]»
			«t.genType»
		«ENDFOR»
		«FOR t : dm.types.filter(typeof(EnumType)).sortBy[t1 | t1.name]»
			«t.genType»
		«ENDFOR»
		«FOR e: dm.types.filter(typeof(Entity)).filter[e1 | e1.supertype != null].sortBy[e1 | e1.name]»
			«e.supertype.name» <|-- «e.name»
		«ENDFOR»
		«FOR a : dm.types.filter(Association).sortBy[a1|a1.name]»
			«a.genType»
		«ENDFOR»
		«FOR tf : dm.eAllContents.filter(typeof(TypeField)).toList.sortBy[t|t.name]»
			«(tf.eContainer as NamedType).name» *--> "«tf.name»[«tf.cardinality.stringify»]" «tf.isType.name»
		«ENDFOR»
		«FOR ef : dm.eAllContents.filter(typeof(EntityReferenceField)).toList.sortBy[t|t.name]»
			«(ef.eContainer as NamedType).name» --> "«ef.name»[«ef.cardinality.stringify»]" «ef.refType.name»
		«ENDFOR»
		«IF !dm.domainModelImports.empty»}«ENDIF»
	'''	}
	
	def genFocusedUMLClassDiagram(Entity e, boolean includeAssociations) {'''
		«e.genType»
		«IF includeAssociations»
			«var des = e.allDependentEntities.sortBy[d|d.name]»
			«FOR t : des»
				«IF t != e»«t.genForeignType»«ENDIF»
			«ENDFOR»
			«FOR a : e.allAssociation.sortBy[t | t.name]»
				«a.genType»
			«ENDFOR»
			«FOR tf : e.eAllContents.filter(typeof(TypeField)).toList.sortBy[t|t.name]»
				«(tf.eContainer as NamedType).name» *--> "«tf.name»[«tf.cardinality.stringify»]" «tf.isType.name»
			«ENDFOR»
			«FOR ef : e.eAllContents.filter(typeof(EntityReferenceField)).toList.sortBy[t|t.name]»
				«(ef.eContainer as NamedType).name» --> "«ef.name»[«ef.cardinality.stringify»]" «ef.refType.name»
			«ENDFOR»
			«IF e.supertype != null»
				«var superTypes = getAllSupertypes(e).sortBy[s|s.name]»
				«var current = e»
				«FOR s: superTypes»
				  «s.name» <|-- «current.name»
				  «{current = s;""}»
				«ENDFOR»
			«ENDIF»
		«ENDIF»
	'''}
	
	def getPackageEntityMap(DomainModel dm) {
		var retVal = new HashMap<String, Set<TableType>>();
		for(i : dm.domainModelImports) {
			retVal.put(i.ref.name, new HashSet<TableType>())
		}
		for (ft : dm.foreignEntities) {
			retVal.get((ft.eContainer as DomainModel).name).add(ft)
		}
		return retVal
	}
	dispatch def genType(NamedType nt) {
	}
	def String genArrow(Association a) {
		if (a.isUnidirectional) {
			if (a.start.isComposition) {
				return "*-->"
			} else {
				return "-->"
			}
		} else {
			if (a.start.isComposition) {
				return "*--"
			} else {
				return "--"
			}
		}
	}
	def genForeignType(TableType tt ) {'''
		class «tt.name» <<(«IF tt instanceof Type»T«ELSE»E«ENDIF»,#EEEEEE)>>
	'''}
	dispatch def genType(Entity e) {'''
		«IF e.isAbstract»abstract «ENDIF»class «e.name» <<(E,#00FF7F)>> «IF !e.fields.empty»{
			«FOR f : e.fields.filter(typeof(SimpleField)).sortBy[f | f.name]»
				«f.name» : «f.stringify» [«f.cardinality.stringify»]
			«ENDFOR»
		}«ENDIF»
	'''}
	dispatch def genType(Type t) {'''
		«IF t.isAbstract»abstract «ENDIF»class «t.name» <<(T,#87CEEB)>> «IF !t.fields.empty»{
			«FOR f : t.fields.filter(typeof(SimpleField)).sortBy[f | f.name]»
				«f.name» : «f.stringify» [«f.cardinality.stringify»]
			«ENDFOR»
		}«ENDIF»
	'''}
	dispatch def genType(EnumType t) {'''
		enum «t.name» <<enum>> {
			«FOR v : t.values.sortBy[v | v.name]»
				«v.name»
			«ENDFOR»
		}
	'''}
	dispatch def genType(Association a) {'''
		«a.start.references.name» "«a.start.name»[«a.start.cardinality.stringify»]" «a.genArrow» "«a.end.name»[«a.end.cardinality.stringify»]" «a.end.references.name»
	'''}
}
