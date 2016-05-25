package io.yaktor.generator

import com.google.inject.Inject
import io.yaktor.domain.DomainModel
import io.yaktor.domain.InclusionType
import io.yaktor.util.Constants
import io.yaktor.util.DslDomainUtil
import io.yaktor.util.FileUtil
import io.yaktor.util.InclusionCat
import org.eclipse.xtext.generator.IFileSystemAccess

class ClassesGenerator {

  @Inject extension FileUtil fileUtil
  @Inject extension DslDomainUtil dslDomainUtil

  def genClasses(IFileSystemAccess fsa, DomainModel spec) {
    var inc = spec.getInclusionType(InclusionCat::CLASSES)
    if (inc != InclusionType::NONE) {
      fileUtil.generateFile(fsa, Constants::webInfBase, 'classes', 'alt.properties', genAlt(),
        inc == InclusionType::PROTECTED)
      fileUtil.generateFile(fsa, Constants::webInfBase, 'classes', 'standard.properties', genStandard(),
        inc == InclusionType::PROTECTED)
    }
  }

  def genAlt() {
    '''
      styleSheet=resources/styles/alt.css
       '''
  }

  def genStandard() {
    '''
      styleSheet=resources/styles/standard.css
       '''
  }
}
