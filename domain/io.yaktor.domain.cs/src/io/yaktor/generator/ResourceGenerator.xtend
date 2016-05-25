package io.yaktor.generator

import com.google.inject.Inject
import io.yaktor.domain.DbProvider
import io.yaktor.domain.DbType
import io.yaktor.domain.DomainModel
import io.yaktor.domain.InclusionType
import io.yaktor.domain.JpaGenOptions
import io.yaktor.domain.PersistenceOptions
import io.yaktor.util.Constants
import io.yaktor.util.DslDomainUtil
import io.yaktor.util.FileUtil
import io.yaktor.util.InclusionCat
import org.eclipse.xtext.generator.IFileSystemAccess

class ResourceGenerator {

  @Inject extension FileUtil fileUtil
  @Inject extension DslDomainUtil dslDomainUtil
  @Inject extension GeneratorExtensions genExt

  
  def genResources(IFileSystemAccess fsa, DomainModel spec) {
    var inc = spec.getInclusionType(InclusionCat::RESOURCES)
    if (inc != InclusionType::NONE) {
	  	fileUtil.generateFile(fsa, Constants::resourceBase, 'META-INF/spring', 'applicationContext.xml', spec.genApplicationContext(), inc == InclusionType::PROTECTED)
	  	if ((spec.genOptions as JpaGenOptions).persistence != null) {
	  	  fileUtil.generateFile(fsa, Constants::resourceBase, 'META-INF/spring', 'database.properties', (spec.genOptions as JpaGenOptions).persistence.genDbProperties(), inc == InclusionType::PROTECTED)
	  	  fileUtil.generateFile(fsa, Constants::resourceBase, 'META-INF', 'persistence.xml', (spec.genOptions as JpaGenOptions).persistence.genPersistence(), inc == InclusionType::PROTECTED)
	  	}
	  	fileUtil.generateFile(fsa, Constants::resourceBase, '', 'log4j.xml', this.genLog4j(), inc == InclusionType::PROTECTED)
	  }
  }


