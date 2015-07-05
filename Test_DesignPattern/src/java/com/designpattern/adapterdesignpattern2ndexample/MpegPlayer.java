/**
 * 
 */
package com.designpattern.adapterdesignpattern2ndexample;

/**
 * @author kumark
 *
 */
public class MpegPlayer implements AdvancedMediaPlayer {

	/* (non-Javadoc)
	 * @see com.designpattern.adapterdesignpattern2ndexample.AdvancedMediaPlayer#playMp4(java.lang.String, java.lang.String)
	 */
	@Override
	public void playMp4(String mp4FileName, String type) {
		// Doing nothing here

	}

	/* (non-Javadoc)
	 * @see com.designpattern.adapterdesignpattern2ndexample.AdvancedMediaPlayer#playMpeg(java.lang.String, java.lang.String)
	 */
	@Override
	public void playMpeg(String mpegFileName, String type) {
		 System.out.println("playing mpeg file ::");

	}

}
