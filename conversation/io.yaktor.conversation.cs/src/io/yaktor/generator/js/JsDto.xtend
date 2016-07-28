package io.yaktor.generator.js

import io.yaktor.domain.BooleanField
import io.yaktor.domain.DateField
import io.yaktor.domain.Entity
import io.yaktor.domain.Field
import io.yaktor.domain.IntegerField
import io.yaktor.domain.NumericField
import io.yaktor.domain.StringField
import io.yaktor.domain.TypeField
import io.yaktor.types.MappedField
import io.yaktor.types.Projection
import io.yaktor.types.ProjectionField
import static extension io.yaktor.generator.nodejs.NodeJsExtensions.*
import static extension io.yaktor.generator.util.CommentExtractorExtensions.*

import static extension io.yaktor.generator.js.JsTypesExtensions.*
import io.yaktor.types.ProjectionContainmentField
import io.yaktor.types.TypeContainmentField
import io.yaktor.domain.ShortIdField
import io.yaktor.domain.IdField

class JsDto {
  def genType(Projection p) {
    '''
      var converter = require('yaktor/services/conversionService')
      «IF p.type != null»
        var model = require('mongoose').model('«p.type.name»')
      «ENDIF»
      
      «p.comments»
      var type = «p.map(null)»
      converter.registerType('«p.fullName»', type)
      module.exports = type
    '''
  }

  def String map(Projection p, Field f) {
    var key = p?.type?.findKey
    '''
      new converter.Type(«IF p.type != null»'«p.type.name»'«ELSE»null«ENDIF», [
        «FOR projectionField : p.allProjectionFields SEPARATOR ','»
          «projectionField.map»
        «ENDFOR»
      ], {
        hasId: «p.type instanceof Entity»,
        keys: {«IF key != null» '«key.name»': true «ENDIF»}
      })
    '''
  }

  def map(ProjectionField f) {
    f.comments + switch (f) {
      TypeContainmentField: '''new converter.Field('«f.name»', '__«f.name»', '«f.eClass.name»', «f.projection.
        map(f.field)»)'''
      MappedField case f.projection != null: '''new converter.Field('«f.name»', '«f.field.name»', '«f.field.eClass.
        name»', «f.projection.map(f.field)»)'''
      ProjectionContainmentField: '''new converter.Field('«f.name»', '__«f.name»', '«f.eClass.name»', «f.
        projection.map(f.field)»)'''
      ProjectionField case f.field != null && f.field instanceof TypeField: '''new converter.Field('«f.name»', '«f.
        field.name»', '«f.field.eClass.name»', «f.field.map»)'''
      ProjectionField case f.field != null: '''new converter.Field('«f.name»', '«f.field.name»', '«f.field.eClass.
        name»', null, «f.field.map»)'''
      default: '''new converter.Field('«f.name»', '__«f.name»','«f.eClass.name»')'''
    }
  }

  def map(Field f) {
    switch (f) {
      IdField: '''
        {}
      '''
      ShortIdField: '''
        {}
      '''
      StringField: '''
      {
        «IF f.obscured»obscured: true,«ENDIF»
        «IF !f.pattern.nullOrEmpty»pattern: /«f.pattern»/,«ENDIF»
        «IF f.maxLength > 0»maxLength: «f.minLength»,«ENDIF»
        «IF f.minLength > 0»minLength :«f.minLength»,«ENDIF»
        «IF !f.defaultValue.nullOrEmpty»default: '«f.defaultValue»',«ENDIF»
        type: 'string'
      }'''
      NumericField: '''
      {
        «IF !f.maxValue.nullOrEmpty»max:«f.maxValue»,«ENDIF»
        «IF !f.minValue.nullOrEmpty»min: «f.minValue»,«ENDIF»
        «IF !f.defaultValue.nullOrEmpty»default: «f.defaultValue»,«ENDIF»
        type: 'number'
      }'''
      IntegerField: '''
      {
        «IF !f.maxValue.nullOrEmpty»max: «f.maxValue»,«ENDIF»
        «IF !f.minValue.nullOrEmpty»min: «f.minValue»,«ENDIF»
        «IF !f.defaultValue.nullOrEmpty»default: «f.defaultValue»,«ENDIF»
        type: 'integer'
      }'''
      DateField: '''
      {
        «IF !f.before.nullOrEmpty»max: new Date(Date.parse('«f.before»')),«ENDIF»
        «IF !f.after.nullOrEmpty»min: new Date(Date.parse('«f.after»')),«ENDIF»
        «IF !f.defaultValue.nullOrEmpty»default: new Date(Date.parse('«f.defaultValue»')),«ENDIF»
        type: 'string'
      }'''
      BooleanField: '''
      {
        «IF !f.defaultValue.nullOrEmpty»,default: «f.defaultValue»,«ENDIF»
        type: 'boolean'
      }'''
      TypeField:
        f.comments + '''
          «f.toProjection.map(f)»
        '''
      default:
        'null'
    }
  }
}
