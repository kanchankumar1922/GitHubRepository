/**
 * 
 */
package com.designpattern.bridgedesignpattern;

/**
 * @author kumark
 *
 */
public class BridgeDesignPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Shape circleRed =  new Circle(10, 5, 8, new RedCircle());
		Shape circleGreen =  new Circle(5, 4, 2, new GreenCircle());

		circleRed.draw();
		circleGreen.draw();
		
		//new RedCircle().drawCircle(10, 5, 8);
	}

}
