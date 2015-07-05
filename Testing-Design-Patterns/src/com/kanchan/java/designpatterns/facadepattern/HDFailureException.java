package com.kanchan.java.designpatterns.facadepattern;

public class HDFailureException extends ComputerSubsystemExecutionException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String errorMessage; 
	
	public HDFailureException(String errorMessage , Throwable tw){
		super(errorMessage , tw);
		this.errorMessage = errorMessage;		
	}
	
	public HDFailureException(String errorMessage){
		super(errorMessage);
		this.errorMessage = errorMessage;		
	}
	public HDFailureException(Throwable tw){
		super(tw);
	}
	
	public String getErrorMessage() {
		return this.errorMessage;
	}
}
