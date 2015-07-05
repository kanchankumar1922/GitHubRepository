/**
 * 
 */
package com.kanchan.java.designpatterns.adapterpattern;

/**
 * @author kumark
 *
 */
public class StrategyFloatAdapter{

	private Strategy strategy;
	/**
	 * 
	 */
	public StrategyFloatAdapter(Strategy strategy) {
		this.strategy = strategy;
	}
	
	/* (non-Javadoc)
	 * @see com.kanchan.java.designpatterns.adapterpattern.Strategy#doOperation(int, int)
	 */
	
	public float doOperation(float x, float y) {
		System.out.println("two floats numbers are " + x + " and " +y);
		Float.floatToIntBits(x);
		return this.strategy.doOperation(Float.floatToIntBits(x), Float.floatToIntBits(y));
	}

}
