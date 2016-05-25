package io.yaktor.generator

import com.google.inject.Inject
import io.yaktor.domain.AmountField
import io.yaktor.domain.Association
import io.yaktor.domain.AssociationEnd
import io.yaktor.domain.BooleanField
import io.yaktor.domain.Cardinality
import io.yaktor.domain.ConstraintTypeField
import io.yaktor.domain.CountField
import io.yaktor.domain.DateField
import io.yaktor.domain.DbProvider
import io.yaktor.domain.DomainModel
import io.yaktor.domain.EnumField
import io.yaktor.domain.EnumType
import io.yaktor.domain.EnumValue
import io.yaktor.domain.Field
import io.yaktor.domain.InclusionType
import io.yaktor.domain.IntegerField
import io.yaktor.domain.JpaEnumType
import io.yaktor.domain.NamedType
import io.yaktor.domain.NumericField
import io.yaktor.domain.PersistenceOptions
import io.yaktor.domain.PriceField
import io.yaktor.domain.SimpleField
import io.yaktor.domain.StringField
import io.yaktor.domain.TableType
import io.yaktor.domain.TypeField
import io.yaktor.domain.UniqueConstraint
import io.yaktor.util.Constants
import io.yaktor.util.DslDomainUtil
import io.yaktor.util.FileUtil
import io.yaktor.util.InclusionCat
import java.util.Map
import java.util.Set
import org.eclipse.emf.common.util.EList
import org.eclipse.xtext.generator.IFileSystemAccess

class DaoGenerator {

  @Inject extension FileUtil fileUtil
  @Inject extension DslDomainUtil dslDomainUtil

  @Inject extension GeneratorExtensions genExt

  def genJavaClasses(IFileSystemAccess fsa, DomainModel spec, Map<String, Set<Association>> ascStrMap,
    Map<String, Set<Association>> ascEndMap) {
    var inc = spec.getInclusionType(InclusionCat::TYPES)
    if (inc != InclusionType::NONE) {
      for (type : spec.types) {
        if (type instanceof TableType || type instanceof EnumType) {
          fileUtil.generateFile(fsa, Constants::javaBase,
            spec.genOptions.getRootPackage + '.' + spec.genOptions.getDomainSubpackage, type.name + '.java',
            type.genClass(spec, ascStrMap, ascEndMap), inc == InclusionType::PROTECTED)
          if (type instanceof TableType && spec.genOptions.useAspects) {
            fileUtil.generateFile(fsa, Constants::javaBase,
              spec.genOptions.getRootPackage + '.' + spec.genOptions.getDomainSubpackage,
              type.name + '_ActiveRecord.aj',
              (type as TableType).genActiveRecordAspects(
                spec.genOptions.metaData || (type as TableType).metaData), inc == InclusionType::PROTECTED)
          }
        }
      }
    }
  }

  def dispatch genClass(NamedType type, DomainModel spec, Map<String, Set<Association>> ascStrMap,
    Map<String, Set<Association>> ascEndMap) {
  }

  def dispatch genClass(TableType type, DomainModel spec, Map<String, Set<Association>> ascStrMap,
    Map<String, Set<Association>> ascEndMap) {
    '''
      package «type.modelPackage»;
      
      «genTypeImports(getPersistenceOptions(spec.genOptions))»
      «genCommonImports()»
      «genRefImports(type.modelPackage, type, ascStrMap.get(type.name), ascEndMap.get(type.name))»
      «genPersistenceImports()»
      «genClassAnnotations(this, type)»
      «IF !spec.genOptions.useAspects»
        @Configurable
      «ENDIF»
      @Entity
      «genTableAnnotations(type)»
      public «type.genAbstract»class «type.name»«type.genSupertype» «IF spec.genOptions.metaData || type.metaData»implements Auditable«ENDIF» {
      
        «IF spec.genOptions.metaData || type.metaData»
          public «type.name»() {
          	this.auditInfo = new AuditInfo();
          }
          
        «ENDIF»
        «IF type.genSupertype == null»    
          @Id
          @GeneratedValue(strategy = GenerationType.AUTO)
          @Column(name = "id")
          «genField('Long', 'id')»
          @Version
          @Column(name = "version", nullable = false)
          «genField('Integer', 'version')»
        «ENDIF»
        «IF spec.genOptions.metaData || type.metaData»
          @Embedded
          «genField('AuditInfo', 'auditInfo')»
        «ENDIF»
        «FOR fld : type.fields»
          «fld.genField(type, getPersistenceOptions(spec.genOptions))»
        «ENDFOR»
        «genReferences(type, spec)»
        «genStrAssociations(ascStrMap.get(type.name))»
        «genEndAssociations(ascEndMap.get(type.name))»
        «IF !spec.genOptions.useAspects»
          «IF type.genSupertype == null»«genEntityManager(type, false)»«ENDIF»
          «genFinders(type.name, false)»
          «genPersistence(type, false, spec.genOptions.metaData || type.metaData)»
        «ENDIF»
      }
    '''
  }

