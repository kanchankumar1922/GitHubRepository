/**
 * 
 */
package com.designpattern.commanddesignpattern;

/**
 * @author kumark
 *
 */
public class CommandDesignPatternMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Stock stock = new Stock();
		Broker broker = new Broker();
		
		broker.takeOrders(new BuyStock(stock));
		broker.takeOrders(new SellStock(stock));
		
		broker.placeOrders();

	}

}
