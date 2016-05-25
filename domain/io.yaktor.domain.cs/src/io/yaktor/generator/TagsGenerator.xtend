package io.yaktor.generator

import com.google.inject.Inject
import io.yaktor.domain.DomainModel
import io.yaktor.domain.InclusionType
import io.yaktor.util.Constants
import io.yaktor.util.DslDomainUtil
import io.yaktor.util.FileUtil
import io.yaktor.util.InclusionCat
import org.eclipse.xtext.generator.IFileSystemAccess

class TagsGenerator {

  @Inject extension FileUtil fileUtil
  @Inject extension DslDomainUtil dslDomainUtil

  
  def genTags(IFileSystemAccess fsa, DomainModel spec) {
    var inc = spec.getInclusionType(InclusionCat::TAGS)
    if (inc != InclusionType::NONE) {
	  	fileUtil.generateFile(fsa, Constants::webInfBase, 'tags/form/fields', 'checkbox.tagx', genCheckbox(), inc == InclusionType::PROTECTED)
	  	fileUtil.generateFile(fsa, Constants::webInfBase, 'tags/form/fields', 'column.tagx', genColumn(), inc == InclusionType::PROTECTED)
	  	fileUtil.generateFile(fsa, Constants::webInfBase, 'tags/form/fields', 'datetime.tagx', genDatetime(), inc == InclusionType::PROTECTED)
	  	fileUtil.generateFile(fsa, Constants::webInfBase, 'tags/form/fields', 'display.tagx', genDisplay(), inc == InclusionType::PROTECTED)
	  	fileUtil.generateFile(fsa, Constants::webInfBase, 'tags/form/fields', 'editor.tagx', genEditor(), inc == InclusionType::PROTECTED)
	  	fileUtil.generateFile(fsa, Constants::webInfBase, 'tags/form/fields', 'input.tagx', genInput(), inc == InclusionType::PROTECTED)
	  	fileUtil.generateFile(fsa, Constants::webInfBase, 'tags/form/fields', 'reference.tagx', genReference(), inc == InclusionType::PROTECTED)
	  	fileUtil.generateFile(fsa, Constants::webInfBase, 'tags/form/fields', 'select.tagx', genSelect(), inc == InclusionType::PROTECTED)
	  	fileUtil.generateFile(fsa, Constants::webInfBase, 'tags/form/fields', 'simple.tagx', genSimple(), inc == InclusionType::PROTECTED)
	  	fileUtil.generateFile(fsa, Constants::webInfBase, 'tags/form/fields', 'table.tagx', genTable(), inc == InclusionType::PROTECTED)
	  	fileUtil.generateFile(fsa, Constants::webInfBase, 'tags/form/fields', 'textarea.tagx', genTextarea(), inc == InclusionType::PROTECTED)
	  	fileUtil.generateFile(fsa, Constants::webInfBase, 'tags/form', 'create.tagx', genCreate(), inc == InclusionType::PROTECTED)
	  	fileUtil.generateFile(fsa, Constants::webInfBase, 'tags/form', 'dependency.tagx', genDependency(), inc == InclusionType::PROTECTED)
	  	fileUtil.generateFile(fsa, Constants::webInfBase, 'tags/form', 'find.tagx', genFind(), inc == InclusionType::PROTECTED)
	  	fileUtil.generateFile(fsa, Constants::webInfBase, 'tags/form', 'list.tagx', genList(), inc == InclusionType::PROTECTED)
	  	fileUtil.generateFile(fsa, Constants::webInfBase, 'tags/form', 'show.tagx', genShow(), inc == InclusionType::PROTECTED)
	  	fileUtil.generateFile(fsa, Constants::webInfBase, 'tags/form', 'update.tagx', genUpdate(), inc == InclusionType::PROTECTED)
	  	fileUtil.generateFile(fsa, Constants::webInfBase, 'tags/menu', 'category.tagx', genCategory(), inc == InclusionType::PROTECTED)
	  	fileUtil.generateFile(fsa, Constants::webInfBase, 'tags/menu', 'item.tagx', genItem(), inc == InclusionType::PROTECTED)
	  	fileUtil.generateFile(fsa, Constants::webInfBase, 'tags/menu', 'menu.tagx', genMenu(), inc == InclusionType::PROTECTED)
	  	fileUtil.generateFile(fsa, Constants::webInfBase, 'tags/util', 'language.tagx', genLanguage(), inc == InclusionType::PROTECTED)
	  	fileUtil.generateFile(fsa, Constants::webInfBase, 'tags/util', 'load-scripts.tagx', genLoadScripts(), inc == InclusionType::PROTECTED)
	  	fileUtil.generateFile(fsa, Constants::webInfBase, 'tags/util', 'pagination.tagx', genPagination(), inc == InclusionType::PROTECTED)
	  	fileUtil.generateFile(fsa, Constants::webInfBase, 'tags/util', 'panel.tagx', genPanel(), inc == InclusionType::PROTECTED)
	  	fileUtil.generateFile(fsa, Constants::webInfBase, 'tags/util', 'placeholder.tagx', genPlaceholder(), inc == InclusionType::PROTECTED)
	  	fileUtil.generateFile(fsa, Constants::webInfBase, 'tags/util', 'theme.tagx', genTheme(), inc == InclusionType::PROTECTED)
	}
  }


  def genCheckbox() {'''
	<jsp:root xmlns:c="http://java.sun.com/jsp/jstl/core" xmlns:fn="http://java.sun.com/jsp/jstl/functions" xmlns:spring="http://www.springframework.org/tags" xmlns:form="http://www.springframework.org/tags/form" xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0">
	  <jsp:output omit-xml-declaration="yes" />
	
	  <jsp:directive.attribute name="id" type="java.lang.String" required="true" rtexprvalue="true" description="The identifier for this tag (do not change!)" />
	  <jsp:directive.attribute name="field" type="java.lang.String" required="true" rtexprvalue="true" description="The field exposed from the form backing object" />
	  <jsp:directive.attribute name="label" type="java.lang.String" required="false" rtexprvalue="true" description="The label used for this field, will default to a message bundle if not supplied" />
	  <jsp:directive.attribute name="disableFormBinding" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Set to true to disable Spring form binding" />
	  <jsp:directive.attribute name="render" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Indicate if the contents of this tag and all enclosed tags should be rendered (default 'true')" />
	  <jsp:directive.attribute name="z" type="java.lang.String" required="false" description="Used for checking if element has been modified (to recalculate simply provide empty string value)" />
	
	  <c:if test="${empty render or render}">
	    <c:if test="${empty label}">
	      <spring:message code="label_${fn:toLowerCase(fn:substringAfter(id,'_'))}" var="label" htmlEscape="false" />
	    </c:if>
	    <c:set var="sec_field">
	      <spring:escapeBody javaScriptEscape="true">${field}</spring:escapeBody>
	    </c:set>
	   
	    <script type="text/javascript">dojo.require("dijit.form.CheckBox");</script>
	    <div id="_${sec_id}_id">
	      <label for="_${sec_field}_id">
	        <c:out value="${fn:escapeXml(label)}" />:
	      </label>
	      <c:choose>
	        <c:when test="${disableFormBinding}">
	          <input id="_${sec_field}_id" name="${sec_field}" type="checkbox"/>
	        </c:when>
	        <c:otherwise>
	          <form:checkbox id="_${sec_field}_id" path="${sec_field}"/>
	        </c:otherwise>
	      </c:choose>
	      <script type="text/javascript">
	      	Spring.addDecoration(new Spring.ElementDecoration({elementId : '_${sec_field}_id', widgetType : 'dijit.form.CheckBox', widgetAttrs : {}}));
	      </script>
	    </div>
	    <br />
	  </c:if>
	</jsp:root>
    '''
  }


  def genColumn() {'''
	<jsp:root xmlns:c="http://java.sun.com/jsp/jstl/core" xmlns:fn="http://java.sun.com/jsp/jstl/functions" xmlns:util="urn:jsptagdir:/WEB-INF/tags/util" xmlns:spring="http://www.springframework.org/tags" xmlns:form="http://www.springframework.org/tags/form" xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0">
	  <jsp:output omit-xml-declaration="yes" />
	
	  <jsp:directive.attribute name="id" type="java.lang.String" required="true" rtexprvalue="true" description="The identifier for this tag (do not change!)" />
	  <jsp:directive.attribute name="property" type="java.lang.String" required="true" rtexprvalue="true" description="The property (field name) of the dataset to be displayed in a column (required)." />
	  <jsp:directive.attribute name="maxLength" type="java.lang.Integer" required="false" rtexprvalue="true" description="Max displayed text length (default '10'). Unlimited if negative" />
	  <jsp:directive.attribute name="label" type="java.lang.String" required="false" rtexprvalue="true" description="The column label to be used in the table (optional)." />
	  <jsp:directive.attribute name="date" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Indicate that this field is of type java.util.Date" />
	  <jsp:directive.attribute name="calendar" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Indicate that this field is of type java.util.Calendar" />
	  <jsp:directive.attribute name="dateTimePattern" type="java.lang.String" required="false" rtexprvalue="true" description="The date / time pattern to use if the field is a date or calendar type" />
	  <jsp:directive.attribute name="render" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Indicate if the contents of this tag and all enclosed tags should be rendered (default 'true')" />
	  <jsp:directive.attribute name="z" type="java.lang.String" required="false" description="Used for checking if element has been modified (to recalculate simply provide empty string value)" />
	
	  <c:if test="${empty render or render}">
	    <c:if test="${empty label}">
	      <spring:message code="label_${fn:toLowerCase(fn:substringAfter(id,'_'))}" var="label" htmlEscape="false" />
	    </c:if>
	
	    <c:if test="${empty dateTimePattern}">
	      <c:set value="MM/dd/yyyy" var="dateTimePattern" />
	    </c:if>
	      
	    <c:choose>
	      <c:when test="${date and empty columnTypes}">
	        <c:set var="columnTypes" value="date" scope="request" />
	        <c:set var="columnDatePatterns" value="${dateTimePattern}" scope="request" />
	      </c:when>
	      <c:when test="${date and not empty columnTypes}">
	        <c:set var="columnTypes" value="${columnTypes}&#9999;date" scope="request" />
	        <c:set var="columnDatePatterns" value="${columnDatePatterns}&#9999;${dateTimePattern}" scope="request" />
	      </c:when>
	      <c:when test="${calendar and empty columnTypes}">
	        <c:set var="columnTypes" value="calendar" scope="request" />
	        <c:set var="columnDatePatterns" value="${dateTimePattern}" scope="request" />
	      </c:when>
	      <c:when test="${calendar and not empty columnTypes}">
	        <c:set var="columnTypes" value="${columnTypes}&#9999;calendar" scope="request" />
	        <c:set var="columnDatePatterns" value="${columnDatePatterns}&#9999;${dateTimePattern}" scope="request" />
	      </c:when>
	      <c:when test="${empty columnTypes}">
	        <c:set var="columnTypes" value="default" scope="request" />
	        <c:set var="columnDatePatterns" value="none" scope="request" />
	      </c:when>
	      <c:otherwise>
	        <c:set var="columnTypes" value="${columnTypes}&#9999;default" scope="request" />
	        <c:set var="columnDatePatterns" value="${columnDatePatterns}&#9999;none" scope="request" />
	      </c:otherwise>
	    </c:choose>
	
	    <c:choose>
	      <c:when test="${empty columnProperties and empty columnLabels}">
	        <c:set var="columnProperties" value="${property}" scope="request" />
	        <c:set var="columnLabels" value="${label}" scope="request" />
	        <c:set var="columnMaxLengths" value="${empty maxLength ? 128 : maxLength}" scope="request" />
	      </c:when>
	      <c:otherwise>
	        <c:set var="columnProperties" value="${columnProperties}&#9999;${property}" scope="request" />
	        <c:set var="columnLabels" value="${columnLabels}&#9999;${label}" scope="request" />
	        <c:set var="columnMaxLengths" value="${columnMaxLengths}&#9999;${empty maxLength ? 128 : maxLength}" scope="request" />
	      </c:otherwise>
	    </c:choose>
	  </c:if>
	</jsp:root>
    '''
  }


