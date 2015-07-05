/**
 * 
 */
package com.designpattern.decoratordesignpattern;

/**
 * @author kumark
 *
 */
public class Dollar extends Currency {

	double dollarValue;

	 public Dollar () {
	  description = "Dollar";
	 }

	public double cost(double v){
	   this.dollarValue = v;
	  return this.dollarValue;

	 }



}
