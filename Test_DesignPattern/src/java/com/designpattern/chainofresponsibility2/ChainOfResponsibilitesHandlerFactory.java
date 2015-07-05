/**
 * 
 */
package com.designpattern.chainofresponsibility2;

/**
 * @author kumark
 *
 */
public class ChainOfResponsibilitesHandlerFactory {
	
	public static ChainOfResponsibilitesHandler getChainOfResponsibilitesHandler(String handlerType) throws ChainOfResponsibilitesInvalidRequestHandlerException{
		
		ChainOfResponsibilitesHandler chainOfResponsibilitesHandler = null;
		try {
			chainOfResponsibilitesHandler = (ChainOfResponsibilitesHandler)Class.forName(handlerType).newInstance();
		} catch (InstantiationException e) {
			throw new ChainOfResponsibilitesInvalidRequestHandlerException(e , ChainOfResponsibilitesUtility.CHAIN_OF_RESPONSIBILITES_INVALID_HANDLER_EXCEPTION_HANDLER_GENERIC);
		} catch (IllegalAccessException e) {
			throw new ChainOfResponsibilitesInvalidRequestHandlerException(e , ChainOfResponsibilitesUtility.CHAIN_OF_RESPONSIBILITES_INVALID_HANDLER_EXCEPTION_HANDLER_GENERIC);
		} catch (ClassNotFoundException e) {
			throw new ChainOfResponsibilitesInvalidRequestHandlerException(e , ChainOfResponsibilitesUtility.CHAIN_OF_RESPONSIBILITES_INVALID_HANDLER_EXCEPTION_HANDLER_GENERIC);
		}
		
		finally{
			//throw new ChainOfResponsibilitesInvalidRequestHandlerException(ChainOfResponsibilitesUtility.CHAIN_OF_RESPONSIBILITES_INVALID_HANDLER_EXCEPTION_HANDLER_ONE);
			
		}
		return chainOfResponsibilitesHandler;
		
	}

}
