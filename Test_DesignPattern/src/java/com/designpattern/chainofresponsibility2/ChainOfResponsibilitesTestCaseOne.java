/**
 * 
 */
package com.designpattern.chainofresponsibility2;

import org.junit.Test;

/**
 * @author kumark
 *
 */
public class ChainOfResponsibilitesTestCaseOne {
	
	
	@Test
	public void testChainOfResponsibilityHandleRequest(){
		
		ChainOfResponsibilitesHandler chainOfResponsibilitesHandlerOne = new ChainOfResponsibilitesHandlerOne();
		ChainOfResponsibilitesHandler chainOfResponsibilitesHandlerTwo = new ChainOfResponsibilitesHandlerTwo();
		chainOfResponsibilitesHandlerOne.setHandler(chainOfResponsibilitesHandlerTwo);
		
		try {
			chainOfResponsibilitesHandlerOne.handleRequest(new ChainOfResponsibilitesRequestImpl(ChainOfResponsibilitesEnum.WEBSERVICE_THREE));
		} catch (ChainOfResponsibilitesInvalidRequestException e) {
			e.printStackTrace();
		} catch (ChainOfResponsibilitesInvalidRequestHandlerException e) {
			e.printStackTrace();
		}
		
		System.out.println("Testing ChainOfResponsibilityHandleRequest");
	}

}
