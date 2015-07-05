/**
 * 
 */
package com.designpattern.chainofresponsibility;

/**
 * @author kumark
 *
 */
public class Request {
	
	private int methodValue;
	private String methodDescription;
	
	public Request (int methodValue , String methodDescription){
		this.methodValue = methodValue;
		this.methodDescription = methodDescription;
	}
	/**
	 * @return the methodName
	 */
	public int getMethodValue() {
		return methodValue;
	}
	
	/**
	 * @return the methodDescription
	 */
	public String getMethodDescription() {
		return methodDescription;
	}
	

}
