/*
* generated by Xtext
*/
package io.yaktor;

import org.eclipse.emf.ecore.EPackage;

import com.google.inject.Injector;
import io.yaktor.domain.DomainPackage;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class DomainStandaloneSetup extends DomainStandaloneSetupGenerated{

	public static void doSetup() {
		new DomainStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
    
    @Override
    public Injector createInjectorAndDoEMFRegistration() {
        EPackage.Registry.INSTANCE.put(DomainPackage.eINSTANCE.getNsURI(),DomainPackage.eINSTANCE);
        return super.createInjectorAndDoEMFRegistration();
    }
}

