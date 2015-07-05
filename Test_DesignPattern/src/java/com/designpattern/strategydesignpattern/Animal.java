/**
 * 
 */
package com.designpattern.strategydesignpattern;

/**
 * @author kumark
 *
 */
public class Animal {
	
	private String color;
	private String height;
	private String name;
	
	private FlyableInterface flyInterfaceType;
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the height
	 */
	public String getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(String height) {
		this.height = height;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	public String tryToFly(){
		return flyInterfaceType.fly();
	}
	
	public void setFlyInterfaceType(FlyableInterface newFlyInterfaceType){
		this.flyInterfaceType = newFlyInterfaceType;
	}
	

}
