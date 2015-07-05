/**
 * 
 */
package com.examples.exceptionsHandling;

/**
 * <p>
 * The {@code CheckingAccount} is a {@link Class} which maintains the account
 * details and balance of an user. The method {@code withdraw} throws an
 * exception {@link InsufficientFundsException}
 * </p>
 * 
 * @author kumark
 */

public class CheckingAccount {
	private double balance;
	private int number;

	public CheckingAccount(int number) {
		this.number = number;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) throws InsufficientFundsException {
		if (amount <= balance) {
			balance -= amount;
		} else {
			double needs = amount - balance;
			throw new InsufficientFundsException(needs);
			// throw new UserAccountException();
		}
	}

	public double getBalance() {
		return balance;
	}

	public int getNumber() {
		return number;
	}
}