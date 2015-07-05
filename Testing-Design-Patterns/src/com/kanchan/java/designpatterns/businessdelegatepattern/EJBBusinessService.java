package com.kanchan.java.designpatterns.businessdelegatepattern;

public class EJBBusinessService implements BusinessService {

	@Override
	public void doProcessing() {
      System.out.println("Processign service " + EJBBusinessService.class.getSimpleName());
	}

}
