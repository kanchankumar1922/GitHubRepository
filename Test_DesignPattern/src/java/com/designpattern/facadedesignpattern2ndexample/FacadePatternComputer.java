/**
 * 
 */
package com.designpattern.facadedesignpattern2ndexample;

/**
 * @author kumark
 *
 */
public class FacadePatternComputer {
	
	private ComputerHardDrive  computerHardDrive;
	private ComputerMemory     computerMemory;
	private ComputerUI         computerUI;
	private ComputerUSB        computerUSB;
	/**
	 * 
	 */
	public FacadePatternComputer() {
		this.computerHardDrive = new ComputerHardDrive();
		this.computerMemory    = new ComputerMemory();
		this.computerUI        = new ComputerUI();
		this.computerUSB       = new ComputerUSB();
	}
	
    public void startComputer() throws ComputerStartingException {
    	
        	computerHardDrive.startHardDrive();
        	computerMemory.loadComputerMomory();
        	computerUSB.detectUSBDevice();
        	computerUI.showComputerScreenUI();	
		
    	//starting all your subsystems
    	
    	System.out.println("Computer started successfully");
    }
	
	

}
