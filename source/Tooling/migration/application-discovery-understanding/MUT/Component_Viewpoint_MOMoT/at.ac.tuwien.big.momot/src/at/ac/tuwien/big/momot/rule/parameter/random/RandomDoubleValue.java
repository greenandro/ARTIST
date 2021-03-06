package at.ac.tuwien.big.momot.rule.parameter.random;

import org.moeaframework.core.PRNG;

public class RandomDoubleValue extends AbstractRandomNumberValue<Double> {

	private Double initialValue = null;
	
	public RandomDoubleValue() {
		this(0, 1);
	}
	
	public RandomDoubleValue(double lowerBound, double upperBound) {
		super(lowerBound, upperBound);
	}

	@Override
	public Double nextValue() {
		Double toReturn = PRNG.nextDouble(getLowerBound(), getUpperBound());
		if(initialValue == null)
			initialValue = new Double(toReturn);
		return toReturn;
	}
	
	@Override
	public String toString() {
		return super.toString() + "[" + getLowerBound() + "," + getUpperBound() + "]";
	}

	@Override
	public Double getInitialValue() {
		return initialValue;
	}
}
