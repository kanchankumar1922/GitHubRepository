/**
 * 
 */
package com.designpattern.nullobjectdesignpattern;

/**
 * @author kumark
 *
 */
public class ConcreteCustomer extends AbstractCustomer{

	public ConcreteCustomer(String name){
		this.name = name;
	}
	@Override
	public String getName() {
		return name;
	}

	@Override
	public boolean isNull() {
		return false;
	}

}
