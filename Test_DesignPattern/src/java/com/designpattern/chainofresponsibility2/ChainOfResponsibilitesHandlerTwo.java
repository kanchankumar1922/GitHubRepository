package com.designpattern.chainofresponsibility2;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ChainOfResponsibilitesHandlerTwo extends ChainOfResponsibilitesHandler{

	private static final Logger logger = Logger.getLogger(ChainOfResponsibilitesLogger.class.getSimpleName());
	
	@Override
	public boolean handleRequest(ChainOfResponsibilitesRequest request) throws ChainOfResponsibilitesInvalidRequestHandlerException , ChainOfResponsibilitesInvalidRequestException{
		boolean isRequestHandled = false;
		ChainOfResponsibilitesHandler chainOfResponsibilitesHandler = getHandler();
		if(null == request){
			logger.log(Level.WARNING, "REQUEST IS NULL , THROWING ChainOfResponsibilitesInvalidRequestException");
			throw new ChainOfResponsibilitesInvalidRequestException(ChainOfResponsibilitesUtility.CHAIN_OF_RESPONSIBILITES_INVALID_REQUEST_EXCEPTION_HANDLER_TWO);
		}
		else if( ((ChainOfResponsibilitesRequestImpl)request).getRequestName() == ChainOfResponsibilitesEnum.WEBSERVICE_TWO.getWebserviceType()){
			logger.info("HANDELING THE WEBSERVICE REQUEST BY " + ChainOfResponsibilitesHandlerTwo.class.getSimpleName());
			/*
			 * Code for Handling the webservice request type two 
			 */
		}
		else{
			logger.info("This is not WEBSERVICE2 so apssing it to the next handler");
			if(null != chainOfResponsibilitesHandler){
				chainOfResponsibilitesHandler.handleRequest(request);
				isRequestHandled = true;
			}
			else{
				isRequestHandled = false;
				throw new ChainOfResponsibilitesInvalidRequestHandlerException(ChainOfResponsibilitesUtility.CHAIN_OF_RESPONSIBILITES_INVALID_HANDLER_EXCEPTION_HANDLER_TWO);
			}
		}
		return isRequestHandled;
	}

}
