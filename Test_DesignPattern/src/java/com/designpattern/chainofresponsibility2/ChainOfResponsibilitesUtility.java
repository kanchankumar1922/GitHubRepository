/**
 * 
 */
package com.designpattern.chainofresponsibility2;

import java.util.logging.Level;

/**
 * @author kumark
 *
 */
public final class ChainOfResponsibilitesUtility {
	
	public final static String CHAIN_OF_RESPONSIBILITES_TEST_CASE_WEBSERVICE_ONE = "WEBSERVICE1";
	public final static String CHAIN_OF_RESPONSIBILITES_TEST_CASE_WEBSERVICE_TWO = "WEBSERVICE2";
	public final static String CHAIN_OF_RESPONSIBILITES_TEST_CASE_WEBSERVICE_THREE = "WEBSERVICE3";
	
	public final static String CHAIN_OF_RESPONSIBILITES_TEST_CASE_WEBSERVICE_ONE_DESCRIPTION = "THIS WEBSERVICE METHOD IS HANDLED BY " + ChainOfResponsibilitesHandlerOne.class.getSimpleName();
	public final static String CHAIN_OF_RESPONSIBILITES_TEST_CASE_WEBSERVICE_TWO_DESCRIPTION = "THIS WEBSERVICE METHOD IS HANDLED BY " + ChainOfResponsibilitesHandlerTwo.class.getSimpleName();
	public final static String CHAIN_OF_RESPONSIBILITES_TEST_CASE_WEBSERVICE_THREE_DESCRIPTION = "THIS WEBSERVICE METHOD IS HANDLED BY " + ChainOfResponsibilitesHandlerThree.class.getSimpleName();

	/*
	 * Exception declarations
	 */
	public final static String CHAIN_OF_RESPONSIBILITES_INVALID_REQUEST_EXCEPTION_HANDLER_ONE = "THIS IS INVALID REQUEST FOR HANDLER CLASS " + ChainOfResponsibilitesHandlerOne.class.getSimpleName();
	public final static String CHAIN_OF_RESPONSIBILITES_INVALID_REQUEST_EXCEPTION_HANDLER_TWO = "THIS IS INVALID REQUEST FOR HANDLER CLASS " + ChainOfResponsibilitesHandlerTwo.class.getSimpleName();
	public final static String CHAIN_OF_RESPONSIBILITES_INVALID_REQUEST_EXCEPTION_HANDLER_THREE = "THIS IS INVALID REQUEST FOR HANDLER CLASS " + ChainOfResponsibilitesHandlerThree.class.getSimpleName();
	
	public final static String CHAIN_OF_RESPONSIBILITES_INVALID_HANDLER_EXCEPTION_HANDLER_GENERIC = "The handler is null";
	public final static String CHAIN_OF_RESPONSIBILITES_INVALID_HANDLER_EXCEPTION_HANDLER_ONE = "The handler for" + ChainOfResponsibilitesHandlerOne.class.getSimpleName() + " is null";
	public final static String CHAIN_OF_RESPONSIBILITES_INVALID_HANDLER_EXCEPTION_HANDLER_TWO = "The handler for" + ChainOfResponsibilitesHandlerTwo.class.getSimpleName() + " is null";
	public final static String CHAIN_OF_RESPONSIBILITES_INVALID_HANDLER_EXCEPTION_HANDLER_THREE = "The handler for" + ChainOfResponsibilitesHandlerThree.class.getSimpleName() + " is null";
	
	public final static Level CHAIN_OF_RESPONSIBILITES_LOGGING_LEVEL = Level.INFO;
}
