/**
 * 
 */
package com.designpattern.strategydesignpattern;

/**
 * @author kumark
 *
 */
public class Bird extends Animal {

	/**
	 * 
	 */
	public Bird() {
		super();
		setFlyInterfaceType(new ICanFly());
	}

}
