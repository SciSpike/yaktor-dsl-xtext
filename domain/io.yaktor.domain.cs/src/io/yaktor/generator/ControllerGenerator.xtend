package io.yaktor.generator

import com.google.inject.Inject
import io.yaktor.domain.Association
import io.yaktor.domain.DomainModel
import io.yaktor.domain.EnumField
import io.yaktor.domain.InclusionType
import io.yaktor.domain.NamedType
import io.yaktor.domain.SimpleField
import io.yaktor.domain.TableType
import io.yaktor.domain.TypeField
import io.yaktor.util.Constants
import io.yaktor.util.DslDomainUtil
import io.yaktor.util.FileUtil
import io.yaktor.util.InclusionCat
import java.util.HashSet
import java.util.Map
import java.util.Set
import org.eclipse.xtext.generator.IFileSystemAccess

class ControllerGenerator {

  @Inject extension FileUtil fileUtil
  @Inject extension DslDomainUtil dslDomainUtil
  @Inject extension GeneratorExtensions genExt

  
  def genJavaClasses(IFileSystemAccess fsa, DomainModel spec, Map<String, Set<Association>> ascStrMap, Map<String, Set<Association>> ascEndMap) {
    var inc = spec.getInclusionType(InclusionCat::CONTROLLER)
    if (inc != InclusionType::NONE) {
	    for(type: spec.types) {
	    	if (type instanceof TableType && !(type as TableType).isAbstract) {
	  	      fileUtil.generateFile(fsa, Constants::javaBase, spec.genOptions.getRootPackage+'.'+spec.genOptions.getControllerSubpackage, type.name+'Controller.java', type.genClass(spec, ascStrMap, ascEndMap), inc == InclusionType::PROTECTED)
	    	}
	    }
    }
  }


  def genConversionService(IFileSystemAccess fsa, DomainModel spec) {
    var inc = spec.getInclusionType(InclusionCat::CONTROLLER)
    if (inc != InclusionType::NONE) {
	  	fileUtil.generateFile(fsa, Constants::javaBase, spec.genOptions.getRootPackage+'.'+spec.genOptions.getControllerSubpackage, 'ApplicationConversionServiceFactoryBean.java', spec.genConversionService(), inc == InclusionType::PROTECTED)
	  }
  }


  def genConversionService(DomainModel spec) {'''
  package «spec.genOptions.getRootPackage».«spec.genOptions.getControllerSubpackage»;
  
  import «spec.genOptions.getRootPackage».«spec.genOptions.domainSubpackage».*;
  import org.springframework.beans.factory.annotation.Configurable;
  import org.springframework.core.convert.converter.Converter;
  import org.springframework.format.FormatterRegistry;
  import org.springframework.format.support.FormattingConversionServiceFactoryBean;
  
  @Configurable
  /**
  * A central place to register application converters and formatters. 
  */
  public class ApplicationConversionServiceFactoryBean extends FormattingConversionServiceFactoryBean {
  
  @Override
  protected void installFormatters(FormatterRegistry registry) {
  	super.installFormatters(registry);
  	// Register application converters and formatters
  }
  
    «FOR type: spec.types»
      «IF type instanceof TableType && !(type as TableType).isAbstract»
        public Converter<«type.name», String> get«type.name»ToStringConverter() {
          return new org.springframework.core.convert.converter.Converter<«spec.genOptions.getDomainPackage».«type.name», java.lang.String>() {
            public String convert(«type.name» «type.name.toFirstLower») {
            «getFieldConv(type as TableType)»
            }
          };
        }
        
        public Converter<Long, «type.name»> getIdTo«type.name»Converter() {
          return new org.springframework.core.convert.converter.Converter<java.lang.Long, «spec.genOptions.getDomainPackage».«type.name»>() {
              public «spec.genOptions.getDomainPackage».«type.name» convert(java.lang.Long id) {
                  return «type.name».find«type.name»(id);
              }
          };
        }
        
        public Converter<String, «type.name»> getStringTo«type.name»Converter() {
          return new org.springframework.core.convert.converter.Converter<java.lang.String, «spec.genOptions.getDomainPackage».«type.name»>() {
              public «spec.genOptions.getDomainPackage».«type.name» convert(String id) {
                  return getObject().convert(getObject().convert(id, Long.class), «type.name».class);
              }
          };
        }
      «ENDIF»
    «ENDFOR»
  
    public void installLabelConverters(FormatterRegistry registry) {
    «FOR type: spec.types»
    «IF type instanceof TableType && !(type as TableType).isAbstract»
      registry.addConverter(get«type.name»ToStringConverter());
      registry.addConverter(getIdTo«type.name»Converter());
      registry.addConverter(getStringTo«type.name»Converter());
    «ENDIF»
    «ENDFOR»
    }
  
    public void afterPropertiesSet() {
        super.afterPropertiesSet();
        installLabelConverters(getObject());
      }
  }
  '''
  }