  def genDatetime() {'''
	<jsp:root xmlns:c="http://java.sun.com/jsp/jstl/core" xmlns:fn="http://java.sun.com/jsp/jstl/functions" xmlns:spring="http://www.springframework.org/tags" xmlns:form="http://www.springframework.org/tags/form" xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0">
	  <jsp:output omit-xml-declaration="yes" />
	
	  <jsp:directive.attribute name="id" type="java.lang.String" required="true" rtexprvalue="true" description="The identifier for this tag (do not change!)" />
	  <jsp:directive.attribute name="field" type="java.lang.String" required="true" rtexprvalue="true" description="The field exposed from the form backing object" />
	  <jsp:directive.attribute name="dateTimePattern" type="java.lang.String" required="true" rtexprvalue="true" description="The format accepted in this field" />
	  <jsp:directive.attribute name="label" type="java.lang.String" required="false" rtexprvalue="true" description="The label used for this field, will default to a message bundle if not supplied" />
	  <jsp:directive.attribute name="required" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Indicates if this field is required (default false)" />
	  <jsp:directive.attribute name="disabled" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Specify if this field should be enabled" />
	  <jsp:directive.attribute name="validationRegex" type="java.lang.String" required="false" rtexprvalue="true" description="Specify regular expression to be used for the validation of the input contents" />
	  <jsp:directive.attribute name="validationMessageCode" type="java.lang.String" required="false" rtexprvalue="true" description="Specify the message (message property code) to be displayed if the regular expression validation fails" />
	  <jsp:directive.attribute name="validationMessage" type="java.lang.String" required="false" rtexprvalue="true" description="Specify the message to be displayed if the regular expression validation fails" />
	  <jsp:directive.attribute name="future" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Specify if the date / time should be in the future" />
	  <jsp:directive.attribute name="past" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Specify if the date / time should be in the past" />
	  <jsp:directive.attribute name="disableFormBinding" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Set to true to disable Spring form binding" />
	  <jsp:directive.attribute name="render" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Indicate if the contents of this tag and all enclosed tags should be rendered (default 'true')" />
	  <jsp:directive.attribute name="z" type="java.lang.String" required="false" description="Used for checking if element has been modified (to recalculate simply provide empty string value)" />
	
	  <c:if test="${empty render or render}">
	
	    <c:if test="${empty disabled}">
	      <c:set value="false" var="disabled" />
	    </c:if>
	    <c:if test="${empty label}">
	      <spring:message code="label_${fn:toLowerCase(fn:substringAfter(id,'_'))}" var="label" htmlEscape="false" />
	    </c:if>
	    <c:set var="sec_field">
	      <spring:escapeBody javaScriptEscape="true" >${field}</spring:escapeBody>
	    </c:set>
	    
	    <c:if test="${empty required}">
	      <c:set value="false" var="required" />
	    </c:if>
	
	    <script type="text/javascript">dojo.require('dijit.form.DateTextBox')</script>
	    <div id="_${sec_id}_id">
	      <label for="_${sec_field}_id">
	        <c:out value="${label}" />
	        :
	      </label>
	      <c:choose>
	        <c:when test="${disableFormBinding}">
	          <input id="_${sec_field}_id" name="${sec_field}" />
	        </c:when>
	        <c:otherwise>
	          <form:input id="_${sec_field}_id" path="${sec_field}" disabled="${disabled}" />
	          <br />
	          <form:errors cssClass="errors" id="_${sec_field}_error_id" path="${sec_field}" />
	        </c:otherwise>
	      </c:choose>
	      <spring:message arguments="${fn:escapeXml(label)}" code="field_invalid" var="field_invalid" htmlEscape="false" />
	      <c:choose>
	        <c:when test="${required}">
	          <spring:message code="field_required" var="field_required" htmlEscape="false" />
	          <spring:message argumentSeparator="," arguments="${label},(${field_required})" code="field_simple_validation" var="field_validation" htmlEscape="false" />
	        </c:when>
	        <c:otherwise>
	          <spring:message argumentSeparator="," arguments="${label}, " code="field_simple_validation" var="field_validation" htmlEscape="false" />
	        </c:otherwise>
	      </c:choose>
	      <script type="text/javascript">
	        <c:set var="sec_field_validation">
	          <spring:escapeBody javaScriptEscape="true">${field_validation}</spring:escapeBody>
	        </c:set>
	        <c:set var="sec_field_invalid">
	          <spring:escapeBody javaScriptEscape="true">${field_invalid}</spring:escapeBody>
	        </c:set>
	        <c:set var="sec_dateTimePattern">
	          <spring:escapeBody javaScriptEscape="true">${dateTimePattern}</spring:escapeBody>
	        </c:set>
	        Spring.addDecoration(new Spring.ElementDecoration({elementId : '_${sec_field}_id', widgetType : 'dijit.form.DateTextBox', widgetAttrs : {promptMessage: '${sec_field_validation}', invalidMessage: '${sec_field_invalid}', required: ${required}, constraints: {datePattern : '${sec_dateTimePattern}', required : ${required}}, datePattern : '${sec_dateTimePattern}'}})); </script>
	    </div>
	    <br />
	  </c:if>
	</jsp:root>
    '''
  }


  def genDisplay() {'''
	<jsp:root xmlns:c="http://java.sun.com/jsp/jstl/core" xmlns:fn="http://java.sun.com/jsp/jstl/functions" xmlns:fmt="http://java.sun.com/jsp/jstl/fmt" xmlns:spring="http://www.springframework.org/tags" xmlns:form="http://www.springframework.org/tags/form" xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0">
	  <jsp:output omit-xml-declaration="yes" />
	
	  <jsp:directive.attribute name="id" type="java.lang.String" required="true" rtexprvalue="true" description="The identifier for this tag (do not change!)" />
	  <jsp:directive.attribute name="object" type="java.lang.Object" required="true" rtexprvalue="true" description="The form backing object" />
	  <jsp:directive.attribute name="field" type="java.lang.String" required="true" rtexprvalue="true" description="The field name" />
	  <jsp:directive.attribute name="label" type="java.lang.String" required="false" rtexprvalue="true" description="The label used for this field, will default to a message bundle if not supplied" />
	  <jsp:directive.attribute name="date" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Indicate that this field is of type java.util.Date" />
	  <jsp:directive.attribute name="calendar" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Indicate that this field is of type java.util.Calendar" />
	  <jsp:directive.attribute name="dateTimePattern" type="java.lang.String" required="false" rtexprvalue="true" description="The date / time pattern to use if the field is a date or calendar type" />
	  <jsp:directive.attribute name="render" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Indicate if the contents of this tag and all enclosed tags should be rendered (default 'true')" />
	  <jsp:directive.attribute name="z" type="java.lang.String" required="false" description="Used for checking if element has been modified (to recalculate simply provide empty string value)" />
	
	  <c:if test="${empty render or render}">
	    <c:if test="${not empty object and empty label}">
	      <spring:message code="label_${fn:toLowerCase(fn:substringAfter(id,'_'))}" var="label" htmlEscape="false" />
	    </c:if>
	
	    <c:if test="${empty dateTimePattern}">
	      <c:set value="MM/dd/yyyy" var="dateTimePattern" />
	    </c:if>
	
	    <div id="_${fn:escapeXml(id)}_id">
	      <label for="_${fn:escapeXml(field)}_id">
	        <c:out value="${label}" />
	        :
	      </label>
	      <div class="box" id="_${fn:escapeXml(id)}_${fn:escapeXml(field)}_id">
	        <c:choose>
	          <c:when test="${date}">
	            <spring:escapeBody>
	              <fmt:formatDate value="${object[field]}" pattern="${fn:escapeXml(dateTimePattern)}" />
	            </spring:escapeBody>
	          </c:when>
	          <c:when test="${calendar}">
	            <spring:escapeBody>
	              <fmt:formatDate value="${object[field].time}" pattern="${fn:escapeXml(dateTimePattern)}" />
	            </spring:escapeBody>
	          </c:when>
	          <c:otherwise>
	            <spring:eval expression="object[field]" />
	          </c:otherwise>
	        </c:choose>
	      </div>
	    </div>
	    <br />
	  </c:if>
	</jsp:root>
    '''
  }


  def genEditor() {'''
	<jsp:root xmlns:c="http://java.sun.com/jsp/jstl/core" xmlns:fn="http://java.sun.com/jsp/jstl/functions" xmlns:spring="http://www.springframework.org/tags" xmlns:form="http://www.springframework.org/tags/form" xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0">
	  <jsp:output omit-xml-declaration="yes" />
	
	  <jsp:directive.attribute name="id" type="java.lang.String" required="true" rtexprvalue="true" description="The identifier for this tag (do not change!)" />
	  <jsp:directive.attribute name="field" type="java.lang.String" required="true" rtexprvalue="true" description="The field exposed from the form backing object" />
	  <jsp:directive.attribute name="label" type="java.lang.String" required="false" rtexprvalue="true" description="The label used for this field, will default to a message bundle if not supplied" />
	  <jsp:directive.attribute name="required" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Indicates if this field is required (default false)" />
	  <jsp:directive.attribute name="disabled" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Specify if this field should be enabled" />
	  <jsp:directive.attribute name="validationRegex" type="java.lang.String" required="false" rtexprvalue="true" description="Specify regular expression to be used for the validation of the input contents" />
	  <jsp:directive.attribute name="validationMessageCode" type="java.lang.String" required="false" rtexprvalue="true" description="Specify the message (message property code) to be displayed if the regular expression validation fails" />
	  <jsp:directive.attribute name="validationMessage" type="java.lang.String" required="false" rtexprvalue="true" description="Specify the message to be displayed if the regular expression validation fails" />
	  <jsp:directive.attribute name="render" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Indicate if the contents of this tag and all enclosed tags should be rendered (default 'true')" />
	  <jsp:directive.attribute name="z" type="java.lang.String" required="false" description="Used for checking if element has been modified (to recalculate simply provide empty string value)" />
	
	  <c:if test="${empty render or render}">
	
	    <c:if test="${empty disabled}">
	      <c:set value="false" var="disabled" />
	    </c:if>
	
	    <c:if test="${empty label}">
	      <spring:message code="label_${fn:toLowerCase(fn:substringAfter(id,'_'))}" var="label" htmlEscape="false" />
	    </c:if>
	
	    <c:if test="${empty required}">
	      <c:set value="false" var="required" />
	    </c:if>
	    
	    <c:set var="sec_field">
	      <spring:escapeBody javaScriptEscape="true" >${field}</spring:escapeBody>
	    </c:set>
	
	    <script type="text/javascript">dojo.require("dijit.Editor");</script>
	    <div id="_${fn:escapeXml(id)}_id">
	      <label for="_${sec_field}_id">
	        <c:out value="${fn:escapeXml(label)}" />
	        :
	      </label>
	      <form:hidden id="_${sec_field}_id" path="${sec_field}" />
	      <div>
	        <div id="_${sec_field}_id_"></div>
	        <script type="text/javascript">
	           Spring.addDecoration(new Spring.ElementDecoration({elementId : '_${sec_field}_id_', widgetType : 'dijit.Editor', widgetAttrs : {disabled: ${disabled}}}));
	           dojo.addOnLoad(function () {
	              var src = dojo.byId('_${sec_field}_id');
	              var rte = dijit.byId('_${sec_field}_id_');
	              rte.disabled = ${disabled};
	              rte.onLoadDeferred.addCallback(function(){
	                rte.setValue(src.value);
	                dojo.connect(rte, 'onBlur', function(){src.value = rte.getValue();});
	              });
	            });
	        </script>
	      </div>
	      <br />
	      <form:errors cssClass="errors" id="_${sec_field}_error_id" path="${sec_field}" />
	    </div>
	    <br />
	  </c:if>
	</jsp:root>
    '''
  }