  def genActiveRecordAspects(TableType type, boolean meta) {
    '''
      package «type.modelPackage»;
      
      «genPersistenceImports()»
      «genCommonImports()»
      «genClassAnnotations(this, type)»
      @Configurable
      privileged aspect «type.name»_ActiveRecord {
        «IF type.genSupertype == null»«genEntityManager(type, true)»«ENDIF»
        «genFinders(type.name, true)»
        «genPersistence(type, true, meta)»
      }
    '''
  }

  def dispatch genClass(EnumType type, DomainModel spec, Map<String, Set<Association>> ascStrMap,
    Map<String, Set<Association>> ascEndMap) {
    '''
      package «spec.genOptions.getRootPackage».«spec.genOptions.getDomainSubpackage»;
      
      public enum «type.name» {
      
        «FOR fld : type.values»
          «genEnumField(fld)»«IF fld != type.values.last»,«ELSE»;«ENDIF»
        «ENDFOR»
      
        private String value;
      
        public String getValue() {
        return value;
        }
      
        private «type.name»(String value) {
        this.value = value;
        }
      }
    '''
  }

  def genEnumField(EnumValue fld) {
    var ret = ''

    ret = ret + fld.name + '("'
    if (fld.value != null) {
      ret = ret + fld.value
    } else {
      ret = ret + fld.name
    }
    ret = ret + '")'
  }

  def genReference(TableType each, TypeField fld) {
    '''
      «IF fld.cardinality.many»@ManyToOne«ELSE»@OneToOne«ENDIF»
      private «each.name» «each.name.toFirstLower»«fld.name.toFirstUpper»;
      
      public «each.name» get«each.name»«fld.name.toFirstUpper»() {
      	return this.«each.name.toFirstLower»«fld.name.toFirstUpper»;
      }
      
      public void set«each.name»«fld.name.toFirstUpper»(«each.name» «each.name.toFirstLower»«fld.name.toFirstUpper») {
      	this.«each.name.toFirstLower»«fld.name.toFirstUpper» = «each.name.toFirstLower»«fld.name.toFirstUpper»;
      }
      
      
    '''
  }

  def genReferences(TableType type, DomainModel spec) {
    var cnt = ''

    for (each : spec.types.filter(typeof(TableType))) {
      for (fld : each.fields) {
        if (fld instanceof TypeField && (fld as TypeField).isType == type) {
          cnt = cnt + genReference(each, fld as TypeField)
        }
      }
    }
    return cnt
  }

  def getSep(EnumValue obj, EList<EnumValue> lst) {
    if (obj.identityEquals(lst.last)) {
      ';'
    } else {
      ','
    }
  }

  def genSupertype(TableType ent) {
    if (ent.supertype != null) {
      ' extends ' + ent.supertype.name
    }
  }

  def genAbstract(TableType ent) {
    if (ent.isAbstract) {
      'abstract '
    }
  }

  def genAnonymous(TableType ent) {
    if (ent.isAbstract) {
      '{}'
    }
  }

  def genField(Field fld, TableType type, PersistenceOptions opts) {
    var str = ''

    str = str + genFieldAnnotations(fld, type, opts)
    if (fld.cardinality.many) {
      str = str + genSetField(fld.javaType, fld.name)
    } else {
      str = str + genField(fld.javaType, fld.name)
    }

    return str
  }

  def genField(String javaType, String fldName) {
    '''
      private «javaType» «fldName»;
      
      public «javaType» get«fldName.toFirstUpper»() {
          return this.«fldName»;
      }
      
      public void set«fldName.toFirstUpper»(«javaType» «fldName») {
          this.«fldName» = «fldName»;
      }
      
      
    '''
  }

