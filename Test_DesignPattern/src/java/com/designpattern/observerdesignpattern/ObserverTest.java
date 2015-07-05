/**
 * 
 */
package com.designpattern.observerdesignpattern;

/**
 * @author kumark
 *
 */
public class ObserverTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Observer newsPaper = new NewsPaper();
		Observer Internet = new Internet();
		
		Loan loan = new Loan("Personal Loan", 12.5f, "Standard Charterd");
		
		loan.addObserver(Internet);
		loan.addObserver(newsPaper);
		
		loan.setInterestRate(14.5f);

	}

}
