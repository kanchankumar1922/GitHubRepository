/**
 * 
 */
package com.kanchan.java.designpatterns.observerpattern;

/**
 * @author kumark
 *
 */
public class CarLoan implements Observer {

	/* (non-Javadoc)
	 * @see com.kanchan.java.designpatterns.observerpattern.Observer#update()
	 */
	@Override
	public void update() {		
		System.out.println("CAR LOAN UPDATED ");

	}

}
