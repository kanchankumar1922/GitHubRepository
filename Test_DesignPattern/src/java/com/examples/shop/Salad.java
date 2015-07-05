/**
 * 
 */
package com.examples.shop;

/**
 * @author kumark
 *
 */
public class Salad extends Goods{

	private int quantity;
	private String quality;    
    
	public int getQuantity() {
		return quantity;
	}

	public String getQuality() {
		return quality;
	}
    
	/************************************
	 * Constructor for Bread class
	 ************************************/
	public Salad(int quantity , String quality) {
		super();
		this.quantity = quantity;
		this.quality = quality;
	}
	
	/************************************
	 * Returns the total price of Specific Good
	 * @see com.examples.shop.Goods#getTotalPrice()
	 ************************************/
	@Override	
	public double getTotalPrice(){
		double totalPrice = this.quantity * 10;
		return totalPrice;
		
	}
	
	/************************************
	 * Returns the name of the Specific Good
	 * @see com.examples.shop.Goods#getGoodsName()
	 ************************************/
	@Override
	public String getGoodsName(){
		return this.quality;
	}
	@Override
	public String toString(){
		return this.quality;
	}
}
