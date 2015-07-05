package com.designpattern.chainofresponsibility2;

public enum ChainOfResponsibilitesEnum {
	
	WEBSERVICE_ONE(ChainOfResponsibilitesUtility.CHAIN_OF_RESPONSIBILITES_TEST_CASE_WEBSERVICE_ONE , ChainOfResponsibilitesUtility.CHAIN_OF_RESPONSIBILITES_TEST_CASE_WEBSERVICE_ONE_DESCRIPTION),
	WEBSERVICE_TWO(ChainOfResponsibilitesUtility.CHAIN_OF_RESPONSIBILITES_TEST_CASE_WEBSERVICE_TWO , ChainOfResponsibilitesUtility.CHAIN_OF_RESPONSIBILITES_TEST_CASE_WEBSERVICE_TWO_DESCRIPTION),
	WEBSERVICE_THREE(ChainOfResponsibilitesUtility.CHAIN_OF_RESPONSIBILITES_TEST_CASE_WEBSERVICE_THREE , ChainOfResponsibilitesUtility.CHAIN_OF_RESPONSIBILITES_TEST_CASE_WEBSERVICE_THREE_DESCRIPTION);
	
	private String webserviceType;
	private String webserviceDescription;
	
	private ChainOfResponsibilitesEnum(String webserviceType , String webserviceDescription){
		this.webserviceType = webserviceType;
		this.webserviceDescription = webserviceDescription;
		
	}

	/**
	 * @return the webserviceType
	 */
	public String getWebserviceType() {
		return webserviceType;
	}

	/**
	 * @param webserviceType the webserviceType to set
	 */
	public void setWebserviceType(String webserviceType) {
		this.webserviceType = webserviceType;
	}

	/**
	 * @return the webserviceDescription
	 */
	public String getWebserviceDescription() {
		return webserviceDescription;
	}

	/**
	 * @param webserviceDescription the webserviceDescription to set
	 */
	public void setWebserviceDescription(String webserviceDescription) {
		this.webserviceDescription = webserviceDescription;
	}
	
	

}
