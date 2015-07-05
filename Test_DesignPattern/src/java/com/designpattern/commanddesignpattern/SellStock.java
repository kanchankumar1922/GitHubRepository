/**
 * 
 */
package com.designpattern.commanddesignpattern;

/**
 * @author kumark
 *
 */
public class SellStock implements Order {

     private Stock stock;
	
	
	/**
	 * @param stock
	 */
	public SellStock(Stock stock) {
		this.stock = stock;
	}
	
	/* (non-Javadoc)
	 * @see com.designpattern.commanddesignpattern.Order#execute()
	 */
	@Override
	public void execute() {
		stock.sell();

	}

}
