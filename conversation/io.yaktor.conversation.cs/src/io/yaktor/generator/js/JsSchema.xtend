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

  static def schematize(Projection t, String quote) {
    t.schematize(false, quote)
  }
  static def schematize(Projection t, boolean includeId, String quote) {
    var schem = new JsSchema2(t, quote)
    schem.docs.get(t.fullName).schematize(true, quote)
  }
  static def CharSequence itemize (Doc items, String quote) {
    items.itemize(false, quote)
  }
  static def CharSequence itemize (Doc items, boolean nest, String quote) {
    '''
      «IF items.type!=null»
        «items.typify(quote)»
      «ELSEIF items.ref!=null»
        «IF nest»
          «items.refDoc.schematize(nest, quote)»
        «ELSE»
          «quote»$ref«quote»: «quote»#/definitions/«items.ref»«quote»
        «ENDIF»
      «ENDIF»
    '''
  }
  static def CharSequence typify (Doc d, String quote) {
    '''
      «IF d.typeRef!=null»
        «quote»x-typeRef«quote»: «quote»«d.typeRef»«quote»,
      «ENDIF»
      «IF d.format!=null»
        «quote»format«quote»: «quote»«d.format»«quote»,
      «ENDIF»
      «IF d.dfault!=null»
        «quote»default«quote»: «IF d.type ==  Type.string»«quote»«ENDIF»«d.dfault»«IF d.type ==  Type.string»«quote»«ENDIF»,
      «ENDIF»
      «IF d.enm!=null»
        «quote»enum«quote»: [«quote»«d.enm.join('","')»«quote»],
      «ENDIF»
      «IF d.maximum!=null»
        «quote»maximum«quote»: «d.maximum»,
      «ENDIF»
      «IF d.minimum!=null»
        «quote»minimum«quote»: «d.minimum»,
      «ENDIF»
      «IF d.maxLength!=null»
        «quote»maxLength«quote»: «d.maxLength»,
      «ENDIF»
      «IF d.minLength!=null»
        «quote»minLength«quote»: «d.minLength»,
      «ENDIF»
      «IF d.pattern!=null»
        «quote»pattern«quote»: «quote»«d.pattern»«quote»,
      «ENDIF»
      «IF d.example!=null && d.example.toString.length>0»
        «quote»example«quote»: «d.example»,
      «ENDIF»
      «IF d.description!=null»
        «quote»description«quote»: «quote»«d.description»«quote»,
      «ENDIF»
      «quote»type«quote»: «quote»«d.type.name»«quote»
    '''
  }
  static def  CharSequence schematize(Doc d, String quote){
    d.schematize(false, quote)
  }
  static def  CharSequence schematize(Doc d, boolean nest, String quote){
    '''
    «IF d.requiredFields.length>0»
      «quote»required«quote»: [«quote»«d.requiredFields.join('''«quote», «quote»''')»«quote»],
    «ENDIF»
    «IF d.typeRef!=null»
      «quote»x-typeRef«quote»: «quote»«d.typeRef»«quote»,
    «ENDIF»
    «quote»properties«quote»: {
      «FOR pentry: d.properties.entrySet SEPARATOR ','»
        «quote»«pentry.key»«quote»: {
          «IF pentry.value.type!= null»
            «pentry.value.typify(quote)»
          «ELSEIF pentry.value.ref!= null»
            «IF nest»
              «pentry.value.refDoc.schematize(nest, quote)»
            «ELSE»
              «quote»$ref«quote»: «quote»#/definitions/«pentry.value.ref»«quote»
            «ENDIF»
          «ELSEIF pentry.value.items!=null»
            «IF d.format!=null»
              «quote»format«quote»: «quote»«d.format»«quote»,
            «ENDIF»
            «quote»type«quote»: «quote»array«quote»,
            «quote»items«quote»: {
              «pentry.value.items.itemize(nest, quote)»
            }
          «ENDIF»
        }
      «ENDFOR»
    }
    '''
  }
}
