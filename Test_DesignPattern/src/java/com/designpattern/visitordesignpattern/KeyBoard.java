/**
 * 
 */
package com.designpattern.visitordesignpattern;

/**
 * @author JSRK
 *
 */
public class KeyBoard extends ComputerPart {

	/**
	 * 
	 */
	public KeyBoard() {
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
