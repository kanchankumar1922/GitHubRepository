/**
 * 
 */
package com.designpattern.chainofresponsibility;

/**
 * @author kumark
 *
 */
public class HandlertestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        Handler handler1 = new ConcreteHandlerOne();
        Handler handler2 = new ConcreteHandlerTwo();
        Handler handler3 = new ConcreteHandlerThree();
        
        handler1.setSuccessor(handler2);
        handler2.setSuccessor(handler3);
        //handler1.handleRequest(new Request(-1, "NEGATIVE VALUES"));
        //handler1.handleRequest(new Request(1, "POSITIVE VALUES"));
        handler1.handleRequest(new Request(0, "POSITIVE VALUES"));
	}

}