  def dispatch genClass(NamedType type, DomainModel spec, Map<String, Set<Association>> ascStrMap, Map<String, Set<Association>> ascEndMap) {
  }
  
  
  def dispatch genClass(TableType type, DomainModel spec, Map<String, Set<Association>> ascStrMap, Map<String, Set<Association>> ascEndMap) {'''
    package «spec.genOptions.getControllerPackage»;

    «genImports()»
    «genRefImports(spec.genOptions.getControllerPackage, type, ascStrMap.get(type.name), ascEndMap.get(type.name))»
    «IF type.supertype != null»
      «genRefImports(spec.genOptions.getControllerPackage, type.supertype, ascStrMap.get(type.supertype.name), ascEndMap.get(type.supertype.name))»
   «ENDIF»
    @RequestMapping("/«type.name.lowerPlural»")
    @Controller
    public class «type.name»Controller {

      «genCreate(type)»
      «genCreateForm(type, ascStrMap.get(type.name), ascEndMap.get(type.name))»
      «genShow(type)»
      «genList(type)»
      «genUpdate(type)»
      «genUpdateForm(type)»
      «genDelete(type)»
      «genPopulateEditForm(type, ascStrMap, ascEndMap)»
      «genEncodeUrlPathSegment(type)»
    }
    '''
  }
	

  def genImports() {'''
    import java.util.Arrays;
    import java.util.ArrayList;
    import java.util.List;
    import java.io.UnsupportedEncodingException;
    import javax.servlet.http.HttpServletRequest;
    import javax.validation.Valid;
    import org.springframework.stereotype.Controller;
    import org.springframework.ui.Model;
    import org.springframework.validation.BindingResult;
    import org.springframework.web.bind.annotation.PathVariable;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RequestMethod;
    import org.springframework.web.bind.annotation.RequestParam;
    import org.springframework.web.util.UriUtils;
    import org.springframework.web.util.WebUtils;
    

    '''
  }


  def genCreate(TableType type) {'''
    @RequestMapping(method = RequestMethod.POST, produces = "text/html")
    public String create(@Valid «type.name» «type.name.toFirstLower», BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, «type.name.toFirstLower»);
            return "«type.name.lowerPlural»/create";
        }
        uiModel.asMap().clear();
        «type.name.toFirstLower».persist();
        return "redirect:/«type.name.lowerPlural»/" + encodeUrlPathSegment(«type.name.toFirstLower».getId().toString(), httpServletRequest);
    }


    '''
  }


  def genCreateForm(TableType type, Set<Association> ascStr, Set<Association> ascEnd) {'''
    @RequestMapping(params = "form", produces = "text/html")
    public String createForm(Model uiModel) {
        populateEditForm(uiModel, new «type.name»());
        «genDependencies(type.fields.filter(typeof(TypeField)), ascStr, ascEnd)»
        return "«type.name.lowerPlural»/create";
    }


    '''
  }


