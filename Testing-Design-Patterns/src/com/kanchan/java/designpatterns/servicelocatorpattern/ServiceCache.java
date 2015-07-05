/**
 * 
 */
package com.kanchan.java.designpatterns.servicelocatorpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kumark
 *
 */
public class ServiceCache {
	
	private List<Service> listOfServices;
	
	public ServiceCache(){
		this.listOfServices = new ArrayList<Service>();
	}
	
	public void addService(Service service){
		boolean exist = false;
		for(Service serv : listOfServices){
			if( serv.getServiceName().equalsIgnoreCase(service.getServiceName()) ) exist = true;
		}
		if(!exist) listOfServices.add(service);
	}
	
	public Service getService(String serviceName){
		for(Service serv : listOfServices){
			if(serv.getServiceName().equalsIgnoreCase(serviceName)){
				System.out.println("service found ...returnign from cache");
				return serv;
			}
		}
		
		return null;
		
	}

}
