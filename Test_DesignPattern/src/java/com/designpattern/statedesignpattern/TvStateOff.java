/**
 * 
 */
package com.designpattern.statedesignpattern;

/**
 * @author JSRK
 *
 */
public class TvStateOff implements State {

	/* (non-Javadoc)
	 * @see com.designpattern.statedesignpattern.State#doAction()
	 */
	@Override
	public void doAction() {
			System.out.println("State of TV is OFF");
	}

}
