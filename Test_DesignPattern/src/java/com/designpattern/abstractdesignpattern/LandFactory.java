/**
 * 
 */
package com.designpattern.abstractdesignpattern;

/**
 * @author kumark
 *
 */
public class LandFactory implements AnimalFactory {

	@Override
	public Animal createAnimal() {
		return new Elephant();
	}
       
}
