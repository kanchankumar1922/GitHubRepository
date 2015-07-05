package com.examples.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {

	 public static void main(String[] args){
		 
		 List<Dog> animals = new ArrayList<Dog>();
		 
		 
		 List<?> list = new ArrayList<Dog>();
		 List<? extends Animal> aList = new ArrayList<Dog>();
		 //List<?> foo = new ArrayList<? extends Animal>();
		 //List<? extends Dog> cList = new ArrayList<Integer>();
		 List<? super Dog> bList = new ArrayList<Animal>();
		 //List<? super Animal> dList = new ArrayList<Dog>();
		 
		 animals.add(new Dog());
		 animals.add(new Dog());
		 AnimalDoctorGeneric doc = new AnimalDoctorGeneric();
		 doc.addAnimal(animals);
	 }
}
