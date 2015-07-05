package com.examples.shop;

import java.util.List;


public class OrderedGoodsStore implements Store {
    
	public Goods getGoods(List<Goods> goods){
		OrderedGoods orderedGoods = new OrderedGoods(goods);
		return orderedGoods;
	}
}
