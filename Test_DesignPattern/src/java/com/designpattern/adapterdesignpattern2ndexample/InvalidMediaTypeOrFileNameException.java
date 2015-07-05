/**
 * 
 */
package com.designpattern.adapterdesignpattern2ndexample;

/**
 * @author kumark
 *
 */
public class InvalidMediaTypeOrFileNameException extends Exception {
	
	private String errorMessage;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidMediaTypeOrFileNameException(String errorMessage){
		super(errorMessage);
		this.errorMessage = errorMessage;
	}
	public InvalidMediaTypeOrFileNameException(String errorMessage , Throwable t){
		super(errorMessage , t);
		this.errorMessage = errorMessage;
	}
	/**
	 * @return the errorMessage
	 */
	public String getErrorMessage() {
		return errorMessage;
	}
	/**
	 * @param errorMessage the errorMessage to set
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
