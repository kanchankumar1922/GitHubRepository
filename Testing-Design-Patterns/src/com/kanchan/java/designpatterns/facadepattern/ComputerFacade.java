/**
 * 
 */
package com.kanchan.java.designpatterns.facadepattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kumark
 *
 */
public class ComputerFacade {
	
	private SubSystemUSB subSystemUSB;
	private SubSystemUI  subSystemUI;
	private SubSystemHD  subSystemHD;
	private List<SubSystem> listSubSystems = new ArrayList<SubSystem>();
	
	public ComputerFacade() {
	  this.subSystemHD = new SubSystemHD();
	  this.subSystemUI = new SubSystemUI();
	  this.subSystemUSB = new SubSystemUSB();
	  listSubSystems.add(subSystemHD);
	  listSubSystems.add(subSystemUI);
	  listSubSystems.add(subSystemUSB);
	  
	}
	
	public void startComputer() throws ComputerSubsystemExecutionException{
		for(SubSystem ss : listSubSystems){
			ss.startSubSystem();
		}
	}
	

}
