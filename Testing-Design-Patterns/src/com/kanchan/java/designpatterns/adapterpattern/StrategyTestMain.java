/**
 * 
 */
package com.kanchan.java.designpatterns.adapterpattern;

/**
 * @author kumark
 *
 */
public class StrategyTestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Strategy addingStrategy = new AddingStrategy();
		Strategy subtractingStrategy = new SubtractionStrategy();
		
		Context context = new Context(addingStrategy);
		System.out.println( context.executeOperation(10, 5) );
		
		context.setStrategy(subtractingStrategy);
		System.out.println( context.executeOperation(10, 5) );
		
		System.out.println( context.executeOperation(10.96f, 5.85f) );
		
		System.out.println( Math.round(10.49f) );
		
		/*StrategyFloatAdapter strategyFloatAdapter = new StrategyFloatAdapter(addingStrategy);
		System.out.println( strategyFloatAdapter.doOperation(10.76f, 5.4f) );*/

	}

}
