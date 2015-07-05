/**
 * 
 */
package com.designpattern.strategydesignpatternEx2;

/**
 * @author kumark
 *
 */
public class AddingStrategy implements Strategy {

	/* (non-Javadoc)
	 * @see com.designpattern.strategydesignpatternEx2.Strategy#doCalculation(int, int)
	 */
	@Override
	public int doCalculation(int i, int j) {
		System.out.println("The is the adding two numbers");
		return i + j;
	}

}
