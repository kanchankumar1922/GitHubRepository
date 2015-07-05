/**
 * 
 */
package com.examples.exceptionsHandling;

/**
 * 
 * <p>The {@code InsufficientFundsException} is a {@link Exception} {@link Class} which is user defined.</p>
 * <p>When the account holder requests to withdraw the amount greater than the current amount</p>
 * @author kumark
 *
 */

public class InsufficientFundsException extends UserAccountException
{
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
   private double amount;
   public InsufficientFundsException(double amount)
   {
      this.amount = amount;
   } 
   public double getAmount()
   {
      return amount;
   }
}
