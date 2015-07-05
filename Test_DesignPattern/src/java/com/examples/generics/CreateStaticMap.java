/**
 * 
 */
package com.examples.generics;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kumark
 *
 */
public class CreateStaticMap{

	private static String t;
	private static Animal x;
	private static Map<String , Animal> map = new HashMap<String, Animal>();
	public static Map<String , Animal> createStaticMap(String t, Animal x) {
		map.put(t, x);
		return map;
	}
	
   @Override
	public String toString(){
		return "String " + t + " Has " + x.toString();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Map<String , Animal> staticMap = CreateStaticMap.createStaticMap("CAT" , new Cat());
		System.out.println(staticMap.toString());

	}

}
