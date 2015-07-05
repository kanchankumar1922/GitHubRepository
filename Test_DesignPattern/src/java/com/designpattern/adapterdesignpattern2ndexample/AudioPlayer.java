/**
 * 
 */
package com.designpattern.adapterdesignpattern2ndexample;

import java.io.File;

/**
 * @author kumark
 *
 */
public class AudioPlayer implements MediaPlayer {

	private MediaPlayer mediaPlayer;
	/* (non-Javadoc)
	 * @see com.designpattern.adapterdesignpattern2ndexample.MediaPlayer#play(java.lang.String, java.lang.String)
	 */
	@Override
	public void play(String mediaFileName, String type)	throws InvalidMediaTypeOrFileNameException {
		
		if(type.equalsIgnoreCase("mp3")) {
			File mediaFile = new File(mediaFileName);
			mediaFile.getAbsolutePath();
			System.out.println("Playing mp3 file ::");
		}
		else if(type.equalsIgnoreCase("mp4") || type.equalsIgnoreCase("mpeg")){
			mediaPlayer = new MediaAdapter(type);
			mediaPlayer.play(mediaFileName, type);
		}
		else{
			System.out.println("invalid media type");
			throw new InvalidMediaTypeOrFileNameException("media type is not correct");
		}
      System.out.println("this is Audio Player ::");
	}

}
