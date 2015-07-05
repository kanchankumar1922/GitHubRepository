/**
 * 
 */
package com.designpattern.decoratordesignpattern;

/**
 * @author kumark
 *
 */
public class CurrencyCheck {

	public static void main(String[] args) {

		  // without adding decorators

		  Currency curr = new Dollar();

		  System.out.println(curr.getDescription() +" dollar. "+curr.cost(2.0));

		  

		  

		  //adding decorators

		  Currency curr2 = new USDDecorator(new Dollar());
		  Currency curr3 = new SGDDecorator(new Rupee());
		  System.out.println(curr2.getDescription() +" dollar. "+curr2.cost(4.0));

		

		  System.out.println(curr3.getDescription() +" dollar. "+curr3.cost(6.0));

   }
  
}
