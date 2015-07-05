/**
 * 
 */
package com.designpattern.statedesignpattern;

/**
 * @author JSRK
 *
 */
public class Context implements State{
	
	private State tvState;

	public State getTvState() {
		return tvState;
	}

	public void setTvState(State tvState) {
		this.tvState = tvState;
	}

	@Override
	public void doAction() {
		
		this.tvState.doAction();
		
	}
	

}
