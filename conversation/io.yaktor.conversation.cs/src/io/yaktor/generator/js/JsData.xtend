package io.yaktor.generator.js

import io.yaktor.conversation.Event
import io.yaktor.domain.AmountField
import io.yaktor.domain.AnyField
import io.yaktor.domain.AssociationEnd
import io.yaktor.domain.BooleanField
import io.yaktor.domain.CountField
import io.yaktor.domain.DateField
import io.yaktor.domain.DomainFactory
import io.yaktor.domain.EntityReferenceField
import io.yaktor.domain.EnumField
import io.yaktor.domain.Field
import io.yaktor.domain.GeoLocationField
import io.yaktor.domain.IdField
import io.yaktor.domain.IntegerField
import io.yaktor.domain.NumericField
import io.yaktor.domain.PriceField
import io.yaktor.domain.ShortIdField
import io.yaktor.domain.StringField
import io.yaktor.domain.TableType
import io.yaktor.domain.TypeField
import io.yaktor.types.MappedField
import io.yaktor.types.NewField
import io.yaktor.types.Projection
import io.yaktor.types.ProjectionContainmentField
import io.yaktor.types.ProjectionField
import java.math.BigInteger
import java.nio.ByteBuffer

import static extension io.yaktor.generator.js.JsTypesExtensions.*
import static extension io.yaktor.generator.nodejs.NodeJsExtensions.*
import java.util.TimeZone
import java.text.SimpleDateFormat
import java.text.DateFormat
import java.util.Date

class JsData {
  static def genData(Event event, String quote) {
    var type = event.refType
    if (type != null) {
      type.genData(quote)
    } else {
      'null'
    }
  }

  static def CharSequence genData(TableType type, String quote) {
    '''
      {
        «FOR field : type.allFields SEPARATOR ','»
          «quote»«field.name»«quote»: «IF field.many»[«ENDIF»«field.genData(quote)»«IF field.many»]«ENDIF»
        «ENDFOR»
      }
    '''
  }

  static def genData(ProjectionField field, String quote) {
    switch (field) {
      ProjectionContainmentField:
        field.projection.genData(quote)
      MappedField: {
        if (field.projection == null) {
          field.field.genData(quote)
        } else {
          field.projection.genData(quote)
        }
      }
      NewField:
        field.field.genData(quote)
    }
  }

  static def String genData(Projection projection, String quote) {
    var fields = projection.allProjectionFields
    '''
      {
        «IF projection.type != null»
           «quote»_id«quote»: «projection.type.genTypeId(projection, quote)»«IF fields.size > 0»,«ENDIF»
        «ENDIF»
        «FOR f : fields SEPARATOR ','»
          «quote»«f.name»«quote»: «IF f.many»[«ENDIF»«f.genData(quote)»«IF f.many»]«ENDIF»
        «ENDFOR»
      }
    '''
  }

  static def CharSequence genTypeId(TableType type, Projection p, String quote) {
    var key = type.keys?.head
    if (key != null) {
      key.genData(quote)
    } else {
      var field = DomainFactory.eINSTANCE.createIdField();
      field.name = type.name?:p.name;
      field.genData(quote)
    }
  }

  static def repeat(String s, int count) {
    var b = new StringBuffer;
    for (var i = 0; i < count; i++) {
      b.append(s);
    }
    b
  }

  static def genIdValue(String name, String quote){
    '''«quote»«new BigInteger(1,ByteBuffer.allocate(12).putInt(-1).putInt(0).putInt((name?:"").hashCode).array).toString(16)»«quote»'''
  }
  static def genValue(Date d, String quote) {
    var TimeZone tz = TimeZone.getTimeZone("UTC");
    var DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'");
    df.setTimeZone(tz);
    var isoValue = df.format(d);
    '''«quote»«isoValue»«quote»'''
  }
  static def genData(Field field, String quote) {
    switch field {
      IdField: field?.name.genIdValue(quote)
      ShortIdField case field.pattern.nullOrEmpty: '''«quote»«"A".repeat(field.length)»«quote»'''
      ShortIdField case !field.pattern.nullOrEmpty: '''«quote»«field.pattern.substring(0, 1).repeat(field.length)»«quote»'''
      AmountField: '''«field.name.hashCode.bitwiseAnd(0xFF).bitwiseOr(0xF00) / 100.0»'''
      AnyField: '''«quote»any«quote»'''
      AssociationEnd: '''«quote»«field.references.name.hashCode»«quote»'''
      BooleanField: '''«false»'''
      CountField: "0"
      DateField: new Date((field?.name?:"1").hashCode *10L).genValue(quote)
      EnumField: '''«quote»«field.isType.values.head.value»«quote»'''
      GeoLocationField:
        "[46.853617, -121.759758]"
      IntegerField: '''«field.name.hashCode.bitwiseAnd(0xFF).bitwiseOr(0xF0)»'''
      NumericField: '''«field.name.hashCode.bitwiseAnd(0xFF).bitwiseOr(0xF00) / 100.0»'''
      PriceField: '''«field.name.hashCode.bitwiseAnd(0xFF).bitwiseOr(0xF00) / 100.0»'''
      EntityReferenceField: '''«field.refType.genTypeId(null, quote)»'''
      StringField: '''«quote»«field.name»«quote»'''
      TypeField:
        field.isType.genData(quote)
      default: '''«field.class.simpleName»'''
    }
  }
}
