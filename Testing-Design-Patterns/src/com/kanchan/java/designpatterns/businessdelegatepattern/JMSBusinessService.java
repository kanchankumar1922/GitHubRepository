package com.kanchan.java.designpatterns.businessdelegatepattern;

public class JMSBusinessService implements BusinessService {

	@Override
	public void doProcessing() {
      System.out.println("Processign service " + JMSBusinessService.class.getSimpleName());
	}

}
