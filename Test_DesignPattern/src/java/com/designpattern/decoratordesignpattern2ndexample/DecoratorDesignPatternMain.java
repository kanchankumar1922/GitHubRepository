/**
 * 
 */
package com.designpattern.decoratordesignpattern2ndexample;

/**
 * @author kumark
 *
 */
public class DecoratorDesignPatternMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Shape circle = new Circle();
		Shape rectangle = new Rectangle();
		System.out.println("-------Simple Shape object with no red border -------");
		circle.draw();
		rectangle.draw();
		System.out.println("\n-------Decorated Shape object with no red border -------");
		
		ShapeDecorator circleShapeDecorator = new ShapeDecorator(circle);
		ShapeDecorator rectangleShapeDecorator = new ShapeDecorator(rectangle);
		
		circleShapeDecorator.draw();
		rectangleShapeDecorator.draw();

	}

}
