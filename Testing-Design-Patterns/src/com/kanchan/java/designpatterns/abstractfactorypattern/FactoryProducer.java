/**
 * 
 */
package com.kanchan.java.designpatterns.abstractfactorypattern;

/**
 * @author kumark
 *
 */
public class FactoryProducer {
	
	public static AbstractFactory getFactory(String factoryName){
		if(null != factoryName && factoryName.equalsIgnoreCase("creatureFactory")) return new CreatureFactory();
		else if(null != factoryName && factoryName.equalsIgnoreCase("windowFactory")) return new WindowFactory();
		else return null; 
	}

}
