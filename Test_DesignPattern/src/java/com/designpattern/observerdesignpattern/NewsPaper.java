/**
 * 
 */
package com.designpattern.observerdesignpattern;

/**
 * @author kumark
 *
 */
public class NewsPaper implements Observer {

	/* (non-Javadoc)
	 * @see com.designpattern.observerdesignpattern.Observer#update(float)
	 */
	@Override
	public void update(float interest) {
		System.out.println("NewsPaper :  Interest rate is updated : new rates are " + interest);

	}

}
