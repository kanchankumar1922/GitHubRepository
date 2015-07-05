/**
 * 
 */
package com.designpattern.visitordesignpattern;

/**
 * @author JSRK
 *
 */
public abstract class ComputerPart {
	
	public abstract void accept(ComputerPartVisitor visitor);

}
