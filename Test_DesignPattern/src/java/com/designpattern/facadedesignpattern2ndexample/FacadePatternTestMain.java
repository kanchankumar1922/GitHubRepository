/**
 * 
 */
package com.designpattern.facadedesignpattern2ndexample;

import java.util.logging.Logger;

/**
 * @author kumark
 *
 */
public class FacadePatternTestMain {

	private static Logger log  = Logger.getLogger(FacadePatternTestMain.class.getSimpleName());
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		FacadePatternComputer facadePatternComputer = new FacadePatternComputer();
		
		try {
			facadePatternComputer.startComputer();
		} catch (ComputerStartingException e) {
			log.severe(e.getMessage());
			e.printStackTrace();
		}
		

	}

}
