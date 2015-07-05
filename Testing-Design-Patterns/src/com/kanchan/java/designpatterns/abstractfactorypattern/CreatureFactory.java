/**
 * 
 */
package com.kanchan.java.designpatterns.abstractfactorypattern;

/**
 * @author kumark
 *
 */
public class CreatureFactory extends AbstractFactory{
	
	@Override
	public Creature createObject(String creatureName){
		if(null != creatureName && creatureName.equalsIgnoreCase("animal"))return new Elephant();
		else if(null != creatureName && creatureName.equalsIgnoreCase("bird"))return new Eagle();
		else return null;
	}

	

}
