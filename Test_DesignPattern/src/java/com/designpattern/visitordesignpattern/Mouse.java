/**
 * 
 */
package com.designpattern.visitordesignpattern;

/**
 * @author JSRK
 *
 */
public class Mouse extends ComputerPart {

	/**
	 * 
	 */
	public Mouse() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.designpattern.visitordesignpatter.ComputerPart#accept(com.designpattern.visitordesignpatter.ComputerPartVisitor)
	 */
	@Override
	public void accept(ComputerPartVisitor visitor) {
			visitor.visit(this);
	}

}
