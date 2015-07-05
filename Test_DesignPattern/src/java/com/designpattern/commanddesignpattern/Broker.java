/**
 * 
 */
package com.designpattern.commanddesignpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kumark
 *
 */
public class Broker {
	
	private List<Order> listOrders = new ArrayList<Order>();
	
	public void takeOrders(Order order){
	    listOrders.add(order);	
	}
	
	public void placeOrders(){
		/*for(Order ord : listOrders){
			ord.execute();
		}*/
		// new Stream API for collections
		listOrders.stream().forEach(o -> o.execute());
	}
	
	

}