  def genInput() {'''
	<jsp:root xmlns:c="http://java.sun.com/jsp/jstl/core" xmlns:fn="http://java.sun.com/jsp/jstl/functions" xmlns:spring="http://www.springframework.org/tags" xmlns:form="http://www.springframework.org/tags/form" xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0">
	  <jsp:output omit-xml-declaration="yes" />
	
	  <jsp:directive.attribute name="id" type="java.lang.String" required="true" rtexprvalue="true" description="The identifier for this tag (do not change!)" />
	  <jsp:directive.attribute name="field" type="java.lang.String" required="true" rtexprvalue="true" description="The field exposed from the form backing object" />
	  <jsp:directive.attribute name="label" type="java.lang.String" required="false" rtexprvalue="true" description="The label used for this field, will default to a message bundle if not supplied" />
	  <jsp:directive.attribute name="labelCode" type="java.lang.String" required="false" rtexprvalue="true" description="Key for label message bundle if label is not supplied" />
	  <jsp:directive.attribute name="required" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Indicates if this field is required (default false)" />
	  <jsp:directive.attribute name="disabled" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Specify if this field should be enabled" />
	  <jsp:directive.attribute name="validationRegex" type="java.lang.String" required="false" rtexprvalue="true" description="Specify regular expression to be used for the validation of the input contents" />
	  <jsp:directive.attribute name="validationMessageCode" type="java.lang.String" required="false" rtexprvalue="true" description="Specify the message (message property code) to be displayed if the regular expression validation fails" />
	  <jsp:directive.attribute name="validationMessage" type="java.lang.String" required="false" rtexprvalue="true" description="Specify the message to be displayed if the regular expression validation fails" />
	  <jsp:directive.attribute name="min" type="java.lang.String" required="false" rtexprvalue="true" description="Specify the minimum length of the input contents" />
	  <jsp:directive.attribute name="max" type="java.lang.String" required="false" rtexprvalue="true" description="Specify the maximum length of the input contents" />
	  <jsp:directive.attribute name="decimalMin" type="java.lang.String" required="false" rtexprvalue="true" description="Specify the minimum size of the input contents" />
	  <jsp:directive.attribute name="decimalMax" type="java.lang.String" required="false" rtexprvalue="true" description="Specify the maximum size of the input contents" />
	  <jsp:directive.attribute name="disableFormBinding" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Set to true to disable Spring form binding" />
	  <jsp:directive.attribute name="type" type="java.lang.String" required="false" rtexprvalue="true" description="Set field type (default 'text', or 'password')" />
	  <jsp:directive.attribute name="render" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Indicate if the contents of this tag and all enclosed tags should be rendered (default 'true')" />
	  <jsp:directive.attribute name="z" type="java.lang.String" required="false" description="Used for checking if element has been modified (to recalculate simply provide empty string value)" />
	  
	  <c:if test="${empty render or render}">
	  
	    <c:if test="${empty type}">
	      <c:set value="text" var="type" />
	    </c:if>
	    
	    <c:if test="${empty disabled}">
	      <c:set value="false" var="disabled" />
	    </c:if>
	    
	    <c:if test="${empty label}">
	      <c:if test="${empty labelCode}">
	        <c:set var="labelCode" value="${fn:substringAfter(id,'_')}" />
	      </c:if>
	      <spring:message code="label_${fn:toLowerCase(labelCode)}" var="label" htmlEscape="false" />
	    </c:if>
	    
	    <c:if test="${empty validationMessage}">
	      <c:choose>
	        <c:when test="${empty validationMessageCode}">
	          <spring:message arguments="${fn:escapeXml(label)}" code="field_invalid" var="field_invalid" htmlEscape="false" />
	        </c:when>
	        <c:otherwise>
	          <spring:message arguments="${fn:escapeXml(label)}" code="${validationMessageCode}" var="field_invalid" htmlEscape="false" />
	        </c:otherwise>
	      </c:choose>
	    </c:if>
	    
	    <c:if test="${empty required}">
	      <c:set value="false" var="required" />
	    </c:if>
	    
	    <c:set var="sec_field">
	      <spring:escapeBody javaScriptEscape="true" >${field}</spring:escapeBody>
	    </c:set>
	    
	    <div id="_${fn:escapeXml(id)}_id">
	      <label for="_${sec_field}_id">
	        <c:out value="${fn:escapeXml(label)}" />
	        :
	      </label>
	      <c:choose>
	        <c:when test="${disableFormBinding}">
	          <input id="_${sec_field}_id" name="${sec_field}" type="${fn:escapeXml(type)}" />
	        </c:when>
	        <c:otherwise>
	          <c:choose>
	            <c:when test="${type eq 'password'}">
	              <form:password id="_${sec_field}_id" path="${sec_field}" disabled="${disabled}" />
	            </c:when>
	            <c:otherwise>
	              <form:input id="_${sec_field}_id" path="${sec_field}" disabled="${disabled}" />
	            </c:otherwise>
	          </c:choose>
	          <br />
	          <form:errors cssClass="errors" id="_${sec_field}_error_id" path="${sec_field}" />
	        </c:otherwise>
	      </c:choose>
	      <c:choose>
	        <c:when test="${required}">
	          <spring:message code="field_required" var="field_required" htmlEscape="false" />
	          <spring:message argumentSeparator="," arguments="${label},(${field_required})" code="field_simple_validation" var="field_validation" htmlEscape="false" />
	        </c:when>
	        <c:otherwise>
	          <spring:message argumentSeparator="," arguments="${label}, " code="field_simple_validation" var="field_validation" htmlEscape="false" />
	        </c:otherwise>
	      </c:choose>
	      <c:set var="sec_field_validation">
	        <spring:escapeBody javaScriptEscape="true">${field_validation}</spring:escapeBody>
	      </c:set>
	      <c:set var="sec_field_invalid">
	        <spring:escapeBody javaScriptEscape="true" htmlEscape="true">${field_invalid}</spring:escapeBody>
	      </c:set>
	      <c:set var="sec_field_required">
	        <spring:escapeBody javaScriptEscape="true">${field_required}</spring:escapeBody>
	      </c:set>
	      <c:set var="sec_validation_regex" value="" />
	      <c:if test="${!empty validationRegex}">
	        <c:set var="sec_validation_regex" value="regExp : '${validationRegex}', " />
	      </c:if>
	      <script type="text/javascript">
	        Spring.addDecoration(new Spring.ElementDecoration({elementId : '_${sec_field}_id', widgetType : 'dijit.form.ValidationTextBox', widgetAttrs : {promptMessage: '${sec_field_validation}', invalidMessage: '${sec_field_invalid}', required : ${required}, ${sec_validation_regex} missingMessage : '${sec_field_required}' }})); 
	      </script>
	    </div>
	    <br />
	  </c:if>
	</jsp:root>
    '''
  }


  def genReference() {'''
	<jsp:root xmlns:c="http://java.sun.com/jsp/jstl/core" xmlns:fn="http://java.sun.com/jsp/jstl/functions" xmlns:spring="http://www.springframework.org/tags" xmlns:form="http://www.springframework.org/tags/form" xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0">
	  <jsp:output omit-xml-declaration="yes" />
	
	  <jsp:directive.attribute name="id" type="java.lang.String" required="true" rtexprvalue="true" description="The identifier for this tag (do not change!)" />
	  <jsp:directive.attribute name="path" type="java.lang.String" required="true" rtexprvalue="true" description="The relative path to the respource" />
	  <jsp:directive.attribute name="field" type="java.lang.String" required="true" rtexprvalue="true" description="The field exposed from the form backing object" />
	  <jsp:directive.attribute name="required" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Indicates if this field is required (default false)" />
	  <jsp:directive.attribute name="label" type="java.lang.String" required="false" rtexprvalue="true" description="The label used for this field, will default to a message bundle if not supplied" />
	  <jsp:directive.attribute name="render" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Indicate if the contents of this tag and all enclosed tags should be rendered (default 'true')" />
	  <jsp:directive.attribute name="z" type="java.lang.String" required="false" description="Used for checking if element has been modified (to recalculate simply provide empty string value)" />
	
	  <c:if test="${empty render or render}">
	
	    <c:if test="${empty label}">
	      <spring:message code="label_${fn:toLowerCase(fn:substringAfter(id,'_'))}" var="label" htmlEscape="false" />
	    </c:if>
	
	    <div id="_${fn:escapeXml(id)}_id">
	      <label for="_${fn:escapeXml(field)}_id">
	        <c:out value="${fn:escapeXml(label)}" />
	        :
	      </label>
	      <spring:url value="${path}" var="create_url">
	        <spring:param name="form" />
	      </spring:url>
	      <a href="${create_url}">
	        <spring:url value="/resources/images/add.png" var="create_img_url" />
	        <spring:message arguments="${field}" code="global_menu_new" var="add_message" htmlEscape="false" />
	        <img alt="${fn:escapeXml(add_message)}" src="${create_img_url}" title="${fn:escapeXml(add_message)}" />
	      </a>
	      <c:out value=" " />
	      <spring:message arguments="${label}" code="entity_not_found" />
	      <c:if test="${not empty required and required eq 'true'}">
	        (
	        <spring:message code="field_required" />
	        )
	      </c:if>
	    </div>
	    <br />
	  </c:if>
	</jsp:root>
    '''
  }


