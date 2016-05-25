/**
 * 
 */
package io.yaktor.generator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.util.RuntimeIOException;

/**
 * @author jkamke
 *
 */
public class BetterFileSystemAccess extends JavaIoFileSystemAccess {
  public void generateFile(String fileName, String outputConfigName, CharSequence contents) throws RuntimeIOException {
  File file = getFile(fileName, outputConfigName);
  OutputConfiguration outputConfig = getOutputConfig(outputConfigName);

  try {
      createFolder(file.getParentFile());
      if (!file.exists() || outputConfig.isOverrideExistingResources()) {
      String encoding = getEncoding(getURI(fileName, outputConfigName));
      OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(file), encoding);
      try {
          writer.append(postProcess(fileName, outputConfigName, contents, encoding));
          
      } finally {
          writer.close();
      }
    }
  } catch (IOException e) {
      throw new RuntimeIOException(e);
  }
}

}
