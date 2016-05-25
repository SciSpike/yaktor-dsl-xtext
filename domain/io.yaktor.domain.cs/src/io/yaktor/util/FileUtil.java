package io.yaktor.util;


import org.eclipse.xtext.generator.IFileSystemAccess;


public class FileUtil {
  
  public void generateFile(IFileSystemAccess fsa, String baseName, String pckgName, String fileName, CharSequence contents) {
	  generateFile(fsa, baseName, pckgName, fileName, contents, false);
  }
  
  
  public void generateFile(IFileSystemAccess fsa, String baseName, String fileName, CharSequence contents, boolean genSfx) {
	 generateFile(fsa, baseName, "", fileName, contents, genSfx);
  }
  
  
  public void generateFile(IFileSystemAccess fsa, String baseName, String pckgName, String fileName, CharSequence contents, boolean genSfx) {
	  String fldrName = pckgName.replaceAll("\\.", "/");
	  if (fldrName.length() > 0)
		  fldrName += '/'; 
	  String fullName = baseName+fldrName+fileName;
	  
	  if (genSfx)
		  fullName += ".gen";

	  fsa.generateFile(fullName, contents);
  }
}
