package io.yaktor.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import io.yaktor.domain.Association;
import io.yaktor.domain.Cardinality;
import io.yaktor.domain.DomainModel;
import io.yaktor.domain.Entity;
import io.yaktor.domain.EnumType;
import io.yaktor.domain.Field;
import io.yaktor.domain.GenOptions;
import io.yaktor.domain.GenerationInclusion;
import io.yaktor.domain.InclusionType;
import io.yaktor.domain.JpaGenOptions;
import io.yaktor.domain.NamedType;
import io.yaktor.domain.Type;
import io.yaktor.domain.TypeField;


public class DslDomainUtil {
  
	
	private static final String[] javaKeys = {
		"abstract",     "continue",     "for",  "new",  "switch",       "assert",       "default",      "goto",         "package",
		"synchronized", "boolean",      "do",   "if",   "private",      "this",         "break",        "double",       "implements",   
		"protected",    "throw",        "byte", "else", "import",       "public",       "throws",       "case",         "enum", 
		"instanceof",   "return",       "transient",    "catch",        "extends",      "int",          "short",        "try",  
		"char",         "final",        "interface",    "static",       "void",         "class",        "finally",      "long", 
		"strictfp",     "volatile",     "const",        "float",        "native",       "super",        "while"		
	};
	
	
	private static Set<String> javaSet = getSet(javaKeys);
	
	
    private static Set<String> getSet(String[] keys, String... addOns) {
      Set<String> keySet = new HashSet<String>();
      for (int i = 0; i < keys.length; i++) {
        keySet.add(keys[i]);
      }
      for (int i = 0; i < addOns.length; i++) {
        keySet.add(addOns[i]);
      }
      return keySet;
    }
	
	
	
	private static Set<String> javascriptSet = getSet(javaKeys,"options");
	
	private static final String[] oracleKeys = {
		"ACCESS",       "ELSE",      "MODIFY",       "START",        "ADD",  "EXCLUSIVE",    "NOAUDIT",      "SELECT", 
		"ALL",  "EXISTS",       "NOCOMPRESS",   "SESSION",      "ALTER",        "FILE", "NOT",  "SET",  "AND",  
		"FLOAT",        "NOTFOUND",     "SHARE",        "ANY",  "FOR",  "NOWAIT",       "SIZE", "ARRAYLEN",     
		"FROM", "NULL", "SMALLINT",     "AS",   "GRANT",        "NUMBER",       "SQLBUF",       "ASC",  "GROUP",        
		"OF",   "SUCCESSFUL",   "AUDIT",        "HAVING",       "OFFLINE",      "SYNONYM",      "BETWEEN",      
		"IDENTIFIED",   "ON",   "SYSDATE",      "BY",   "IMMEDIATE",    "ONLINE",       "TABLE",        "CHAR", 
		"IN",   "OPTION",       "THEN", "CHECK",        "INCREMENT",    "OR",   "TO",   "CLUSTER",      "INDEX",        
		"ORDER",        "TRIGGER",      "COLUMN",       "INITIAL",      "PCTFREE",      "UID",  "COMMENT",      
		"INSERT",       "PRIOR",        "UNION",        "COMPRESS",     "INTEGER",      "PRIVILEGES",   "UNIQUE",       
		"CONNECT",      "INTERSECT",    "PUBLIC",       "UPDATE",       "CREATE",       "INTO", "RAW",  "USER", 
		"CURRENT",      "IS",   "RENAME",       "VALIDATE",     "DATE", "LEVEL",        "RESOURCE",     "VALUES",       
		"DECIMAL",      "LIKE", "REVOKE",       "VARCHAR",      "DEFAULT",      "LOCK", "ROW",  "VARCHAR2",     
		"DELETE",       "LONG", "ROWID",        "VIEW", "DESC", "MAXEXTENTS",   "ROWLABEL",     "WHENEVER",     
		"DISTINCT",     "MINUS",        "ROWNUM",       "WHERE",        "DROP", "MODE", "ROWS", "WITH"
		};
	
	
	private static Set<String> oracleSet = getSet(oracleKeys);
	
	
	public static boolean isJavaKeyword(String word) {
	  return javaSet.contains(word);	
	}
	
	public static boolean isJavascriptKeyword(String world) {
		return javascriptSet.contains(world);
	}
	
	
	public static boolean isOracleKeyword(String word) {
	  return oracleSet.contains(word);	
	}
	
	
	public String getColumnSpec(String name) {
		String spec = name.toUpperCase();
		if (oracleSet.contains(spec)) {
			spec = " --column " + spec + "_CN";
			return spec;
		}
		
		return "";
	}
	
	
	public String getTableSpec(String name) {
		String spec = name.toUpperCase();
		if (oracleSet.contains(spec)) {
			spec = " --table " + spec + "_TN";
			return spec;
		}
		
		return "";
	}
	
	
	public String getNameSuffix(String name) {
		if (name.endsWith("s")) {
			return "es";
		}
		
		return "s";
	}
	
	
	public String getPlural(String name) {
		return name+getNameSuffix(name);
	}
	
	
	public String getLowerPlural(String name) {
		return name.toLowerCase()+getNameSuffix(name);
	}
	
	
	public String dotToUnd(String name) {
		return name.replaceAll("\\.","_");
	}


