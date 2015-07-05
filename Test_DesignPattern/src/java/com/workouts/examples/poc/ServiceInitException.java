/**
 * 
 */
package com.workouts.examples.poc;

/**
 * @author kumark
 *
 */
public class ServiceInitException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ServiceInitException(Throwable cause){
		super(cause);
		System.out.println("#######" + cause.toString());
	}
	
}
