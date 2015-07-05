/**
 * 
 */
package com.examples.exceptionhandelingsubclass;

/**
 * @author kumark
 *
 */
public class ExceptionHandelingTestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ComputerInterface computer = new ComputerInterfaceImpl();
		
		try {
			computer.startComputer();
		} catch (ComputerSystemException e) {
			e.printStackTrace();
		}
	}
 
}
