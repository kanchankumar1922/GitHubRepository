package com.designpattern.filterdesignpattern;

public class Person {
	
	private String name;
	private String maritialStatus;
	private String grnder;
	

	
	/**
	 * @param name
	 * @param maritialStatus
	 * @param grnder
	 */
	public Person(String name, String maritialStatus, String grnder) {
		this.name = name;
		this.maritialStatus = maritialStatus;
		this.grnder = grnder;
	}
	
	public String getName() {
		return name;
	}
	public String getMaritialStatus() {
		return maritialStatus;
	}
	public String getGrnder() {
		return grnder;
	}
	

}
