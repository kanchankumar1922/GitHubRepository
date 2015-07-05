package com.examples.shop;

import java.util.List;

public class Goods {

	private List<Goods> listGoodsObject = null;
	
	public Goods(){
		
	}
	public Goods(List<Goods> listGood){
		this.listGoodsObject = listGood;
	}
	public double getTotalPrice(){
		double theTotalPrice = 0.0;
		for(Goods good : listGoodsObject){
			theTotalPrice +=  good.getTotalPrice();			
		}
		return theTotalPrice;
	}
	
	public String getGoodsName(){
		String goodsName = "The Goods Names Are : ";
		for(Goods good : listGoodsObject){
			goodsName +=  good.getGoodsName() + " , ";			
		}
		return goodsName;
	}

}
