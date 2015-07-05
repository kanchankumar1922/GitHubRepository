/**
 * 
 */
package com.designpattern.abstractdesignpattern;

/**
 * @author kumark
 *
 */
public class Elephant implements Animal {

	/* (non-Javadoc)
	 * @see com.designpattern.abstractdesignpattern.Animal#breathe()
	 */
	@Override
	public void breathe() {
		System.out.println("I breathe In Land :) I am an " + Elephant.class.getSimpleName());

	}

}
