/**
 * 
 */
package com.designpattern.abstractdesignpattern;

/**
 * @author kumark
 *
 */
public class Shark implements Animal {

	/* (non-Javadoc)
	 * @see com.designpattern.abstractdesignpattern.Animal#breathe()
	 */
	@Override
	public void breathe() {
		System.out.println("I breathe In Water :) I am a "  + Shark.class.getSimpleName());
	}

}
