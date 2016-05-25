package io.yaktor.generator.js

import io.yaktor.domain.DateField
import io.yaktor.domain.Field
import io.yaktor.domain.IntegerField
import io.yaktor.domain.NumericField
import io.yaktor.domain.StringField
import io.yaktor.domain.TypeField
import io.yaktor.types.MappedField
import io.yaktor.types.Projection
import io.yaktor.types.ProjectionField
import java.text.SimpleDateFormat
import java.util.Date
import java.util.TimeZone

import static extension io.yaktor.generator.js.JsTypesExtensions.*
import static extension io.yaktor.generator.js.JsData.*
import static extension io.yaktor.generator.nodejs.NodeJsExtensions.*
import static extension io.yaktor.generator.util.CommentExtractorExtensions.*
import io.yaktor.domain.AssociationEnd
import io.yaktor.domain.EntityReferenceField
import io.yaktor.domain.TableType
import io.yaktor.domain.EnumField
import io.yaktor.domain.AmountField
import io.yaktor.domain.GeoLocationField
import io.yaktor.types.ProjectionContainmentField
import io.yaktor.domain.BooleanField
import io.yaktor.domain.ShortIdField
import io.yaktor.domain.IdField
import io.yaktor.domain.Entity
import java.util.Map
import java.util.UUID
import java.util.List
import java.util.LinkedList
import java.util.LinkedHashMap
import org.eclipse.emf.ecore.EObject

class JsSchema2 {
  static class Doc {
    public Object example
    public String[] enm
    public Object maximum
    public Object minimum
    public Object maxLength
    public Object minLength
    public Object dfault
    public String pattern
    public String format
    public String description
    public Doc items
    public Type type
    public String ref
    public Doc refDoc
    public boolean required = false;
    public List<String> requiredFields = new LinkedList<String>
    public String typeRef
    public Map<String, Doc> properties = new LinkedHashMap
  }

  public Map<String, Doc> docs = new LinkedHashMap

  new(Projection t) {
    t.type(true, true)
  }

  static def dateTime(Date date) {
    var fmt = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
    fmt.setTimeZone(TimeZone.getTimeZone("UTC"));
    return fmt.format(date);
  }

  static def date(Date date) {
    var fmt = new SimpleDateFormat("yyyy-MM-dd");
    fmt.setTimeZone(TimeZone.getTimeZone("UTC"));
    return fmt.format(date);
  }

  def type(Projection t, boolean includeId) {
    t.type(includeId, true)
  }

  def type(Projection t, boolean includeId, boolean root) {
    var fields = t.allProjectionFields
    val key = t.type?.keys?.head
    var isKeyed = fields.filter[f|(f?.oldField ?: "").equals(key)].size > 0
    var doc = {
      var Doc d = new Doc();
      if (t.getType != null && t.getType instanceof Entity) {
        d.typeRef = '''«t.getType.model.name».«t.getType.name»'''
      }
      var type = t.getType()
      if (!isKeyed && includeId && type != null && !(type instanceof io.yaktor.domain.Type)) {
        d.properties.put("_id", type.refDef(false))
      }
      for (field : fields) {
        var f = field(field)
        d.properties.put(field.name, f)
        if (f.required) {
          d.requiredFields.add(field.name)
        }
      }
      d
    }
    if (root) {
      docs.put(t.fullName.toString(), doc)
    }
    doc
  }

  def Doc field(ProjectionField field) {
    var fi = if (field.many) {
        var d = new Doc()
        d.items = {
          var f = field.typeDef
          if (f.properties.size > 0) {
            var dd = new Doc()
            dd.refDoc = f
            dd.ref = field.name + "#" + UUID.randomUUID().toString.replace("-", "")
            docs.put(dd.ref, f)
            dd
          } else {
            f
          }
        }
        d
      } else {
        var f = field.typeDef
        if (f.properties.size > 0) {
          var dd = new Doc()
          dd.refDoc = f
          dd.ref = field.name + "#" + UUID.randomUUID().toString.replace("-", "")
          docs.put(dd.ref, f)
          dd
        } else {
          f
        }
      }
    fi.required = field.required
    fi.description = field.cleanComments
    fi
  }

