/**
 * 
 */
package com.designpattern.nullobjectdesignpattern;

/**
 * @author kumark
 *
 */
public class NullDesignPatternMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		AbstractCustomer customer1 = CustomerFactory.getCustomer("KAMAL");		
		System.out.println( "CUSTOMER NAME - " + customer1.getName() + ", IS OBJECT NULL ?? " +customer1.isNull());
		AbstractCustomer customer2 = CustomerFactory.getCustomer("KANU");
		System.out.println( "CUSTOMER NAME - " + customer2.getName() + ", IS OBJECT NULL ?? " +customer2.isNull());
        
	}

}