  def genSelect() {'''
	<jsp:root xmlns:c="http://java.sun.com/jsp/jstl/core" xmlns:field="urn:jsptagdir:/WEB-INF/tags/form/fields" xmlns:fn="http://java.sun.com/jsp/jstl/functions" xmlns:spring="http://www.springframework.org/tags" xmlns:form="http://www.springframework.org/tags/form" xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0">
	  <jsp:output omit-xml-declaration="yes" />
	
	  <jsp:directive.attribute name="id" type="java.lang.String" required="true" rtexprvalue="true" description="The identifier for this tag (do not change!)" />
	  <jsp:directive.attribute name="field" type="java.lang.String" required="true" rtexprvalue="true" description="The field exposed from the form backing object" />
	  <jsp:directive.attribute name="path" type="java.lang.String" required="true" rtexprvalue="true" description="The relative path to the referenced resource" />
	  <jsp:directive.attribute name="items" type="java.util.Collection" required="true" rtexprvalue="true" description="The name of the collection displayed in the select box" />
	  <jsp:directive.attribute name="label" type="java.lang.String" required="false" rtexprvalue="true" description="The label used for this field, will default to a message bundle if not supplied" />
	  <jsp:directive.attribute name="itemLabel" type="java.lang.String" required="false" rtexprvalue="true" description="Name of the property mapped to the inner text of the 'option' tag (will override the configured converter)" />
	  <jsp:directive.attribute name="itemValue" type="java.lang.String" required="false" rtexprvalue="true" description="The identifier used as value in the select box (defaults to 'id' for non enum types)" />
	  <jsp:directive.attribute name="required" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Indicates if this field is required (default false)" />
	  <jsp:directive.attribute name="disabled" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Specify if this field should be enabled" />
	  <jsp:directive.attribute name="multiple" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Specify if the select box should allow multiple selections" />
	  <jsp:directive.attribute name="disableFormBinding" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Set to true to disable Spring form binding" />
	  <jsp:directive.attribute name="render" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Indicate if the contents of this tag and all enclosed tags should be rendered (default 'true')" />
	  <jsp:directive.attribute name="z" type="java.lang.String" required="false" description="Used for checking if element has been modified (to recalculate simply provide empty string value)" />
	
	  <c:if test="${empty render or render}">
	
	    <c:if test="${empty disabled}">
	      <c:set value="false" var="disabled" />
	    </c:if>
	
	    <c:if test="${empty label}">
	      <spring:message code="label_${fn:toLowerCase(fn:substringAfter(id,'_'))}" var="label" htmlEscape="false" />
	    </c:if>
	
	    <c:if test="${empty required}">
	      <c:set value="false" var="required" />
	    </c:if>
	
	    <c:if test="${empty multiple}">
	      <c:set value="false" var="multiple" />
	    </c:if>
	    
	    <c:set var="sec_field">
	      <spring:escapeBody javaScriptEscape="true" >${field}</spring:escapeBody>
	    </c:set>
	
	    <c:set var="sec_itemLabel">
	      <spring:escapeBody htmlEscape="true" >${itemLabel}</spring:escapeBody>
	    </c:set>
	
	    <div id="_${fn:escapeXml(id)}_id">
	      <c:choose>
	        <c:when test="${not empty items}">
	          <label for="_${sec_field}_id">
	            <c:out value="${fn:escapeXml(label)}" />
	            :
	          </label>
	          <c:choose>
	            <c:when test="${empty itemValue}">
	              <c:choose>
	                <c:when test="${disableFormBinding}">
	                  <c:choose>
	                    <c:when test="${multiple}">
	                      <select id="_${sec_field}_id" name="${sec_field}" multiple="${multiple}">
	                      <c:forEach items="${items}" var="item">
	                        <option value="${item}">
	                        <c:choose>
	                          <c:when test="${empty itemLabel}">
	                            <spring:eval expression="item" />
	                          </c:when>
	                          <c:otherwise>
	                            <spring:eval expression="item[sec_itemLabel]"/>
	                          </c:otherwise>
	                        </c:choose>
	                        </option>
	                      </c:forEach>
	                      </select>
	                    </c:when>
	                    <c:otherwise>
	                      <select id="_${sec_field}_id" name="${sec_field}">
	                      <c:forEach items="${items}" var="item">
	                        <option value="${item}">
	                        <c:choose>
	                          <c:when test="${empty itemLabel}">
	                            <spring:eval expression="item" />
	                          </c:when>
	                          <c:otherwise>
	                            <spring:eval expression="item[sec_itemLabel]"/>
	                          </c:otherwise>
	                        </c:choose>
	                        </option>
	                      </c:forEach>
	                      </select>
	                    </c:otherwise>
	                  </c:choose>
	                </c:when>
	                <c:otherwise>
	                  <c:choose>
	                    <c:when test="${empty itemLabel}">
	                      <c:choose>
	                        <c:when test="${multiple}">
	                          <form:select id="_${sec_field}_id" items="${items}" path="${sec_field}" disabled="${disabled}" multiple="${multiple}" />
	                        </c:when>
	                        <c:otherwise>
	                          <form:select id="_${sec_field}_id" items="${items}" path="${sec_field}" disabled="${disabled}" />
	                        </c:otherwise>
	                     </c:choose>
	                    </c:when>
	                    <c:otherwise>
	                      <c:choose>
	                        <c:when test="${multiple}">
	                          <form:select id="_${sec_field}_id" items="${items}" path="${sec_field}" disabled="${disabled}" multiple="${multiple}" itemLabel="${sec_itemLabel}"/>
	                        </c:when>
	                        <c:otherwise>
	                          <form:select id="_${sec_field}_id" items="${items}" path="${sec_field}" disabled="${disabled}" itemLabel="${sec_itemLabel}"/>
	                        </c:otherwise>
	                      </c:choose>
	                    </c:otherwise>
	                  </c:choose>
	                  <br />
	                  <form:errors cssClass="errors" id="_${sec_field}_error_id" path="${sec_field}" />
	                </c:otherwise>
	              </c:choose>
	            </c:when>
	            <c:otherwise>
	              <c:choose>
	                <c:when test="${disableFormBinding}">
	                  <c:choose>
	                    <c:when test="${multiple}">
	                      <select id="_${sec_field}_id" name="${sec_field}" multiple="${multiple}">
	                        <c:forEach items="${items}" var="item">
	                          <option value="${item[fn:escapeXml(itemValue)]}">
	                            <c:choose>
	                              <c:when test="${empty itemLabel}">
	                                <spring:eval expression="item" />
	                              </c:when>
	                              <c:otherwise>
	                                <spring:eval expression="item[sec_itemLabel]"/>
	                              </c:otherwise>
	                            </c:choose>
	                          </option>
	                        </c:forEach>
	                      </select>
	                    </c:when>
	                    <c:otherwise>
	                      <select id="_${sec_field}_id" name="${sec_field}" multiple="${multiple}">
	                        <c:forEach items="${items}" var="item">
	                          <option value="${item[fn:escapeXml(itemValue)]}">
	                            <c:choose>
	                              <c:when test="${empty itemLabel}">
	                                <spring:eval expression="item" />
	                              </c:when>
	                              <c:otherwise>
	                                <spring:eval expression="item[sec_itemLabel]"/>
	                              </c:otherwise>
	                            </c:choose>
	                          </option>
	                        </c:forEach>
	                      </select>
	                    </c:otherwise>
	                  </c:choose>
	                </c:when>
	                <c:otherwise>
	                  <c:choose>
	                    <c:when test="${empty itemLabel}">
	                      <c:choose>
	                        <c:when test="${multiple}">
	                          <form:select id="_${sec_field}_id" items="${items}" path="${sec_field}" disabled="${disabled}" multiple="${multiple}" itemValue="${fn:escapeXml(itemValue)}" />
	                        </c:when>
	                        <c:otherwise>
	                          <form:select id="_${sec_field}_id" items="${items}" path="${sec_field}" disabled="${disabled}" itemValue="${fn:escapeXml(itemValue)}" />
	                        </c:otherwise>
	                      </c:choose>
	                    </c:when>
	                    <c:otherwise>
	                      <c:choose>
	                        <c:when test="${multiple}">
	                          <form:select id="_${sec_field}_id" items="${items}" path="${sec_field}" disabled="${disabled}" multiple="${multiple}" itemValue="${fn:escapeXml(itemValue)}" itemLabel="${sec_itemLabel}"/>
	                        </c:when>
	                        <c:otherwise>
	                          <form:select id="_${sec_field}_id" items="${items}" path="${sec_field}" disabled="${disabled}" itemValue="${fn:escapeXml(itemValue)}" itemLabel="${sec_itemLabel}"/>
	                        </c:otherwise>
	                      </c:choose>
	                    </c:otherwise>
	                  </c:choose>
	                  <br />
	                  <form:errors cssClass="errors" id="_${sec_field}_error_id" path="${sec_field}" />
	                </c:otherwise>
	              </c:choose>
	            </c:otherwise>
	          </c:choose>
	          <c:choose>
	            <c:when test="${multiple == false}">
	              <script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : '_${sec_field}_id', widgetType: 'dijit.form.FilteringSelect', widgetAttrs : {hasDownArrow : true}})); </script>
	            </c:when>
	            <!-- disabled due to http://jira.springframework.org/browse/ROO-909 <c:otherwise> <script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : '_${field}_id', widgetType: 'dijit.form.MultiSelect', widgetAttrs : {}})); </script> </c:otherwise> -->
	          </c:choose>
	        </c:when>
	        <c:otherwise>
	          <field:reference field="${label}" id="${id}" path="${path}" required="${required}" />
	        </c:otherwise>
	      </c:choose>
	    </div>
	    <br />
	  </c:if>
	</jsp:root>
    '''
  }


  def genSimple() {'''
	<jsp:root xmlns:c="http://java.sun.com/jsp/jstl/core" xmlns:fn="http://java.sun.com/jsp/jstl/functions" xmlns:spring="http://www.springframework.org/tags" xmlns:form="http://www.springframework.org/tags/form" xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0">
	  <jsp:output omit-xml-declaration="yes" />
	
	  <jsp:directive.attribute name="id" type="java.lang.String" required="true" rtexprvalue="true" description="The identifier for this tag (do not change!)" />
	  <jsp:directive.attribute name="field" type="java.lang.String" required="true" rtexprvalue="true" description="The field exposed from the form backing object" />
	  <jsp:directive.attribute name="text" type="java.lang.String" required="false" rtexprvalue="true" description="The text to be presented" />
	  <jsp:directive.attribute name="messageCode" type="java.lang.String" required="false" rtexprvalue="true" description="The code for the message to be presented" />
	  <jsp:directive.attribute name="messageCodeAttribute" type="java.lang.String" required="false" rtexprvalue="true" description="The attribute for the message code sto be presented" />
	  <jsp:directive.attribute name="label" type="java.lang.String" required="false" rtexprvalue="true" description="The label used for this field, will default to a message bundle if not supplied" />
	  <jsp:directive.attribute name="render" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Indicate if the contents of this tag and all enclosed tags should be rendered (default 'true')" />
	  <jsp:directive.attribute name="z" type="java.lang.String" required="false" description="Used for checking if element has been modified (to recalculate simply provide empty string value)" />
	
	  <c:if test="${empty render or render}">
	
	    <c:if test="${empty label}">
	      <spring:message code="label_${fn:toLowerCase(fn:substringAfter(id,'_'))}" var="label" htmlEscape="false" />
	    </c:if>
	
	    <div id="_${fn:escapeXml(id)}_id">
	      <label for="_${fn:escapeXml(field)}_id">
	        <c:out value="${label}" />
	        :
	      </label>
	      <c:choose>
	        <c:when test="${not empty messageCode}">
	          <spring:message code="${messageCode}" arguments="${messageCodeAttribute}" />
	        </c:when>
	        <c:otherwise>
	          <spring:eval expression="text" />
	        </c:otherwise>
	      </c:choose>
	    </div>
	    <br />
	  </c:if>
	</jsp:root>
    '''
  }


