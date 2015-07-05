package com.designpattern.servicelocatorcachepattern;

public class ServiceLocator {
	
	private static ServiceCacheHolder serviceCacheHolder;
	
	static {
		serviceCacheHolder = new ServiceCacheHolder();
	}
	
	public static Service getService(String jndiName) throws ServiceNotFoundException{
		Service service = serviceCacheHolder.getService(jndiName);
		if(null != service) return service;
		
		InitialServiceContext initialServiceContext = new InitialServiceContext();
		 Service service1 = (Service) initialServiceContext.lookup(jndiName);
		 serviceCacheHolder.addService(service1);
		 return service1;
	}

}
