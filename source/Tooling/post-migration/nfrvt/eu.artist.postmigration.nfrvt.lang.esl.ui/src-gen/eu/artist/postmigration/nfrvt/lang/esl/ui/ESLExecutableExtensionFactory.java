/*******************************************************************************
 * Copyright (c) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Martin Fleck (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
/*
 * generated by Xtext
 */
package eu.artist.postmigration.nfrvt.lang.esl.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import eu.artist.postmigration.nfrvt.lang.esl.ui.internal.ESLActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ESLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return ESLActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return ESLActivator.getInstance().getInjector(ESLActivator.EU_ARTIST_POSTMIGRATION_NFRVT_LANG_ESL_ESL);
	}
	
}
