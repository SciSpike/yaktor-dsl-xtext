package io.yaktor.generator

import com.google.inject.Inject
import io.yaktor.domain.Association
import io.yaktor.domain.BooleanField
import io.yaktor.domain.Cardinality
import io.yaktor.domain.DateField
import io.yaktor.domain.DomainModel
import io.yaktor.domain.EnumField
import io.yaktor.domain.Field
import io.yaktor.domain.InclusionType
import io.yaktor.domain.SimpleField
import io.yaktor.domain.StringField
import io.yaktor.domain.TableType
import io.yaktor.domain.TypeField
import io.yaktor.util.Constants
import io.yaktor.util.DslDomainUtil
import io.yaktor.util.FileUtil
import io.yaktor.util.InclusionCat
import java.util.Map
import java.util.Set
import org.eclipse.xtext.generator.IFileSystemAccess

class ViewsGenerator {

  @Inject extension FileUtil fileUtil
  @Inject extension DslDomainUtil dslDomainUtil
  @Inject extension GeneratorExtensions genExt

  def genViews(IFileSystemAccess fsa, DomainModel spec, Map<String, Set<Association>> ascStrMap,
    Map<String, Set<Association>> ascEndMap) {
    var inc = spec.getInclusionType(InclusionCat::VIEWS)
    if (inc != InclusionType::NONE) {
      for (type : spec.types) {
        if (type instanceof TableType && !(type as TableType).isAbstract) {
          fileUtil.generateFile(fsa, Constants::viewBase, type.name.lowerPlural, 'create.jspx',
            spec.genCreate(type as TableType, ascStrMap, ascEndMap), inc == InclusionType::PROTECTED)
          fileUtil.generateFile(fsa, Constants::viewBase, type.name.lowerPlural, 'list.jspx',
            spec.genList(type as TableType, ascStrMap), inc == InclusionType::PROTECTED)
          fileUtil.generateFile(fsa, Constants::viewBase, type.name.lowerPlural, 'show.jspx',
            spec.genShow(type as TableType, ascStrMap), inc == InclusionType::PROTECTED)
          fileUtil.generateFile(fsa, Constants::viewBase, type.name.lowerPlural, 'update.jspx',
            spec.genUpdate(type as TableType, ascStrMap, ascEndMap), inc == InclusionType::PROTECTED)
          fileUtil.generateFile(fsa, Constants::viewBase, type.name.lowerPlural, 'views.xml',
            spec.genViews(type as TableType), inc == InclusionType::PROTECTED)
        }
      }
      fileUtil.generateFile(fsa, Constants::viewBase, '', 'dataAccessFailure.jspx', genAccessFailure(),
        inc == InclusionType::PROTECTED)
      fileUtil.generateFile(fsa, Constants::viewBase, '', 'footer.jspx', genFooter(),
        inc == InclusionType::PROTECTED)
      fileUtil.generateFile(fsa, Constants::viewBase, '', 'header.jspx', genHeader(),
        inc == InclusionType::PROTECTED)
      fileUtil.generateFile(fsa, Constants::viewBase, '', 'index-template.jspx', genIndexTemplate(),
        inc == InclusionType::PROTECTED)
      fileUtil.generateFile(fsa, Constants::viewBase, '', 'index.jspx', genIndex(),
        inc == InclusionType::PROTECTED)
      fileUtil.generateFile(fsa, Constants::viewBase, '', 'menu.jspx', spec.genMenu(),
        inc == InclusionType::PROTECTED)
      fileUtil.generateFile(fsa, Constants::viewBase, '', 'resourceNotFound.jspx', genResourceNotFound(),
        inc == InclusionType::PROTECTED)
      fileUtil.generateFile(fsa, Constants::viewBase, '', 'uncaughtException.jspx', genUncaughtException(),
        inc == InclusionType::PROTECTED)
      fileUtil.generateFile(fsa, Constants::viewBase, '', 'views.xml', genViews(), inc == InclusionType::PROTECTED)
    }
  }

