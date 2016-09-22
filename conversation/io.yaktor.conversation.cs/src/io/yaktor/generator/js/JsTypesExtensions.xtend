package io.yaktor.generator.js

import io.yaktor.conversation.Agent
import io.yaktor.conversation.Conversation
import io.yaktor.domain.AssociationEnd
import io.yaktor.domain.Entity
import io.yaktor.domain.EntityReferenceField
import io.yaktor.domain.Field
import io.yaktor.domain.TableType
import io.yaktor.domain.TypeField
import io.yaktor.types.MappedField
import io.yaktor.types.NewField
import io.yaktor.types.Projection
import io.yaktor.types.ProjectionContainmentField
import io.yaktor.types.ProjectionField
import io.yaktor.types.TypesFactory
import io.yaktor.types.impl.ProjectionFieldImpl
import java.util.LinkedList
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.InternalEObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.nodemodel.ICompositeNode
import org.eclipse.xtext.resource.XtextResource

import static java.util.Collections.*

import static extension io.yaktor.generator.nodejs.NodeJsExtensions.*
import static extension io.yaktor.generator.js.JsExtensions.*

import io.yaktor.domain.SimpleField
import io.yaktor.access.RestService
import io.yaktor.access.RestAccess
import java.util.HashSet
import io.yaktor.domain.ShortIdField
import io.yaktor.conversation.Event

class JsTypesExtensions {
  static def methods(RestService r){
    var set=new HashSet<RestAccess>
    for (a : r.accessGroups  ){
      set.addAll(a.accessMethods)
    }
    set
  }
  static def int length(ShortIdField field){
    if(field.pattern != null){
      Math.ceil(Math.log((field.maxValue?:Integer.MAX_VALUE).doubleValue)/Math.log(field.pattern.length)) as int
    } else {
      6
    }
  }
  static def <T extends EObject> T proxy(T o) {
    if (o.eIsProxy) {
      return o
    } else {
      var InternalEObject result = EcoreUtil.create(o.eClass) as InternalEObject;
      result.eSetProxyURI(EcoreUtil.getURI(o));
      result as T;
    }
  }

  static def <T extends EObject> T resolve(T o) {
    if (o.eIsProxy) {
      EcoreUtil.resolve(o, null as Resource) as T
    } else {
      o
    }
  }

  static def Field getField(ProjectionField f) {
    f.newField ?: f.oldField
  }

  static def setField(ProjectionField ff, Field f) {
    switch (ff) {
      NewField: ff.newField = f
      MappedField: ff.oldField = f
    }
  }
  static def toProjection(TypeField field){
    var fields = field.isType.superAllFields.filter(SimpleField).map[ff|
      var mf = TypesFactory.eINSTANCE.createMappedField;
      mf.setField(ff);
      return mf;
    ]
    var p = TypesFactory.eINSTANCE.createProjection;
    p.fields.addAll(fields)
    var m = TypesFactory.eINSTANCE.createMappedField
    m.field = field
    p.setParent(m)
    p
  }

  static def name(ProjectionField f) {
    var empty = "(null)"
    switch (f) {
      ProjectionContainmentField:
        f.alias ?: empty
      default:
        if (f.field != null) {
          f.alias ?: f.field.name ?: empty
        } else {
          empty
        }
    }

  }

  static def String fullName(ProjectionField f) {
    if (f.parent != null && f.parent.parent != null) {
      f.parent.parent.fullName + "." + f.name
    } else {
      f.name
    }
  }

  static def Projection rootProjection(ProjectionField f) {
    if (f.parent != null && f.parent.parent != null) {
      f.parent.parent.rootProjection
    } else if (f.parent != null) {
      f.parent
    } else {
      null
    }
  }
  static def fullName(Projection t) {
    var con = t.eContainer
    switch con {
      Agent: '''«con.parent.name».«con.name».«t.name»'''
      Conversation: '''«con.name».«t.name»'''
      Event: '''«con.parent.parent.name».«con.parent.name».«con.name»'''
      //Don't know why this is here???
      ProjectionField:
        t.alias ?: con.name
      default: '''«t.name»'''
    }.toString()
  }

  static def TableType getType(ProjectionField p) {
    switch (p) {
      MappedField: {
        var type = p.oldField ?: p.newField
        switch (type) {
          AssociationEnd: type.references
          EntityReferenceField: type.refType
          TypeField: type.isType
        }
      }
    }
  }

  static def TableType getType(Projection p) {
    p.entity ?: p.parent.type
  }

  static def getMany(ProjectionField p) {
    switch (p) {
      ProjectionContainmentField: p.cardinality.isMany
      default: p.field.many
    }

  }
  static def getRequired(ProjectionField p) {
    switch (p) {
      ProjectionContainmentField: p.cardinality.required
      default: p.field.required
    }

  }

  static def getSuperAllFields(Projection p) {
    var type = (p.entity ?: p.parent.type)
    type.superAllFields
  }

  static def getSuperAllFields(TableType type) {
    var allfields = type.allFields;
    switch (type) {
      Entity: allfields.addAll(type.associationEnds.opposites)
    }
    return allfields;
  }


  static def Iterable<ProjectionField> getAllProjectionFields(TableType type, Projection p) {
    var allProjectionFields = new LinkedList<ProjectionField>
    for (field : type.superAllFields) {
      var mappedField = TypesFactory.eINSTANCE.createMappedField as ProjectionFieldImpl;
      type.eResource.contents.add(mappedField)
      mappedField.basicSetParent(p,null)
      mappedField.field = field;
      allProjectionFields.add(mappedField);
    }
    allProjectionFields
  }

  static def Iterable<ProjectionField> getAllProjectionFields(Projection p) {
    if (p.fields.size > 0) {
      p.fields
    } else if (p.type != null) {
      p.type.getAllProjectionFields(p).sortWith[f1,f2|f1.name.compareTo(f2.name)]
    } else {
      #[]
    }
  }

  static def getRoot(EObject eObject) {
    var parseResult = (eObject.eResource as XtextResource).parseResult
    if (parseResult != null) {
      var ICompositeNode rootNode = parseResult.getRootNode();
      singleton(rootNode)
    }
  }

}
