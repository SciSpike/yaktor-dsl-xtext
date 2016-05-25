package io.yaktor.generator

import com.google.inject.Inject
import io.yaktor.domain.Association
import io.yaktor.domain.DomainModel
import io.yaktor.domain.InclusionType
import io.yaktor.domain.JpaGenOptions
import io.yaktor.domain.TableType
import io.yaktor.util.Constants
import io.yaktor.util.DslDomainUtil
import io.yaktor.util.FileUtil
import io.yaktor.util.InclusionCat
import java.util.Map
import java.util.Set
import org.eclipse.xtext.generator.IFileSystemAccess

class PropertiesGenerator {

  @Inject extension FileUtil fileUtil
  @Inject extension DslDomainUtil dslDomainUtil
  @Inject extension GeneratorExtensions genExt

  
  def genAppProperties(IFileSystemAccess fsa, DomainModel spec, Map<String, Set<Association>> ascStrMap, Map<String, Set<Association>> ascEndMap) {
    var inc = spec.getInclusionType(InclusionCat::PROPERTIES)
    if (inc != InclusionType::NONE) {
	  	fileUtil.generateFile(fsa, Constants::webInfBase, 'i18n', 'application.properties', spec.genAppProperties(ascStrMap, ascEndMap), inc == InclusionType::PROTECTED)
	  	fileUtil.generateFile(fsa, Constants::webInfBase, 'i18n', 'messages.properties', genMessages(), inc == InclusionType::PROTECTED)
	}
  }


  def genAppProperties(DomainModel spec, Map<String, Set<Association>> ascStrMap, Map<String, Set<Association>> ascEndMap) {'''
    application_name=«(spec.genOptions as JpaGenOptions).project.name»

    «FOR type: spec.types»
      «IF type instanceof TableType && !(type as TableType).isAbstract»
      menu_category_«type.name.toLowerCase»_label=«type.name.label»
      menu_item_«type.name.toLowerCase»_list_label=«type.name.label.plural»
      menu_item_«type.name.toLowerCase»_new_label=«type.name.label»
      «spec.genAppProperties(type as TableType, ascStrMap, ascEndMap)»

      «ENDIF»
    «ENDFOR»

    '''
  }


  def genAppProperties(DomainModel spec, TableType type, Map<String, Set<Association>> ascStrMap, Map<String, Set<Association>> ascEndMap) {'''
	«genAppProperty(spec, type, type.name, '', type.name)»
	«genAppProperty(spec, type, type.name, 'plural', type.name.plural)»
	«genAppProperty(spec, type, type.name, 'id')»
	«genAppProperty(spec, type, type.name, 'version')»
	«spec.genAppPropertiesForType(type, type.name, ascStrMap, ascEndMap)»
    «IF type.supertype != null»
	  «spec.genAppPropertiesForType(type.supertype, type.name, ascStrMap, ascEndMap)»
    «ENDIF»
    '''
  }


  def genAppPropertiesForType(DomainModel spec, TableType type, String typeName, Map<String, Set<Association>> ascStrMap, Map<String, Set<Association>> ascEndMap) {'''
	«FOR fld: type.fields»
	  «genAppProperty(spec, type, typeName, fld.name)»
	«ENDFOR»
	«genStrAssociations(spec, type, typeName, ascStrMap.get(type.name))»
	«genEndAssociations(spec, type, typeName, ascEndMap.get(type.name))»

    '''
  }


  def genAppProperty(DomainModel spec, TableType type, String typeName, String name) {
  	return genAppProperty(spec, type, typeName, name, name)
  }


  def genAppProperty(DomainModel spec, TableType type, String typeName, String suffix, String name) {
  	var str = 'label.'+spec.genOptions.domainPackage+'.'+typeName
  	if (suffix != '') {
  		str = str+'.'+suffix
  	}
  	return str.replaceAll('\\.','_').toLowerCase+'='+name.getLabel
  }
  
  
  def genStrAssociations(DomainModel spec, TableType type, String typeName, Set<Association> ascSet) {'''
    «IF ascSet != null»
    «FOR asc : ascSet»
  	  «genAppProperty(spec, type, typeName, asc.end.name)»
    «ENDFOR»
    «ENDIF»
    '''
  }
  
  
  def genEndAssociations(DomainModel spec, TableType type, String typeName, Set<Association> ascSet) {'''
    «IF ascSet != null»
    «FOR asc : ascSet»
  	  «genAppProperty(spec, type, typeName, asc.start.name)»
    «ENDFOR»
    «ENDIF»
    '''
  }


