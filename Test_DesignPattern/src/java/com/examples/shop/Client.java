package com.examples.shop;

import java.util.List;


public class Client {
	
	/**
	* to get finished materials
	*/
	public static void main(String[] args) {
		
		//List<Goods> listGoods = new GoodsDeligator().getListOfGoods(args);
		//StoreKeeperInterface [] keeper  = new StoreKeeper[20];
		StoreKeeperInterface keeper = (StoreKeeperInterface)Initializer.initializeStoreKeeper(args , List.class);
		// Examples taken from http://www.allapplabs.com/java_design_patterns/facade_pattern.htm
		
	//StoreKeeper keeper = new StoreKeeper();
	OrderedGoods orderedGoods = keeper.getOrderedGoods();
	double totalPrice = orderedGoods.getTotalPrice();
	System.out.println("TOtal Price of OrderedGoods :: " + totalPrice);
	System.out.println("LIST OF RAW GOODS IN STORE :: " + keeper.getRawGoods());
	System.out.println("LIST OF FINISHED GOODS  :: " + orderedGoods);
	//System.out.println("OrderedGoods Goods :: " + listGoods);
		
		
	}

}
