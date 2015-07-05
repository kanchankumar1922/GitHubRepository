/**
 * 
 */
package com.designpattern.chainofresponsibility2;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * @author kumark
 *
 */
public class ChainOfResponsibilitesMain {

	private static final Logger logger = Logger.getLogger(ChainOfResponsibilitesLogger.class.getSimpleName());
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//ChainOfResponsibilitesHandler chainOfResponsibilitesHandlerOne = new ChainOfResponsibilitesHandlerOne();
		ChainOfResponsibilitesHandler chainOfResponsibilitesHandlerOne = null;
		ChainOfResponsibilitesHandler chainOfResponsibilitesHandlerTwo = null;
		ChainOfResponsibilitesHandler chainOfResponsibilitesHandlerThree = null;
		try {
			chainOfResponsibilitesHandlerOne = ChainOfResponsibilitesHandlerFactory.getChainOfResponsibilitesHandler(ChainOfResponsibilitesHandlerOne.class.getSimpleName());
			chainOfResponsibilitesHandlerTwo = ChainOfResponsibilitesHandlerFactory.getChainOfResponsibilitesHandler(ChainOfResponsibilitesHandlerTwo.class.getName());		
			chainOfResponsibilitesHandlerThree = ChainOfResponsibilitesHandlerFactory.getChainOfResponsibilitesHandler(ChainOfResponsibilitesHandlerThree.class.getName());
		}catch (ChainOfResponsibilitesInvalidRequestHandlerException e) {
			logger.severe("ChainOfResponsibilitesInvalidRequestHandlerException occoured :: " + e.getSimpleNameString());
			e.printStackTrace();
		}finally{
			
		}
		
		
		if(null != chainOfResponsibilitesHandlerOne)chainOfResponsibilitesHandlerOne.setHandler(chainOfResponsibilitesHandlerTwo);
		if(null != chainOfResponsibilitesHandlerTwo)chainOfResponsibilitesHandlerTwo.setHandler(chainOfResponsibilitesHandlerThree);
		logger.setLevel(ChainOfResponsibilitesUtility.CHAIN_OF_RESPONSIBILITES_LOGGING_LEVEL);
		//System.setProperty(key, value)
		try {
			chainOfResponsibilitesHandlerOne.handleRequest(new ChainOfResponsibilitesRequestImpl(ChainOfResponsibilitesEnum.WEBSERVICE_THREE));
			//chainOfResponsibilitesHandlerThree.handleRequest(null);
		} catch (ChainOfResponsibilitesInvalidRequestException e) {
			logger.log(Level.SEVERE, "ChainOfResponsibilitesInvalidRequestException occured");
			e.printStackTrace();
		} catch (ChainOfResponsibilitesInvalidRequestHandlerException e) {
			logger.log(Level.SEVERE, "ChainOfResponsibilitesInvalidRequestHandlerException occured");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();		
	    }

    }
}
