/**
 * 
 */
package com.kanchan.java.designpatterns.observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kumark
 *
 */
public class BankLoan {
	
	private float loanInterest = 2.5f;
	List<Observer> listOfObservers = new ArrayList<Observer>();

	public BankLoan(Observer o){
		this.listOfObservers.add(o);
	}
	/**
	 * @return the loanInterest
	 */
	public float getLoanInterest() {
		return loanInterest;
	}

	
	/**
	 * @param loanInterest the loanInterest to set
	 */
	public void setLoanInterest(float loanInterest) {
		this.loanInterest = loanInterest;
		notifyAllObservers();
	}
	
	public void notifyAllObservers(){
		for(Observer o : listOfObservers){
			o.update();
		}
	}

	
}
