/**
 * 
 */
package com.designpattern.chainofresponsibility2;

/**
 * @author kumark
 *
 */
public class ChainOfResponsibilitesRequestImpl implements ChainOfResponsibilitesRequest {

	private String requestName;
	private String requestDescription;
	/* (non-Javadoc)
	 * @see com.examples.mesc.ChainOfResponsibilitesRequest#getRequest()
	 */
	@Override
	public ChainOfResponsibilitesHandler getRequest() {
		
		return null;
	}
	/**
	 * @param requestName
	 * @param requestDescription
	 */
	public ChainOfResponsibilitesRequestImpl(ChainOfResponsibilitesEnum chainOfResponsibilitesEnum) {
		System.out.println(ChainOfResponsibilitesEnum.WEBSERVICE_ONE.name());
		System.out.println(chainOfResponsibilitesEnum.getWebserviceType());
		System.out.println(chainOfResponsibilitesEnum.getWebserviceDescription());
		//this.requestName = chainOfResponsibilitesEnum.WEBSERVICE_ONE.name();
		//this.requestDescription = requestDescription;
		this.requestDescription = chainOfResponsibilitesEnum.getWebserviceDescription();
		this.requestName = chainOfResponsibilitesEnum.getWebserviceType();
	}
	/**
	 * @return the requestName
	 */
	public String getRequestName() {
		return requestName;
	}
	/**
	 * @param requestName the requestName to set
	 */
	public void setRequestName(String requestName) {
		this.requestName = requestName;
	}
	/**
	 * @return the requestDescription
	 */
	public String getRequestDescription() {
		return requestDescription;
	}
	/**
	 * @param requestDescription the requestDescription to set
	 */
	public void setRequestDescription(String requestDescription) {
		this.requestDescription = requestDescription;
	}
	
	

}
