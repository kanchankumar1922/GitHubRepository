/**
 * 
 */
package com.designpattern.adapterdesignpattern2ndexample;

/**
 * @author kumark
 *
 */
public class MediaAdapter implements MediaPlayer {

	private AdvancedMediaPlayer advancedMediaPlayer;
	
	public MediaAdapter(String mediaType){
		if(mediaType.equalsIgnoreCase("mp4")) advancedMediaPlayer = new Mp4MediaPlayer();
		if(mediaType.equalsIgnoreCase("mpeg")) advancedMediaPlayer = new MpegPlayer();
	}
	
	
	/* (non-Javadoc)
	 * @see com.designpattern.adapterdesignpattern2ndexample.MediaPlayer#play(java.lang.String, java.lang.String)
	 */
	@Override
	public void play(String mediaFileName, String type)	throws InvalidMediaTypeOrFileNameException {
           
		if(type.equalsIgnoreCase("mp4")) advancedMediaPlayer.playMp4(mediaFileName, type);
		if(type.equalsIgnoreCase("mpeg")) advancedMediaPlayer.playMpeg(mediaFileName, type);
	}

}
