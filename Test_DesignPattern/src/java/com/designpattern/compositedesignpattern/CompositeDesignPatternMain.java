/**
 * 
 */
package com.designpattern.compositedesignpattern;

/**
 * @author kumark
 * 		Read more at http://javapostsforlearning.blogspot.com/2012/09/composite-design-pattern-in-java.html#R0txGCX4G1iQcD8Q.99 
 */
public class CompositeDesignPatternMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		  Employee emp1 = new Developer("John-D", 10000);  
		  Employee emp2 = new Developer("David-D", 15000);  
		  Employee manager1 = new Manager("Daniel-M",25000);  
		  
		  manager1.add(emp1);  
		  manager1.add(emp2);
		  
		  Employee developer1 = new Developer("Michael-D", 20000);  
		  Employee developer2 = new Developer("Brown-D", 20000);  
		  
		  Developer dev = new Developer("TEST", 0);
		  
		  Employee generalManager = new Manager("Mark-GM", 50000);  
		  generalManager.add(developer1);  
		  generalManager.add(developer2);
		  generalManager.add(manager1); 
		  
		  Employee vicePresident = new VicePresident("OBAMA-VP" , 100000);
		  
		  vicePresident.add(generalManager);
		  vicePresident.print();


	}

}
