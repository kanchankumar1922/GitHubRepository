/**
 * 
 */
package com.designpattern.adapterdesignpattern2ndexample;

/**
 * @author kumark
 *
 */
public class AdapterDesignPatterCheckMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MediaPlayer mediaPlayer = new AudioPlayer();
		try {
			mediaPlayer.play("song.mp3", "mp4");
		} catch (InvalidMediaTypeOrFileNameException e) {
			System.out.println( e.getErrorMessage() );
			e.printStackTrace();
		}

	}

}
