package io.yaktor.generator.js

import io.yaktor.types.Projection
import java.text.SimpleDateFormat
import java.util.Date
import java.util.TimeZone

import static extension io.yaktor.generator.js.JsTypesExtensions.*
import io.yaktor.generator.js.JsSchema2.Doc

class JsSchema {
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

  static def schemafy(Projection t) {
    t.schemafy(false)
  }
  static def schemafy(Projection t, boolean includeId) {
    var schem = new JsSchema2(t)
    schem.docs.get(t.fullName).schemafy(true)
  }
  
  static def CharSequence typafy (Doc d) {
    '''
      «IF d.typeRef!=null»
        "$typeRef":"«d.typeRef»",
      «ENDIF»
      «IF d.format!=null»
        "format":"«d.format»",
      «ENDIF»
      «IF d.dfault!=null»
        "default":"«d.dfault»",
      «ENDIF»
      «IF d.enm!=null»
        "enum":["«d.enm.join('","')»"],
      «ENDIF»
      «IF d.maximum!=null»
        "maximum":"«d.maximum»",
      «ENDIF»
      «IF d.minimum!=null»
        "minimum":"«d.minimum»",
      «ENDIF»
      «IF d.maxLength!=null»
        "maxLength":"«d.maxLength»",
      «ENDIF»
      «IF d.minLength!=null»
        "minLength":"«d.minLength»",
      «ENDIF»
      «IF d.pattern!=null»
        "pattern":"«d.pattern»",
      «ENDIF»
      «IF d.example!=null && d.example.toString.length>0»
        "example":«d.example»,
      «ENDIF»
      «IF d.description!=null»
        "description":"«d.description»",
      «ENDIF»
      "type":"«d.type.name»"
    '''
  }
  static def  CharSequence schemafy(Doc d, boolean nest){
    '''
    «IF d.requiredFields.length>0»
      "required":["«d.requiredFields.join('","')»"],
    «ENDIF»
    «IF d.typeRef!=null»
      "$typeRef":"«d.typeRef»",
    «ENDIF»
    "properties":{
      «FOR pentry: d.properties.entrySet SEPARATOR ','»
        "«pentry.key»":{
          «IF pentry.value.type!= null»
            «pentry.value.typafy»
          «ELSEIF pentry.value.ref!= null»
            «IF nest»
              «pentry.value.refDoc.schemafy(nest)»
            «ELSE»
              "$ref":"#/definitions/«pentry.value.ref»"
            «ENDIF»
          «ELSEIF pentry.value.items!=null»
            «IF d.format!=null»
              "format":"«d.format»",
            «ENDIF»
            "type":"array",
            "items":{
              «IF pentry.value.items.type!=null»
                «pentry.value.items.typafy»
              «ELSEIF pentry.value.items.ref!=null»
                «IF nest»
                  «pentry.value.items.refDoc.schemafy(nest)»
                «ELSE»
                  "$ref":"#/definitions/«pentry.value.items.ref»"
                «ENDIF»
              «ENDIF»
            }
          «ENDIF»
        }
      «ENDFOR»
    }
    '''
  }
}
