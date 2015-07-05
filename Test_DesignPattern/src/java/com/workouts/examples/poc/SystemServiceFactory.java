/**
 * 
 */
package com.workouts.examples.poc;

/**
 * @author kumark
 *
 */
public class SystemServiceFactory {
	
	private SystemServiceFactory(){
		
	}

	public static Object getSystemService(Class ssp) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		
		return (SystemServicePlatform)Class.forName(ssp.getClass().getCanonicalName()).newInstance();
		//return new SystemServicePlatformImpl();
		
	}
}
