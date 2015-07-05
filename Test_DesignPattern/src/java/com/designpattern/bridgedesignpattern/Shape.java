/**
 * 
 */
package com.designpattern.bridgedesignpattern;

/**
 * @author kumark
 *
 */
public abstract class Shape {
	
	protected DrawAPI drawAPI;
	
	public Shape(DrawAPI drawAPI){
		System.out.println("in Shape constructor");
		this.drawAPI = drawAPI;
	}
	
	public abstract void draw();

}
