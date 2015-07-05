/**
 * 
 */
package com.kanchan.java.designpatterns.chainofresponsibilities;

/**
 * @author kumark
 *
 */
public class ConcreteHandlerTwo extends RequestHandler {

	/* (non-Javadoc)
	 * @see com.kanchan.java.designpatterns.chainofresponsibilities.RequestHandler#processRequest()
	 */
	@Override
	public void processRequest(RequestObject requestObject) {
		 if(null != requestObject && requestObject.getRequestName().equalsIgnoreCase("RequestTwo")) {
			 System.out.println(ConcreteHandlerTwo.class.getSimpleName() + " Is Handling the request");
		 }
		 else {
			 System.out.println("Passing request to the handler " + getRequestHandler().getClass().getSimpleName());
			 getRequestHandler().processRequest(requestObject);
		 }

	}

}
