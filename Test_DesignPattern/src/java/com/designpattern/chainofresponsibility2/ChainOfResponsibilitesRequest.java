/**
 * 
 */
package com.designpattern.chainofresponsibility2;

/**
 * @author kumark
 *
 */
public interface ChainOfResponsibilitesRequest {

	public ChainOfResponsibilitesHandler getRequest() throws ChainOfResponsibilitesInvalidRequestException; 
}
