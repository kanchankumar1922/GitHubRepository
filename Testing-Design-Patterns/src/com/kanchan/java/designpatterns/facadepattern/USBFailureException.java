package com.kanchan.java.designpatterns.facadepattern;

public class USBFailureException extends ComputerSubsystemExecutionException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String errorMessage; 
	
	public USBFailureException(String errorMessage , Throwable tw){
		super(errorMessage , tw);
		this.errorMessage = errorMessage;		
	}
	
	public USBFailureException(String errorMessage){
		super(errorMessage);
		this.errorMessage = errorMessage;		
	}
	public USBFailureException(Throwable tw){
		super(tw);
	}
	
	public String getErrorMessage() {
		return this.errorMessage;
	}
}
