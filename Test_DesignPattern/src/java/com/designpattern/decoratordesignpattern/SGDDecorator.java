/**
 * 
 */
package com.designpattern.decoratordesignpattern;

/**
 * @author kumark
 *
 */
public class SGDDecorator extends Decorator {
	 Currency currency;

	 public SGDDecorator(Currency currency){
	  this.currency = currency;
	 }


	 public String getDescription(){
	  return currency.getDescription()+" ,its singapore Dollar";
	 }


	@Override
	public double cost(double value) {
		// TODO Auto-generated method stub
		return currency.cost(value);
	}


}