  def Doc typeDef(ProjectionField field) {
    switch (field) {
      ProjectionContainmentField: {
        field.projection.type(true, false)
      }
      MappedField case field.projection != null:
        field.projection.type(true)
      default:
        (field.oldField ?: field.newField).typeDef
    }
  }

  def Doc typeDef(Field field) {
    var entity = switch field {
      GeoLocationField: {
        var d = new Doc
        d.format = "geo"
        d.type = Type.array
        d.items = {
          var dd = new Doc
          dd.type = Type.number
          dd
        }
        d
      }
      AmountField: {
        var d = new Doc
        d.format = "amount"
        d.type = Type.number
        d
      }
      ShortIdField: {
        var d = new Doc
        if (field.pattern != null) {
          d.pattern = '''[«field.pattern.replace("\\", "\\\\")»]{1,«field.length»}'''
        } else {
          d.pattern = '''(\\w|[-]){1,«field.length»}'''
        }
        d.type = Type.string
        d
      }
      IdField: {
        _id(field.name)
      }
      StringField: {
        var d = new Doc
        if (field.pattern != null) {
          d.pattern = field.pattern.replace("\\", "\\\\")
        }
        if (field.maxLength > 0) {
          d.maxLength = field.maxLength
        }
        if (field.minLength > 0) {
          d.minLength = field.minLength
        }
        d.dfault = field.defaultValue
        if (field.obscured) {
          d.format = "obscured"
        }
        d.type = Type.string
        d
      }
      BooleanField: {
        var d = new Doc
        if (field.defaultValue != null) {
          d.dfault = field.defaultValue
        }
        d.type = Type.bool
        d
      }
      NumericField: {
        var d = new Doc
        d.maximum = field.maxValue
        d.minimum = field.minValue
        d.type = Type.number
        d
      }
      DateField: {
        var d = new Doc
        d.maximum = field.before
        d.minimum = field.after
        d.format = "date-time"
        //        "future":«field.future»,
        //        "past":«field.past»,
        d.dfault = field.defaultValue
        d.type = Type.string
        d
      }
      IntegerField: {
        var d = new Doc
        d.maximum = field.maxValue
        d.minimum = field.minValue
        d.dfault = field.defaultValue
        d.type = Type.integer
        d
      }
      EnumField: {
        var d = new Doc
        var enumType = field.isType
        d.type = Type.string
        d.dfault = field.defaultValue
        d.enm = enumType.values.map[e|e.value]
        d
      }
      //We will give you a mapping but it won't go any deeper
      TypeField: {
        field.toProjection.type(false)
      }
      AssociationEnd:
        field.references.refDef(true)
      EntityReferenceField:
        field.refType.refDef(true)
      // Price Amount Count fields
      default: {
        var d = new Doc
        d.format = field.class.simpleName
        d.type = Type.string
        d
      }
    }
    entity.description = field.cleanComments
    entity.example = field.genData
    entity.required = field.required
    entity
  }
  
  static def String getCleanComments(EObject field) {
    var comments = field.bareComments
    if(comments.length>0){
      return comments.join('\u2424').replace('"','\\"').replace("\t","  ") 
    }
  }

  def Doc _id(String name){
    var dd = new Doc()
    dd.type = Type.string
    dd.format = "objectId"
    dd.pattern = "[A-Z0-9]{24}"
    dd.example = (name?:"1").genIdValue
    dd
  }

  def Doc refDef(TableType type, boolean includeRef) {
    var key = type.findKey
    var d = if (key != null) {
        key.typeDef
      } else {
        _id(type.name)
      }
    if (includeRef) {
      d.typeRef = '''«type.model.name».«type.name»'''
    }
    d
  }
}
