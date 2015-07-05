/**
 * 
 */
package com.kanchan.java.designpatterns.strategypattern;


/**
 * @author kumark
 *
 */
public class Context{

	private Strategy strategy;

	/**
	 * @param strategy
	 */
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	/**
	 * @return the strategy
	 */
	public Strategy getStrategy() {
		return strategy;
	}

	/**
	 * @param strategy the strategy to set
	 */
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public int executeOperation(int i , int j){
		return this.strategy.doOperation(i, j);
	}
	
}

