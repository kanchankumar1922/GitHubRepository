/**
 * 
 */
package com.examples.shop;

import java.util.List;
import java.util.Map;

/**
 * @author kumark
 *
 */
public class StoreKeeper implements StoreKeeperInterface{
	
	private List<Goods> goods = null;
	
	public StoreKeeper(List<Goods> goods){
		this.goods = goods;
	}
	
	public StoreKeeper(Map<String ,Goods> goods){
		System.out.println("The private constructor");
		//this.goods = goods;
	}
	
	/**
	* The ordered goods are asked for and are returned.
	*
	* @return ordered goods
	*/
	@Override
	public OrderedGoods getOrderedGoods() {
	OrderedGoodsStore store = new OrderedGoodsStore();
	OrderedGoods orderedGoods = (OrderedGoods)store.getGoods(goods);
	return orderedGoods;
	}
	
	@Override
	public List<String> getRawGoods() {
		List<String> listRawGoods = GoodsCategories.getListOfRawGoods();
		return listRawGoods;
	}
	

}
