package com.designpattern.servicelocatorcachepattern;

public class AutomotiveService implements Service {

	
	@Override
	public String getServiceName() {
		return AutomotiveService.class.getSimpleName();
	}

	@Override
	public void execute() {
      System.out.println("Executing service " + AutomotiveService.class.getSimpleName());
	}

}