  def genAspectField(String typeName, String javaType, String fldName) {
    '''
      private «javaType» «typeName».«fldName»;
      
      public «javaType» «typeName».get«fldName.toFirstUpper»() {
          return this.«fldName»;
      }
      
      public void «typeName».set«fldName.toFirstUpper»(«javaType» «fldName») {
          this.«fldName» = «fldName»;
      }
      
      
    '''
  }

  def genSetField(String javaType, String fldName) {
    '''
      private Set<«javaType»> «fldName» = new HashSet<«javaType»>();
      
      public Set<«javaType»> get«fldName.toFirstUpper»() {
          return this.«fldName»;
      }
      
      public void set«fldName.toFirstUpper»(Set<«javaType»> «fldName») {
          this.«fldName» = «fldName»;
      }
      
      
    '''
  }

  def genClassAnnotations(Object genSrc, TableType type) {
    var annot = ''

    annot = annot + genJavaGenAnnotation(genSrc)
    if (type.jpaInheritanceType != null) {
      annot = annot + '@Inheritance(strategy = InheritanceType.' + type.jpaInheritanceType + ')\n'
    }

    return annot
  }

  def genTableAnnotations(TableType type) {
    var annot = ''
    var name = ''

    if (!type.uniqueConstraints.empty) {
      annot = annot + '@Table(uniqueConstraints={'
      for (UniqueConstraint uc : type.uniqueConstraints) {
        annot = annot + '@UniqueConstraint(columnNames={'
        for (ConstraintTypeField sf : uc.fields) {
          name = sf.name
          annot = annot + '"' + name + '"'
          if (!sf.equals(uc.fields.last)) {
            annot = annot + ', '
          }
        }
        annot = annot + '})'
        if (!uc.equals(type.uniqueConstraints.last)) {
          annot = annot + ', '
        }
      }
      annot = annot + '})\n'
    }

    return annot
  }

  def addColDef(String curDef, String addDef) {
    var colDef = ''
    if (curDef == '') {
      colDef = '@Column('
    } else {
      colDef = curDef + ', '
    }
    colDef = colDef + addDef

    return colDef
  }

  def genFieldAnnotations(Field fld, TableType type, PersistenceOptions opts) {
    var annot = ''
    var colDef = ''

    if (fld.cardinality != null &&
      (fld.cardinality == Cardinality::REQUIRED || fld.cardinality == Cardinality::ONE_OR_MORE)) {
      annot = annot + '@NotNull\n'
    }
    if (fld.cardinality != null && fld.cardinality == Cardinality::ONE_OR_MORE && opts != null &&
      opts.dbProvider == DbProvider::HIBERNATE) {
      annot = annot + '@NotEmpty\n'
    }

    if (fld instanceof SimpleField && (fld as SimpleField).unique) {
      colDef = addColDef(colDef, 'unique = true')
    }

    if (fld instanceof PriceField) {
      annot = annot + '@Digits(integer = 16, fraction = 5)\n'
    } else if (fld instanceof DateField) {
      annot = annot + '@Temporal(TemporalType.TIMESTAMP)\n'
      annot = annot + '@DateTimeFormat(style = "M-")\n'
    } else if (fld instanceof NumericField) {
      colDef = addColDef(colDef, 'columnDefinition = "float"')
    } else if (fld instanceof StringField) {
      annot = annot + getLength(fld)
    } else if (fld instanceof TypeField) {
      if (fld.cardinality.many) {
        annot = annot + '@OneToMany(cascade = CascadeType.ALL, mappedBy="' + type.name.toFirstLower +
          fld.name.toFirstUpper + '")\n'
      } else {
        annot = annot + '@OneToOne(cascade = CascadeType.ALL, mappedBy="' + type.name.toFirstLower +
          fld.name.toFirstUpper + '")\n'
      }
    } else if (fld instanceof EnumField) {
      annot = annot + '@Enumerated'
      if (fld.isJpaEnumType != JpaEnumType::NONE) {
        annot = annot + '(' + 'EnumType.' + fld.isJpaEnumType.getName() + ')'
      }
      annot = annot + '\n'
    }
    if (colDef != '') {
      annot = annot + colDef + ')\n';
    }

    return annot
  }

