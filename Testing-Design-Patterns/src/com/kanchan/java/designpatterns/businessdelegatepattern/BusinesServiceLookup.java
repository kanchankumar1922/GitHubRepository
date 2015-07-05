/**
 * 
 */
package com.kanchan.java.designpatterns.businessdelegatepattern;

/**
 * @author kumark
 *
 */
public class BusinesServiceLookup {
	
	public BusinessService getBusinessService(String businessName){
		if(null != businessName && businessName != "" && businessName.equalsIgnoreCase("JMS")) return new JMSBusinessService();
		else if(null != businessName && businessName != "" && businessName.equalsIgnoreCase("EJB")) return new EJBBusinessService();
		else return null;
	}

}
