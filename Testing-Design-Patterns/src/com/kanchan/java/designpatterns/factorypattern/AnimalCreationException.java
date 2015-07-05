/**
 * 
 */
package com.kanchan.java.designpatterns.factorypattern;

/**
 * @author kumark
 *
 */
public class AnimalCreationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public AnimalCreationException() {
	}

	/**
	 * @param message
	 */
	public AnimalCreationException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public AnimalCreationException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public AnimalCreationException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public AnimalCreationException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