  def getLength(StringField fld) {
    switch (fld) {
      case fld.maxLength > 4000:
        '@Lob\n'
      case fld.minLength != 0 && fld.maxLength != 0:
        '@Size(min = ' + fld.minLength + ', max = ' + fld.maxLength + ')\n'
      case fld.minLength != 0:
        '@Size(min = ' + fld.minLength + ')\n'
      case fld.maxLength != 0:
        '@Size(max = ' + fld.maxLength + ')\n'
      default:
        ''
    }
  }

  def genTypeImports(PersistenceOptions opts) {
    '''
      import java.util.Set;
      import java.util.HashSet;
      import javax.persistence.CascadeType;
      import javax.persistence.Table;
      import javax.persistence.EntityManager;
      import javax.persistence.EnumType;
      import javax.persistence.Enumerated;
      import javax.persistence.Inheritance;
      import javax.persistence.InheritanceType;
      import javax.persistence.Lob;
      import javax.persistence.OneToMany;
      import javax.persistence.ManyToMany;
      import javax.persistence.OneToOne;
      import javax.persistence.ManyToOne;
      import javax.persistence.PersistenceContext;
      import javax.persistence.UniqueConstraint;
      import javax.persistence.JoinColumn;
      import javax.validation.constraints.Digits;
      import javax.validation.constraints.NotNull;
      import javax.validation.constraints.Size;
      «IF opts != null && opts.dbProvider == DbProvider::HIBERNATE»
        import org.hibernate.validator.constraints.NotEmpty;
      «ENDIF»
    '''
  }

  def genPersistenceImports() {
    '''
      import javax.persistence.Id;
      import javax.persistence.Version;
      import javax.persistence.Entity;
      import javax.persistence.Column;
      import javax.persistence.GeneratedValue;
      import javax.persistence.GenerationType;
      import javax.persistence.EntityManager;
      import javax.persistence.PersistenceContext;
      import org.springframework.transaction.annotation.Transactional;
      import org.springframework.beans.factory.annotation.Configurable;
      
    '''
  }

  def genCommonImports() {
    '''
      import java.util.Date;
      import java.util.List;
      import javax.annotation.Generated;
      import javax.persistence.Temporal;
      import javax.persistence.TemporalType;
      import javax.persistence.Embedded;
      import org.springframework.format.annotation.DateTimeFormat;
      import io.yaktor.dsl.data.domain.Auditable;
      import io.yaktor.dsl.data.domain.AuditInfo;
      
    '''
  }

  def genEntityManager(TableType type, boolean asp) {
    '''
      @PersistenceContext
      transient EntityManager «IF asp»«type.name».«ENDIF»entityManager;
      
      public static final EntityManager «IF asp»«type.name».«ENDIF»entityManager() {
        EntityManager em = new «type.name»()«type.genAnonymous».entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
          return em;
      }
      
      
    '''
  }

  def genFinders(String typeName, boolean asp) {
    '''
      public static long «IF asp»«typeName».«ENDIF»count«typeName»«typeName.nameSuffix»() {
        return entityManager().createQuery("SELECT COUNT(o) FROM «typeName» o", Long.class).getSingleResult();
      }
      
      public static List<«typeName»> «IF asp»«typeName».«ENDIF»findAll«typeName»«typeName.nameSuffix»() {
        return entityManager().createQuery("SELECT o FROM «typeName» o", «typeName».class).getResultList();
      }
      
      public static «typeName» «IF asp»«typeName».«ENDIF»find«typeName»(Long id) {
        if (id == null) return null;
        return entityManager().find(«typeName».class, id);
      }
      
      public static List<«typeName»> «IF asp»«typeName».«ENDIF»find«typeName»Entries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM «typeName» o", «typeName».class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
      }
      
      
    '''
  }

  def genPersistence(TableType type, boolean asp, boolean meta) {
    '''
      «IF type.genSupertype == null»    
        @Transactional
        public void «IF asp»«type.name».«ENDIF»persist() {
          if (this.entityManager == null) this.entityManager = entityManager();
          this.entityManager.persist(this);
        }
        
        @Transactional
        public void «IF asp»«type.name».«ENDIF»remove() {
          if (this.entityManager == null) this.entityManager = entityManager();
          if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
          } else {
            «type.name» attached = «type.name».find«type.name»(this.id);
            this.entityManager.remove(attached);
          }
        }
        
        @Transactional
        public void «IF asp»«type.name».«ENDIF»flush() {
          if (this.entityManager == null) this.entityManager = entityManager();
          this.entityManager.flush();
        }
        
        @Transactional
        public void «IF asp»«type.name».«ENDIF»clear() {
          if (this.entityManager == null) this.entityManager = entityManager();
          this.entityManager.clear();
        }
      «ENDIF»
      
      @Transactional
      public «type.name» «IF asp»«type.name».«ENDIF»merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        «type.name» merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
      }
    '''
  }

