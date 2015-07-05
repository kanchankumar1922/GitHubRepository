package com.kanchan.java.designpatterns.facadepattern;

public class SubSystemHD extends SubSystem {

	private boolean isHDStartedSuccessfully = false;
	
	@Override
	public void startSubSystem() throws ComputerSubsystemExecutionException{
		System.out.println("THE SUBSYSTEM HD STARTING.....");
		// code to start HARD DRIVE 
			{
				isHDStartedSuccessfully = false;
			}
		if(!isHDStartedSuccessfully) throw new HDFailureException("EXCEPTION IN STARTING HARD DRIVE SUBSYSTEM");
		
	}

}
