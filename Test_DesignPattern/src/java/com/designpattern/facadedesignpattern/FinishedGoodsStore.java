package com.designpattern.facadedesignpattern;

public class FinishedGoodsStore implements Store {
    
	public Goods getGoods(){
		FinishedGoods finishedGoods = new FinishedGoods();
		return finishedGoods;
	}
}
