package io.yaktor.generator.nodejs

import io.yaktor.domain.AmountField
import io.yaktor.domain.AnyField
import io.yaktor.domain.Association
import io.yaktor.domain.BooleanField
import io.yaktor.domain.Constraint
import io.yaktor.domain.CountField
import io.yaktor.domain.DateField
import io.yaktor.domain.DomainModel
import io.yaktor.domain.Entity
import io.yaktor.domain.EntityReferenceField
import io.yaktor.domain.EnumField
import io.yaktor.domain.EnumType
import io.yaktor.domain.Field
import io.yaktor.domain.GeoLocationField
import io.yaktor.domain.IdField
import io.yaktor.domain.IntegerField
import io.yaktor.domain.NumericField
import io.yaktor.domain.PriceField
import io.yaktor.domain.ShortIdField
import io.yaktor.domain.SimpleField
import io.yaktor.domain.StringField
import io.yaktor.domain.TableType
import io.yaktor.domain.TypeField
import io.yaktor.domain.UniqueConstraint
import io.yaktor.mongoNode.Ttl
import java.util.ArrayList
import java.util.Collection
import java.util.HashSet
import java.util.LinkedList
import java.util.Set
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.CrossReference
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.nodemodel.util.NodeModelUtils

import static extension io.yaktor.generator.nodejs.NodeJsExtensions.*
import static extension io.yaktor.generator.util.CommentExtensions.*
import static extension io.yaktor.generator.util.DomainModelExtensions.*
import io.yaktor.domain.Type

class NodeJsGenerator {

  /**
	 * Generates all the artifacts for the mongoose mapping
	 * of the Yaktor domain model
	 */
  def generate(IFileSystemAccess fsa, DomainModel model) {
    var path = model.path ?: ""

    fsa.generateFile('''modelAll/index.js''',
      '''
        var fs = require('fs');
        var path = require('path');
        fs.readdirSync(__dirname).forEach(function(file) {
          if(__filename != file){
            var mod = require(path.join(__dirname,file));
            for(var model in mod ){
              module.exports[model] = mod[model];
            }
          }
        });
      ''')
    for (EnumType et : model.types.filter(typeof(EnumType)).sortBy[e|e.name]) {
      fsa.generateFile('''«path»«et.name.toFirstLower».js''', et.genEnumType())
      fsa.generateFile('''modelAll/«et.name.toFirstLower».js''',
        '''
          require("../«path»«et.name.toFirstLower».js");
        ''')
    }
    for (Association a : model.getBidirectionalManyToManyAssociations.sortBy[a|a.name]) {
      fsa.generateFile('''«path»«a.name.toFirstLower».js''', a.genMany2ManyAssociation)
      fsa.generateFile('''modelAll/«a.name.toFirstLower».js''',
        '''
          require("../«path»«a.name.toFirstLower».js")
        ''')
    }
    for (TableType e : model.types.filter(typeof(TableType)).sortBy[e|e.name]) {
      if (e.collectionName != null) {
        fsa.generateFile('''«path»«e.name.toFirstLower».js''', e.genType())
        fsa.generateFile('''modelAll/«e.name.toFirstLower».js''',
          '''
            require("../«path»«e.name.toFirstLower».js");
          ''')
      }
    }
    fsa.generateFile('''«path»index.js''',
      '''
        var fs = require('fs');
        var path = require('path');
        fs.readdirSync(__dirname).forEach(function(file) {
          if(__filename != file){
            var mod = require(path.join(__dirname,file));
            for(var model in mod ){
              module.exports[model] = mod[model];
            }
          }
        });
      ''')
  }

