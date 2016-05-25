package io.yaktor.generator

import java.util.Set
import org.eclipse.xtext.generator.IOutputConfigurationProvider
import org.eclipse.xtext.generator.OutputConfiguration
import org.eclipse.xtext.generator.OutputConfigurationProvider

class DomainOutputConfigurationProvider implements IOutputConfigurationProvider {

	IOutputConfigurationProvider defaultP = new OutputConfigurationProvider;
	Set<OutputConfiguration> ocs = defaultP.outputConfigurations;
	public static final String DOC = "DocOutputConfiguration"
	public static final OutputConfiguration DOC_CONFIG = new OutputConfiguration(DOC);

	new() {
		DOC_CONFIG.setDescription("Conversation Generated Documentation Files");
		DOC_CONFIG.setOutputDirectory("./doc");
		DOC_CONFIG.setOverrideExistingResources(true);
		DOC_CONFIG.setCreateOutputDirectory(true);
		DOC_CONFIG.setCanClearOutputDirectory(false);
		DOC_CONFIG.setCleanUpDerivedResources(true);
		DOC_CONFIG.setSetDerivedProperty(true);
		ocs.add(DOC_CONFIG);
	}

	override getOutputConfigurations() {
		return ocs;
	}

}
