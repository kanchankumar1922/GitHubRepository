/**
 * 
 */
package com.designpattern.proxydesignpattern;

/**
 * @author kumark
 *
 */
public class ImageProxy implements Image {

	private String imageLocation;
	private Image highResolutionImage;
	
	public ImageProxy(String imageLocation) {
		System.out.println("IMAGE proxy is saving the location of the file .. wnd when required it will load the image when requested::");
		this.imageLocation = imageLocation;
	}

	/* (non-Javadoc)
	 * @see com.designpattern.proxydesignpattern.Image#showImage()
	 */
	@Override
	public void showImage() {
		System.out.println("Image load requested in Image Proxy");
		highResolutionImage = new HighResolutionImage(this.imageLocation);
		highResolutionImage.showImage();
	}

}