  def genCreate(DomainModel spec, TableType type, Map<String, Set<Association>> ascStrMap,
    Map<String, Set<Association>> ascEndMap) {
    '''
      <?xml version="1.0" encoding="UTF-8" standalone="no"?>
      <div xmlns:c="http://java.sun.com/jsp/jstl/core" xmlns:field="urn:jsptagdir:/WEB-INF/tags/form/fields" xmlns:form="urn:jsptagdir:/WEB-INF/tags/form" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:spring="http://www.springframework.org/tags" version="2.0">
          <jsp:directive.page contentType="text/html;charset=UTF-8"/>
          <jsp:output omit-xml-declaration="yes"/>
          <form:create id="«('fc.' + spec.genOptions.domainPackage + '.' + type.name).dotToUnd»" modelAttribute="«type.name.
        toFirstLower»" path="/«type.name.lowerPlural»" render="${empty dependencies}" z="Bz5VCR54X5X40yEndWMgDmNG0Ws=">
           «spec.genFields(type, ascStrMap, ascEndMap)»
          </form:create>
          <form:dependency dependencies="${dependencies}" id="«('d.' + spec.genOptions.domainPackage + '.' + type.name).
        dotToUnd»" render="${not empty dependencies}" z="dk/FACkBldDIy1Cs3S0hz5oG5AQ="/>
      </div>
      
       '''
  }

  def genFields(DomainModel spec, TableType type, Map<String, Set<Association>> ascStrMap,
    Map<String, Set<Association>> ascEndMap) {
    '''
      «spec.genFieldsForType(type, type.name, ascStrMap.get(type.name), ascEndMap.get(type.name))»
         «IF type.supertype != null»
        «spec.genFieldsForType(type.supertype, type.name, ascStrMap.get(type.supertype.name),
        ascEndMap.get(type.supertype.name))»
        «ENDIF»
      '''
  }

  def genFieldsForType(DomainModel spec, TableType type, String typeName, Set<Association> ascStr,
    Set<Association> ascEnd) {
    '''
      «FOR fld : type.fields»
        «IF fld instanceof SimpleField»
          «IF fld instanceof EnumField»
            <field:select field="«fld.name»" id="«('c.' + spec.genOptions.domainPackage + '.' + typeName + '.' + fld.name).
        dotToUnd»" items="${«fld.isType.name.lowerPlural»}"«genRequired(fld)»«genMultiple(fld)» path="/«fld.isType.name.
        lowerPlural»" z="EzR1wRLRaauR7Dho1mfpdGE1ERU="/>
          «ELSEIF fld instanceof BooleanField»
            <field:checkbox field="«fld.name»" id="«('c.'+spec.genOptions.domainPackage+'.'+typeName+'.'+fld.name).dotToUnd»"«genMaxLength(fld)» z="ECKNx2AzoX26TWWUMT02YTq+IbY="/>
          «ELSEIF fld instanceof DateField»
            <field:datetime dateTimePattern="${«typeName.toFirstLower»_notedate_date_format}" field="«fld.name»" id="«('c.'+spec.genOptions.domainPackage+'.'+typeName+'.'+fld.name).dotToUnd»"«genRequired(fld)» z="2Mpjt8XPqV1AFhwcCjdq+yIBTu4="/>
          «ELSE»
            <field:«genInputType(fld)» field="«fld.name»" id="«('c.' + spec.genOptions.domainPackage + '.' + typeName + '.' +
        fld.name).dotToUnd»"«genMaxLength(fld)»«genRequired(fld)» z="ECKNx2AzoX26TWWUMT02YTq+IbY="/>
          «ENDIF»
        «ELSE»
          <field:select field="«fld.name»" id="«('c.' + spec.genOptions.domainPackage + '.' + typeName + '.' + fld.name).
        dotToUnd»" itemValue="id" items="${«(fld as TypeField).isType.name.lowerPlural»}"«genRequired(fld)»«genMultiple(
        fld)» path="/«(fld as TypeField).isType.name.lowerPlural»" z="EzR1wRLRaauR7Dho1mfpdGE1ERU="/>
        «ENDIF»
      «ENDFOR»
      «IF ascStr != null»
        «FOR asc : ascStr»
          «IF !asc.start.cardinality.isMany && asc.end.cardinality.isMany»
            <field:simple field="«asc.end.name»" id="«('c.' + spec.genOptions.domainPackage + '.' + typeName + '.' +
        asc.end.name).dotToUnd»" messageCode="entity_reference_not_managed" messageCodeAttribute="«asc.end.references.
        name.label»" z="LQS66qbcLAivhLBfPXj9pZAMpFA="/>
          «ELSE»
            <field:select field="«asc.end.name»" id="«('c.' + spec.genOptions.domainPackage + '.' + typeName + '.' +
        asc.end.name).dotToUnd»" itemValue="id" items="${«asc.end.references.name.lowerPlural»}" path="/«asc.end.
        references.name.lowerPlural»" z="LQS66qbcLAivhLBfPXj9pZAMpFA="/>
          «ENDIF»
        «ENDFOR»
      «ENDIF»
      «IF ascEnd != null»
        «FOR asc : ascEnd»
          «IF asc.start.cardinality.isMany && !asc.end.cardinality.isMany»
            <field:simple field="«asc.start.name»" id="«('c.' + spec.genOptions.domainPackage + '.' + typeName + '.' +
        asc.start.name).dotToUnd»" messageCode="entity_reference_not_managed" messageCodeAttribute="«asc.start.
        references.name.label»" z="LQS66qbcLAivhLBfPXj9pZAMpFA="/>
          «ELSE»
            <field:select field="«asc.start.name»" id="«('c.' + spec.genOptions.domainPackage + '.' + typeName + '.' +
        asc.start.name).dotToUnd»" itemValue="id" items="${«asc.start.references.name.lowerPlural»}" path="/«asc.start.
        references.name.lowerPlural»" z="LQS66qbcLAivhLBfPXj9pZAMpFA="/>
          «ENDIF»
        «ENDFOR»
      «ENDIF»
    '''
  }

