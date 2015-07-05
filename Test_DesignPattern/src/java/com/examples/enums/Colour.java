package com.examples.enums;
/**
 * 
 */

/**
 * @author kumark
 *
 */
public enum Colour {
	RED (),
	BLUE ("rgb_blue_101"),
	GREEN ("rgb_green_101"),
	YELLOW(100);
	
	private String colourCode;
	private int colorId;
	
	private Colour(String colour){
		this.colourCode = colour;
	}
	private Colour(){
		//this.colourCode = colour;
	}
	private Colour(int colorId){
		this.colorId = colorId;
	}
	/**
	 * @return the colourCode
	 */
	public String getColourCode() {
		return colourCode;
	}
	/**
	 * @param colourCode the colourCode to set
	 */
	public void setColourCode(String colourCode) {
		this.colourCode = colourCode;
	}
	
	

}
