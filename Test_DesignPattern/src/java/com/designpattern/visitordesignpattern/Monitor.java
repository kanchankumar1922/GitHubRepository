/**
 * 
 */
package com.designpattern.visitordesignpattern;

/**
 * @author JSRK
 *
 */
public class Monitor extends ComputerPart {

	/* (non-Javadoc)
	 * @see com.designpattern.visitordesignpatter.ComputerPart#accept(com.designpattern.visitordesignpatter.ComputerPartVisitor)
	 */
	@Override
	public void accept(ComputerPartVisitor visitor) {
          visitor.visit(this);
	}

}
