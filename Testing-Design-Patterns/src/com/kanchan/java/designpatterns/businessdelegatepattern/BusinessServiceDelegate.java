/**
 * 
 */
package com.kanchan.java.designpatterns.businessdelegatepattern;

/**
 * @author kumark
 *
 */
public class BusinessServiceDelegate {
	
	private BusinesServiceLookup businesServiceLookup =  new BusinesServiceLookup();
	private BusinessService businessService;
	private String businessServiceType;
	/**
	 * @return the businessServiceType
	 */
	public String getBusinessServiceType() {
		return businessServiceType;
	}
	/**
	 * @param businessServiceType the businessServiceType to set
	 */
	public void setBusinessServiceType(String businessServiceType) {
		this.businessServiceType = businessServiceType;
	}
	
	public void doTask(){
		this.businessService = businesServiceLookup.getBusinessService(businessServiceType);
		businessService.doProcessing();
	}

}
