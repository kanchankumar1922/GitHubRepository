/**
 * 
 */
package com.designpattern.adapterdesignpattern2ndexample;

/**
 * @author kumark
 *
 */
public interface MediaPlayer {	
	public void play(String mediaFileName , String type) throws InvalidMediaTypeOrFileNameException;

}
