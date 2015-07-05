/**
 * 
 */
package com.designpattern.observerdesignpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kumark
 *
 */
public class Loan implements Subject {
	
	private List<Observer> listObservers = new ArrayList<Observer>();
	private String type;
	private float  interestRate;
	
	public Loan(String type, float interestRate, String bank) {
		this.type = type;
		this.interestRate = interestRate;
		this.bank = bank;
	}
	
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the interestRate
	 */
	public float getInterestRate() {
		return interestRate;
	}

	/**
	 * @param interestRate the interestRate to set
	 */
	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
		notifyObservers();
	}

	/**
	 * @return the bank
	 */
	public String getBank() {
		return bank;
	}

	/**
	 * @param bank the bank to set
	 */
	public void setBank(String bank) {
		this.bank = bank;
	}

	private String bank;

	/* (non-Javadoc)
	 * @see com.designpattern.observerdesignpattern.Subject#addObserver(com.designpattern.observerdesignpattern.Observer)
	 */
	@Override
	public void addObserver(Observer observer) {
		this.listObservers.add(observer);

	}

	/* (non-Javadoc)
	 * @see com.designpattern.observerdesignpattern.Subject#removeObserver(com.designpattern.observerdesignpattern.Observer)
	 */
	@Override
	public void removeObserver(Observer observer) {
              this.listObservers.remove(observer);
	}

	/* (non-Javadoc)
	 * @see com.designpattern.observerdesignpattern.Subject#notifyObservers()
	 */
	@Override
	public void notifyObservers() {
		for(Observer observer : listObservers){
			observer.update(this.interestRate);
		}

	}

	

}
