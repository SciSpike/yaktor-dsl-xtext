package io.yaktor.generator

import com.google.inject.Inject
import io.yaktor.domain.Association
import io.yaktor.domain.AssociationRef
import io.yaktor.domain.DomainModel
import io.yaktor.domain.MongoNodeGenOptions
import io.yaktor.generator.nodejs.NodeJsGenerator
import io.yaktor.generator.nodejs.NodeMochaTestGenerator
import io.yaktor.util.AssociationComparator
import java.util.HashMap
import java.util.HashSet
import java.util.Map
import java.util.Set
import java.util.TreeSet
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import io.yaktor.generator.doc.ADocGenerator
import io.yaktor.generator.util.RubyScripts
import io.yaktor.generator.util.MiscStaticFiles
import io.yaktor.generator.plantuml.PlantUMLGenerator

//import static extension org.eclipse.xtext.xbase.lib.ResourceExtensions.*
//import static extension org.eclipse.xtext.xtend2.lib.ResourceExtensions.*
class DomainGenerator implements IGenerator {

  @Inject extension DotDomainGenerator dotGen
  @Inject extension DaoGenerator daoGen
  @Inject extension ControllerGenerator conGen
  @Inject extension ResourceGenerator resGen
  @Inject extension PropertiesGenerator propGen
  @Inject extension ViewsGenerator viewGen
  @Inject extension WebXmlGenerator webGen
  @Inject extension PomGenerator pomGen
  @Inject extension StylesGenerator stylesGen
  @Inject extension ClassesGenerator classesGen
  @Inject extension LayoutsGenerator layoutsGen
  @Inject extension WebMvcGenerator webMvcGen
  @Inject extension TagsGenerator tagsGen
  @Inject extension NodeJsGenerator nodeGen
  @Inject extension NodeMochaTestGenerator nodeTestGen
  @Inject extension ADocGenerator aDocGen
  @Inject extension RubyScripts rbGen
  @Inject extension MiscStaticFiles miscGen
  @Inject extension PlantUMLGenerator plantUMLGen

  override void doGenerate(Resource resource, IFileSystemAccess fsa) {
    var DomainModel spec = resource.getAllContents.filter(typeof(DomainModel)).head

    fsa.generateFile('dot/domain/' + spec.name + '.dot', spec.genDotRepresentation())
    fsa.generateFile('plantUML/' + spec.name + '.plantuml', spec.genCompleteUMLClassDiagram)
    fsa.generateFile('domain/' + spec.name + '/reference.adoc', DomainOutputConfigurationProvider.DOC, spec.genADoc)
    fsa.generateFile('buildAll.rb', DomainOutputConfigurationProvider.DOC, rbGen.genCompileAsciiDocScript)
    fsa.generateFile('README.MD', DomainOutputConfigurationProvider.DOC, miscGen.genDocumentationReadme)
    fsa.generateFile('css/riak.css', DomainOutputConfigurationProvider.DOC, miscGen.genDocumentationCss)
    if (spec.genOptions != null) {
      if (spec.genOptions instanceof MongoNodeGenOptions) {
        var ngo = spec.genOptions as MongoNodeGenOptions
        nodeGen.generate(fsa, spec)
        if (ngo.generateTest) {
          nodeTestGen.generate(fsa, spec)
        }
      } else {
        var Iterable<Association> ascLst = spec.types.filter(typeof(Association))
        var Iterable<AssociationRef> ascRefLst = spec.types.filter(typeof(AssociationRef))

        var Set<Association> ascSet = new HashSet<Association>()

        for (Association asc : ascLst) {
          ascSet.add(asc)
        }
        for (AssociationRef asc : ascRefLst) {
          ascSet.add(asc.ref)
        }

        var Map<String, Set<Association>> ascStrMap = getAssocMap(ascSet, true)
        var Map<String, Set<Association>> ascEndMap = getAssocMap(ascSet, false)

        daoGen.genJavaClasses(fsa, spec, ascStrMap, ascEndMap)
        conGen.genJavaClasses(fsa, spec, ascStrMap, ascEndMap)
        conGen.genConversionService(fsa, spec)
        resGen.genResources(fsa, spec)
        propGen.genAppProperties(fsa, spec, ascStrMap, ascEndMap)
        viewGen.genViews(fsa, spec, ascStrMap, ascEndMap)
        webGen.genWebXml(fsa, spec)
        pomGen.genPom(fsa, spec)
        stylesGen.genStyles(fsa, spec)
        classesGen.genClasses(fsa, spec)
        layoutsGen.genLayouts(fsa, spec)
        webMvcGen.genWebMvc(fsa, spec)
        tagsGen.genTags(fsa, spec)
      }
    }
  }

  def getAssocMap(Set<Association> ascLst, boolean isStr) {
    var Map<String, Set<Association>> map = new HashMap<String, Set<Association>>()
    var nam = ''
    for (asc : ascLst) {
      if (isStr || !asc.isUnidirectional) {
        if (isStr) {
          nam = asc.start.references.name
        } else {
          nam = asc.end.references.name
        }
        if (!map.containsKey(nam)) {
          map.put(nam, new TreeSet<Association>(new AssociationComparator()))
        }
        map.get(nam).add(asc)
      }
    }

    return map
  }

}
