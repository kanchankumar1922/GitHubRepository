package com.kanchan.java.designpatterns.servicelocatorpattern;

public class BankingService implements Service {

	@Override
	public String getServiceName() {
		return BankingService.class.getSimpleName();
	}

	@Override
	public void executeService() {
    System.out.println("Executing service " + getServiceName());
	}

}
