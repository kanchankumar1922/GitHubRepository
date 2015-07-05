/**
 * 
 */
package com.designpattern.chainofresponsibility;

/**
 * @author kumark
 *
 */
public abstract class Handler {
	
	private Handler nextHandler;
	
	public void setSuccessor (Handler handler){
		this.nextHandler = handler;
	}
	public Handler getSuccessor (){
		return this.nextHandler;
	}
	public abstract void handleRequest(Request request); 

}
