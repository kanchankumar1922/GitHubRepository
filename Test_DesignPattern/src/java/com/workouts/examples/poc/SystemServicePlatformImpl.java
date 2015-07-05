/**
 * 
 */
package com.workouts.examples.poc;

/**
 * @author kumark
 *
 */
public class SystemServicePlatformImpl implements SystemServicePlatform {

	/* (non-Javadoc)
	 * @see com.workouts.examples.poc.SystemServicePlatform#intializeSystemService()
	 */
	@Override
	public void intializeSystemService() throws ServiceInitException{
          
          try {
        	  System.out.println("WRITE CODE HERE FOR SERVICE IMPLEMENTATION");
        	  int i = 10/0;
		} catch (Exception e) {
		   throw new ServiceInitException(e);
		}
	}

}
