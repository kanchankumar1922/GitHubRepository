/**
 * 
 */
package com.designpattern.bridgedesignpattern;

/**
 * @author kumark
 *
 */
public class Circle extends Shape {

	private int radius;
	private int x;
	private int y;
	public Circle(int radius , int x , int y , DrawAPI drawAPIObject) {
		super(drawAPIObject);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	/* (non-Javadoc)
	 * @see com.designpattern.bridgedesignpattern.Shape#draw()
	 */
	@Override
	public void draw() {
		if(null != drawAPI)
		drawAPI.drawCircle(radius, x, y);

	}

}
