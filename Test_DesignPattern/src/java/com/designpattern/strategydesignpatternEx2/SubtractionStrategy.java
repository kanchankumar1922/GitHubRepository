/**
 * 
 */
package com.designpattern.strategydesignpatternEx2;

/**
 * @author kumark
 *
 */
public class SubtractionStrategy implements Strategy {

	/* (non-Javadoc)
	 * @see com.designpattern.strategydesignpatternEx2.Strategy#doCalculation(int, int)
	 */
	@Override
	public int doCalculation(int i, int j) {
		System.out.println("This is subtracting two numbers");
		return i - j;
	}

}
