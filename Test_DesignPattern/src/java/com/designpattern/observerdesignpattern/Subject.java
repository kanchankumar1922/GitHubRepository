/**
 * 
 */
package com.designpattern.observerdesignpattern;

/**
 * @author kumark
 *
 */
public interface Subject {
	public void addObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers();

}