  /**
   * Generate the JS schema file for an individual entity
   */
  def String genType(TableType e) {
    var requiresDiscriminator = e.requiresDiscriminator
    var isRoot = e?.mongoNodeTableOptions?.singleTableRoot
    var supertype = e.supertype
    '''
      var mongoose = require('mongoose');
      var util = require('util');
      var path = require('path');
      «FOR en : e.allUsedEnums.sortBy[en|en.name] BEFORE "// Import all the enums\n"»
        var «NodeJsExtensions.ENUM_QUALIFIER»«en.name» = require(path.resolve('src-gen','«en.modelPath»«en.name.
        toFirstLower»')).legalValues;
      «ENDFOR»
      «IF supertype != null»
        var «supertype.name» = require(path.resolve('src-gen','«supertype.modelPath»«supertype.name.toFirstLower»')).«supertype.
        name»; //to ensure registered
      «ENDIF»
      «FOR en : e.allReferencedEntities.sortBy[en|en.name] BEFORE "// Import all the entities\n"»
        require(path.resolve('src-gen','«en.modelPath»«en.name.toFirstLower»')); //to ensure registered
      «ENDFOR»
      «FOR en : e.allFields.filter(typeof(TypeField)).sortBy[en|en.name] BEFORE "// Import all the types\n"»
        var __«en.isType?.name» = require(path.resolve('src-gen','«en.isType?.modelPath»«en.isType?.name?.toFirstLower»')); //to ensure registered
        var «en.isType?.name» = __«en.isType?.name».schema;
      «ENDFOR»

      // Create the schema
      var Schema = mongoose.Schema;

      // Definition of the schema
      «var key = e.findKey»
      «e.comments»
      var __schema = {
        «e.genAllField»
      };
      var schema = new Schema( __schema,{«IF e instanceof Type || (key != null && !(key instanceof IdField))»_id:false,«ENDIF»«IF (isRoot || supertype == null || e.isAbstract)»collection:"«e.
        collectionName»s"«ENDIF»});
      «var constraints = new LinkedList<Constraint>»
      «{
        constraints.addAll(e.findIndexes(null))
        constraints.addAll(e.findUniqueConstraints(null))
       '';
      }»
      «FOR uC : constraints.sortWith[uC1, uC2|
        NodeModelUtils.getNode(uC1).text.compareTo(NodeModelUtils.getNode(uC2).text)]»
        schema.index({
          «var node = uC.crossRefChildren»
          «FOR k : node SEPARATOR ','»
            «IF key?.name == k.text.trim»
              _id : 1
            «ELSE»
              "«k.text.trim»" : 1
            «ENDIF»
          «ENDFOR»
          «IF requiresDiscriminator»
            ,__t:1
          «ENDIF»
        }«IF uC instanceof UniqueConstraint»,{ unique: true }«ENDIF»);
      «ENDFOR»

      «IF key != null»
        var id = schema.virtual('«key.name»');
        id.get(function () {
          return this._id;
        });
        id.set(function (_id) {
          return (this._id = _id);
        });
      «ENDIF»
      «IF e.mongoNodeTableOptions != null»
        «var options = e.mongoNodeTableOptions»
        «IF options.ttl != null»
          schema.index({"«options.ttl.dateFieldText»":1},{expireAfterSeconds:«options.ttl.expireAfterSeconds»});
        «ENDIF»
      «ENDIF»

      // Allow user schema customizations
      var custom = path.resolve('models', 'schema', path.basename(__filename));
      if (require('fs').existsSync(custom)) {
        var fn = require(custom);
        if (typeof fn === 'function') {
          fn(schema);
        }
      }

      // Compile the model
      «IF !isRoot && e.supertype != null && !e.isAbstract»
        var «e.name» = «e.supertype.name».discriminator('«e.name»', schema);
      «ELSE»
        var «e.name» = mongoose.model('«e.name»', schema);
      «ENDIF»

      // Make the schema available
      exports.«e.name» = «e.name»;
      exports.schema = schema;
      exports.getNested = function(required){
        return {
          type:schema,
          required: required
        };
      }
    '''
  }

  def static getCrossRefChildren(EObject o) {
    NodeModelUtils.getNode(o).children.filter [ n |
      var g = n.grammarElement
      g instanceof CrossReference
    ]
  }

  def String dateFieldText(Ttl ttl) {
    var node = ttl.crossRefChildren
    node.head.text.trim
  }

  /**
	 * Generates the enums. We're using a strategy of
	 * creating the enums in separate files. The entities
	 * will then use require to import the definition. This
	 * way the enums are reused across entities
	 */
  def String genEnumType(EnumType et) {
    '''
      // This is a generated file, generated for the enum «et.name»
      var «NodeJsExtensions.ENUM_QUALIFIER»«et.name» = «et.getEnumValuesAsString()»

      «et.comments»
      exports.legalValues = «NodeJsExtensions.ENUM_QUALIFIER»«et.name»;
    '''
  }

