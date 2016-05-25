package io.yaktor.generator.nodejs

import io.yaktor.domain.Association
import io.yaktor.domain.AssociationEnd
import io.yaktor.domain.Cardinality
import io.yaktor.domain.DomainModel
import io.yaktor.domain.Entity
import io.yaktor.domain.EntityReferenceField
import io.yaktor.domain.Field
import io.yaktor.domain.IndexConstraint
import io.yaktor.domain.MongoNodeGenOptions
import io.yaktor.domain.NamedType
import io.yaktor.domain.TableType
import io.yaktor.domain.Type
import io.yaktor.domain.TypeField
import io.yaktor.domain.UniqueConstraint
import java.util.ArrayList
import java.util.HashSet
import java.util.List
import java.util.Set

import static extension io.yaktor.generator.util.DomainModelExtensions.*

class NodeJsExtensions {

  /*
	 * Used as a qualifier in both the generated JS file for
	 * the enum as well as for the generated mongoose schema 
	 */
  var public static ENUM_QUALIFIER = "__enum__"

  def static Field findKey(TableType type) {
    if (type.keys.head != null) {
      type.keys.head
    } else if (type.supertype != null) {
      findKey(type.supertype)
    } else {
      null
    }
  }

  def static Set<UniqueConstraint> findUniqueConstraints(TableType type, Set<UniqueConstraint> c) {
    var constraints = c ?: new HashSet<UniqueConstraint>
    constraints.addAll(type.uniqueConstraints)
    if (type.supertype != null) {
      type.supertype.findUniqueConstraints(constraints)
    }
    return constraints
  }

  def static Set<IndexConstraint> findIndexes(TableType type, Set<IndexConstraint> c) {
    var constraints = c ?: new HashSet<IndexConstraint>
    constraints.addAll(type.indexConstraints)
    if (type.supertype != null) {
      type.supertype.findIndexes(constraints)
    }
    return constraints
  }

  def static getNestedTypes(TableType type) {
    switch (type) {
      Type:
        type.allFields.filter[field|field instanceof EntityReferenceField || field instanceof TypeField].map[field|
          switch (field) {
            EntityReferenceField: field.refType
            TypeField: field.isType
          }]
      //I don't think this is right
      Entity:
        type.associationEnds.map[assEnd|assEnd.references]
    }
  }

  def static String getCollectionName(TableType e) {

    var str = e.rootEntity;
    if (str!= null){
      str.name.toLowerCase
    } else {
      e.name.toLowerCase
    }
  }
  def static TableType getRootEntity(TableType e) {

    var isStr = (e.mongoNodeTableOptions != null && e.mongoNodeTableOptions.singleTableRoot)
    if (isStr || (!e.isAbstract && e.supertype == null)) {
      //base case
      e
    } else if (e.isAbstract && e.supertype == null) {
      //base case
      null
    } else {
      //check
      e.supertype.rootEntity?:e
    }
  }
  def static boolean requiresDiscriminator(TableType e) {

    var isStr = (e.mongoNodeTableOptions != null && e.mongoNodeTableOptions.singleTableRoot)
    if (isStr) {
      true
    } else if (e.supertype != null) {
      e.supertype.requiresDiscriminator
    } else {
      false
    }
  }

  /**
	 * An extension that collects all the fields from this type
	 * and all the super types
	 */
  def static getAllFields(TableType e) {
    var List<Field> fields = new ArrayList<Field>()
    e.recursiveCollectFields(fields)
    return fields;
  }

  /**
	 * Helper method that collects all the fields
	 * by recursing through the supertypes
	 */
  def static void recursiveCollectFields(TableType e, List<Field> l) {
    l.addAll(e.fields);
    if (e.supertype != null) {
      var s = e.supertype
      s.recursiveCollectFields(l)
    }
  }

  /**
	 * Find all many-2-many associations defined in the model
	 */
  def static getBidirectionalManyToManyAssociationEnds(DomainModel m) {
    var retVal = new HashSet<AssociationEnd>
    for (a : m.bidirectionalManyToManyAssociations) {
      retVal.add(a.start);
      retVal.add(a.end);
    }
    return retVal
  }

  def static getBidirectionalManyToManyAssociations(DomainModel m) {
    var retVal = new HashSet<Association>
    for (a : m.types.filter(typeof(Association))) {
      if (!a.isUnidirectional && a.start.cardinality.many && a.end.cardinality.many) {
        retVal.add(a)
      }
    }
    return retVal
  }

  /**
	 * Check to see if the cardinality has a max of more than 1
	 */
  def static boolean isMany(Cardinality c) {
    return Cardinality.MANY.equals(c) || Cardinality.ONE_OR_MORE.equals(c)
  }

  /**
	 * Check to see if the cardinality has a max of more than 1
	 */
  def static boolean isMany(Field f) {
    return f.cardinality.isMany
  }
//  static def String fullName(Field f) {
//    if (f.eContainer instanceof NamedType
//      
//      .parent != null
//    ) {
//      f.parent.parent.fullName + "." + f.name
//    } else {
//      f.name
//    }
//  }
  /**
	 * Is the cardinality implying required?
	 */
  def static boolean isRequired(Cardinality c) {
    return Cardinality.ONE_OR_MORE.equals(c) || Cardinality.REQUIRED.equals(c)
  }

  /**
	  * 
	  */
  def static boolean isRequired(Field f) {
    return f.cardinality.required
  }

  /**
	 * Retrieve the domain model 
	 */
  def static DomainModel getDomainModel(NamedType t) {
    return t.eContainer as DomainModel
  }
  def static modelPath(NamedType t){
    t.domainModel.path
  }
  def static path(DomainModel model){
    var genOptions = model.genOptions as MongoNodeGenOptions
    genOptions.modelPath
  }

  /**
	 * Get all association ends for an entity
	 */
  def static Set<AssociationEnd> getAssociationEnds(Entity e) {
    var Set<TableType> parents = e.collectParents
    var Set<AssociationEnd> retVal = new HashSet<AssociationEnd>()

    for (a : e.domainModel.types.filter(Association)) {
      if (parents.contains(a.start.references)) {
        retVal.add(a.start)
      }
      if (parents.contains(a.end.references)) {
        retVal.add(a.end)
      }
    }
    return retVal
  }
  
  static def getOpposites(Iterable<AssociationEnd> assEnds) {
    assEnds.map [ assEnd |
      var ass = assEnd.association
      if (ass.start == assEnd) {
        ass.end
      } else {
        ass.start
      }
    ]
  }

  def static Set<TableType> collectParents(TableType e) {
    var Set<TableType> parents = new HashSet<TableType>
    e.collectParents(parents)
  }

  def static Set<TableType> collectParents(TableType e, Set<TableType> parents) {
    if (e == null || parents.contains(e)) {
      return parents
    } else {
      parents.add(e)
      return e.supertype.collectParents(parents)
    }
  }

  /**
	 * Returns true if this association end is the start (origin) of the association
	 */
  def static boolean isStart(AssociationEnd ae) {
    var a = ae.eContainer as Association
    return a.start.equals(ae)
  }

  /**
	 * Returns true if this association end is the end (destination) of the association
	 */
  def static boolean isEnd(AssociationEnd ae) {
    var a = ae.eContainer as Association
    return a.end.equals(ae)
  }

  /**
	 * Get the association for an association end
	 */
  def static Association getAssociation(AssociationEnd ae) {
    return ae.eContainer as Association
  }

}
