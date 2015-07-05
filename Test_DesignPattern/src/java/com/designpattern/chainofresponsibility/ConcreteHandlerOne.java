/**
 * 
 */
package com.designpattern.chainofresponsibility;

/**
 * @author kumark
 *
 */
public class ConcreteHandlerOne extends Handler{

	@Override
	public void handleRequest(Request request) {
		if(request.getMethodValue() < 0 ){
			System.out.println(" THIS METHOD IS TO PROCESS NEGATIVE VALUES");
			System.out.println("\tConcreteHandlerOne.HandleRequest : " + request.getMethodDescription()
					 + request.getMethodValue());
		}
		else{
			System.out.println("In Else Block of ConcreteHandlerOne");
			getSuccessor().handleRequest(request);
		}
	}

}