  /**
	 * Generate a many to many association
	 */
  def String genMany2ManyAssociation(Association a) {
    '''
      var mongoose = require('mongoose');

      // Create the schema
      var Schema = mongoose.Schema;
      // Definition of the schema

      «a.comments»
      var «a.name.toFirstLower»Schema = new Schema( {
        «var startKey = a.start.references.findKey»
        «var endKey = a.end.references.findKey»
        «a.start.name»: { type: «IF startKey != null»«startKey.doTypeName»«ELSE»Schema.Types.ObjectId«ENDIF», ref: '«a.
        start.references.name»' },
        «a.end.name»: { type: «IF endKey != null»«endKey.doTypeName»«ELSE»Schema.Types.ObjectId«ENDIF», ref: '«a.end.
        references.name»' }
      });

      // Allow user schema customizations
      var custom = path.resolve('models', 'schema', path.basename(__filename));
      if (require('fs').existsSync(custom)) {
        var fn = require(custom);
        if (typeof fn === 'function') {
          fn(schema);
        }
      }

      // Compile the model
      var «a.name» = mongoose.model('«a.name»', «a.name.toFirstLower»Schema);

      // Make the schema available
      exports.«a.name» = «a.name»;
    '''
  }

  //  def subTypes(TableType e){
  //    var List<TableType> tt = new LinkedList<TableType>
  //    tt.addAll(e.domainModel.eContents.filter(TableType).filter[t|t.supertype==e])
  //    for()
  //  }
  /**
	 * Create all the fields
	 * TODO: Add the association ends
	 */
  def genAllField(TableType tt) {
    var Collection<CharSequence> fieldDeclarations = new ArrayList<CharSequence>()
    var key = tt.findKey
    for (f : tt.allFields.sortBy[f|f.name]) {
      if (key != f) {
        fieldDeclarations.add(f.genDeclaration)
      }
    }
    if (key != null && !(key instanceof IdField)) {
      var originalName = key.name
      key.name = "_id"
      fieldDeclarations.add(key.genDeclaration)
      key.name = originalName
    }
    if (tt instanceof Entity) {
      fieldDeclarations.addAll(tt.genLinkDefinitions)
    }

    //    if(tt.mongoNodeTableOptions != null && tt.mongoNodeTableOptions.singleTableRoot){
    //      for(subType : tt.subTypes) {
    //        subType.allSubClassFields(fieldDeclarations)
    //      }
    //    }
    return '''
      «FOR f : fieldDeclarations.sortWith[f1, f2|f1.toString().compareTo(f2.toString())] SEPARATOR ','»
        «f»
      «ENDFOR»
    '''
  }

  def void allSubClassFields(TableType type, Collection<CharSequence> fieldDeclarations) {
    for (f : type.fields) {
      fieldDeclarations.add(f.genDeclaration)
    }
    for (subType : type.subTypes) {
      allSubClassFields(subType, fieldDeclarations)
    }
  }

  /**
	 * Generate the enum values as a string array
	 */
  def String getEnumValuesAsString(EnumType type) {
    var retVal = "["
    for (ev : type.values) {
      retVal = retVal + '''"«ev.value»"'''
      if (!(ev == type.values.last)) {
        retVal = retVal + ", "
      }
    }
    retVal = retVal + "];"
    return retVal
  }

  /**
   * Create a declaration of a field.
   * This method simply adds the multiplicity
   * before delegating to the 'genDef' method on field
   */
  def CharSequence genDeclaration(Field f) {
    f.comments + switch f {
      //For many it needs to be a schema
      TypeField case f.cardinality.many: '''«f.name»: [«f.isType.name»]'''
      //For singles it needs to be 'nested' so as to enforce required
      TypeField case !f.cardinality.many: '''«f.name»: «f.genTypeFieldTypeDef»'''
      EntityReferenceField: '''«f.name»: «IF f.isMany»[«ENDIF»{ type: «f.doTypeName»«f.genDef»}«IF f.isMany»]«ENDIF»'''
      default: '''«f.name»: { type: «f.typeName»«f.genDef»}'''
    }
  }

  /**
   * The abstract type
   */
  def dispatch String genDef(Field f) {
    return f.genConstraints
  }

  def typeName(Field f) {
    if (f.cardinality.many) {
      return '''[«f.doTypeName»]'''
    } else {
      return f.doTypeName
    }
  }

  def String doTypeName(Field f) {
    switch f {
      IdField:
        "Schema.Types.ObjectId"
      ShortIdField:
        "Schema.Types.ShortId"
      StringField:
        "String"
      NumericField:
        "Number"
      AmountField:
        "Number"
      CountField:
        "Number"
      PriceField:
        "Number"
      IntegerField:
        "Number"
      GeoLocationField:
        "[Number]"
      BooleanField:
        "Boolean"
      DateField:
        "Date"
      EntityReferenceField: {
        var key = f.refType.findKey
        if (key != null) {
          doTypeName(key)
        } else {
          "Schema.Types.ObjectId"
        }
      }
      //TypeField case f.isType instanceof Type: "Schema.Types.ObjectId"
      TypeField case f.isType instanceof EnumType:
        "String"
      EnumField:
        "String"
      AnyField:
        "Schema.Types.Mixed"
      default:
        f.class.simpleName
    }
  }

