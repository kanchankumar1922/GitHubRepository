/**
 * 
 */
package com.designpattern.commanddesignpattern;

/**
 * @author kumark
 *
 */
public class Stock {
	
	private String name = "TestStock";
	private int quantity = 10;
	
	public void buy(){
		System.out.println(" The Stock [ name : " + name + ", quantity : " + quantity +" ] is bought");
	}
	
	public void sell(){
		System.out.println(" The Stock [ name : " + name + ", quantity : " + quantity +" ] is sold out");
	}
	

}