  def genInputType(Field fld) {
    var inputType = 'input'
    if (fld instanceof StringField && (fld as StringField).maxLength >= 32) {
      inputType = 'textarea'
    }
    inputType
  }

  def genInputType(Cardinality crd) {
    var inputType = 'select'
    if (crd.isMany) {
      inputType = 'simple'
    }
    inputType
  }

  def genMaxLength(Field fld) {
    var maxLength = ''
    if (fld instanceof StringField) {
      var lgt = fld.maxLength
      if (lgt > 0 && lgt < 32) {
        maxLength = ' max="' + fld.maxLength + '"'
      }
    }
    maxLength
  }

  def genRequired(Field fld) {
    var required = ''
    if (fld.cardinality != null && fld.cardinality == Cardinality::REQUIRED) {
      required = ' required="true"'
    }
    required
  }

  def genMultiple(Field fld) {
    var required = ''
    if (fld.cardinality != null && fld.cardinality.many) {
      required = ' multiple="true"'
    }
    required
  }

  def genList(DomainModel spec, TableType type, Map<String, Set<Association>> ascStrMap) {
    '''
      <?xml version="1.0" encoding="UTF-8" standalone="no"?>
      <div xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:page="urn:jsptagdir:/WEB-INF/tags/form" xmlns:table="urn:jsptagdir:/WEB-INF/tags/form/fields" version="2.0">
          <jsp:directive.page contentType="text/html;charset=UTF-8"/>
          <jsp:output omit-xml-declaration="yes"/>
          <page:list id="«('pl.' + spec.genOptions.domainPackage + '.' + type.name).dotToUnd»" items="${«type.name.
        lowerPlural»}" z="hsMg4mHLK80jTS9avikqB+O9+2I=">
              <table:table data="${«type.name.lowerPlural»}" id="l_com_aptitude_domain_«type.name»" path="/«type.name.
        lowerPlural»" z="JT8J1Eq71qRtdGmjVRRUB8gZBjA=">
          «spec.genListFields(type, ascStrMap)»
           </table:table>
          </page:list>
      </div>
      
       '''
  }

