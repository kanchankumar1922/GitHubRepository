package com.designpattern.filterdesignpattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class FilterDesignPatternMain {
	
	public static void main(String [] args){
		
		Person maleSingle     = new Person("KAKA", "SINGLE", "MALE");
		Person maleSingle1    = new Person("MANOJ", "SINGLE", "MALE");
		Person femaleSingle   = new Person("SANGEETA", "SINGLE", "FEMALE");
		Person femaleMarried  = new Person("PUZA", "MARRIED", "FEMALE");
		Person maleMarried 	  = new Person("RAMESH", "MARRIED", "MALE");
		Person femaleSingle1  = new Person("MEENA", "SINGLE", "FEMALE");
		Person maleMarried1   = new Person("SACHDEV", "MARRIED", "MALE");
		Person femaleSingle2  = new Person("KISHORI", "SINGLE", "FEMALE");
		Person femaleMarried3 = new Person("KUSUM", "MARRIED", "FEMALE");
		
		List<Person> listOfPerson = new ArrayList<Person>();
		
		
		listOfPerson.add(femaleMarried3);
		listOfPerson.add(femaleSingle2);
		listOfPerson.add(maleMarried1);
		listOfPerson.add(femaleSingle1);
		listOfPerson.add(maleMarried);
		listOfPerson.add(femaleMarried);
		listOfPerson.add(femaleSingle);
		listOfPerson.add(maleSingle1);
		listOfPerson.add(maleSingle);
		
		
		
	    
		
		Criteria criteriaMan          = new CriteriaMan();
		Criteria criteriaWomen        = new CriteriaWomen();
		Criteria criteriaMarried      = new CriteriaMarried();
		Criteria criteriaSingle       = new CriteriaSingle();
		Criteria criteriaMaleMarried  = new CriteriaMaleMarried();
		Criteria criteriaFemaleMarried  = new CriteriaFemaleMarried();
				
	    System.out.println("Males: ----------------------");
		printPersonDetails ( criteriaMan.meetCriterea(listOfPerson) );
		System.out.println("Females: --------------------");
		printPersonDetails ( criteriaWomen.meetCriterea(listOfPerson) );
		System.out.println("Single: ---------------------");
		printPersonDetails ( criteriaSingle.meetCriterea(listOfPerson) );
		System.out.println("Married: --------------------");
		printPersonDetails ( criteriaMarried.meetCriterea(listOfPerson) );
		System.out.println("Males married: --------------");
		printPersonDetails ( criteriaMaleMarried.meetCriterea(listOfPerson) );
		System.out.println("Female married: -------------");
		printPersonDetails ( criteriaFemaleMarried.meetCriterea(listOfPerson) );
		
		
		
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
