package com.designpattern.facadedesignpattern2ndexample;

public class ComputerHardDrive {
	
	static{
		
	}
	
	public void startHardDrive() throws ComputerStartingException{
		boolean isHDLoaded = false;
		 {
		  System.out.println("Starting the hard drive .....");
		  isHDLoaded = true;
		 }
		 if(!isHDLoaded) throw new ComputerStartingException("Hadrdrive failed to load...");
	}

}