  def genApplicationContext(DomainModel spec) {'''
	<?xml version="1.0" encoding="UTF-8" standalone="no"?>
	<beans xmlns="http://www.springframework.org/schema/beans" xmlns:aop="http://www.springframework.org/schema/aop" xmlns:context="http://www.springframework.org/schema/context" xmlns:jee="http://www.springframework.org/schema/jee" xmlns:tx="http://www.springframework.org/schema/tx" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://www.springframework.org/schema/aop http://www.springframework.org/schema/aop/spring-aop-3.1.xsd         http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.1.xsd         http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context-3.1.xsd         http://www.springframework.org/schema/jee http://www.springframework.org/schema/jee/spring-jee-3.1.xsd         http://www.springframework.org/schema/tx http://www.springframework.org/schema/tx/spring-tx-3.1.xsd">
	    <!--
	        This will automatically locate any and all property files you have
	        within your classpath, provided they fall under the META-INF/spring
	        directory. The located property files are parsed and their values can
	        then be used within application context files in the form of
	        ${propertyKey}.
	    -->
	    <context:property-placeholder location="classpath*:META-INF/spring/*.properties"/>
	    <!--
	        Turn on AspectJ @Configurable support. As a result, any time you
	        instantiate an object, Spring will attempt to perform dependency
	        injection on that object. This occurs for instantiation via the "new"
	        keyword, as well as via reflection. This is possible because AspectJ
	        is used to "weave" Roo-based applications at compile time. In effect
	        this feature allows dependency injection of any object at all in your
	        system, which is a very useful feature (without @Configurable you'd
	        only be able to dependency inject objects acquired from Spring or
	        subsequently presented to a specific Spring dependency injection
	        method). Roo applications use this useful feature in a number of
	        areas, such as @PersistenceContext injection into entities.
	    -->
	    <context:spring-configured/>
	    <!--
	        This declaration will cause Spring to locate every @Component,
	        @Repository and @Service in your application. In practical terms this
	        allows you to write a POJO and then simply annotate the new POJO as an
	        @Service and Spring will automatically detect, instantiate and
	        dependency inject your service at startup time. Importantly, you can
	        then also have your new service injected into any other class that
	        requires it simply by declaring a field for your service inside the
	        relying class and Spring will inject it. Note that two exclude filters
	        are declared. The first ensures that Spring doesn't spend time
	        introspecting Roo-specific ITD aspects. The second ensures Roo doesn't
	        instantiate your @Controller classes, as these should be instantiated
	        by a web tier application context. Refer to web.xml for more details
	        about the web tier application context setup services.
	        
	        Furthermore, this turns on @Autowired, @PostConstruct etc support. These 
	        annotations allow you to use common Spring and Java Enterprise Edition 
	        annotations in your classes without needing to do any special configuration. 
	        The most commonly used annotation is @Autowired, which instructs Spring to
	        dependency inject an object into your class.
	    -->
	    <context:component-scan base-package="«spec.genOptions.getRootPackage»">
	        <context:exclude-filter expression=".*_Roo_.*" type="regex"/>
	        <context:exclude-filter expression="org.springframework.stereotype.Controller" type="annotation"/>
	    </context:component-scan>
	    <bean class="org.apache.commons.dbcp.BasicDataSource" destroy-method="close" id="dataSource">
	        <property name="driverClassName" value="${database.driverClassName}"/>
	        <property name="url" value="${database.url}"/>
	        <property name="username" value="${database.username}"/>
	        <property name="password" value="${database.password}"/>
	        <property name="testOnBorrow" value="true"/>
	        <property name="testOnReturn" value="true"/>
	        <property name="testWhileIdle" value="true"/>
	        <property name="timeBetweenEvictionRunsMillis" value="1800000"/>
	        <property name="numTestsPerEvictionRun" value="3"/>
	        <property name="minEvictableIdleTimeMillis" value="1800000"/>
	        «IF (spec.genOptions as JpaGenOptions).persistence.dbType == DbType::ORACLE»
	        <property name="validationQuery" value="SELECT 1 FROM DUAL"/>
			«ENDIF»
	    </bean>
	    <bean class="org.springframework.orm.jpa.JpaTransactionManager" id="transactionManager">
	        <property name="entityManagerFactory" ref="entityManagerFactory"/>
	    </bean>
	    <tx:annotation-driven mode="aspectj" transaction-manager="transactionManager"/>
	    <bean class="org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean" id="entityManagerFactory">
	        <property name="persistenceUnitName" value="persistenceUnit"/>
	        <property name="dataSource" ref="dataSource"/>
	    </bean>
	</beans>

    '''
  }


  def genUrl(PersistenceOptions options) {
  	if (options.url != null) {
  		'database.url='+options.url
  	} else {
  		'database.url=jdbc\\:oracle\\:thin\\:@localhost\\:1521\\:'+options.dbName
  	}
  }
  
  
  def genDbProperties(PersistenceOptions options) {'''
	«IF options.dbType == DbType::ORACLE»
		database.driverClassName=oracle.jdbc.OracleDriver
		«genUrl(options)»
		database.username=«genNrmString(options.userName)»
		database.password=«genNrmString(options.password)»
	«ELSEIF options.dbType == DbType::HYPERSONIC_IN_MEMORY»
		database.driverClassName=org.hsqldb.jdbcDriver
		database.url=jdbc\:hsqldb\:mem\:aptsit
		database.username=sa
		database.password=
	«ELSEIF options.dbType == DbType::DERBY_EMBEDDED»
		database.driverClassName=org.apache.derby.jdbc.EmbeddedDriver
		database.url=jdbc\:derby\:aptsit;create\=true
		database.username=sa
		database.password=
	«ELSE»
		<dbDriverClassName>
		<dbName>
		database.username=sa
		database.password=
	«ENDIF»

    '''
  }


