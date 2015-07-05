/**
 * 
 */
package com.designpattern.strategydesignpatternEx2;

/**
 * @author kumark
 *
 */
public class Context {
	
	private Strategy operationalStrategy;
	
	public Context(Strategy strategy){
		this.operationalStrategy = strategy;
	}

	public Strategy getOperationalStrategy() {
		return operationalStrategy;
	}

	public void setOperationalStrategy(Strategy operationalStrategy) {
		this.operationalStrategy = operationalStrategy;
	}
	
	public int executeOpetration(int i , int j){
		return this.operationalStrategy.doCalculation(i, j);
	}

}