  def genListFields(DomainModel spec, TableType type, Map<String, Set<Association>> ascStrMap) {
    '''
      «spec.genListFieldsForType(type, type.name, ascStrMap.get(type.name))»
         «IF type.supertype != null»
        «spec.genListFieldsForType(type.supertype, type.name, ascStrMap.get(type.supertype.name))»
        «ENDIF»
      '''
  }

  def genListFieldsForType(DomainModel spec, TableType type, String typeName, Set<Association> ascStr) {
    '''
      «FOR fld : type.fields»
        <table:column id="«('c.' + spec.genOptions.domainPackage + '.' + typeName + '.' + fld.name).dotToUnd»" property="«fld.
        name»" z="bhtNum0gGU0qc4WRwhkmExGmLLo="/>
      «ENDFOR»
      «IF ascStr != null»
        «FOR asc : ascStr»
          «IF !(!asc.start.cardinality.isMany && asc.end.cardinality.isMany)»
            <table:column id="«('c.' + spec.genOptions.domainPackage + '.' + typeName + '.' + asc.end.name).dotToUnd»" property="«asc.
        end.name»" z="bhtNum0gGU0qc4WRwhkmExGmLLo="/>
          «ENDIF»
        «ENDFOR»
      «ENDIF»
    '''
  }

  def genShow(DomainModel spec, TableType type, Map<String, Set<Association>> ascStrMap) {
    '''
      <?xml version="1.0" encoding="UTF-8" standalone="no"?>
      <div xmlns:field="urn:jsptagdir:/WEB-INF/tags/form/fields" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:page="urn:jsptagdir:/WEB-INF/tags/form" version="2.0">
          <jsp:directive.page contentType="text/html;charset=UTF-8"/>
          <jsp:output omit-xml-declaration="yes"/>
          <page:show id="«('ps.' + spec.genOptions.domainPackage + '.' + type.name).dotToUnd»" object="${«type.name.
        toLowerCase»}" path="/«type.name.lowerPlural»" z="XR5A8taSjVoQOlw7ZVd7FhA8DEo=">
      	  «spec.genShowFields(type, ascStrMap)»
       </page:show>
      </div>
      
       '''
  }

  def genShowFields(DomainModel spec, TableType type, Map<String, Set<Association>> ascStrMap) {
    '''
      «spec.genShowFieldsForType(type, type.name, ascStrMap.get(type.name))»
         «IF type.supertype != null»
        «spec.genShowFieldsForType(type.supertype, type.name, ascStrMap.get(type.supertype.name))»
        «ENDIF»
      '''
  }

  def genShowFieldsForType(DomainModel spec, TableType type, String typeName, Set<Association> ascStr) {
    '''
      «FOR fld : type.fields»
        <field:display field="«fld.name»" id="«('s.' + spec.genOptions.domainPackage + '.' + typeName + '.' + fld.name).
        dotToUnd»" object="${«typeName.toLowerCase»}" z="VFWDRrqck5VBBf9oPbXqgnhImWI="/>
      «ENDFOR»
      «IF ascStr != null»
        «FOR asc : ascStr»
          «IF !(!asc.start.cardinality.isMany && asc.end.cardinality.isMany)»
            <field:display field="«asc.end.name»" id="«('s.' + spec.genOptions.domainPackage + '.' + typeName + '.' +
        asc.end.name).dotToUnd»" object="${«typeName.toLowerCase»}" z="bhtNum0gGU0qc4WRwhkmExGmLLo="/>
          «ENDIF»
        «ENDFOR»
      «ENDIF»
    '''
  }

  def genUpdate(DomainModel spec, TableType type, Map<String, Set<Association>> ascStrMap,
    Map<String, Set<Association>> ascEndMap) {
    '''
      <?xml version="1.0" encoding="UTF-8" standalone="no"?>
      <div xmlns:field="urn:jsptagdir:/WEB-INF/tags/form/fields" xmlns:form="urn:jsptagdir:/WEB-INF/tags/form" xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0">
          <jsp:directive.page contentType="text/html;charset=UTF-8"/>
          <jsp:output omit-xml-declaration="yes"/>
          <form:update id="«('fu.' + spec.genOptions.domainPackage + '.' + type.name).dotToUnd»" modelAttribute="«type.name.
        toFirstLower»" path="/«type.name.lowerPlural»" versionField="Version" z="LFhbaBJkFkelHmyOAhYonQ30ENo=">
           «spec.genFields(type, ascStrMap, ascEndMap)»
          </form:update>
      </div>
      
       '''
  }

