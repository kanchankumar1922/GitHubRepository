/**
 * 
 */
package com.kanchan.java.designpatterns.factorypattern;

/**
 * @author kumark
 *
 */
public class FactoryTestMain {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Cat cat = null;
		try {
			cat = (Cat) Factory.createInstance("cat");
		} catch (AnimalCreationException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
        if(null != cat)
        	System.out.println(cat);
	}

}
