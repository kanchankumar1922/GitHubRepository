package com.kanchan.java.designpatterns.facadepattern;

public class FacadeTestMain {

	public static void main(String[] args) {
		
		ComputerFacade computer = new ComputerFacade();
		try {
			computer.startComputer();
		} catch (ComputerSubsystemExecutionException e) {
			System.err.println(e.getErrorMessage());
			System.err.println("the error ocured in class "  + e.getClass().getCanonicalName() + " at line number " + e.getStackTrace()[0].getLineNumber()) ;
			e.printStackTrace();
		}

	}

}