  def genPersistence(PersistenceOptions options) {'''
	<?xml version="1.0" encoding="UTF-8" standalone="no"?>
	<persistence xmlns="http://java.sun.com/xml/ns/persistence" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" version="2.0" xsi:schemaLocation="http://java.sun.com/xml/ns/persistence http://java.sun.com/xml/ns/persistence/persistence_2_0.xsd">
	<persistence-unit name="persistenceUnit" transaction-type="RESOURCE_LOCAL">
	«IF options.dbProvider == DbProvider::HIBERNATE»
	        <provider>org.hibernate.ejb.HibernatePersistence</provider>
	        <properties>
	            <property name="hibernate.dialect" value="org.hibernate.dialect.«genDialect(options)»"/>
	            <!-- value="create" to build a new database on each run; value="update" to modify an existing database; value="create-drop" means the same as "create" but also drops tables when Hibernate closes; value="validate" makes no changes to the database -->
	            <property name="hibernate.hbm2ddl.auto" value="create"/>
	            <property name="hibernate.ejb.naming_strategy" value="org.hibernate.cfg.ImprovedNamingStrategy"/>
	            <property name="hibernate.connection.charSet" value="UTF-8"/>
	            <!-- Uncomment the following two properties for JBoss only -->
	            <!-- property name="hibernate.validator.apply_to_ddl" value="false" /-->
	            <!-- property name="hibernate.validator.autoregister_listeners" value="false" /-->
	        </properties>
	 «ELSE»
	        <DbProvider>
	 «ENDIF»
	</persistence-unit>
	</persistence>

    '''
  }


  def genDialect(PersistenceOptions options) {
  	switch (options.dbType) {
  		case DbType::ORACLE : 'OracleDialect' 
  		case DbType::HYPERSONIC_IN_MEMORY : 'HSQLDialect' 
  		case DbType::DERBY_EMBEDDED : 'DerbyDialect' 
  		default : '<DefaultDialect>'
  	}
  }


  def genNrmString(String str) {
  	if (str != null) {
  		str
  	} else {
  		''
  	}
  }
  
  
  def genLog4j() {'''
	<?xml version="1.0" encoding="UTF-8"?>
	<!DOCTYPE log4j:configuration SYSTEM "http://logging.apache.org/log4j/1.2/apidocs/org/apache/log4j/xml/doc-files/log4j.dtd">
	<log4j:configuration xmlns:log4j="http://jakarta.apache.org/log4j/" debug="false">
	
	    <appender name="consoleAppender" class="org.apache.log4j.ConsoleAppender">
	        <param name="Threshold" value="INFO"/>
	        <layout class="org.apache.log4j.PatternLayout">
	            <param value="%d [%t] %-5p %c - %m%n" name="ConversionPattern"/>
	        </layout>	
	    </appender>
	    
	    <appender name="fileAppender" class="org.apache.log4j.RollingFileAppender">
	        <param name="File" value="application.log"/>
	        <param name="MaxBackupIndex" value="1"/>
	        <param name="MaxFileSize" value="10MB"/>
	        <param name="Append" value="false"/>
	        <layout class="org.apache.log4j.PatternLayout">
	            <param value="%p %t %c - %m%n" name="ConversionPattern"/>
	        </layout>
	    </appender>
	    
	    <logger name="org.springframework">
	    	<level value="DEBUG"/>
	    </logger>
		<category name="org.springframework.security">
	  		<priority value="DEBUG" />
		</category>
	    
	    <logger name="org.hibernate">
	    	<level value="INFO"/>
	    </logger>  
	    
	    <logger name="org.apache.commons">
	    	<level value="WARN"/>
	    </logger>   
	    
	    <logger name="org.apache.tiles">
	    	<level value="INFO"/>
	    </logger>            
	    
	    <root>
	        <level value="DEBUG"/>	  
	        <appender-ref ref="consoleAppender"/>
	        <appender-ref ref="fileAppender"/>
	    </root>
	    
	</log4j:configuration>

    '''
  }
}
