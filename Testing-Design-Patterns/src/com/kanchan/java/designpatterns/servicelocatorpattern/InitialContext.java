/**
 * 
 */
package com.kanchan.java.designpatterns.servicelocatorpattern;

/**
 * @author kumark
 *
 */
public class InitialContext {
	
	public Object lookup(String jndiName){
		if(null != jndiName && jndiName.equalsIgnoreCase("bankingservice")) return new BankingService();
		else if(null != jndiName && jndiName.equalsIgnoreCase("mobileservice")) return new MobileService();
		else return null;
	}

}
