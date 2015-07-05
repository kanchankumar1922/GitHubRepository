package com.designpattern.servicelocatorcachepattern;

public class InitialServiceContext {
	
	public Object lookup(String jndiName) throws ServiceNotFoundException{
		if(jndiName.equalsIgnoreCase(MobileService.class.getSimpleName())) return new MobileService();
		else if(jndiName.equalsIgnoreCase(AutomotiveService.class.getSimpleName())) return new AutomotiveService();
		else throw new ServiceNotFoundException("The service named [" + jndiName + "] is not valid");
//		/return null;
	}

}
