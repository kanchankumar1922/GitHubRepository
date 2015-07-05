package com.kanchan.java.designpatterns.abstractfactorypattern;

public class WindowFactory extends AbstractFactory{
	
	@Override
	public Window createObject(String windowName){
		if(null != windowName && windowName.equalsIgnoreCase("macwindow")) return new MacWindow();
		else if (null != windowName && windowName.equalsIgnoreCase("mswindow")) return new MsWindow();
		return null;
	}

	

}
