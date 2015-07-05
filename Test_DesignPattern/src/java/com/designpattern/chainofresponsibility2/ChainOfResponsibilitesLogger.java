package com.designpattern.chainofresponsibility2;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ChainOfResponsibilitesLogger extends Logger {

	protected ChainOfResponsibilitesLogger(String name,	String resourceBundleName) {
		super(name, resourceBundleName);
	}
	
	@Override
	public void setLevel(Level newLevel) throws SecurityException {
		super.setLevel(newLevel);
	}

}
