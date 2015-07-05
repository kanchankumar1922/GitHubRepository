/**
 * 
 */
package com.designpattern.builderdesignpattern;

/**
 * @author kumark
 *
 */
public class BuilderDesignPatternExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Cake cake = new Cake.Builder().bakingpowder(2.0).butter(2.0).cherry(2).eggs(2).flour(2.0).milk(2.0).sugar(2.0).vanila(2).build();
		System.out.println(cake);

	}

}
