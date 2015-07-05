/**
 * 
 */
package com.kanchan.java.designpatterns.businessdelegatepattern;

/**
 * @author kumark
 *
 */
public class Client {
	
	private BusinessServiceDelegate businessServiceDelegate;
	
	public Client(BusinessServiceDelegate bsd){
		this.businessServiceDelegate = bsd;
	}
	
	public void doTask(){
		this.businessServiceDelegate.doTask();
	}

}
