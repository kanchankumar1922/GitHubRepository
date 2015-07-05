/**
 * 
 */
package com.examples.collections.sortexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.designpattern.filterdesignpattern.Person;

/**
 * @author kumark
 *
 */
public class CollectionSortClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> listOfStrings = new ArrayList<String>();
		List<Integer> listOfInts = new ArrayList<Integer>();
		List<Float> listOfFlots = new ArrayList<Float>();
		
		listOfStrings.add("KANA");
		listOfStrings.add("DANA");
		listOfStrings.add("MANA");
		listOfStrings.add("AANA");
		listOfStrings.add("JANA");
		listOfStrings.add("CHANA");
		
		listOfInts.add(12);
		listOfInts.add(100);
		listOfInts.add(1);
		listOfInts.add(29);
		listOfInts.add(2);
		listOfInts.add(89);
		
		listOfFlots.add(12.433333F);
		
		Float f = 12.35345245454654654365635634545F;
		Double d = 12.35345245454654654365635634545;
		System.out.println(f);
		System.out.println(d);
		
		float f1=3.25433f;  
	    float f2=6.5f;  

	    if(f == 3.25433f)  
	      System.out.println("same");  
	    else  
	      System.out.println("different");  

	    if(f2 == 6.5)  
	      System.out.println("same");  
	    else  
	      System.out.println("different");  
		
		System.out.println("String before: -------------");
		printStringDetails(listOfStrings);
		Collections.sort(listOfStrings);
		System.out.println("String after: -------------");
		printStringDetails(listOfStrings);
		
		System.out.println(listOfInts);
		Collections.sort(listOfInts);
		System.out.println(listOfInts);
		
		
	}
	
	public static void printPersonDetails(List<Person> persons){
		for(Person person : persons){
			System.out.println("Person : [ Name : " + person.getName() +", Gender : " + person.getGrnder() +", Marital Status : " + person.getMaritialStatus() +" ]");
		}
	}
	
	public static void printStringDetails(List<String> listStrings){
		for(String str : listStrings){
			System.out.println( str);
		}
	}

}
