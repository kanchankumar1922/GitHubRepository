/**
 * 
 */
package com.designpattern.nullobjectdesignpattern;

/**
 * @author kumark
 *
 */
public class CustomerFactory {
	
	private static final String [] names = {"LAMPAT" , "KANUA" , "SHYAM" , "KANU"};
	
	public static AbstractCustomer getCustomer(String customerName){
		for(String name : names){
			if(name.equalsIgnoreCase(customerName)) return new ConcreteCustomer(customerName);			
		}
		return new NullCustomer();
	}

}
