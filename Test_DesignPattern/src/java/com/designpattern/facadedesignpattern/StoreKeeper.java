/**
 * 
 */
package com.designpattern.facadedesignpattern;

/**
 * @author kumark
 *
 */
public class StoreKeeper {
	
	/**
	* The finished goods are asked for and are returned.
	*
	* @return finished goods
	*/
	public FinishedGoods getOrderedGoods() {
	FinishedGoodsStore store = new FinishedGoodsStore();
	FinishedGoods finishedGoods = (FinishedGoods)store.getGoods();
	return finishedGoods;
	}
	

}
