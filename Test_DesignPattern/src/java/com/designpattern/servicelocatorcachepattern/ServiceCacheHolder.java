package com.designpattern.servicelocatorcachepattern;

import java.util.ArrayList;
import java.util.List;

public class ServiceCacheHolder {
	
	private List<Service> listOfServices;
	
	public ServiceCacheHolder() {
		//listOfServices = new ArrayList<Service>();
	}
	
	public Service getService(String serviceName){
		if(null != listOfServices)
		for(Service serv : listOfServices){
			if(null != serv && serv.getServiceName().equalsIgnoreCase(serviceName)){
				System.out.println("Returning Cached Service Object :: " + serviceName);
				return serv;
				}
		}
		return null;
	}
	
	public void addService(Service service){
		boolean isServiceExist = false;
		if(null != listOfServices)
		for(Service serv : listOfServices){
			if(serv.getServiceName().equalsIgnoreCase(service.getServiceName()))
			isServiceExist = true;
		}
		if(!isServiceExist && null != listOfServices){
			System.out.println("Adding service for first time " + service);
			listOfServices.add(service);
		}
	}
	
	

}
