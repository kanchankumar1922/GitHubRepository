package com.kanchan.java.designpatterns.servicelocatorpattern;

public class MobileService implements Service {

	@Override
	public String getServiceName() {
		return MobileService.class.getSimpleName();
	}

	@Override
	public void executeService() {
    System.out.println("Executing service " + getServiceName());
	}

}
