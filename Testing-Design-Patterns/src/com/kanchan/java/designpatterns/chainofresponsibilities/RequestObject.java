/**
 * 
 */
package com.kanchan.java.designpatterns.chainofresponsibilities;

/**
 * @author kumark
 *
 */
public class RequestObject {
	
	private String requestName;
	private String requestDescription;
	
	
	/**
	 * @return the requestName
	 */
	public String getRequestName() {
		return requestName;
	}
	/**
	 * @param requestName the requestName to set
	 */
	public void setRequestName(String requestName) {
		this.requestName = requestName;
	}
	/**
	 * @return the requestDescription
	 */
	public String getRequestDescription() {
		return requestDescription;
	}
	/**
	 * @param requestDescription the requestDescription to set
	 */
	public void setRequestDescription(String requestDescription) {
		this.requestDescription = requestDescription;
	}
	
	

}
