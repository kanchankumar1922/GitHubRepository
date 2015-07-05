package com.designpattern.chainofresponsibility2;

public abstract class ChainOfResponsibilitesHandler {

	private ChainOfResponsibilitesHandler chainOfResponsibilitesHandler;
	
	public ChainOfResponsibilitesHandler getHandler() {
		
		return this.chainOfResponsibilitesHandler;
	}
	
   public void setHandler(ChainOfResponsibilitesHandler chainOfResponsibilitesHandler) {
		this.chainOfResponsibilitesHandler = chainOfResponsibilitesHandler;
	}
   
   public abstract boolean handleRequest(ChainOfResponsibilitesRequest request) throws 
                         ChainOfResponsibilitesInvalidRequestException , ChainOfResponsibilitesInvalidRequestHandlerException;
		

}
