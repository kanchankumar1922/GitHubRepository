/**
 * 
 */
package com.examples.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kumark
 * 
 */
public class AnimalDoctorGeneric {
	// change the argument from Animal[] to ArrayList<Animal>
	public void checkAnimals(List<Animal> animals) {
		for (Animal a : animals) {
			a.checkup();
		}
	}
	public void addAnimal(List<? extends Animal> animals){
		//animals.add(new)
	}

	public static void main(String[] args) {
		// make ArrayLists instead of arrays for Dog, Cat, Bird
		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog());
		dogs.add(new Dog());
		List<Cat> cats = new ArrayList<Cat>();
		cats.add(new Cat());
		cats.add(new Cat());
		List<Bird> birds = new ArrayList<Bird>();
		birds.add(new Bird());
		
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Dog());
		animals.add(new Bird());
		animals.add(new Cat());
		// this code is the same as the Array version
		AnimalDoctorGeneric docAnimalDoctorGeneric = new AnimalDoctorGeneric();
		// This doesnt work when the List of SubType
		/*
		docAnimalDoctorGeneric.checkAnimals(dogs); // send a List<Dog>
		docAnimalDoctorGeneric.checkAnimals(cats); // send a List<Cat>
		docAnimalDoctorGeneric.checkAnimals(birds); // send a List<Bird>
		*/
		
		// This does work when the List of SubType
		
		docAnimalDoctorGeneric.checkAnimals(animals);
	}
}
