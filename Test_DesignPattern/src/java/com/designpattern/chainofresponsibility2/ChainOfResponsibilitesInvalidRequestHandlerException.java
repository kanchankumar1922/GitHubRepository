/**
 * 
 */
package com.designpattern.chainofresponsibility2;

/**
 * @author kumark
 *
 */
public class ChainOfResponsibilitesInvalidRequestHandlerException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ChainOfResponsibilitesInvalidRequestHandlerException(){
		super();
	}
	
	public ChainOfResponsibilitesInvalidRequestHandlerException(String message){
		super(message);
	}
	
	public ChainOfResponsibilitesInvalidRequestHandlerException(Throwable cause , String message){
		super(message , cause);
	}
	
	public ChainOfResponsibilitesInvalidRequestHandlerException(Throwable cause){
		super(cause);
	}
	
	public String getSimpleNameString(){
		return "GALAXY";
	}
}
