/*
 * generated by Xtext
 */
package eu.artist.postmigration.nfrvt.lang.nsl.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import eu.artist.postmigration.nfrvt.lang.nsl.ui.internal.NSLActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class NSLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return NSLActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return NSLActivator.getInstance().getInjector(NSLActivator.EU_ARTIST_POSTMIGRATION_NFRVT_LANG_NSL_NSL);
	}
	
}