  def genViews(DomainModel spec, TableType type) {
    '''
      <?xml version="1.0" encoding="UTF-8" standalone="no"?>
      <!DOCTYPE tiles-definitions PUBLIC "-//Apache Software Foundation//DTD Tiles Configuration 2.1//EN" "http://tiles.apache.org/dtds/tiles-config_2_1.dtd">
      <tiles-definitions>
          <definition extends="default" name="«type.name.lowerPlural»/list">
              <put-attribute name="body" value="/WEB-INF/views/«type.name.lowerPlural»/list.jspx"/>
          </definition>
      <definition extends="default" name="«type.name.lowerPlural»/show">
              <put-attribute name="body" value="/WEB-INF/views/«type.name.lowerPlural»/show.jspx"/>
          </definition>
      <definition extends="default" name="«type.name.lowerPlural»/create">
              <put-attribute name="body" value="/WEB-INF/views/«type.name.lowerPlural»/create.jspx"/>
          </definition>
      <definition extends="default" name="«type.name.lowerPlural»/update">
              <put-attribute name="body" value="/WEB-INF/views/«type.name.lowerPlural»/update.jspx"/>
          </definition>
      </tiles-definitions>
      
       '''
  }

  def genAccessFailure() {
    '''
      <div xmlns:c="http://java.sun.com/jsp/jstl/core" xmlns:util="urn:jsptagdir:/WEB-INF/tags/util" xmlns:fn="http://java.sun.com/jsp/jstl/functions"  xmlns:spring="http://www.springframework.org/tags" xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0">
        <jsp:directive.page contentType="text/html;charset=UTF-8" />
        <jsp:output omit-xml-declaration="yes" />
        <spring:message var="title" code="error_dataaccessfailure_title" htmlEscape="false" />
        <util:panel id="title" title="${title}">
          <h2>${fn:escapeXml(title)}</h2>
          <p>
            <spring:message code="error_dataaccessfailure_problemdescription" />
          </p>
          <c:if test="${not empty exception}">
            <p>
              <h4>
                <spring:message code="exception_details" />
              </h4>
              <spring:message var="message" code="exception_message" />
              <util:panel id="_message" title="${message}" openPane="false">
                <c:out value="${exception.localizedMessage}" />
              </util:panel>
              <spring:message var="stacktrace" code="exception_stacktrace" />
              <util:panel id="_exception" title="${stacktrace}" openPane="false">
                <c:forEach items="${exception.stackTrace}" var="trace">
                  <c:out value="${trace}" />
                  <br />
                </c:forEach>
              </util:panel>
            </p>
          </c:if>
        </util:panel>
      </div>
       '''
  }

  def genFooter() {
    '''
      <?xml version="1.0" encoding="UTF-8" standalone="no"?>
      <div xmlns:c="http://java.sun.com/jsp/jstl/core" xmlns:fn="http://java.sun.com/jsp/jstl/functions" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:spring="http://www.springframework.org/tags" xmlns:util="urn:jsptagdir:/WEB-INF/tags/util" id="footer" version="2.0">
        <jsp:directive.page contentType="text/html;charset=UTF-8"/>
        <jsp:output omit-xml-declaration="yes"/>
      
        <spring:url value="/" var="home"/>
        <span>
          <a href="${home}">
            <spring:message code="button_home"/>
          </a>
        </span>
        <c:if test="${pageContext['request'].userPrincipal != null}">
          <c:out value=" | "/>
          <span>
            <spring:url value="/resources/j_spring_security_logout" var="logout"/>
            <a href="${logout}">
              <spring:message code="security_logout"/>
            </a>
          </span>
        </c:if>
      
        <span id="language">
          <c:out value=" | "/>
          <spring:message code="global_language"/>
          <c:out value=": "/>
        <util:language label="English" locale="en"/>
          </span>
        <util:theme/>
      
        <spring:url value="/resources/images/springsource-logo.png" var="logo"/>
        <spring:message code="global_sponsored" htmlEscape="false" var="sponsored"/>
        <span>
          <a href="http://springsource.com" title="${fn:escapeXml(sponsored)}">
            <img align="right" alt="${fn:escapeXml(sponsored)}" src="${logo}"/>
          </a>
        </span>
      </div>
       '''
  }

