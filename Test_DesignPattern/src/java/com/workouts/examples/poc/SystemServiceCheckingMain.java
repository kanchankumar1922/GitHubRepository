/**
 * 
 */
package com.workouts.examples.poc;

/**
 * @author kumark
 *
 */
public class SystemServiceCheckingMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
      
		SystemServicePlatform systemServicePlatform = null;
		try {
			
			SystemServicePlatform obj  = new SystemServicePlatformImpl();
			System.out.println( obj.getClass().getCanonicalName() );
			Class<SystemServicePlatform> c = SystemServicePlatform.class;
			System.out.println( c.getClass().getCanonicalName() );
			systemServicePlatform = (SystemServicePlatform)SystemServiceFactory.getSystemService(SystemServicePlatformImpl.class);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			systemServicePlatform.intializeSystemService();
		} catch (ServiceInitException e) {
			e.printStackTrace();
		}
	}

}
