/*******************************************************************************
 * Copyright (c) 2015 Vienna University of Technology.
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
package at.ac.tuwien.big.moea.solution;

import java.io.Serializable;

import org.moeaframework.core.Solution;

public class MOEASolution extends Solution {
	private static final long serialVersionUID = 1489801128861913870L;

	/**
	 * The aggregated fitness of a solution is the sum of all objective values 
	 * plus the sum of all constraint values.
	 */
	public static final String ATTRIBUTE_AGGREGATED_FITNESS = "AggregatedFitness";
	
	public MOEASolution(double[] objectives) {
		super(objectives);
	}

	public MOEASolution(int numberOfVariables, int numberOfObjectives,
			int numberOfConstraints) {
		super(numberOfVariables, numberOfObjectives, numberOfConstraints);
	}

	public MOEASolution(int numberOfVariables, int numberOfObjectives) {
		super(numberOfVariables, numberOfObjectives);
	}

	public MOEASolution(Solution solution) {
		super(solution);
	}

	public <A extends Serializable> A getAttribute(String key, Class<A> resultClass) {
		Object value = getAttribute(key);
		if(value == null || !resultClass.isInstance(value))
			return null;
		return resultClass.cast(value);
	}
	
	public void storeAggregatedFitness(double fitness) {
		setAttribute(ATTRIBUTE_AGGREGATED_FITNESS, fitness);
	}
		
	public Double getStoredAggregatedFitness() {
		return getAttribute(ATTRIBUTE_AGGREGATED_FITNESS, Double.class);
	}
	
	public void removeStoredAggregatedFitness() {
		removeAttribute(ATTRIBUTE_AGGREGATED_FITNESS);
	}
}
