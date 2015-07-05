/**
 * 
 */
package com.designpattern.decoratordesignpattern;

/**
 * @author kumark
 *
 */
public class Rupee extends Currency {

	double value;

	 public Rupee() {
	  description = "indian rupees";
	 }

	 public double cost(double v){
	  value = v;
	  return this.value;
	 }

}
