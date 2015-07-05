/**
 * 
 */
package com.kanchan.java.designpatterns.chainofresponsibilities;

/**
 * @author kumark
 *
 */
public class ConcreteHandlerThree extends RequestHandler {

	/* (non-Javadoc)
	 * @see com.kanchan.java.designpatterns.chainofresponsibilities.RequestHandler#processRequest()
	 */
	@Override
	public void processRequest(RequestObject requestObject) {
		 if(null != requestObject && requestObject.getRequestName().equalsIgnoreCase("RequestThree")) {
			 System.out.println(ConcreteHandlerThree.class.getSimpleName() + " Is Handling the request");
		 }
		 else {
			 System.out.println("Passing request to the handler " + getRequestHandler().getClass().getSimpleName());
			 getRequestHandler().processRequest(requestObject);
		 }

	}

}
