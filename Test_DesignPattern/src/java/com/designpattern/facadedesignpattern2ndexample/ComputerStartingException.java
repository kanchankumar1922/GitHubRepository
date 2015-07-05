package com.designpattern.facadedesignpattern2ndexample;

public class ComputerStartingException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ComputerStartingException(String errormessage){
		super(errormessage);
	}

	public ComputerStartingException(String errormessage ,  Throwable e){
		super(errormessage , e);
	}
}
