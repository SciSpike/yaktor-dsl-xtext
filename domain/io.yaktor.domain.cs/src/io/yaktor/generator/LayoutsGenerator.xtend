package io.yaktor.generator

import com.google.inject.Inject
import io.yaktor.domain.DomainModel
import io.yaktor.domain.InclusionType
import io.yaktor.util.Constants
import io.yaktor.util.DslDomainUtil
import io.yaktor.util.FileUtil
import io.yaktor.util.InclusionCat
import org.eclipse.xtext.generator.IFileSystemAccess

class LayoutsGenerator {

  @Inject extension FileUtil fileUtil
  @Inject extension DslDomainUtil dslDomainUtil

  def genLayouts(IFileSystemAccess fsa, DomainModel spec) {
    var inc = spec.getInclusionType(InclusionCat::LAYOUTS)
    if (inc != InclusionType::NONE) {
      fileUtil.generateFile(fsa, Constants::webInfBase, 'layouts', 'default.jspx', genDefault(),
        inc == InclusionType::PROTECTED)
      fileUtil.generateFile(fsa, Constants::webInfBase, 'layouts', 'layouts.xml', genLayout(),
        inc == InclusionType::PROTECTED)
    }
  }

  def genDefault() {
    '''
      <html xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:c="http://java.sun.com/jsp/jstl/core" xmlns:tiles="http://tiles.apache.org/tags-tiles" xmlns:spring="http://www.springframework.org/tags" xmlns:util="urn:jsptagdir:/WEB-INF/tags/util" >  
      	
      	<jsp:output doctype-root-element="HTML" doctype-system="about:legacy-compat" />
      	
      	<jsp:directive.page contentType="text/html;charset=UTF-8" />  
      	<jsp:directive.page pageEncoding="UTF-8" /> 
      			
      	<head>
      		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
      		<meta http-equiv="X-UA-Compatible" content="IE=8" />	
      			
      		<util:load-scripts />
      		
      		<spring:message code="application_name" var="app_name" htmlEscape="false"/>
      		<title><spring:message code="welcome_h3" arguments="${app_name}" /></title>
      	</head>
      	
      	 	<body class="tundra spring">
      	 			<div id="wrapper">
      	 			 <tiles:insertAttribute name="header" ignore="true" />
      	 			 <tiles:insertAttribute name="menu" ignore="true" />   
      	 			 <div id="main">
      	 			 	<tiles:insertAttribute name="body"/> 
      	 			 	<tiles:insertAttribute name="footer" ignore="true"/>
      	 			 </div>
      	</div>
      	</body>
      </html>
    '''
  }

  def genLayout() {
    '''
      <?xml version="1.0" encoding="UTF-8"?>
      <!DOCTYPE tiles-definitions PUBLIC
             "-//Apache Software Foundation//DTD Tiles Configuration 2.1//EN"
             "http://tiles.apache.org/dtds/tiles-config_2_1.dtd">
      
      <tiles-definitions>
      
        <definition name="default" template="/WEB-INF/layouts/default.jspx">
          <put-attribute name="header" value="/WEB-INF/views/header.jspx" />
          <put-attribute name="menu" value="/WEB-INF/views/menu.jspx" />
          <put-attribute name="footer" value="/WEB-INF/views/footer.jspx" />
        </definition>
      
        <definition name="public" template="/WEB-INF/layouts/default.jspx">
          <put-attribute name="header" value="/WEB-INF/views/header.jspx" />
          <put-attribute name="footer" value="/WEB-INF/views/footer.jspx" />
        </definition>
      
      </tiles-definitions>
    '''
  }
}
