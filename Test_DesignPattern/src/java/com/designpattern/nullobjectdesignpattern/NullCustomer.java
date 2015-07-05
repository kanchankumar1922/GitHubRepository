/**
 * 
 */
package com.designpattern.nullobjectdesignpattern;

/**
 * @author kumark
 *
 */
public class NullCustomer extends AbstractCustomer {

	/* (non-Javadoc)
	 * @see com.designpattern.nullobjectdesignpattern.AbstractCustomer#getName()
	 */
	@Override
	public String getName() {
		return "\"NAME IS NULL\"";
	}

	/* (non-Javadoc)
	 * @see com.designpattern.nullobjectdesignpattern.AbstractCustomer#isNull()
	 */
	@Override
	public boolean isNull() {
		return true;
	}

}
