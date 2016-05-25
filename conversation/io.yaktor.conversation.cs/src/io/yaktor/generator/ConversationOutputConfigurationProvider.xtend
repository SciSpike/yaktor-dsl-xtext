package io.yaktor.generator

import java.util.Set
import org.eclipse.xtext.generator.IOutputConfigurationProvider
import org.eclipse.xtext.generator.OutputConfiguration
import org.eclipse.xtext.generator.OutputConfigurationProvider

class ConversationOutputConfigurationProvider implements IOutputConfigurationProvider {

  IOutputConfigurationProvider defaultP = new OutputConfigurationProvider;
  Set<OutputConfiguration> ocs = defaultP.outputConfigurations;
  public static final String GEN_ONCE = "GenOnceOutputConfiguration"
  public static final OutputConfiguration GEN_ONCE_CONFIG = new OutputConfiguration(GEN_ONCE);
  public static final String GEN_ONCE_ROOT = "GenOnceRootOutputConfiguration"
  public static final OutputConfiguration GEN_ONCE_ROOT_CONFIG = new OutputConfiguration(GEN_ONCE_ROOT);
  public static final String GEN = "GenOutputConfiguration"
  public static final OutputConfiguration GEN_CONFIG = new OutputConfiguration(GEN);
  public static final String GEN_ROOT = "GenRootOutputConfiguration"
  public static final OutputConfiguration GEN_ROOT_CONFIG = new OutputConfiguration(GEN_ROOT);
  public static final String PUBLIC = "PublicOutputConfiguration"
  public static final OutputConfiguration PUBLIC_CONFIG = new OutputConfiguration(PUBLIC);
  public static final String DOC = "DocOutputConfiguration"
  public static final OutputConfiguration DOC_CONFIG = new OutputConfiguration(DOC);

  new() {
    GEN_ONCE_CONFIG.setDescription("Conversation User files");
    GEN_ONCE_CONFIG.setOutputDirectory("./conversations");
    GEN_ONCE_CONFIG.setOverrideExistingResources(false);
    GEN_ONCE_CONFIG.setCreateOutputDirectory(true);
    GEN_ONCE_CONFIG.setCanClearOutputDirectory(false);
    GEN_ONCE_CONFIG.setCleanUpDerivedResources(false);
    GEN_ONCE_CONFIG.setSetDerivedProperty(false);
    ocs.add(GEN_ONCE_CONFIG);
    
    GEN_ONCE_ROOT_CONFIG.setDescription("Root User files");
    GEN_ONCE_ROOT_CONFIG.setOutputDirectory("./");
    GEN_ONCE_ROOT_CONFIG.setOverrideExistingResources(false);
    GEN_ONCE_ROOT_CONFIG.setCreateOutputDirectory(true);
    GEN_ONCE_ROOT_CONFIG.setCanClearOutputDirectory(false);
    GEN_ONCE_ROOT_CONFIG.setCleanUpDerivedResources(false);
    GEN_ONCE_ROOT_CONFIG.setSetDerivedProperty(false);
    ocs.add(GEN_ONCE_ROOT_CONFIG);

    GEN_CONFIG.setDescription("Conversation Generated files");
    GEN_CONFIG.setOutputDirectory("./conversations");
    GEN_CONFIG.setOverrideExistingResources(true);
    GEN_CONFIG.setCreateOutputDirectory(true);
    GEN_CONFIG.setCanClearOutputDirectory(false);
    GEN_CONFIG.setCleanUpDerivedResources(false);
    GEN_CONFIG.setSetDerivedProperty(true);
    ocs.add(GEN_CONFIG);
    
    GEN_ROOT_CONFIG.setDescription("Root Generated files");
    GEN_ROOT_CONFIG.setOutputDirectory("./");
    GEN_ROOT_CONFIG.setOverrideExistingResources(true);
    GEN_ROOT_CONFIG.setCreateOutputDirectory(true);
    GEN_ROOT_CONFIG.setCanClearOutputDirectory(false);
    GEN_ROOT_CONFIG.setCleanUpDerivedResources(false);
    GEN_ROOT_CONFIG.setSetDerivedProperty(true);
    ocs.add(GEN_ROOT_CONFIG);

    DOC_CONFIG.setDescription("Conversation Generated Documentation Files");
    DOC_CONFIG.setOutputDirectory("./doc");
    DOC_CONFIG.setOverrideExistingResources(true);
    DOC_CONFIG.setCreateOutputDirectory(true);
    DOC_CONFIG.setCanClearOutputDirectory(false);
    DOC_CONFIG.setCleanUpDerivedResources(true);
    DOC_CONFIG.setSetDerivedProperty(true);
    ocs.add(DOC_CONFIG);

    PUBLIC_CONFIG.setDescription("Public Generated files");
    PUBLIC_CONFIG.setOutputDirectory("./public");
    PUBLIC_CONFIG.setOverrideExistingResources(true);
    PUBLIC_CONFIG.setCreateOutputDirectory(true);
    PUBLIC_CONFIG.setCanClearOutputDirectory(false);
    PUBLIC_CONFIG.setCleanUpDerivedResources(true);
    PUBLIC_CONFIG.setSetDerivedProperty(true);
    ocs.add(PUBLIC_CONFIG);
  }

  override getOutputConfigurations() {
    return ocs;
  }

}
