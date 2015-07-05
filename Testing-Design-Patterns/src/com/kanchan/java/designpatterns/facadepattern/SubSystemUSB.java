/**
 * 
 */
package com.kanchan.java.designpatterns.facadepattern;

/**
 * @author kumark
 *
 */
public class SubSystemUSB extends SubSystem {

	private boolean isUSBStartedSuccessfully = false;
	
	@Override
	public void startSubSystem() throws ComputerSubsystemExecutionException{
		 System.out.println("THE SUBSYSTEM USB STARTING.....");
		 isUSBStartedSuccessfully = true;
			if(!isUSBStartedSuccessfully) throw new USBFailureException("EXCEPTION IN STARTING USB SUBSYSTEM");
	}

}
