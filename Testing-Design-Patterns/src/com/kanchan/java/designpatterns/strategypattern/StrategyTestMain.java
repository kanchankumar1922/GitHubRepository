/**
 * 
 */
package com.kanchan.java.designpatterns.strategypattern;

/**
 * @author kumark
 *
 */
public class StrategyTestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Context context = new Context(new AddingStrategy());
		System.out.println( context.executeOperation(10, 5) );
		
		context.setStrategy(new SubtractionStrategy());
		System.out.println( context.executeOperation(10, 5) );

	}

}