  def genTable() {'''
	<jsp:root xmlns:c="http://java.sun.com/jsp/jstl/core" xmlns:fn="http://java.sun.com/jsp/jstl/functions" xmlns:util="urn:jsptagdir:/WEB-INF/tags/util" xmlns:spring="http://www.springframework.org/tags" xmlns:form="http://www.springframework.org/tags/form" xmlns:fmt="http://java.sun.com/jsp/jstl/fmt" xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0">
	  <jsp:directive.tag import="java.util.ArrayList" />
	  <jsp:output omit-xml-declaration="yes" />
	
	  <jsp:directive.attribute name="id" type="java.lang.String" required="true" rtexprvalue="true" description="The identifier for this tag (do not change!)" />
	  <jsp:directive.attribute name="data" type="java.util.Collection" required="true" rtexprvalue="true" description="The collection to be displayed in the table" />
	  <jsp:directive.attribute name="path" type="java.lang.String" required="true" rtexprvalue="true" description="Specify the URL path" />
	  <jsp:directive.attribute name="typeIdFieldName" type="java.lang.String" required="false" rtexprvalue="true" description="The identifier field name for the type (defaults to 'id')" />
	  <jsp:directive.attribute name="create" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Include 'create' link into table (default true)" />
	  <jsp:directive.attribute name="update" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Include 'update' link into table (default true)" />
	  <jsp:directive.attribute name="delete" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Include 'delete' link into table (default true)" />
	  <jsp:directive.attribute name="render" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Indicate if the contents of this tag and all enclosed tags should be rendered (default 'true')" />
	  <jsp:directive.attribute name="z" type="java.lang.String" required="false" description="Used for checking if element has been modified (to recalculate simply provide empty string value)" />
	
	  <c:if test="${empty render or render}">
	
	    <c:set var="columnProperties" scope="request" />
	    <c:set var="columnLabels" scope="request" />
	    <c:set var="columnMaxLengths" scope="request" />
	    <c:set var="columnTypes" scope="request" />
	    <c:set var="columnDatePatterns" scope="request" />
	
	    <jsp:doBody />
	
	    <c:if test="${empty typeIdFieldName}">
	      <c:set var="typeIdFieldName" value="id" />
	    </c:if>
	
	    <c:if test="${empty update}">
	      <c:set var="update" value="true" />
	    </c:if>
	
	    <c:if test="${empty delete}">
	      <c:set var="delete" value="true" />
	    </c:if>
	
	    <spring:message var="typeName" code="menu_item_${fn:toLowerCase(fn:split(id,'_')[fn:length(fn:split(id,'_')) - 1])}_new_label" htmlEscape="false" />
	    <c:set var="lengths" value="${fn:split(columnMaxLengths, '&#9999;')}" scope="request" />
	    <c:set var="types" value="${fn:split(columnTypes, '&#9999;')}" scope="request" />
	    <c:set var="patterns" value="${fn:split(columnDatePatterns, '&#9999;')}" scope="request" />
	
	    <spring:eval var="colCounter" expression="1" />
	
	    <table>
	      <thead>
	        <tr>
	          <c:forTokens items="${columnLabels}" delims="${'&#9999;'}" var="columnHeading">
	            <th>
	              <c:out value="${columnHeading}" />
	              <spring:eval var="colCounter" expression="colCounter  + 1" />
	            </th>
	          </c:forTokens>
	          <th></th>
	          <c:if test="${update}">
	            <th></th>
	            <spring:eval var="colCounter" expression="colCounter  + 1" />
	          </c:if>
	          <c:if test="${delete}">
	            <th></th>
	            <spring:eval var="colCounter" expression="colCounter  + 1" />
	          </c:if>
	        </tr>
	      </thead>
	      <c:forEach items="${data}" var="item">
	        <tr>
	          <c:forTokens items="${columnProperties}" delims="${'&#9999;'}" var="column" varStatus="num">
	            <c:set var="columnMaxLength" value="${lengths[num.count-1]}" />
	            <c:set var="columnType" value="${types[num.count-1]}" />
	            <c:set var="columnDatePattern" value="${patterns[num.count-1]}" />
	            <td>
	              <c:choose>
	                <c:when test="${columnType eq 'date'}">
	                  <spring:escapeBody>
	                    <fmt:formatDate value="${item[column]}" pattern="${fn:escapeXml(columnDatePattern)}" var="colTxt" />
	                  </spring:escapeBody>
	                </c:when>
	                <c:when test="${columnType eq 'calendar'}">
	                  <spring:escapeBody>
	                    <fmt:formatDate value="${item[column].time}" pattern="${fn:escapeXml(columnDatePattern)}" var="colTxt"/>
	                  </spring:escapeBody>
	                </c:when>
	                <c:otherwise>
	                  <c:set var="colTxt">
	                    <spring:eval expression="item[column]" htmlEscape="false" />
	                  </c:set>
	                </c:otherwise>
	              </c:choose>
	              <c:if test="${columnMaxLength ge 0}">
	                <c:set value="${fn:substring(colTxt, 0, columnMaxLength)}" var="colTxt" />
	              </c:if>
	              <c:out value="${colTxt}" />
	            </td>
	          </c:forTokens>
	          <c:set var="itemId"><spring:eval expression="item[typeIdFieldName]"/></c:set>
	          <td class="utilbox">
	            <spring:url value="${path}/${itemId}" var="show_form_url" />
	            <spring:url value="/resources/images/show.png" var="show_image_url" />
	            <spring:message arguments="${typeName}" code="entity_show" var="show_label" htmlEscape="false" />
	            <a href="${show_form_url}" alt="${fn:escapeXml(show_label)}" title="${fn:escapeXml(show_label)}">
	              <img alt="${fn:escapeXml(show_label)}" class="image" src="${show_image_url}" title="${fn:escapeXml(show_label)}" />
	            </a>
	          </td>
	          <c:if test="${update}">
	            <td class="utilbox">
	              <spring:url value="${path}/${itemId}" var="update_form_url">
	                <spring:param name="form" />
	              </spring:url>
	              <spring:url value="/resources/images/update.png" var="update_image_url" />
	              <spring:message arguments="${typeName}" code="entity_update" var="update_label" htmlEscape="false" />
	              <a href="${update_form_url}" alt="${fn:escapeXml(update_label)}" title="${fn:escapeXml(update_label)}">
	                <img alt="${fn:escapeXml(update_label)}" class="image" src="${update_image_url}" title="${fn:escapeXml(update_label)}" />
	              </a>
	            </td>
	          </c:if>
	          <c:if test="${delete}">
	            <td class="utilbox">
	              <spring:url value="${path}/${itemId}" var="delete_form_url" />
	              <spring:url value="/resources/images/delete.png" var="delete_image_url" />
	              <form:form action="${delete_form_url}" method="DELETE">
	                <spring:message arguments="${typeName}" code="entity_delete" var="delete_label" htmlEscape="false" />
	                <c:set var="delete_confirm_msg">
	                  <spring:escapeBody javaScriptEscape="true">
	                    <spring:message code="entity_delete_confirm" />
	                  </spring:escapeBody>
	                </c:set>
	                <input alt="${fn:escapeXml(delete_label)}" class="image" src="${delete_image_url}" title="${fn:escapeXml(delete_label)}" type="image" value="${fn:escapeXml(delete_label)}" onclick="return confirm('${delete_confirm_msg}');" />
	                <c:if test="${not empty param.page}">
	                  <input name="page" type="hidden" value="1" />
	                </c:if>
	                <c:if test="${not empty param.size}">
	                  <input name="size" type="hidden" value="${fn:escapeXml(param.size)}" />
	                </c:if>
	              </form:form>
	            </td>
	          </c:if>
	        </tr>
	      </c:forEach>
	      <tr class="footer">
	        <td colspan="${colCounter}">
	          <c:if test="${empty create or create}">
	            <span class="new">
	              <spring:url value="${path}" var="create_url">
	                <spring:param name="form" />
	              </spring:url>
	              <a href="${create_url}">
	                <spring:url value="/resources/images/add.png" var="create_img_url" />
	                <spring:message arguments="${typeName}" code="global_menu_new" var="add_message" htmlEscape="false" />
	                <img alt="${fn:escapeXml(add_message)}" src="${create_img_url}" title="${fn:escapeXml(add_message)}" />
	              </a>
	            </span>
	            <c:out value=" " />
	          </c:if>
	          <c:if test="${not empty maxPages}">
	            <util:pagination maxPages="${maxPages}" page="${param.page}" size="${param.size}" />
	          </c:if>
	        </td>
	      </tr>
	    </table>
	
	  </c:if>
	
	</jsp:root>
    '''
  }


  def genTextarea() {'''
	<jsp:root xmlns:c="http://java.sun.com/jsp/jstl/core" xmlns:fn="http://java.sun.com/jsp/jstl/functions" xmlns:spring="http://www.springframework.org/tags" xmlns:form="http://www.springframework.org/tags/form" xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0">
	  <jsp:output omit-xml-declaration="yes" />
	
	  <jsp:directive.attribute name="id" type="java.lang.String" required="true" rtexprvalue="true" description="The identifier for this tag (do not change!)" />
	  <jsp:directive.attribute name="field" type="java.lang.String" required="true" rtexprvalue="true" description="The field exposed from the form backing object" />
	  <jsp:directive.attribute name="label" type="java.lang.String" required="false" rtexprvalue="true" description="The label used for this field, will default to a message bundle if not supplied" />
	  <jsp:directive.attribute name="required" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Indicates if this field is required (default false)" />
	  <jsp:directive.attribute name="disabled" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Specify if this field should be enabled" />
	  <jsp:directive.attribute name="validationRegex" type="java.lang.String" required="false" rtexprvalue="true" description="Specify regular expression to be used for the validation of the input contents" />
	  <jsp:directive.attribute name="validationMessageCode" type="java.lang.String" required="false" rtexprvalue="true" description="Specify the message (message property code) to be displayed if the regular expression validation fails" />
	  <jsp:directive.attribute name="validationMessage" type="java.lang.String" required="false" rtexprvalue="true" description="Specify the message to be displayed if the regular expression validation fails" />
	  <jsp:directive.attribute name="render" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Indicate if the contents of this tag and all enclosed tags should be rendered (default 'true')" />
	  <jsp:directive.attribute name="z" type="java.lang.String" required="false" description="Used for checking if element has been modified (to recalculate simply provide empty string value)" />
	
	  <c:if test="${empty render or render}">
	
	    <c:if test="${empty disabled}">
	      <c:set value="false" var="disabled" />
	    </c:if>
	
	    <c:if test="${empty label}">
	      <spring:message code="label_${fn:toLowerCase(fn:substringAfter(id,'_'))}" var="label" htmlEscape="false" />
	    </c:if>
	
	    <c:if test="${empty required}">
	      <c:set value="false" var="required" />
	    </c:if>
	    
	    <c:set var="sec_field">
	      <spring:escapeBody javaScriptEscape="true" >${field}</spring:escapeBody>
	    </c:set>
	
	    <script type="text/javascript">dojo.require("dijit.form.SimpleTextarea");</script>
	    <div id="_${fn:escapeXml(id)}_id">
	      <label for="_${sec_field}_id">
	        <c:out value="${fn:escapeXml(label)}" />
	        :
	      </label>
	      <form:textarea id="_${sec_field}_id" path="${sec_field}" disabled="${disabled}" />
	      <br />
	      <form:errors cssClass="errors" id="_${sec_field}_error_id" path="${sec_field}" />
	      <script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : '_${sec_field}_id', widgetType : 'dijit.form.SimpleTextarea', widgetAttrs : {disabled : ${disabled}}})); </script>
	    </div>
	    <br />
	
	  </c:if>
	</jsp:root>
    '''
  }


  def genCreate() {'''
	<jsp:root xmlns:c="http://java.sun.com/jsp/jstl/core" xmlns:fn="http://java.sun.com/jsp/jstl/functions" xmlns:util="urn:jsptagdir:/WEB-INF/tags/util" xmlns:form="http://www.springframework.org/tags/form" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:spring="http://www.springframework.org/tags" version="2.0">
	  <jsp:output omit-xml-declaration="yes"/>
	  
	  <jsp:directive.attribute name="id" type="java.lang.String" required="true" rtexprvalue="true" description="The identifier for this tag (do not change!)"/>
	  <jsp:directive.attribute name="modelAttribute" type="java.lang.String" required="true" rtexprvalue="true" description="The name of the model attribute for form binding"/>
	  <jsp:directive.attribute name="path" type="java.lang.String" required="true" rtexprvalue="true" description="Specify the relative URL path (wit leading /)" />
	  <jsp:directive.attribute name="compositePkField" type="java.lang.String" required="false" rtexprvalue="true" description="The field name of the composite primary key (only used if a composite PK is present in the form backing object)" />
	  <jsp:directive.attribute name="multipart" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Indicate if this is a multipart form (default: false)" />
	  <jsp:directive.attribute name="label" type="java.lang.String" required="false" rtexprvalue="true" description="The label used for this object, will default to a message bundle if not supplied"/>
	  <jsp:directive.attribute name="render" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Indicate if the contents of this tag and all enclosed tags should be rendered (default 'true')" />
	  <jsp:directive.attribute name="openPane" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Control if the title pane is opened or closed by default (default: true)"/>
	  <jsp:directive.attribute name="z" type="java.lang.String" required="false" description="Used for checking if element has been modified (to recalculate simply provide empty string value)"/>
		
	  <c:if test="${empty render or render}">
	    <c:if test="${empty label}">
	      <spring:message code="label_${fn:toLowerCase(fn:substringAfter(id,'_'))}" var="label" htmlEscape="false" />
	    </c:if>
	    <c:set var="enctype" value="application/x-www-form-urlencoded"/>
	    <c:if test="${multipart}">
	      <c:set var="enctype" value="multipart/form-data"/>
	    </c:if>
	    <spring:message arguments="${label}" code="entity_create" var="title_msg" htmlEscape="false" />
	    <util:panel id="${id}" title="${title_msg}" openPane="${openPane}">
	      <spring:url value="${path}" var="form_url"/>
	      <c:set var="jsCall" value=""/>
	      <c:if test="${not empty compositePkField}">
	      	<c:set var="jsCall" value="encodePk()" />
	      </c:if>
	      <form:form action="${form_url}" method="POST" modelAttribute="${modelAttribute}" enctype="${enctype}" onsubmit="${jsCall}">
	        <form:errors cssClass="errors" delimiter="&lt;p/&gt;"/>
	        <c:if test="${not empty compositePkField}">
	          <form:hidden id="_${fn:escapeXml(compositePkField)}_id" path="${fn:escapeXml(compositePkField)}" />
	          <script type="text/javascript">
	          <![CDATA[
	            dojo.require("dojox.encoding.base64");
	            function encodePk() {
	              var obj = new Object();
	              dojo.query("input[name^=\"${compositePkField}.\"]").forEach(function(node, index, nodelist){
	                obj[node.name.substring('${compositePkField}'.length + 1)] = node.value;
	              });
	              var json = dojo.toJson(obj);
	              var tokArr = [];
	              for (var i = 0; i < json.length; i++) {
	                tokArr.push(json.charCodeAt(i));
	              }
	              var encoded = dojox.encoding.base64.encode(tokArr);
	              dojo.byId('_${fn:escapeXml(compositePkField)}_id').value = encoded;
	            }
	          ]]>
	          </script>
	        </c:if>
	        <jsp:doBody />
	        <div class="submit" id="${fn:escapeXml(id)}_submit">
	          <spring:message code="button_save" var="save_button" htmlEscape="false" />
	          <script type="text/javascript">Spring.addDecoration(new Spring.ValidateAllDecoration({elementId:'proceed', event:'onclick'}));</script>
	          <input id="proceed" type="submit" value="${fn:escapeXml(save_button)}"/>
	        </div>
	      </form:form>
	    </util:panel>
	  </c:if>
	</jsp:root>
    '''
  }


