package io.yaktor.generator.util

import com.google.inject.Inject
import org.eclipse.xtext.documentation.impl.MultiLineCommentDocumentationProvider
import org.eclipse.emf.ecore.EObject

class CommentExtractorExtensions {
  @Inject
  static MultiLineCommentDocumentationProvider mlcdp
  
  static def String[] getBareComments(EObject eObject) {
    var doc = mlcdp.getDocumentation(eObject)
    if (doc == null) {
      #[]
    } else {
      doc.split("\n")
    }
  }

  static def getComments(EObject eObject) {
    var doc = mlcdp.getDocumentation(eObject)
    if (doc == null) {
      ""
    } else {
      '''
        «FOR comment : eObject.bareComments BEFORE '/**\n' AFTER ' */\n'»
          «" "»* «comment»
        «ENDFOR»
      '''
    }
  }

}
