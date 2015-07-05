/**
 * 
 */
package com.examples.shop;

import java.util.List;


/**
 * @author kumark
 *
 */
public class OrderedGoods extends Goods{
	
	public OrderedGoods(List<Goods> goods) {
		super(goods);
	}

	public double getTotalPrice(){
		return super.getTotalPrice();
	}
	
	public String toString(){
		return super.getGoodsName();
	}
	

}