  def genHeader() {
    '''
      <div id="header" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:fn="http://java.sun.com/jsp/jstl/functions" xmlns:c="http://java.sun.com/jsp/jstl/core" xmlns:spring="http://www.springframework.org/tags" version="2.0">
        <jsp:directive.page contentType="text/html;charset=UTF-8" />
        <jsp:output omit-xml-declaration="yes" />
      
        <spring:url var="banner" value="/resources/images/banner-graphic.png" />
        <spring:url var="home" value="/" />
        <spring:message code="button_home" var="home_label" htmlEscape="false" />
        <a href="${home}" name="${fn:escapeXml(home_label)}" title="${fn:escapeXml(home_label)}">
          <img src="${banner}" />
        </a>
      </div> 
       '''
  }

  def genIndexTemplate() {
    '''
      <div xmlns:spring="http://www.springframework.org/tags" xmlns:util="urn:jsptagdir:/WEB-INF/tags/util" xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0">
        <jsp:directive.page contentType="text/html;charset=UTF-8" />
        <jsp:output omit-xml-declaration="yes" />
        <spring:message var="title" htmlEscape="false" />
        <util:panel id="title" title="${title}">
          <spring:message code="application_name" var="app_name" htmlEscape="false" />
          <h3>
            <spring:message code="welcome_titlepane" arguments="${app_name}" />
          </h3>
        </util:panel>
      </div>
       '''
  }

  def genIndex() {
    '''
      <div xmlns:spring="http://www.springframework.org/tags" xmlns:util="urn:jsptagdir:/WEB-INF/tags/util" xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0">
        <jsp:directive.page contentType="text/html;charset=UTF-8" />
        <jsp:output omit-xml-declaration="yes" />
        <spring:message var="app_name" code="application_name" htmlEscape="false" />
        <spring:message var="title" code="welcome_titlepane" arguments="${app_name}" htmlEscape="false" />
        <util:panel id="title" title="${title}">
          <h3>
            <spring:message code="welcome_h3" arguments="${app_name}" />
          </h3>
          <p>
            <spring:message code="welcome_text" />
          </p>
        </util:panel>
      </div>
       '''
  }

  def genMenu(DomainModel spec) {
    '''
      <?xml version="1.0" encoding="UTF-8" standalone="no"?>
      <div xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:menu="urn:jsptagdir:/WEB-INF/tags/menu" id="menu" version="2.0">
        <jsp:directive.page contentType="text/html;charset=UTF-8"/>
        <jsp:output omit-xml-declaration="yes"/>
        <menu:menu id="_menu" z="nZaf43BjUg1iM0v70HJVEsXDopc=">
        «FOR type : spec.types»
          «IF type instanceof TableType && !(type as TableType).isAbstract»
            <menu:category id="c_«type.name.toLowerCase»" z="XsUSSZsSyR5jSrIhNKZCGn7sZkw=">
              <menu:item id="i_«type.name.toLowerCase»_new" messageCode="global_menu_new" url="/«type.name.lowerPlural»?form" z="UpIDlc6IpAlLKyQbwxKxz3HSSig="/>
              <menu:item id="i_«type.name.toLowerCase»_list" messageCode="global_menu_list" url="/«type.name.lowerPlural»?page=1&amp;size=${empty param.size ? 10 : param.size}" z="IqhAkIpFf6MkSgMceWiZPbJtdqk="/>
            </menu:category>
          «ENDIF»
        «ENDFOR»
        </menu:menu>
      </div>
    '''
  }