  /**
   * Generate field for StringField
   */
  def dispatch String genDef(StringField f) {
    var Set<String> constraints = new HashSet<String>()
    var match = "";
    if (f.minLength > 0 || f.maxLength > 0) {
      match = '''«match»(?=^.{«f.minLength»,«IF f.maxLength > f.minLength»«f.maxLength»«ELSE»*«ENDIF»}$)'''
    }
    if (f.pattern !== null) {
      match = '''«match»(?=^«f.pattern»$)'''
    }
    if (!f.obscured && match.length > 0) {
      constraints.add('''match: /«match»/''')
    }
    return f.genConstraints(constraints)
  }

  /**
   * Generate field for StringField
   */
  def dispatch String genDef(ShortIdField f) {
    var Set<String> constraints = new HashSet<String>()
    if (f.pattern != null) {
      constraints.add('''"alphabet": "«f.pattern»"''')
      constraints.add(
        '''"len": «Math.ceil(
          Math.log((f.maxValue ?: Integer.MAX_VALUE).doubleValue) / Math.log(f.pattern.length)).intValue»''')
    }
    return f.genConstraints(constraints)
  }

  /**
   * Generate field for IntegerField
   */
  def dispatch genDef(IntegerField f) {
    var Set<String> constraints = new HashSet<String>()
    if (f.maxValue != null) {
      constraints.add('''"max": «f.maxValue»''')
    }
    if (f.minValue != null) {
      constraints.add('''"min": «f.minValue»''')
    }
    return f.genConstraints(constraints)
  }

  def dispatch genDef(NumericField f) {
    var Set<String> constraints = new HashSet<String>()
    if (f.maxValue != null) {
      constraints.add('''"max": «f.maxValue»''')
    }
    if (f.minValue != null) {
      constraints.add('''"min": «f.minValue»''')
    }
    return f.genConstraints(constraints)
  }

  //  def dispatch String genDef(TypeField f) {
  //    if (!f.required) {
  //      this.fromNowOptional = true;
  //    }
  //    return '''
  //    {
  //            «f.isType.genAllField()»
  //    }'''
  //  }
  /**
   * Generate field for EnumField
   */
  def dispatch String genDef(TypeField f) {
    if (f.isType instanceof EnumType) {
      var Set<String> constraints = new HashSet<String>()
      constraints.add('''enum: «NodeJsExtensions.ENUM_QUALIFIER»«f.isType.name»''')
      return f.genConstraints(constraints)
    } else {
      return f.genRefTypeDef
    }
  }

  /**
   * Generate field for EnumField
   */
  def dispatch String genDef(EnumField f) {
    var Set<String> constraints = new HashSet<String>()
    constraints.add('''enum: «NodeJsExtensions.ENUM_QUALIFIER»«f.isType.name»''')
    return f.genConstraints(constraints)
  }

  /**
   * Generate field for EnumField
   */
  def dispatch String genDef(GeoLocationField f) {
    var Set<String> constraints = new HashSet<String>()
    constraints.add("index: '2d'")
    return f.genConstraints(constraints)
  }

  /**
   * Generate field for EntityReferenceField
   */
  def dispatch String genDef(EntityReferenceField f) {
    var Set<String> constraints = new HashSet<String>()
    constraints.add('''ref: '«f.refType.name»' ''')
    return f.genConstraints(constraints)
  }

  /**
   * Generate field for TypeField
   */
  def String genRefTypeDef(TypeField f) {
    var Set<String> constraints = new HashSet<String>()
    constraints.add('''ref: '«f.isType.name»' ''')
    return f.genConstraints(constraints)
  }

  /**
   * Generate field for Type Field
   */
  def String genTypeFieldTypeDef(TypeField f) {
    return '''
    __«f.isType.name».getNested(«f.required»)
    '''
  }

  /**
	 * Given a set of specific constraints:
	 *   - Create the list of constraints for the generic TableType
	 *   - Merge the list with the specific constraints
	 *   - Construct the comma separated string of constraints
	 *     required for the mongo field declaration
	 */
  def String genConstraints(Field f) {
    return f.genConstraints(null)
  }

