/**
 * 
 */
package com.kanchan.java.designpatterns.observerpattern;

/**
 * @author kumark
 *
 */
public class ObservertestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		BankLoan loan = new BankLoan(new CarLoan());
		loan.setLoanInterest(3.0f);
	}

}
