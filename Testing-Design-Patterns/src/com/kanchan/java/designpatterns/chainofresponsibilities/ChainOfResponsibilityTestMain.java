/**
 * 
 */
package com.kanchan.java.designpatterns.chainofresponsibilities;

/**
 * @author kumark
 *
 */
public class ChainOfResponsibilityTestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		RequestObject requestObject = new RequestObject();
		requestObject.setRequestName("requestthree");
		
		RequestHandler requestHandlerOne = new ConcreteHandlerOne();
		RequestHandler requestHandlerTwo = new ConcreteHandlerTwo();
		RequestHandler requestHandlerThree = new ConcreteHandlerThree();
		
		requestHandlerOne.setRequestHandler(requestHandlerTwo);
		requestHandlerTwo.setRequestHandler(requestHandlerThree);
		
		System.out.println(requestHandlerOne);
		System.out.println(requestHandlerTwo);
		
		System.out.println(requestHandlerOne.getRequestHandler());
		System.out.println(requestHandlerTwo.getRequestHandler());
		
		requestHandlerOne.processRequest(requestObject);

	}

}
