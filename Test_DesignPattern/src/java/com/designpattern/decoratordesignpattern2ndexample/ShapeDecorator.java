package com.designpattern.decoratordesignpattern2ndexample;

public class ShapeDecorator implements Shape {
	private Shape shape;
	
	public ShapeDecorator(Shape shapeObject){
		this.shape = shapeObject;
	}

	@Override
	public void draw() {
       this.shape.draw();
       setRedBroder();
	}
	
	private void setRedBroder(){
		System.out.println(this.shape.getClass().getSimpleName() + " has Red border" );
	}

}
