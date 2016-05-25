package io.yaktor.generator

import io.yaktor.domain.Association
import io.yaktor.domain.DomainModel
import io.yaktor.domain.Entity
import io.yaktor.domain.EnumField
import io.yaktor.domain.EnumType
import io.yaktor.domain.Field
import io.yaktor.domain.GenOptions
import io.yaktor.domain.JpaGenOptions
import io.yaktor.domain.TableType
import io.yaktor.domain.Type
import io.yaktor.domain.TypeField
import java.util.Set
import java.util.TreeSet
import static extension io.yaktor.generator.util.DomainModelExtensions.*

class GeneratorExtensions {
  def getJpaInheritanceType(TableType e) {
    if(e.jpaTableOptions != null && e.jpaTableOptions.singleTableRoot){
       "SINGLE_TABLE"
    }
  }
  
	def getModelPackage(DomainModel spec) {
	    spec.genOptions.getRootPackage+'.'+spec.genOptions.getDomainSubpackage
	}
  
 
	def getModelPackage(Type type) {
	    (type.eContainer as DomainModel).modelPackage
	}
  
 
	def getModelPackage(EnumType type) {
	    (type.eContainer as DomainModel).modelPackage
	}
  
 
    def getModelPackage(TableType type) {
	    (type.eContainer as DomainModel).modelPackage
    }
 

    def getModelPackage(Entity type) {
	    (type.eContainer as DomainModel).modelPackage
    }
 

    def addRefImport(String curPck, String refPck, String refName, Set<String> impSet) {
	  	if (!refPck.equals(curPck)) {
	  		impSet.add(refPck+'.'+refName)
	  	}
    }
  
  
    def genRefImports(String curPck, TableType type, Set<Association> ascStrSet, Set<Association> ascEndSet) {
	  	var impSet = new TreeSet<String>();
	  	
		addRefImport(curPck, type.modelPackage, type.name, impSet)
		for (Field fld : type.fields) {
		  	switch (fld) {
		     	EnumField: addRefImport(curPck, fld.isType.modelPackage, fld.isType.name, impSet)
		     	TypeField: addRefImport(curPck, fld.isType.modelPackage, fld.isType.name, impSet)
		  	}
		}
	  	if (ascStrSet != null) {
		  	for (Association asc : ascStrSet) {
		  		addRefImport(curPck, asc.end.references.modelPackage, asc.end.references.name, impSet)
		  	}
	  	}
	  	if (ascEndSet != null) {
		  	for (Association asc : ascEndSet) {
		  		addRefImport(curPck, asc.start.references.modelPackage, asc.start.references.name, impSet)
		  	}
	  	}
	  	
	  	var imps = '';
	  	if (!impSet.empty) {
		  	for (imp : impSet) {
		  		imps = imps+'import '+imp+';\n'
		  	}
		  	imps = imps+'\n\n';
	  	}
	  	
	  	return imps;
	} 
		
		
	def dispatch getDomainSubpackage(GenOptions genOptions) {
	}
	
	
	def dispatch getDomainSubpackage(JpaGenOptions genOptions) {
	  if (genOptions.project.domainSubpackage != null) {
	  	genOptions.project.domainSubpackage
	  } else {
	  	'domain'
	  }
	}
	
	
	def dispatch getControllerSubpackage(GenOptions genOptions) {
	}
	
	
	def dispatch getControllerSubpackage(JpaGenOptions genOptions) {
	  if (genOptions.project.controllerSubpackage != null) {
	  	genOptions.project.controllerSubpackage
	  } else {
	  	'controller'
	  }
	}
	
	
	def dispatch getControllerPackage(GenOptions genOptions) {
	}
	
	
	def dispatch getControllerPackage(JpaGenOptions genOptions) {
		genOptions.getRootPackage+'.'+genOptions.getControllerSubpackage
	}
	
	
	def dispatch getDomainPackage(GenOptions genOptions) {
	}
	
	
	def dispatch getDomainPackage(JpaGenOptions genOptions) {
		genOptions.getRootPackage+'.'+genOptions.getDomainSubpackage
	}
	
	
	def dispatch getRootPackage(GenOptions genOptions) {
	}
	
	
	def dispatch getRootPackage(JpaGenOptions genOptions) {
		genOptions.project.rootPackage	
	}


	def dispatch boolean getUseAspects(GenOptions genOptions) {
		false
	}
	
	
	def dispatch boolean getUseAspects(JpaGenOptions genOptions) {
	  	genOptions.useAspects
	}


	def dispatch boolean getMetaData(GenOptions genOptions) {
		false
	}
	
	
	
	def dispatch boolean getMetaData(JpaGenOptions genOptions) {
	  	genOptions.metaData
	}
		
		
	def dispatch getPersistenceOptions(GenOptions genOptions) {
	}
	
	
	def dispatch getPersistenceOptions(JpaGenOptions genOptions) {
	  if (genOptions != null) {
	  	genOptions.persistence
	  }
	}
}

