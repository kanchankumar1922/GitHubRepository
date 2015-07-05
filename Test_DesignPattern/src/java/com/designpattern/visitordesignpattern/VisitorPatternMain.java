/**
 * 
 */
package com.designpattern.visitordesignpattern;

/**
 * @author JSRK
 *
 */
public class VisitorPatternMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());

	}

}
