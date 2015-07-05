package com.examples.enums;
/**
 * 
 */

/**
 * @author kumark
 *
 */
public enum States {
	
	INITIAL(00),
	MANAGED(11),
	DEFINED(22),
	OPTIMIZED(33);
	
	private States(int val){
		this.statuscode = val;
	}
	
	/**
	 * @return the statuscode
	 */
	public int getStatuscode() {
		return statuscode;
	}

	/**
	 * @param statuscode the statuscode to set
	 */
	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}

	private int statuscode;
	
	
	
	
}
