/**
 * 
 */
package com.designpattern.strategydesignpattern;

/**
 * @author kumark
 *
 */
public class StrategyPaternTestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Animal tommyDog = new Dog();
		Animal sweetyBird = new Bird();
		
		System.out.println("tommyDog :: " + tommyDog.tryToFly());
		System.out.println("sweetyBird :: " + sweetyBird.tryToFly());
		
		tommyDog.setFlyInterfaceType(new ICanFly());
		
		System.out.println("tommyDog :: " + tommyDog.tryToFly());

	}

}