  def genDependency() {'''
	<jsp:root xmlns:c="http://java.sun.com/jsp/jstl/core" xmlns:fn="http://java.sun.com/jsp/jstl/functions" xmlns:util="urn:jsptagdir:/WEB-INF/tags/util" xmlns:field="urn:jsptagdir:/WEB-INF/tags/form/fields" xmlns:form="http://www.springframework.org/tags/form" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:spring="http://www.springframework.org/tags" version="2.0">
	  <jsp:output omit-xml-declaration="yes"/>
	
	  <jsp:directive.attribute name="id" type="java.lang.String" required="true" rtexprvalue="true" description="The identifier for this tag (do not change!)"/>
	  <jsp:directive.attribute name="dependencies" type="java.util.Collection" required="true" rtexprvalue="true" description="The collection of dependencies which need to be listed"/>
	  <jsp:directive.attribute name="label" type="java.lang.String" required="false" rtexprvalue="true" description="The label used for this object, will default to a message bundle if not supplied"/>
	  <jsp:directive.attribute name="render" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Indicate if the contents of this tag and all enclosed tags should be rendered (default 'true')" />
	  <jsp:directive.attribute name="openPane" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Control if the title pane is opened or closed by default (default: true)"/>
	  <jsp:directive.attribute name="z" type="java.lang.String" required="false" description="Used for checking if element has been modified (to recalculate simply provide empty string value)"/>
	
	  <c:if test="${empty render or render}">
	    <c:if test="${empty label}">
	      <spring:message code="label_${fn:toLowerCase(fn:substringAfter(id,'_'))}" var="label" htmlEscape="false"/>
	    </c:if>
	    <spring:message arguments="${label}" code="entity_create" var="title_msg" htmlEscape="false" />
	    <util:panel id="${fn:escapeXml(id)}" title="${fn:escapeXml(title_msg)}" openPane="${openPane}">
	    <spring:message code="entity_dependency_required"/>
	    <c:forEach items="${dependencies}" var="dependency" >
	      <p>
	        <field:reference field="${dependency[0]}" id="${fn:escapeXml(id)}_${dependency[0]}" path="/${dependency[1]}"/>
	      </p>
		</c:forEach>
	    </util:panel>
	  </c:if>
	</jsp:root>
    '''
  }


  def genFind() {'''
	<jsp:root xmlns:c="http://java.sun.com/jsp/jstl/core" xmlns:fn="http://java.sun.com/jsp/jstl/functions" xmlns:util="urn:jsptagdir:/WEB-INF/tags/util" xmlns:form="http://www.springframework.org/tags/form" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:spring="http://www.springframework.org/tags" version="2.0">
	  <jsp:output omit-xml-declaration="yes"/>
	
	  <jsp:directive.attribute name="id" type="java.lang.String" required="true" rtexprvalue="true" description="The identifier for this tag (do not change!)"/>
	  <jsp:directive.attribute name="finderName" type="java.lang.String" required="true" rtexprvalue="true" description="The finder name"/>
	  <jsp:directive.attribute name="path" type="java.lang.String" required="true" rtexprvalue="true" description="Specify the relative URL path (with leading /)" />
	  <jsp:directive.attribute name="label" type="java.lang.String" required="false" rtexprvalue="true" description="The label used for this field, will default to a message bundle if not supplied" />
	  <jsp:directive.attribute name="render" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Indicate if the contents of this tag and all enclosed tags should be rendered (default 'true')" />
	  <jsp:directive.attribute name="openPane" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Control if the title pane is opened or closed by default (default: true)"/>
	  <jsp:directive.attribute name="z" type="java.lang.String" required="false" description="Used for checking if element has been modified (to recalculate simply provide empty string value)"/>
	
	  <c:if test="${empty render or render}">
	    <c:if test="${empty label}">
	      <c:set var="entityClass" value="${fn:substringAfter(id,'ff_')}" />
	      <spring:message code="label_${fn:toLowerCase(entityClass)}_plural" var="label" htmlEscape="false" />
	    </c:if>
	    <spring:message arguments="${fn:escapeXml(label)}" code="entity_find" var="title_msg" htmlEscape="false" />
	    <util:panel id="${id}" title="${title_msg}" openPane="${openPane}">
	      <spring:url value="${path}" var="form_url" />
	      <form:form action="${form_url}" method="GET">
	        <input type="hidden" name="find" value="${fn:escapeXml(finderName)}" />
	        <jsp:doBody />
	        <div class="submit" id="${fn:escapeXml(id)}_${fn:escapeXml(finderName)}_submit">
	          <spring:message code="button_find" var="find_button" htmlEscape="false" />
	          <script type="text/javascript">Spring.addDecoration(new Spring.ValidateAllDecoration({elementId:'proceed', event:'onclick'}));</script>
	          <input id="proceed" type="submit" value="${fn:escapeXml(find_button)}"/>
	        </div>
	      </form:form>
	    </util:panel>
	  </c:if>
	</jsp:root>
    '''
  }


  def genList() {'''
	<jsp:root xmlns:c="http://java.sun.com/jsp/jstl/core" xmlns:fn="http://java.sun.com/jsp/jstl/functions" xmlns:util="urn:jsptagdir:/WEB-INF/tags/util" xmlns:form="http://www.springframework.org/tags/form" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:spring="http://www.springframework.org/tags" version="2.0">
	  <jsp:output omit-xml-declaration="yes" />
	
	  <jsp:directive.attribute name="id" type="java.lang.String" required="true" rtexprvalue="true" description="The identifier for this tag (do not change!)" />
	  <jsp:directive.attribute name="items" type="java.util.Collection" required="true" rtexprvalue="true" description="The form backing object name" />
	  <jsp:directive.attribute name="label" type="java.lang.String" required="false" rtexprvalue="true" description="The label used for this object, will default to a message bundle if not supplied" />
	  <jsp:directive.attribute name="labelPlural" type="java.lang.String" required="false" rtexprvalue="true" description="The label used for this object, will default to a message bundle if not supplied" />
	  <jsp:directive.attribute name="render" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Indicate if the contents of this tag and all enclosed tags should be rendered (default 'true')" />
	  <jsp:directive.attribute name="openPane" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Control if the title pane is opened or closed by default (default: true)" />
	  <jsp:directive.attribute name="z" type="java.lang.String" required="false" description="Used for checking if element has been modified (to recalculate simply provide empty string value)" />
	
	  <c:if test="${empty render or render}">
	    <c:if test="${empty label}">
	      <spring:message code="label_${fn:toLowerCase(fn:substringAfter(id,'_'))}" var="label" htmlEscape="false" />
	    </c:if>
	    <c:if test="${empty labelPlural}">
	      <spring:message code="label_${fn:toLowerCase(fn:substringAfter(id,'_'))}_plural" var="labelPlural" htmlEscape="false" />
	    </c:if>
	    <spring:message arguments="${labelPlural}" code="entity_list_all" var="title_msg" htmlEscape="false" />
	    <util:panel id="${id}" title="${title_msg}" openPane="${openPane}">
	      <c:choose>
	        <c:when test="${not empty items}">
	          <jsp:doBody />
	        </c:when>
	        <c:otherwise>
	          <spring:message arguments="${label}" code="entity_not_found" />
	        </c:otherwise>
	      </c:choose>
	    </util:panel>
	  </c:if>
	</jsp:root>
    '''
  }


