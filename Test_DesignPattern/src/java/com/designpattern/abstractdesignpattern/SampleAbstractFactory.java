/**
 * 
 */
package com.designpattern.abstractdesignpattern;

import java.lang.annotation.Annotation;

/**
 * @author kumark
 *
 */
public class SampleAbstractFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new WonderLand(createAnimalFactory("water"));
		new WonderLand(createAnimalFactory("land"));
		SampleAbstractFactory sampleAbstractFactory = new SampleAbstractFactory();
		Class <? extends SampleAbstractFactory> cl = sampleAbstractFactory.getClass();
		Annotation [] annotations =	cl.getAnnotations();
		
        //System.out.println();
	}
	
	private static AnimalFactory createAnimalFactory(String type){
		if(type.equals("water"))
		    return new SeaFactory();
		else
		    return new LandFactory();
		
		
	}

}
