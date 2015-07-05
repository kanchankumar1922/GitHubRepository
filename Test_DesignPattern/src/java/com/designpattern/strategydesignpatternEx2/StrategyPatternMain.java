/**
 * 
 */
package com.designpattern.strategydesignpatternEx2;

/**
 * @author kumark
 *
 */
public class StrategyPatternMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Context context = new Context(new AddingStrategy());
		System.out.println("Adding :: " + context.executeOpetration(2, 5) );
		
		context.setOperationalStrategy(new SubtractionStrategy());
	    System.out.println("Subtracting :: " + context.executeOpetration(2, 5));	
	
		

	}

}
