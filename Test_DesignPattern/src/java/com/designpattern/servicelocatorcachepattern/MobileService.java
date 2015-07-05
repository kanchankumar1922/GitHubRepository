/**
 * 
 */
package com.designpattern.servicelocatorcachepattern;

/**
 * @author kumark
 *
 */
public class MobileService implements Service {

	
	@Override
	public String getServiceName() {
		return MobileService.class.getSimpleName();
	}

	
	@Override
	public void execute() {
		System.out.println("Executing service " + MobileService.class.getSimpleName());
	}

}