  def String genConstraints(Field f, Collection<String> specificConstaints) {
    var constraints = new HashSet<String>()
    if (specificConstaints != null) {
      constraints.addAll(specificConstaints);
    }
    if (f instanceof SimpleField) {
      if (f.unique) {
        constraints.add("unique: true")
      }
      if (f.required) {
        constraints.add("required: true")
      }
      if (f.indexed) {
        constraints.add("index: true")
      }
    }
    if (constraints.empty) {
      return ""
    }
    return ''', «FOR s : constraints.sort SEPARATOR ","»«s»«ENDFOR»'''

  }

  /**
	 * Extension to entity that collects all the enums used by
	 * this entity
	 */
  def Set<EnumType> getAllUsedEnums(TableType e) {
    var Set<EnumType> enums = new HashSet<EnumType>()
    recursiveCollectEnums(e, enums)
    if (e.mongoNodeTableOptions != null && e.mongoNodeTableOptions.singleTableRoot) {
      recursiveCollectEnumsUsingSubType(e, enums)
    }
    return enums
  }

  /**
	 * Helper function to collect enums for an entity
	 */
  def void recursiveCollectEnums(TableType e, Set<EnumType> enums) {
    for (f : e.allFields) {
      if (f instanceof EnumField) {
        enums.add(f.isType)
      } else if (f instanceof TypeField) {
        f.isType.recursiveCollectEnums(enums)
      }
    }
  }

  /**
   * Helper function to collect enums for an entity recursing down subTypes
   */
  def void recursiveCollectEnumsUsingSubType(TableType e, Set<EnumType> enums) {
    for (f : e.fields) {
      if (f instanceof EnumField) {
        enums.add(f.isType)
      }
    }
    for (subType : e.subTypes) {
      recursiveCollectEnumsUsingSubType(subType, enums)
    }
  }

  /**
   * Extension to entity that collects all the types used by
   * this entity
   */
  def Set<Entity> getAllReferencedEntities(TableType e) {
    var Set<Entity> entities = new HashSet<Entity>
    for (ass : e.domainModel.bidirectionalManyToManyAssociations) {
      entities.add(ass.start.references)
      entities.add(ass.end.references)
    }
    recursiveCollectEntities(e, entities)

    //    if(e.mongoNodeTableOptions != null && e.mongoNodeTableOptions.singleTableRoot){
    //      recursiveCollectEntitiesUsingSubTypes(e,entities)
    //    }
    entities.remove(e);
    return entities
  }

  /**
   * Helper function to collect types for an entity
   */
  def void recursiveCollectEntities(TableType e, Set<Entity> entities) {
    for (ref : e.allFields.filter(EntityReferenceField)) {
      if (ref.refType != null) {
        entities.add(ref.refType)
        if (!entities.contains(e)) {
          (ref.refType).recursiveCollectEntities(entities)
        }
      }
    }
  }

  /**
   * Helper function to collect types for an entity
   */
  def void recursiveCollectEntitiesUsingSubTypes(TableType e, Set<Entity> entities) {
    for (ref : e.fields.filter(EntityReferenceField)) {
      if (ref.refType != null) {
        entities.add(ref.refType)
      }
    }
    for (subType : e.subTypes) {
      recursiveCollectEntitiesUsingSubTypes(subType, entities)
    }
  }

  /**
	 * Generate declarations for all association ends that are relevant
	 * That is:
	 *   - An association to or from me
	 *   - Where I have visibility (based on directionality) to the other
	 *   - Exclude the bidirectional many-2-many associations as it is generated
	 *     as a separate entity
	 */
  def Collection<CharSequence> genLinkDefinitions(Entity e) {
    var retVal = new ArrayList<CharSequence>
    var excludeTheseAssociations = e.domainModel.bidirectionalManyToManyAssociationEnds
    for (ae : e.associationEnds.sortBy[ae|ae.name]) {
      if (!excludeTheseAssociations.contains(ae) && // not a many-2-many
      ( ae.start || // we are the start (not excluded by uni-directional)
        (ae.end && !ae.association.isUnidirectional) // bidirectional end
            )) { // then we should generate a link
        var String roleName
        var Boolean isMany
        var String typeName
        if (ae.start) { // we are the origin
          roleName = ae.association.end.name
          isMany = ae.association.end.cardinality.isMany
          typeName = ae.association.end.references.name
        } else { // this association end is the termination
          roleName = ae.association.start.name
          isMany = ae.association.start.cardinality.isMany
          typeName = ae.association.start.references.name
        }
        var key = e.findKey
        retVal.add(
          '''«roleName»: «IF isMany»[«ENDIF»{ type: «IF key != null»«key.doTypeName»«ELSE»Schema.Types.ObjectId«ENDIF», ref: '«typeName»'}«IF isMany»]«ENDIF»''')
      }
    }

    return retVal
  }

}
