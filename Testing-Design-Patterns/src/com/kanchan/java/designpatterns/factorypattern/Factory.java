/**
 * 
 */
package com.kanchan.java.designpatterns.factorypattern;

/**
 * @author kumark
 *
 */
public class Factory {
	
	public static Object createInstance(String animalName) throws AnimalCreationException{
		if(animalName.equalsIgnoreCase("CAT"))return new Cat();
		else if(animalName.equalsIgnoreCase("DOG"))return new Dog();
		else {
			throw new AnimalCreationException("Can not create the animail " + animalName);
		}
		
	}

}
