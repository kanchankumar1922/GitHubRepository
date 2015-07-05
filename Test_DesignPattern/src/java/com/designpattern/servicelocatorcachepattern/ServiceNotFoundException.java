package com.designpattern.servicelocatorcachepattern;

public class ServiceNotFoundException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String errorMessage;

	public ServiceNotFoundException(String errorMessage){
		super(errorMessage);
		setErrorMessage(errorMessage);
	}
	
	public ServiceNotFoundException(String errorMessage , Throwable thro){
		super(errorMessage , thro);
		setErrorMessage(errorMessage);
	}
	
	public ServiceNotFoundException(Throwable thro){
		super(thro);
	}
	
	public String getErrorMessage() {
		StackTraceElement stackTraceElement = getStackTrace()[0];
		return "####Error Occured In ::: " + stackTraceElement.getFileName() + ", In Method \"" + stackTraceElement.getMethodName() + "\", Line number at " + stackTraceElement.getLineNumber()+ ", With Error Message ::  \"" + errorMessage +"\"";
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	

}
