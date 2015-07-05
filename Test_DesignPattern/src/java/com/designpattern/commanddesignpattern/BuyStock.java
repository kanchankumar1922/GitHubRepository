/**
 * 
 */
package com.designpattern.commanddesignpattern;

/**
 * @author kumark
 *
 */
public class BuyStock implements Order {

	private Stock stock;
	
	
	/**
	 * @param stock
	 */
	public BuyStock(Stock stock) {
		this.stock = stock;
	}


	@Override
	public void execute() {
		stock.buy();

	}

}
