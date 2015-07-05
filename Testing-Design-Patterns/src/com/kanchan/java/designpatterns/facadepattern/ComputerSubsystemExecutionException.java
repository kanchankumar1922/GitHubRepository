/**
 * 
 */
package com.kanchan.java.designpatterns.facadepattern;

/**
 * @author kumark
 *
 */
public class ComputerSubsystemExecutionException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String errorMessage; 
	
	public ComputerSubsystemExecutionException(String errorMessage , Throwable tw){
		super(errorMessage , tw);
		this.errorMessage = errorMessage;		
	}
	
	public ComputerSubsystemExecutionException(String errorMessage){
		super(errorMessage);
		this.errorMessage = errorMessage;		
	}
	public ComputerSubsystemExecutionException(Throwable tw){
		super(tw);
	}
	
	public String getErrorMessage() {
		return this.errorMessage;
	}
	
	

}
