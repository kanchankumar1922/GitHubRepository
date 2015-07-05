package com.designpattern.facadedesignpattern;

public class Client {
	
	/**
	* to get finished materials
	*/
	public static void main(String[] args) {
		
		// Examples taken from http://www.allapplabs.com/java_design_patterns/facade_pattern.htm
		
	StoreKeeper keeper = new StoreKeeper();
	FinishedGoods finishedGoods = keeper.getOrderedGoods();
	System.out.println(finishedGoods);
		
		System.out.println("sadsad java.lang.NoClassDefFoundError: com/designpattern/facadedesignpattern/Client");
	}

}