	public boolean isMany(Cardinality card) {
	   return (card != null && (card == Cardinality.MANY || card == Cardinality.ONE_OR_MORE));
	}


	public boolean isRequired(Cardinality card) {
	   return (card != null && (card == Cardinality.REQUIRED || card == Cardinality.ONE_OR_MORE));
	}
	
	
	private GenerationInclusion getGenerationInclusion(DomainModel spec) {
		GenOptions options = spec.getGenOptions();
		if (options != null) {
			if (options instanceof JpaGenOptions) {
				return ((JpaGenOptions) options).getGenerationInclusion();
			}
		}
		
		return null;
	}
	
	
	public InclusionType getInclusionType(DomainModel spec, InclusionCat cat) {
		GenerationInclusion inc = getGenerationInclusion(spec);
		if (inc != null) {
			switch (cat) {
				case TYPES: return inc.getTypes();
				case CONTROLLER: return inc.getController();
				case RESOURCES: return inc.getResources();
				case PROPERTIES: return inc.getProperties();
				case VIEWS: return inc.getViews();
				case WEBXML: return inc.getWebxml();
				case POM: return inc.getPom();
				case STYLES: return inc.getStyles();
				case CLASSES: return inc.getClasses();
				case LAYOUTS: return inc.getLayouts();
				case WEBMVC: return inc.getWebmvc();
				case TAGS: return inc.getTags();
			}
		}
		return InclusionType.NONE;
	}
	
	
	public String getLabel(String name) {
		StringBuilder bld = new StringBuilder();
		if (name != null) {
			if (name.length()  > 0) {
				bld.append(Character.toUpperCase(name.charAt(0)));
				
				for (int i = 1; i < name.length(); i++) {
					if (Character.isUpperCase(name.charAt(i))) {
						bld.append(' ');
					}
					bld.append(name.charAt(i));
				}
			}
		}
		return bld.toString();
	}
	
	
	public String genJavaGenAnnotation(Object obj) {
		StringBuilder bld = new StringBuilder();
		
		bld.append("@Generated(\n");
		
		Class<?> cls = obj.getClass();
		bld.append("  value=\"").append(cls.getCanonicalName()).append("\",\n");
		
		bld.append("  comments=\"").append(Constants.genCom).append("\"\n");
		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
//		bld.append("  date=\"").append(sdf.format(new Date())).append("\"\n");

		bld.append("  )\n");

		return bld.toString();
	}
	
	
	public List<NamedType> sortTypes(List<NamedType> src) {
		SortedSet<NamedType> srt = new TreeSet<NamedType>(new TypeComparator());
		for (NamedType typ : src) {
			srt.add(typ);
		}
		
		List<NamedType> trg = new ArrayList<NamedType>();
		for (NamedType typ : srt) {
			trg.add(typ);
		}
		
		return trg;
    }
	
	
	public Set<Association> sortAssociations(Set<Association> src) {
		SortedSet<Association> srt = new TreeSet<Association>(new AssociationComparator());
		for (Association typ : src) {
			srt.add(typ);
		}
		
		return srt;
    }
	
	
	class TypeComparator implements Comparator<NamedType> {
		
		public int compare(NamedType typ1, NamedType typ2) {
	        if (typ1 instanceof EnumType) return -1;
	        if (typ2 instanceof EnumType) return 1;

	        if (typ1 instanceof Association) return 1;
	        if (typ2 instanceof Association) return -1;

	        if (typ1 instanceof Type && typ2 instanceof Entity) return -1;
	        if (typ1 instanceof Entity && typ2 instanceof Type) return 1;
	        
	        if (typ1 instanceof Entity) {
	        	if (isHigher((Entity) typ1, (Entity) typ2)) return 1;
	        	if (isHigher((Entity) typ2, (Entity) typ1)) return -1;
	        }

	        if (typ1 instanceof Type) {
	        	if (isHigher((Type) typ1, (Type) typ2)) return 1;
	        	if (isHigher((Type) typ2, (Type) typ1)) return -1;
	        }

	        return 1;
	    }
		
		
		private boolean isHigher(Entity ent1, Entity ent2) {
        	if (ent1.getSupertype() != null && ent1.getSupertype().equals(ent2.getName())) 
        		return true;
        	
        	for (Field fld : ent1.getFields()) {
        		if (fld instanceof TypeField) {
        			TypeField typ = (TypeField) fld;
        			if (typ.getIsType().getName().equals(ent2.getName()))
                		return true;
        		}
        	}

        	return false;	
		}
		
		
		private boolean isHigher(Type ent1, Type ent2) {
        	if (ent1.getSupertype() != null && ent1.getSupertype().equals(ent2.getName())) 
        		return true;
        	
        	for (Field fld : ent1.getFields()) {
        		if (fld instanceof TypeField) {
        			TypeField typ = (TypeField) fld;
        			if (typ.getIsType().getName().equals(ent2.getName()))
                		return true;
        		}
        	}

        	return false;	
		}
	}
}