  def getJavaType(Field fld) {
    switch (fld) {
      StringField: 'String'
      DateField: 'Date'
      IntegerField: 'Integer'
      NumericField: 'Double'
      BooleanField: 'Boolean'
      PriceField: 'java.math.BigDecimal'
      AmountField: 'java.math.BigDecimal'
      CountField: 'Integer'
      EnumField: fld.isType.name
      TypeField: fld.isType.name
    }
  }

  def genAssocUnique(AssociationEnd assEnd) {
    if (assEnd.unique && !assEnd.cardinality.many) {
      '@JoinColumn(unique = true)\n'
    } else {
      ''
    }
  }

  def genComposition(AssociationEnd assEnd) {
    if (assEnd.isComposition) {
      ', orphanRemoval = true'
    } else {
      ''
    }
  }

  // Reverting orphan removal for the compositions
  // @OneToMany(cascade = CascadeType.ALL, mappedBy = "«asc.start.name»"«genComposition(asc.start)»)
  def genStrAssociations(Set<Association> ascSet) {
    '''
      «IF ascSet != null»
        «FOR asc : ascSet»
          «IF !asc.start.cardinality.isMany && asc.end.cardinality.isMany»
            @OneToMany(cascade = CascadeType.ALL, mappedBy = "«asc.start.name»")
            «genSetField(asc.end.references.name, asc.end.name)»
          «ENDIF»
          «IF asc.start.cardinality.isMany && !asc.end.cardinality.isMany»
            @ManyToOne«IF asc.end.cardinality.required»(optional = false)«ENDIF»
            «genAssocUnique(asc.end)»
            «genField(asc.end.references.name, asc.end.name)»
          «ENDIF»
          «IF !asc.start.cardinality.isMany && !asc.end.cardinality.isMany»
            «IF asc.isUnidirectional»@OneToOne«ELSE»@OneToOne(mappedBy = "«asc.start.name»")«ENDIF»
            «genField(asc.end.references.name, asc.end.name)»
          «ENDIF»
          «IF asc.start.cardinality.isMany && asc.end.cardinality.isMany»
            @ManyToMany(cascade = CascadeType.ALL)
            «genSetField(asc.end.references.name, asc.end.name)»
          «ENDIF»
        «ENDFOR»
      «ENDIF»
    '''
  }

  // Reverting orphan removal for the compositions
  // @OneToMany(cascade = CascadeType.ALL, mappedBy = "«asc.end.name»"«genComposition(asc.start)»)
  def genEndAssociations(Set<Association> ascSet) {
    '''
      «IF ascSet != null»
        «FOR asc : ascSet»
          «IF !asc.isUnidirectional»
            «IF asc.start.cardinality.isMany && !asc.end.cardinality.isMany»
              @OneToMany(cascade = CascadeType.ALL, mappedBy = "«asc.end.name»")
              «genSetField(asc.start.references.name, asc.start.name)»
            «ENDIF»
            «IF !asc.start.cardinality.isMany && asc.end.cardinality.isMany»
              @ManyToOne«IF asc.start.cardinality.required»(optional = false)«ENDIF»
              «genAssocUnique(asc.start)»
              «genField(asc.start.references.name, asc.start.name)»
            «ENDIF»
            «IF !asc.start.cardinality.isMany && !asc.end.cardinality.isMany»
              @OneToOne
              «genField(asc.start.references.name, asc.start.name)»
            «ENDIF»
            «IF asc.start.cardinality.isMany && asc.end.cardinality.isMany»
              @ManyToMany(cascade = CascadeType.ALL, mappedBy = "«asc.end.name»")
              «genSetField(asc.start.references.name, asc.start.name)»
            «ENDIF»
          «ENDIF»
        «ENDFOR»
      «ENDIF»
    '''
  }
}
