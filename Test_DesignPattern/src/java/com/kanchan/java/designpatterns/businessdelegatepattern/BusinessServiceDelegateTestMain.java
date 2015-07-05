/**
 * 
 */
package com.kanchan.java.designpatterns.businessdelegatepattern;

/**
 * @author kumark
 *
 */
public class BusinessServiceDelegateTestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		BusinessServiceDelegate businessServiceDelegate = new BusinessServiceDelegate();
		businessServiceDelegate.setBusinessServiceType("JMS");
		
		Client client = new Client(businessServiceDelegate);
		client.doTask();
		
		businessServiceDelegate.setBusinessServiceType("EJB");
		client.doTask();

	}

}
