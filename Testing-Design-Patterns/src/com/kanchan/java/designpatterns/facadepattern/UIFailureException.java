package com.kanchan.java.designpatterns.facadepattern;

public class UIFailureException extends ComputerSubsystemExecutionException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String errorMessage; 
	
	public UIFailureException(String errorMessage , Throwable tw){
		super(errorMessage , tw);
		this.errorMessage = errorMessage;		
	}
	
	public UIFailureException(String errorMessage){
		super(errorMessage);
		this.errorMessage = errorMessage;		
	}
	public UIFailureException(Throwable tw){
		super(tw);
	}
	
	public String getErrorMessage() {
		return this.errorMessage;
	}
}
