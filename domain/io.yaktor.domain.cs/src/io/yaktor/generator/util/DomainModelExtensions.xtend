package io.yaktor.generator.util

import io.yaktor.domain.Association
import io.yaktor.domain.DomainModel
import io.yaktor.domain.Entity
import io.yaktor.domain.TableType
import io.yaktor.domain.impl.TableTypeImpl
import java.util.HashSet
import io.yaktor.domain.MongoNodeGenOptions
import io.yaktor.domain.JpaGenOptions
import java.util.ArrayList
import io.yaktor.domain.EntityReferenceField
import io.yaktor.domain.Cardinality
import io.yaktor.domain.StringField
import io.yaktor.domain.Field
import io.yaktor.domain.BooleanField
import io.yaktor.domain.IntegerField
import io.yaktor.domain.EnumField
import io.yaktor.domain.DateField
import io.yaktor.domain.NumericField
import io.yaktor.domain.PriceField
import io.yaktor.domain.AmountField
import io.yaktor.domain.GeoLocationField
import io.yaktor.domain.CountField
import io.yaktor.domain.TypeField
import io.yaktor.domain.AnyField
import java.util.Set

class DomainModelExtensions {
	static var singleton = new DomainModelExtensions

	static def getForeignEntities(DomainModel model) {
		val Set<TableType> setOfForeignTypes = new HashSet<TableType>()
		for (a : model.types.filter(typeof(Association))) {
			if (!model.types.contains(a.start.references))
				setOfForeignTypes.add(a.start.references)
			if (!model.types.contains(a.end.references))
				setOfForeignTypes.add(a.end.references)
		}
		for (t : model.types.filter(typeof(TableType))) {
			for (f : t.fields.filter(typeof(EntityReferenceField))) {
				if (!model.types.contains(f.refType)) {
					setOfForeignTypes.add(f.refType)
				}
			}
			for (f : t.fields.filter(typeof(TypeField))) {
				if (!model.types.contains(f.isType)) {
					setOfForeignTypes.add(f.isType)
				}
			}
		}
		return setOfForeignTypes
	}

	def static subTypes(TableType t) {
		val key = t.subTypeKey;
		var set = TableTypeImpl.SUBTYPES.get(key) ?: #{}
		set.filter[el|key.equals(el.supertype?.subTypeKey)]
	}

	def static subTypeKey(TableType t) {
		t.eResource.URI + "." + t.name;
	}

	def static mongoNodeTableOptions(TableType t) {
		var genOptions = t.model.genOptions;
		if (genOptions instanceof MongoNodeGenOptions) {
			return genOptions.tableOptions.filter[to|to.type == t].head
		}
		return null
	}

	def static jpaTableOptions(TableType t) {
		var genOptions = t.model.genOptions;
		if (genOptions instanceof JpaGenOptions) {
			return genOptions.tableOptions.filter[to|to.type == t].head
		}
		return null
	}

	/**
	 * Answer all the associations that the entity participates in
	 */
	def static getAllAssociation(Entity e) {
		var retVal = new HashSet<Association>()
		var dm = e.eContainer as DomainModel
		for (a : dm.types.filter(typeof(Association))) {
			if (a.start.references.equals(e) || a.end.references.equals(e)) {
				retVal.add(a)
			}
		}
		return retVal
	}

	/**
	 * Get all the directly dependent entities
	 */
	def static getAllDependentEntities(Entity e) {
		var retVal = new HashSet<Entity>()
		var associations = e.allAssociation
		for (a : associations) {
			if (!a.start.references.equals(e)) {
				retVal.add(a.start.references)
			}
			if (!a.end.references.equals(e)) {
				retVal.add(a.end.references)
			}
		}
		for (f : e.fields) {
			if (f instanceof EntityReferenceField) {
				retVal.add(f.refType)
			}
		}
		retVal.addAll(getAllSupertypes(e))
		return retVal
	}

	def static getAllSupertypes(Entity e) {
		var retVal = new ArrayList<Entity>()
		var s = e.supertype as Entity
		while (s != null) {
			retVal.add(s)
			s = s.supertype as Entity
		}
		return retVal
	}

	static def stringify(Cardinality c) {
		var retVal = ""
		if (Cardinality::MANY.equals(c)) {
			retVal = "*"
		} else if (Cardinality::ONE_OR_MORE.equals(c)) {
			retVal = "1..*"
		} else if (Cardinality::OPTIONAL.equals(c)) {
			retVal = "0..1"
		} else if (Cardinality::REQUIRED.equals(c)) {
			retVal = "1"
		}
		return retVal
	}

	static def String stringify(Field f) {
		return singleton.genTypeAsString(f)
	}

	def dispatch String genTypeAsString(Field f) {
	}

	def dispatch genTypeAsString(StringField f) {
		return "String"
	}

	def dispatch genTypeAsString(BooleanField f) {
		return "Boolean"
	}

	def dispatch genTypeAsString(IntegerField f) {
		return "Integer"
	}

	def dispatch genTypeAsString(EnumField f) {
		return f.isType.name
	}

	def dispatch genTypeAsString(DateField f) {
		return "Date"
	}

	def dispatch genTypeAsString(NumericField f) {
		return "Numeric"
	}

	def dispatch genTypeAsString(PriceField f) {
		return "Price"
	}

	def dispatch genTypeAsString(AmountField f) {
		return "Amount"
	}

	def dispatch genTypeAsString(GeoLocationField f) {
		return "GeoLocation"
	}

	def dispatch genTypeAsString(CountField f) {
		return "Count"
	}

	def dispatch genTypeAsString(TypeField f) {
		return f.isType.name
	}

	def dispatch genTypeAsString(AnyField f) {
		return "Any"
	}

	def dispatch genTypeAsString(EntityReferenceField f) {
		return f.refType.name
	}
}
