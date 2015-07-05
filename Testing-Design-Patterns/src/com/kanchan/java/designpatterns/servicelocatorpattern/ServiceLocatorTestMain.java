/**
 * 
 */
package com.kanchan.java.designpatterns.servicelocatorpattern;

/**
 * @author kumark
 *
 */
public class ServiceLocatorTestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Service service = ServiceLocator.getService("bankingservice");
        service.executeService();
        
        service = ServiceLocator.getService("bankingservice");
        service.executeService();
	}

}
