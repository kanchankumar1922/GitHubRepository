/**
 * 
 */
package com.designpattern.chainofresponsibility2;

/**
 * @author kumark
 *
 */
public class ChainOfResponsibilitesInvalidRequestException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ChainOfResponsibilitesInvalidRequestException(){
		super();
	}
	
	public ChainOfResponsibilitesInvalidRequestException(String message){
		super(message);
	}
	
	public ChainOfResponsibilitesInvalidRequestException(Throwable cause , String message){
		super(message , cause);
	}
	
	public ChainOfResponsibilitesInvalidRequestException(Throwable cause){
		super(cause);
	}
}
