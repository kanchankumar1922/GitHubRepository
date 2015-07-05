/**
 * 
 */
package com.designpattern.proxydesignpattern;

/**
 * @author kumark
 *
 */
public class HighResolutionImage implements Image{

	
	
	public HighResolutionImage(String imageFilePath) {
		loadImage(imageFilePath);
	}
	
	private void loadImage(String imageFilePath){
		
		System.out.println("Loading the high resolution image with path  " + imageFilePath);
	}
	@Override
	public void showImage() {
		System.out.println("Showing High Definition logic for High Resolution Image");
		
	}	
	

}