  def genShow() {'''
	<jsp:root xmlns:c="http://java.sun.com/jsp/jstl/core" xmlns:fn="http://java.sun.com/jsp/jstl/functions" xmlns:util="urn:jsptagdir:/WEB-INF/tags/util" xmlns:form="http://www.springframework.org/tags/form" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:spring="http://www.springframework.org/tags" version="2.0">
	  <jsp:output omit-xml-declaration="yes" />
	
	  <jsp:directive.attribute name="id" type="java.lang.String" required="true" rtexprvalue="true" description="The identifier for this tag (do not change!)" />
	  <jsp:directive.attribute name="object" type="java.lang.Object" required="true" rtexprvalue="true" description="The form backing object" />
	  <jsp:directive.attribute name="path" type="java.lang.String" required="true" rtexprvalue="true" description="Specify the URL path" />
	  <jsp:directive.attribute name="list" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Include 'list' link into table (default true)" />
	  <jsp:directive.attribute name="create" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Include 'create' link into table (default true)" />
	  <jsp:directive.attribute name="update" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Include 'update' link into table (default true)" />
	  <jsp:directive.attribute name="delete" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Include 'delete' link into table (default true)" />
	  <jsp:directive.attribute name="label" type="java.lang.String" required="false" rtexprvalue="true" description="The label used for this object, will default to a message bundle if not supplied" />
	  <jsp:directive.attribute name="render" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Indicate if the contents of this tag and all enclosed tags should be rendered (default 'true')" />
	  <jsp:directive.attribute name="openPane" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Control if the title pane is opened or closed by default (default: true)" />
	  <jsp:directive.attribute name="z" type="java.lang.String" required="false" description="Used for checking if element has been modified (to recalculate simply provide empty string value)" />
	
	  <c:if test="${empty render or render}">
	    <c:if test="${empty label}">
	      <spring:message code="label_${fn:toLowerCase(fn:substringAfter(id,'_'))}" var="label" htmlEscape="false" />
	    </c:if>
	
	    <c:if test="${empty list}">
	      <c:set var="list" value="true" />
	    </c:if>
	
	    <c:if test="${empty create}">
	      <c:set var="create" value="true" />
	    </c:if>
	
	    <c:if test="${empty update}">
	      <c:set var="update" value="true" />
	    </c:if>
	
	    <c:if test="${empty delete}">
	      <c:set var="delete" value="true" />
	    </c:if>
	
	    <spring:message var="typeName" code="menu_item_${fn:toLowerCase(fn:split(id,'_')[fn:length(fn:split(id,'_')) - 1])}_new_label" htmlEscape="false" />
	    <spring:message var="typeNamePlural" code="menu_item_${fn:toLowerCase(fn:split(id,'_')[fn:length(fn:split(id,'_')) - 1])}_list_label" htmlEscape="false" />
	
	    <spring:message arguments="${label}" code="entity_show" var="title_msg" htmlEscape="false" />
	    <util:panel id="${id}" title="${title_msg}" openPane="${openPane}">
	      <c:choose>
	        <c:when test="${not empty object}">
	          <jsp:doBody />
	          <div class="quicklinks">
	            <span>
	              <c:if test="${delete}">
	                <spring:url value="${path}/${itemId}" var="delete_form_url" />
	                <spring:url value="/resources/images/delete.png" var="delete_image_url" />
	                <form:form action="${delete_form_url}" method="DELETE">
	                  <spring:message arguments="${typeName}" code="entity_delete" var="delete_label" htmlEscape="false" />
	                  <c:set var="delete_confirm_msg">
	                    <spring:escapeBody javaScriptEscape="true">
	                      <spring:message code="entity_delete_confirm" />
	                    </spring:escapeBody>
	                  </c:set>
	                  <input alt="${fn:escapeXml(delete_label)}" class="image" src="${delete_image_url}" title="${fn:escapeXml(delete_label)}" type="image" value="${fn:escapeXml(delete_label)}" onclick="return confirm('${fn:escapeXml(delete_confirm_msg)}');" />
	                </form:form>
	              </c:if>
	            </span>
	            <span>
	              <c:if test="${update}">
	                <spring:url value="${path}/${itemId}" var="update_form_url">
	                  <spring:param name="form" />
	                </spring:url>
	                <spring:url value="/resources/images/update.png" var="update_image_url" />
	                <spring:message arguments="${typeName}" code="entity_update" var="update_label" htmlEscape="false" />
	                <a href="${update_form_url}" alt="${fn:escapeXml(update_label)}" title="${fn:escapeXml(update_label)}">
	                  <img alt="${fn:escapeXml(update_label)}" class="image" src="${update_image_url}" title="${fn:escapeXml(update_label)}" />
	                </a>
	              </c:if>
	            </span>
	            <span>
	              <c:if test="${create}">
	                <spring:url value="${path}" var="create_form_url">
	                  <spring:param name="form" />
	                </spring:url>
	                <spring:url value="/resources/images/create.png" var="create_image_url" />
	                <spring:message arguments="${typeName}" code="entity_create" var="create_label" htmlEscape="false" />
	                <a href="${create_form_url}" alt="${fn:escapeXml(create_label)}" title="${fn:escapeXml(create_label)}">
	                  <img alt="${fn:escapeXml(create_label)}" class="image" src="${create_image_url}" title="${fn:escapeXml(create_label)}" />
	                </a>
	              </c:if>
	            </span>
	            <span>
	              <c:if test="${list}">
	                <spring:url value="${path}" var="list_form_url" />
	                <spring:url value="/resources/images/list.png" var="list_image_url" />
	                <spring:message arguments="${typeNamePlural}" code="entity_list_all" var="list_label" htmlEscape="false" />
	                <a href="${list_form_url}" alt="${fn:escapeXml(list_label)}" title="${fn:escapeXml(list_label)}">
	                  <img alt="${fn:escapeXml(list_label)}" class="image" src="${list_image_url}" title="${fn:escapeXml(list_label)}" />
	                </a>
	              </c:if>
	            </span>
	          </div>
	        </c:when>
	        <c:otherwise>
	          <spring:message arguments="${label}" code="entity_not_found_single" />
	        </c:otherwise>
	      </c:choose>
	    </util:panel>
	  </c:if>
	</jsp:root>
    '''
  }


  def genUpdate() {'''
	<jsp:root xmlns:c="http://java.sun.com/jsp/jstl/core" xmlns:fn="http://java.sun.com/jsp/jstl/functions" xmlns:util="urn:jsptagdir:/WEB-INF/tags/util" xmlns:form="http://www.springframework.org/tags/form" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:spring="http://www.springframework.org/tags" version="2.0">
	  <jsp:output omit-xml-declaration="yes" />
	
	  <jsp:directive.attribute name="id" type="java.lang.String" required="true" rtexprvalue="true" description="The identifier for this tag (do not change!)" />
	  <jsp:directive.attribute name="modelAttribute" type="java.lang.String" required="true" rtexprvalue="true" description="The name of the model attribute for form binding" />
	  <jsp:directive.attribute name="path" type="java.lang.String" required="true" rtexprvalue="true" description="Specify the relative URL path (with leading /)" />
	  <jsp:directive.attribute name="multipart" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Indicate if this is a multipart form (default: false)" />
	  <jsp:directive.attribute name="label" type="java.lang.String" required="false" rtexprvalue="true" description="The label used for this object, will default to a message bundle if not supplied" />
	  <jsp:directive.attribute name="idField" type="java.lang.String" required="false" rtexprvalue="true" description="Specify the field name of the id field (default 'id')" />
	  <jsp:directive.attribute name="versionField" type="java.lang.String" required="false" rtexprvalue="true" description="Specify the field name of the version field (default 'version'). If specified 'none' the version field will not be inlcuded (versionField='none')." />
	  <jsp:directive.attribute name="render" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Indicate if the contents of this tag and all enclosed tags should be rendered (default 'true')" />
	  <jsp:directive.attribute name="openPane" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Control if the title pane is opened or closed by default (default: true)" />
	  <jsp:directive.attribute name="z" type="java.lang.String" required="false" description="Used for checking if element has been modified (to recalculate simply provide empty string value)" />
	
	  <c:if test="${empty render or render}">
	    <c:if test="${empty label}">
	      <spring:message code="label_${fn:toLowerCase(fn:substringAfter(id,'_'))}" var="label" htmlEscape="false" />
	    </c:if>
	    <c:if test="${empty idField}">
	      <c:set value="id" var="idField" />
	    </c:if>
	    <c:if test="${empty versionField}">
	      <c:set value="version" var="versionField" />
	    </c:if>
	    <c:set var="enctype" value="application/x-www-form-urlencoded"/>
	    <c:if test="${multipart}">
	      <c:set var="enctype" value="multipart/form-data"/>
	    </c:if>
	    <spring:message arguments="${label}" code="entity_update" var="title_msg" htmlEscape="false" />
	    <util:panel id="${id}" title="${title_msg}" openPane="${openPane}">
	      <spring:url value="${path}" var="form_url" />
	      <form:form action="${form_url}" method="PUT" modelAttribute="${modelAttribute}" enctype="${enctype}">
	        <form:errors cssClass="errors" delimiter="&lt;p/&gt;" />
	        <jsp:doBody />
	        <div class="submit" id="${fn:escapeXml(id)}_submit">
	          <spring:message code="button_save" var="save_button" htmlEscape="false" />
	          <script type="text/javascript">Spring.addDecoration(new Spring.ValidateAllDecoration({elementId:'proceed', event:'onclick'}));</script>
	          <input id="proceed" type="submit" value="${fn:escapeXml(save_button)}" />
	        </div>
	        <form:hidden id="_${fn:escapeXml(idField)}_id" path="${fn:escapeXml(idField)}" />
	        <c:if test="${versionField ne 'none'}">
	          <form:hidden id="_${fn:escapeXml(versionField)}_id" path="${fn:escapeXml(versionField)}" />
	        </c:if>
	      </form:form>
	    </util:panel>
	  </c:if>
	</jsp:root>
    '''
  }


  def genCategory() {'''
	<jsp:root xmlns:c="http://java.sun.com/jsp/jstl/core" xmlns:fn="http://java.sun.com/jsp/jstl/functions" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:spring="http://www.springframework.org/tags" version="2.0">
		<jsp:output omit-xml-declaration="yes"/>
		
		<jsp:directive.attribute name="id" type="java.lang.String" required="true" rtexprvalue="true" description="The identifier for this tag (do not change!)"/>
		<jsp:directive.attribute name="label" type="java.lang.String" required="false" rtexprvalue="true" description="The label for this category (if not set the resource bundle is used)"/>
		<jsp:directive.attribute name="render" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Indicate if the contents of this tag and all enclosed tags should be rendered (default 'true')" />
		<jsp:directive.attribute name="z" type="java.lang.String" required="false" description="Used for checking if element has been modified (to recalculate simply provide empty string value)"/>
		
		<c:if test="${empty render or render}">
	
			<c:if test="${empty label}">
				<spring:message code="menu_category_${fn:toLowerCase(fn:substringAfter(id,'_'))}_label" var="label" htmlEscape="false"/>
			</c:if>
			
			<li id="${fn:escapeXml(id)}">
				<h2>
					<c:out value="${label}" />
				</h2>
				<ul>
					<jsp:doBody />
				</ul>
			</li>
		
		</c:if>
	</jsp:root>
    '''
  }


  def genItem() {'''
	<jsp:root xmlns:c="http://java.sun.com/jsp/jstl/core" xmlns:fn="http://java.sun.com/jsp/jstl/functions" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:spring="http://www.springframework.org/tags" version="2.0">
	  <jsp:output omit-xml-declaration="yes" />
	
	  <jsp:directive.attribute name="id" type="java.lang.String" required="true" rtexprvalue="true" description="The identifier for this tag (do not change!)" />
	  <jsp:directive.attribute name="url" type="java.lang.String" required="true" rtexprvalue="true" description="The link URL" />
	  <jsp:directive.attribute name="label" type="java.lang.String" required="false" rtexprvalue="true" description="The label used for this menu item" />
	  <jsp:directive.attribute name="messageCode" type="java.lang.String" required="false" rtexprvalue="true" description="The global message code to be used (works in conjunction with label)" />
	  <jsp:directive.attribute name="render" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Indicate if the contents of this tag and all enclosed tags should be rendered (default 'true')" />
	  <jsp:directive.attribute name="z" type="java.lang.String" required="false" description="Used for checking if element has been modified (to recalculate simply provide empty string value)" />
	
	  <c:if test="${empty render or render}">
	
	    <c:if test="${empty label}">
	      <spring:message code="menu_item_${fn:toLowerCase(fn:substringAfter(id,'_'))}_label" var="label" htmlEscape="false" />
	    </c:if>
	
	    <c:if test="${not empty messageCode}">
	      <spring:message code="${messageCode}" var="label" arguments="${label}" htmlEscape="false" />
	    </c:if>
	
	    <li id="${fn:escapeXml(id)}">
	      <spring:url value="${url}" var="menu_item_url"/>
	      <a href="${menu_item_url}" title="${fn:escapeXml(label)}">
	        <c:out value="${label}"/>
	      </a>
	    </li>
	
	  </c:if>
	</jsp:root>
    '''
  }


  def genMenu() {'''
	<jsp:root xmlns:c="http://java.sun.com/jsp/jstl/core" xmlns:fn="http://java.sun.com/jsp/jstl/functions" xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0">
		<jsp:output omit-xml-declaration="yes"/>
		
		<jsp:directive.attribute name="id" type="java.lang.String" required="true" rtexprvalue="true" description="The identifier for this tag (do not change!)"/>
		<jsp:directive.attribute name="render" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Indicate if the contents of this tag and all enclosed tags should be rendered (default 'true')" />
		<jsp:directive.attribute name="z" type="java.lang.String" required="false" description="Used for checking if element has been modified (to recalculate simply provide empty string value)"/>
		
		<c:if test="${empty render or render}">
			<ul id="${fn:escapeXml(id)}">
				<jsp:doBody />
			</ul>
		</c:if>
	</jsp:root>
    '''
  }