  def genResourceNotFound() {
    '''
      <div xmlns:c="http://java.sun.com/jsp/jstl/core" xmlns:fn="http://java.sun.com/jsp/jstl/functions" xmlns:spring="http://www.springframework.org/tags" xmlns:util="urn:jsptagdir:/WEB-INF/tags/util" xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0">
        <jsp:directive.page contentType="text/html;charset=UTF-8" />
        <jsp:output omit-xml-declaration="yes" />
        <spring:message var="title" code="error_resourcenotfound_title" htmlEscape="false" />
        <util:panel id="title" title="${title}">
          <h2>${fn:escapeXml(title)}</h2>
          <p>
            <spring:message code="error_resourcenotfound_problemdescription" />
          </p>
          <c:if test="${not empty exception}">
            <p>
              <h4>
                <spring:message code="exception_details" />
              </h4>
              <spring:message var="message" code="exception_message" htmlEscape="false" />
              <util:panel id="_message" title="${message}" openPane="false">
                <c:out value="${exception.localizedMessage}" />
              </util:panel>
              <spring:message var="stacktrace" code="exception_stacktrace" htmlEscape="false" />
              <util:panel id="_exception" title="${stacktrace}" openPane="false">
                <c:forEach items="${exception.stackTrace}" var="trace">
                  <c:out value="${trace}" />
                  <br />
                </c:forEach>
              </util:panel>
            </p>
          </c:if>
        </util:panel>
      </div>
       '''
  }

  def genUncaughtException() {
    '''
      <div xmlns:c="http://java.sun.com/jsp/jstl/core" xmlns:fn="http://java.sun.com/jsp/jstl/functions" xmlns:util="urn:jsptagdir:/WEB-INF/tags/util" xmlns:spring="http://www.springframework.org/tags" xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0">
        <jsp:directive.page contentType="text/html;charset=UTF-8" />
        <jsp:output omit-xml-declaration="yes" />
        <spring:message var="title" code="error_uncaughtexception_title" htmlEscape="false" />
        <util:panel id="title" title="${title}">
          <h2>${fn:escapeXml(title)}</h2>
          <p>
            <spring:message code="error_uncaughtexception_problemdescription" />
          </p>
          <c:if test="${not empty exception}">
            <p>
              <h4>
                <spring:message code="exception_details" />
              </h4>
              <spring:message var="message" code="exception_message" htmlEscape="false" />
              <util:panel id="_message" title="${message}" openPane="false">
                <c:out value="${exception.localizedMessage}" />
              </util:panel>
              <spring:message var="stacktrace" code="exception_stacktrace" htmlEscape="false" />
              <util:panel id="_exception" title="${stacktrace}" openPane="false">
                <c:forEach items="${exception.stackTrace}" var="trace">
                  <c:out value="${trace}" />
                  <br />
                </c:forEach>
              </util:panel>
            </p>
          </c:if>
        </util:panel>
      </div>
       '''
  }

  def genViews() {
    '''
      <?xml version="1.0" encoding="UTF-8"?>
      <!DOCTYPE tiles-definitions PUBLIC
      	"-//Apache Software Foundation//DTD Tiles Configuration 2.1//EN"
      	"http://tiles.apache.org/dtds/tiles-config_2_1.dtd">
      
      <tiles-definitions>
      
        <definition name="index" extends="default">
          <put-attribute name="body" value="/WEB-INF/views/index.jspx" />
        </definition>
      
        <definition name="dataAccessFailure" extends="public">
          <put-attribute name="body" value="/WEB-INF/views/dataAccessFailure.jspx" />
        </definition>
      
        <definition name="resourceNotFound" extends="public">
          <put-attribute name="body" value="/WEB-INF/views/resourceNotFound.jspx" />
        </definition>
      
        <definition name="uncaughtException" extends="public">
          <put-attribute name="body" value="/WEB-INF/views/uncaughtException.jspx" />
        </definition>
      
      </tiles-definitions>
       '''
  }
}
