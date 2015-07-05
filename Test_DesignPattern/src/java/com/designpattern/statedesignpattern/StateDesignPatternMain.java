/**
 * 
 */
package com.designpattern.statedesignpattern;

/**
 * @author JSRK
 *
 */
public class StateDesignPatternMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Context context = new Context();
		State tvIsON = new TvStateOn();
		State tvIsOFF = new TvStateOff();
		
		context.setTvState(tvIsOFF);
		context.doAction();
		
		context.setTvState(tvIsON);
		context.doAction();
		

	}

}
