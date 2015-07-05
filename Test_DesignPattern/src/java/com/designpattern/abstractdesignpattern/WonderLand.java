/**
 * 
 */
package com.designpattern.abstractdesignpattern;

/**
 * @author kumark
 *
 */
public class WonderLand {
	
	public WonderLand(AnimalFactory animalFactory){
	     Animal animal = animalFactory.createAnimal();
	     animal.breathe();
	}

}
