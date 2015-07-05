/**
 * 
 */
package com.examples.exceptionhandelingsubclass;

/**
 * @author kumark
 *
 */
public class ComputerInterfaceImpl implements ComputerInterface {

	/* (non-Javadoc)
	 * @see com.examples.exceptionhandelingsubclass.ComputerInterface#startComputer()
	 */
	@Override
	public void startComputer() throws ComputerSystemException {
		// TODO Auto-generated method stub
		startHardware();
          
	}
	
	private void startHardware() throws HardwareFailureException{
		throw new HardwareFailureException();
	}

}
