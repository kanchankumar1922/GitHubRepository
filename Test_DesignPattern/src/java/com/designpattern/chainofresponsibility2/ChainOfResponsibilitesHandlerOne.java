package com.designpattern.chainofresponsibility2;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ChainOfResponsibilitesHandlerOne extends ChainOfResponsibilitesHandler{

	private static final Logger logger = Logger.getLogger(ChainOfResponsibilitesLogger.class.getSimpleName());
	
	@Override
	public boolean handleRequest(ChainOfResponsibilitesRequest request) throws ChainOfResponsibilitesInvalidRequestException , ChainOfResponsibilitesInvalidRequestHandlerException{
	    boolean isRequestHandled = false;
	    
	    ChainOfResponsibilitesHandler chainOfResponsibilitesHandler = getHandler();
		if(null == request){
			logger.log(Level.WARNING, "REQUEST IS NULL , THROWING ChainOfResponsibilitesInvalidRequestException");
			throw new ChainOfResponsibilitesInvalidRequestException(ChainOfResponsibilitesUtility.CHAIN_OF_RESPONSIBILITES_INVALID_REQUEST_EXCEPTION_HANDLER_ONE);
			}
		if( ((ChainOfResponsibilitesRequestImpl)request).getRequestName() == ChainOfResponsibilitesEnum.WEBSERVICE_ONE.getWebserviceType()){
			logger.info("HANDELING THE WEBSERVICE REQUEST BY " + ChainOfResponsibilitesHandlerOne.class.getSimpleName());
			/*
			 * Code for Handling the webservice request type one 
			 */
		}
		else{
		      //logger.info("This is not WEBSERVICE1 so apssing it to the next handler :: " + chainOfResponsibilitesHandler.getClass().getSimpleName());
			if(null != chainOfResponsibilitesHandler){
				chainOfResponsibilitesHandler.handleRequest(request);
				isRequestHandled = true;
			}
			else{
				isRequestHandled = false;
				throw new ChainOfResponsibilitesInvalidRequestHandlerException(ChainOfResponsibilitesUtility.CHAIN_OF_RESPONSIBILITES_INVALID_HANDLER_EXCEPTION_HANDLER_ONE);
			}
		}
		
		return isRequestHandled;
	}

}
