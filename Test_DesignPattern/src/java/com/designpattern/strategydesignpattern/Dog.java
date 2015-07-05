/**
 * 
 */
package com.designpattern.strategydesignpattern;

/**
 * @author kumark
 *
 */
public class Dog extends Animal {

	/**
	 * 
	 */
	public Dog() {
		super();
		setFlyInterfaceType(new ICanNotFly());
	}

}