  def genLanguage() {'''
	<jsp:root xmlns:c="http://java.sun.com/jsp/jstl/core" xmlns:fn="http://java.sun.com/jsp/jstl/functions" xmlns:spring="http://www.springframework.org/tags" xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0">
	  <jsp:output omit-xml-declaration="yes" />
	
	  <jsp:directive.attribute name="locale" type="java.lang.String" required="true" rtexprvalue="true" description="The locale for the language to be added." />
	  <jsp:directive.attribute name="label" type="java.lang.String" required="true" rtexprvalue="true" description="The country label for the language to be added." />
	  <jsp:directive.attribute name="render" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Indicate if the contents of this tag and all enclosed tags should be rendered (default 'true')" />
	
	  <c:if test="${empty render or render}">
	    <spring:url var="img" value="/resources/images/${locale}.png" />
	    <spring:url var="url" value="">
	      <c:if test="${null ne param.form}">
	        <spring:param name="form" />
	      </c:if>
	      <c:if test="${not empty param.find}">
	        <spring:param name="find" value="${param.find}" />
	      </c:if>
	      <spring:param name="lang" value="${locale}" />
	      <c:if test="${not empty param.page}">
	        <spring:param name="page" value="${param.page}" />
	      </c:if>
	      <c:if test="${not empty param.size}">
	        <spring:param name="size" value="${param.size}" />
	      </c:if>
	    </spring:url>
	    <spring:message code="global_language_switch" arguments="${label}" var="lang_label" htmlEscape="false" />
	    <a href="${url}" title="${fn:escapeXml(lang_label)}">
	      <img class="flag" src="${img}" alt="${fn:escapeXml(lang_label)}" />
	    </a>
	    <c:out value=" " />
	  </c:if>
	</jsp:root>
    '''
  }


  def genLoadScripts() {'''
	<jsp:root xmlns:c="http://java.sun.com/jsp/jstl/core" xmlns:fn="http://java.sun.com/jsp/jstl/functions" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:spring="http://www.springframework.org/tags" version="2.0">
	
	  <jsp:output omit-xml-declaration="yes" />
	
	  <spring:theme code="styleSheet" var="roo_css" />
	  <spring:url value="/${roo_css}" var="roo_css_url" />
	  <spring:url value="/resources/dojo/dojo.js" var="dojo_url" />
	  <spring:url value="/resources/dijit/themes/tundra/tundra.css" var="tundra_url" />
	  <spring:url value="/resources/spring/Spring.js" var="spring_url" />
	  <spring:url value="/resources/spring/Spring-Dojo.js" var="spring_dojo_url" />
	  <spring:url value="/resources/images/favicon.ico" var="favicon" />
	  <link rel="stylesheet" type="text/css" href="${tundra_url}" />
	  <link rel="stylesheet" type="text/css" media="screen" href="${roo_css_url}" />
	  <link rel="SHORTCUT ICON" href="${favicon}" />
	
	  <!-- Get the user local from the page context (it was set by Spring MVC's locale resolver) -->
	  <c:set var="userLocale">
	    <c:set var="plocale">${pageContext.response.locale}</c:set>
	    <c:out value="${fn:replace(plocale, '_', '-')}" default="en" />
	  </c:set>
	
	  <script type="text/javascript">var djConfig = {parseOnLoad: false, isDebug: false, locale: '${fn:toLowerCase(userLocale)}'};</script>
	
	  <script src="${dojo_url}" type="text/javascript"><!-- required for FF3 and Opera --></script>
	  <script src="${spring_url}" type="text/javascript"><!-- /required for FF3 and Opera --></script>
	  <script src="${spring_dojo_url}" type="text/javascript"><!-- required for FF3 and Opera --></script>
	  <script language="JavaScript" type="text/javascript">dojo.require("dojo.parser");</script>
	
	</jsp:root>
    '''
  }


  def genPagination() {'''
	<jsp:root xmlns:c="http://java.sun.com/jsp/jstl/core" xmlns:fn="http://java.sun.com/jsp/jstl/functions" xmlns:spring="http://www.springframework.org/tags" xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0">
	  <jsp:output omit-xml-declaration="yes" />
	
	  <jsp:directive.attribute name="maxPages" type="java.lang.Integer" required="true" rtexprvalue="true" description="The maximum number of pages available (ie tableRecordCount / size)" />
	  <jsp:directive.attribute name="page" type="java.lang.Integer" required="false" rtexprvalue="true" description="The current page (not required, defaults to 1)" />
	  <jsp:directive.attribute name="size" type="java.lang.Integer" required="false" rtexprvalue="true" description="The number of records per page (not required, defaults to 10)" />
	  <jsp:directive.attribute name="render" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Indicate if the contents of this tag and all enclosed tags should be rendered (default 'true')" />
	
	  <c:if test="${empty render or render}">
	
	    <c:if test="${empty page || page lt 1}">
	      <c:set var="page" value="1" />
	    </c:if>
	
	    <c:if test="${empty size || size lt 1}">
	      <c:set var="size" value="10" />
	    </c:if>
	
	    <spring:message code="list_size" var="list_size" htmlEscape="false" />
	    <c:out value="${list_size} " />
	
	    <c:forEach var="i" begin="5" end="25" step="5">
	      <c:choose>
	        <c:when test="${size == i}">
	          <c:out value="${i}" />
	        </c:when>
	        <c:otherwise>
	          <spring:url value="" var="sizeUrl">
	            <spring:param name="page" value="1" />
	            <spring:param name="size" value="${i}" />
	          </spring:url>
	          <a href="${sizeUrl}">${i}</a>
	        </c:otherwise>
	      </c:choose>
	      <c:out value=" " />
	    </c:forEach>
	    <c:out value="| " />
	
	    <c:if test="${page ne 1}">
	      <spring:url value="" var="first">
	        <spring:param name="page" value="1" />
	        <spring:param name="size" value="${size}" />
	      </spring:url>
	      <spring:url value="/resources/images/resultset_first.png" var="first_image_url" />
	      <spring:message code="list_first" var="first_label" htmlEscape="false" />
	      <a class="image" href="${first}" title="${fn:escapeXml(first_label)}">
	        <img alt="${fn:escapeXml(first_label)}" src="${first_image_url}" />
	      </a>
	    </c:if>
	    <c:if test="${page gt 1}">
	      <spring:url value="" var="previous">
	        <spring:param name="page" value="${page - 1}" />
	        <spring:param name="size" value="${size}" />
	      </spring:url>
	      <spring:url value="/resources/images/resultset_previous.png" var="previous_image_url" />
	      <spring:message code="list_previous" var="previous_label" htmlEscape="false" />
	      <a class="image" href="${previous}" title="${fn:escapeXml(previous_label)}">
	        <img alt="${fn:escapeXml(previous_label)}" src="${previous_image_url}" />
	      </a>
	    </c:if>
	    <c:out value=" " />
	    <spring:message code="list_page" arguments="${page},${maxPages}" argumentSeparator="," />
	    <c:out value=" " />
	    <c:if test="${page lt maxPages}">
	      <spring:url value="" var="next">
	        <spring:param name="page" value="${page + 1}" />
	        <spring:param name="size" value="${size}" />
	      </spring:url>
	      <spring:url value="/resources/images/resultset_next.png" var="next_image_url" />
	      <spring:message code="list_next" var="next_label" htmlEscape="false" />
	      <a class="image" href="${next}" title="${fn:escapeXml(next_label)}">
	        <img alt="${fn:escapeXml(next_label)}" src="${next_image_url}" />
	      </a>
	    </c:if>
	    <c:if test="${page ne maxPages}">
	      <spring:url value="" var="last">
	        <spring:param name="page" value="${maxPages}" />
	        <spring:param name="size" value="${size}" />
	      </spring:url>
	      <spring:url value="/resources/images/resultset_last.png" var="last_image_url" />
	      <spring:message code="list_last" var="last_label" htmlEscape="false" />
	      <a class="image" href="${last}" title="${fn:escapeXml(last_label)}">
	        <img alt="${fn:escapeXml(last_label)}" src="${last_image_url}" />
	      </a>
	    </c:if>
	  </c:if>
	</jsp:root>
    '''
  }


  def genPanel() {'''
	<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:fn="http://java.sun.com/jsp/jstl/functions" xmlns:spring="http://www.springframework.org/tags" xmlns:c="http://java.sun.com/jsp/jstl/core" version="2.0">
	  <jsp:output omit-xml-declaration="yes" />
	  
	  <jsp:directive.attribute name="id" type="java.lang.String" required="true" rtexprvalue="true" description="The identifier for this tag (do not change!)" />
	  <jsp:directive.attribute name="title" type="java.lang.String" required="true" rtexprvalue="true" description="The page title (required)" />
	  <jsp:directive.attribute name="render" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Indicate if the contents of this tag and all enclosed tags should be rendered (default 'true')" />
	  <jsp:directive.attribute name="openPane" type="java.lang.String" required="false" rtexprvalue="true" description="Control if the title pane is opened or closed by default (default: true)" />
	  <jsp:directive.attribute name="z" type="java.lang.String" required="false" description="Used for checking if element has been modified (to recalculate simply provide empty string value)" />
	  
	  <c:if test="${empty render or render}">
	    <c:if test="${empty openPane}">
	      <c:set value="true" var="openPane" />
	    </c:if>
	  
	    <c:set var="sec_id">
	      <spring:escapeBody javaScriptEscape="true" >${id}</spring:escapeBody>
	    </c:set>
	    
	    <c:set var="sec_openPane">
	      <spring:escapeBody javaScriptEscape="true" >${openPane}</spring:escapeBody>
	    </c:set>
	    
	    <c:set var="sec_title">
	      <spring:escapeBody javaScriptEscape="true" >${title}</spring:escapeBody>
	    </c:set>
	    
	    <script type="text/javascript">dojo.require('dijit.TitlePane');</script>
	    <div id="_title_${sec_id}_id">
	      <script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : '_title_${sec_id}_id', widgetType : 'dijit.TitlePane', widgetAttrs : {title: '${sec_title}', open: ${sec_openPane}}})); </script>
	      <jsp:doBody />
	    </div>
	  </c:if>
	</jsp:root>
    '''
  }


  def genPlaceholder() {'''
	<jsp:root xmlns:c="http://java.sun.com/jsp/jstl/core" xmlns:fn="http://java.sun.com/jsp/jstl/functions" xmlns:util="urn:jsptagdir:/WEB-INF/tags/util" xmlns:spring="http://www.springframework.org/tags" xmlns:form="http://www.springframework.org/tags/form" xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0">
	  <jsp:output omit-xml-declaration="yes" />
	  
	  <jsp:directive.attribute name="description" type="java.lang.String" required="false" rtexprvalue="true" description="Can be used to describe the purpose of this element" />
	</jsp:root>
    '''
  }


  def genTheme() {'''
	<jsp:root xmlns:c="http://java.sun.com/jsp/jstl/core" xmlns:fn="http://java.sun.com/jsp/jstl/functions" xmlns:spring="http://www.springframework.org/tags" xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0">
	  <jsp:output omit-xml-declaration="yes" />
	
	  <jsp:directive.attribute name="render" type="java.lang.Boolean" required="false" rtexprvalue="true" description="Indicate if the contents of this tag and all enclosed tags should be rendered (default 'true')" />
	
	  <c:if test="${empty render or render}">
	    <span>
	      <c:out value=" | " />
	      <spring:message code="global_theme" />
	      <c:out value=": " />
	      <spring:url var="url_theme1" value="">
	        <spring:param name="theme" value="standard" />
	        <c:if test="${not empty param.page}">
	          <spring:param name="page" value="${param.page}" />
	        </c:if>
	        <c:if test="${not empty param.size}">
	          <spring:param name="size" value="${param.size}" />
	        </c:if>
	      </spring:url>
	      <spring:message code="global_theme_standard" var="theme_standard" htmlEscape="false" />
	      <a href="${url_theme1}" title="${fn:escapeXml(theme_standard)}">${fn:escapeXml(theme_standard)}</a>
	      <c:out value=" | " />
	      <spring:url var="url_theme2" value="">
	        <spring:param name="theme" value="alt" />
	        <c:if test="${not empty param.page}">
	          <spring:param name="page" value="${param.page}" />
	        </c:if>
	        <c:if test="${not empty param.size}">
	          <spring:param name="size" value="${param.size}" />
	        </c:if>
	      </spring:url>
	      <spring:message code="global_theme_alt" var="theme_alt" htmlEscape="false" />
	      <a href="${url_theme2}" title="${fn:escapeXml(theme_alt)}">${fn:escapeXml(theme_alt)}</a>
	    </span>
	  </c:if>
	</jsp:root>
    '''
  }
}
