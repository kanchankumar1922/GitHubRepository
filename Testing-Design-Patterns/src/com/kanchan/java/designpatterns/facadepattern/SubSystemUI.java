package com.kanchan.java.designpatterns.facadepattern;

public class SubSystemUI extends SubSystem{

	private boolean isUIStartedSuccessfully = false;
	
	@Override
	public void startSubSystem() throws ComputerSubsystemExecutionException{
		System.out.println("THE SUBSYSTEM UI STARTING.....");
		isUIStartedSuccessfully = true;
		if(!isUIStartedSuccessfully) throw new UIFailureException("EXCEPTION IN STARTING USER INTERFACE SUBSYSTEM");
	}

}
