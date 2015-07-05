/**
 * 
 */
package com.kanchan.java.designpatterns.abstractfactorypattern;

/**
 * @author kumark
 *
 */
public class AbstractFactoryTestMain {

	private static String WINDOW_FACTORY_NAME = "windowFactory";
	private static String CREATURE_FACTORY_NAME = "creatureFactory";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
        AbstractFactory windowFactory = FactoryProducer.getFactory(WINDOW_FACTORY_NAME);
        Window window = (Window) windowFactory.createObject("mswindow"); 
        
        AbstractFactory creatureFactory = FactoryProducer.getFactory(CREATURE_FACTORY_NAME);
        Creature creature = (Creature) creatureFactory.createObject("animal");
        
        window.setTitle();
        creature.breath();
	}

}