  def genMessages() {'''
	#menu
	global_menu_new=Create new {0}
	global_menu_list=List all {0}
	global_menu_find=Find by {0}
	global_language_switch=Switch language to {0}
	global_language=Language
	global_sponsored=Sponsored by SpringSource
	global_theme=Theme
	global_theme_alt=alt
	global_theme_standard=standard
	global_generic={0}
	
	#welcome page
	welcome_titlepane=Welcome to {0}
	welcome_h3=Welcome to {0}
	welcome_text=Spring Roo provides interactive, lightweight and user customizable tooling that enables rapid delivery of high performance enterprise Java applications.
	
	#entity labels
	entity_list_all=List all {0}
	entity_show=Show {0}
	entity_create=Create new {0}
	entity_update=Update {0}
	entity_delete=Delete {0}
	entity_delete_confirm=Are you sure want to delete this item?
	entity_find=Find {0}
	entity_not_found=No {0} found.
	entity_not_found_single=No {0} found with this id.
	entity_dependency_required=The following dependencies need to be created first:
	entity_reference_not_managed=This relationship is managed from the {0} side.
	
	#button labels
	button_home=Home
	button_save=Save
	button_update=Update
	button_find=Find
	button_cancel=Cancel
	button_proceed=Proceed
	button_submit=Submit
	button_reset=Reset
	button_end=End
	button_showmessage=Show Message
	button_showstacktrace=Show Stack Trace
	button_showcookie=Show Cookie
	
	#field labels
	field_simple_validation=Enter {0} {1}
	field_invalid_email=Please enter a valid email
	field_invalid_number=Number with \\'-\\' or \\'.\\' allowed
	field_invalid_integer=Integer numbers only
	field_invalid=Please enter valid {0}
	field_required=required
	
	#list labels
	list_first=First Page
	list_next=Next Page
	list_previous=Previous Page
	list_last=Last Page
	list_page=Page {0} of {1}
	list_size=List results per page:
	
	#selenium
	selenium_menu_test_suite=Test Suite
	
	#exception
	exception_message=Exception Message
	exception_stacktrace=Exception Stack Trace
	exception_cookie=Cookies
	exception_details=Details
	
	#dataAccessFailure_jspx
	error_dataaccessfailure_title=Data access failure
	error_dataaccessfailure_problemdescription=Sorry, a problem occurred while accessing the database.
	
	#resourceNotFound_jspx
	error_resourcenotfound_title=Requested Resource Not Found
	error_resourcenotfound_problemdescription=Sorry, we did not find the resource you were looking for.
	
	#uncaughtException_jspx
	error_uncaughtexception_title=Internal Error
	error_uncaughtexception_problemdescription=Sorry, we encountered an internal error.
	
	#webflow
	webflow_menu_enter=Enter {0} flow
	webflow_state1_title=Spring Web Flow - View State One
	webflow_state1_message=This is a simple example to get started with Spring Web Flow. The buttons below lead you to another view state (Proceed) or to an end state.
	webflow_state2_title=Spring Web Flow - View State Two
	webflow_state2_message=This is a simple example to get started with Spring Web Flow. The buttons below lead you to another view state (Proceed) or to an end state.
	webflow_endstate_title=Spring Web Flow - End State
	webflow_endstate_message=You have now reached the end of this flow.
	
	#security
	security_login_title=Spring Security Login
	security_login_message=You have tried to access a protected area of this application. By default you can login as "admin", with a password of "admin".
	security_login_form_name=Name
	security_login_form_name_message=Enter your name
	security_login_form_password=Password
	security_login_form_password_message=Enter your password
	security_login_unsuccessful=Your login attempt was not successful, try again. Reason: 
	security_logout=Logout
    '''
  }
}