  def genDependencies(Iterable<TypeField> fields, Set<Association> ascStr, Set<Association> ascEnd) {
  	var dependencies = genDependenciesDetail(fields, ascStr, ascEnd)
  	if (dependencies.length > 0) {'''
        List<String[]> dependencies = new ArrayList<String[]>();
        «dependencies»
        uiModel.addAttribute("dependencies", dependencies);
    '''
  	}
  }
  
  
  def genDependenciesDetail(Iterable<TypeField> fields, Set<Association> ascStr, Set<Association> ascEnd) {'''
    «FOR fld : fields»
      «IF !fld.cardinality.many»
        if («fld.isType.name».count«fld.isType.name.plural»() == 0) {
            dependencies.add(new String[] { "«fld.isType.name.toLowerCase»", "«fld.isType.name.lowerPlural»" });
        }
      «ENDIF»
    «ENDFOR»
    «IF ascStr != null»
      «FOR asc : ascStr»
        «IF asc.start.cardinality.many && !asc.end.cardinality.many»
        if («asc.end.references.name».count«asc.end.references.name.plural»() == 0) {
            dependencies.add(new String[] { "«asc.end.references.name.toLowerCase»", "«asc.end.references.name.lowerPlural»" });
        }
        «ENDIF»
      «ENDFOR»
    «ENDIF»
    «IF ascEnd != null»
      «FOR asc : ascEnd»
        «IF !asc.start.cardinality.many && asc.end.cardinality.many»
        if («asc.start.references.name».count«asc.start.references.name.plural»() == 0) {
            dependencies.add(new String[] { "«asc.start.references.name.toLowerCase»", "«asc.start.references.name.lowerPlural»" });
        }
        «ENDIF»
      «ENDFOR»
    «ENDIF»
    '''
  }


  def genShow(TableType type) {'''
    @RequestMapping(value = "/{id}", produces = "text/html")
    public String show(@PathVariable("id") Long id, Model uiModel) {
        uiModel.addAttribute("«type.name.toLowerCase»", «type.name».find«type.name»(id));
        uiModel.addAttribute("itemId", id);
        return "«type.name.lowerPlural»/show";
    }


    '''
  }


  def genList(TableType type) {'''
    @RequestMapping(produces = "text/html")
    public String list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            final int firstResult = page == null ? 0 : (page.intValue() - 1) * sizeNo;
            uiModel.addAttribute("«type.name.lowerPlural»", «type.name».find«type.name»Entries(firstResult, sizeNo));
            float nrOfPages = (float) «type.name».count«type.name»«type.name.nameSuffix»() / sizeNo;
            uiModel.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            uiModel.addAttribute("«type.name.lowerPlural»", «type.name».findAll«type.name.plural»());
        }
        return "«type.name.lowerPlural»/list";
    }


    '''
  }


  def genUpdate(TableType type) {'''
    @RequestMapping(method = RequestMethod.PUT, produces = "text/html")
    public String update(@Valid «type.name» «type.name.toFirstLower», BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, «type.name.toFirstLower»);
            return "«type.name.lowerPlural»/update";
        }
        uiModel.asMap().clear();
        «type.name.toFirstLower».merge();
        return "redirect:/«type.name.lowerPlural»/" + encodeUrlPathSegment(«type.name.toFirstLower».getId().toString(), httpServletRequest);
    }


    '''
  }


  def genUpdateForm(TableType type) {'''
    @RequestMapping(value = "/{id}", params = "form", produces = "text/html")
    public String updateForm(@PathVariable("id") Long id, Model uiModel) {
        populateEditForm(uiModel, «type.name».find«type.name»(id));
        return "«type.name.lowerPlural»/update";
    }


    '''
  }


