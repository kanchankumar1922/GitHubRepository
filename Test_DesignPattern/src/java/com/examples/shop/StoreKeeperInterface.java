/**
 * 
 */
package com.examples.shop;

import java.util.List;


/**
 * @author kumark
 *
 */
public interface StoreKeeperInterface extends GenericInterface{

	public OrderedGoods getOrderedGoods();
	public List<String> getRawGoods();
	
}
