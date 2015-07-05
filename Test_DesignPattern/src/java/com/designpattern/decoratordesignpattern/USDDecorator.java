/**
 * 
 */
package com.designpattern.decoratordesignpattern;

/**
 * @author kumark
 *
 */
public class USDDecorator extends Decorator {

	 Currency currency;
	 

	 public USDDecorator(Currency currency){
	  this.currency = currency;
	 }


	 public String getDescription(){
	  return currency.getDescription()+" ,its US Dollar";
	 }


	@Override
	public double cost(double value) {
		// TODO Auto-generated method stub
		return currency.cost(value);
	}



}
