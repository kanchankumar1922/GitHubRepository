/**
 * 
 */
package com.designpattern.facadedesignpattern2ndexample;

/**
 * @author kumark
 *
 */
public class ComputerMemory {
	
	private boolean isMemoryLoaded = false;
	
	public void loadComputerMomory() throws ComputerMemoryStartException{
		{
			System.out.println("Loading computer memory....");
			isMemoryLoaded = true;
		}
		if(!isMemoryLoaded)
		throw new ComputerMemoryStartException("Some weired fault happened in Memory while booting the computer");
	}

}