  def genDelete(TableType type) {'''
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "text/html")
    public String delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        «type.name» «type.name.toFirstLower» = «type.name».find«type.name»(id);
        «type.name.toFirstLower».remove();
        uiModel.asMap().clear();
        uiModel.addAttribute("page", (page == null) ? "1" : page.toString());
        uiModel.addAttribute("size", (size == null) ? "10" : size.toString());
        return "redirect:/«type.name.lowerPlural»";
    }


    '''
  }


  def genPopulateEditForm(TableType type, Map<String, Set<Association>> ascStrMap, Map<String, Set<Association>> ascEndMap) {'''
    void populateEditForm(Model uiModel, «type.name» «type.name.toFirstLower») {
        uiModel.addAttribute("«type.name.toFirstLower»", «type.name.toFirstLower»);
        «genPopulateEditEnums(type)»
        «genPopulateEditRefs(getEditRefs(type, ascStrMap, ascEndMap))»
    }

    '''
  }


  def genPopulateEditRefs(Set<String> editRefs) {'''
    «FOR ref : editRefs»
        uiModel.addAttribute("«ref.lowerPlural»", «ref».findAll«ref.plural»());
    «ENDFOR»
    '''
  }


  def genPopulateEditEnums(TableType type) {'''
      «FOR fld : type.fields.filter(typeof(EnumField))»
        uiModel.addAttribute("«fld.isType.name.lowerPlural»", Arrays.asList(«fld.isType.name».values()));
      «ENDFOR»
    '''
  }


  def Set<String> getEditRefs(TableType type, Map<String, Set<Association>> ascStrMap, Map<String, Set<Association>> ascEndMap) {
  	var Set<String> editRefs = new HashSet<String>();
  	
  	getEditRefsForType(editRefs, type, ascStrMap, ascEndMap)
  	
  	if (type.supertype != null) {
  	  getEditRefsForType(editRefs, type.supertype, ascStrMap, ascEndMap)
  	}

  	return editRefs;
  }


  def void getEditRefsForType(Set<String> editRefs, TableType type, Map<String, Set<Association>> ascStrMap, Map<String, Set<Association>> ascEndMap) {
  	if (ascStrMap.get(type.name) != null) {
  		for (asc : ascStrMap.get(type.name)) {
  			editRefs.add(asc.end.references.name)
  		}
  	}
  	if (ascEndMap.get(type.name) != null) {
  		for (asc : ascEndMap.get(type.name)) {
  			editRefs.add(asc.start.references.name)
  		}
  	}
  	for (fld : type.fields) {
  		if (fld instanceof TypeField) {
  			editRefs.add(fld.isType.name)
  		}
  	}
  }


  def String getFieldConv(TableType type) {
  	var StringBuilder bld = new StringBuilder()
  	
  	bld.append('return new StringBuilder()')
  	
  	getFieldConv(bld, type.name.toFirstLower, type)
  	
  	if (type.supertype != null) {
  	  getFieldConv(bld, type.name.toFirstLower, type.supertype)
  	}

  	bld.append('.toString();')
  	
  	return bld.toString()
  }
  
  
  def getFieldConv(StringBuilder bld, String refName, TableType type) {
  	for (fld : type.fields) {
  		if (fld instanceof SimpleField) {
  			bld.append('.append(').append(refName).append('.').append('get').append(fld.name.toFirstUpper).append('())').append('.append(\' \')')
  		}
  	}
  }


  def genEncodeUrlPathSegment(TableType type) {'''
    String encodeUrlPathSegment(String pathSegment, HttpServletRequest httpServletRequest) {
        String enc = httpServletRequest.getCharacterEncoding();
        if (enc == null) {
            enc = WebUtils.DEFAULT_CHARACTER_ENCODING;
        }
        try {
            pathSegment = UriUtils.encodePathSegment(pathSegment, enc);
        } catch (UnsupportedEncodingException uee) {}
        return pathSegment;
    }


    '''
  }
}
