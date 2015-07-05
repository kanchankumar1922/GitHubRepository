package com.designpattern.servicelocatorcachepattern;

public class ServiceLocatorDesignPatternCacheCheckMain {

	public static void main(String[] args) {
		
		try {
			Service mbService =  ServiceLocator.getService("MobileService");
			mbService.execute();
			Service auService =  ServiceLocator.getService("AutomotiveService1");
			auService.execute();
			
			Service mbService2 =  ServiceLocator.getService("MobileService");
			Service auService2 =  ServiceLocator.getService("AutomotiveService");
			
		} catch (ServiceNotFoundException e) {
			System.out.println( e.getErrorMessage() );
			e.printStackTrace();
		}

	}

}
