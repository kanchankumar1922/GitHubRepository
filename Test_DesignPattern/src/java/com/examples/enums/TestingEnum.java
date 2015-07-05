package com.examples.enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 */

/**
 * @author kumark
 *
 */
public class TestingEnum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("name", "Kanchan");
		String systemProperties  = System.getProperties().toString();
		systemProperties = systemProperties.substring(1 , systemProperties.lastIndexOf("}")); //split(",").;
		String [] stringPropertyArray = systemProperties.split(",");
		//System.out.println(stringPropertyArray).to;
		Map<String , String> map =  convertToHashMap(stringPropertyArray);
		
		System.out.println(map);
		
		
		System.out.println(System.getProperties().toString().split(",").length);
		System.out.println(map.size());
		System.out.println(System.getProperty("sun.desktop"));
        Flavor flavor = Flavor.CHOCOLATE;
        System.out.println("calories  of FLAVOR :: " + flavor);
        flavor.setCalories(5000);
        int calories = flavor.getCalories();
        System.out.println("calories  :: " + calories);
        System.out.println("flavor  :: " + flavor  + "\n\n");
        
        Colour colour = Colour.RED;
        //Colour colour = new Co;
        System.out.println("colour.name() ::: " + colour.name());
        System.out.println("Colour Code " + colour.getColourCode());
        colour.setColourCode("myRedCode");
        System.out.println("Colour Code " + colour.getColourCode() + "\n\n");
        
        
        
        List<String> listOfString  = new ArrayList<String>();
        listOfString.add("first");
        listOfString.add("second");
        listOfString.add("third");
        listOfString.add("fourth");
        /*String [] arrayOfString = (String [])listOfString.toArray();
        
        for (String elem : arrayOfString){
        	System.out.println("" + elem);
        }*/
        
        String [] arrayString  = new String [4];
        arrayString[0] = "first1";
        arrayString[0] = "first2";
        arrayString[0] = "first3";
        arrayString[0] = "first4";
        arrayString[0] = "first5";
        
        /*Testing Planet*/
        
        double earthWeight = Double.parseDouble(args[0]);
        double mass = earthWeight/Planet.EARTH.surfaceGravity();
        Planet pp = Planet.EARTH;
        System.out.println("Planet.EARTH :: " + pp.surfaceGravity());
        System.out.println("...mass::: " + mass);
        System.out.println("Math.sqrt(mass)::: " + Math.sqrt(mass));
        for (Planet p : Planet.values())
           System.out.printf("Your weight on %s is %f%n",p, p.surfaceWeight(mass));
       
        
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[0]);
        for (Operation op : Operation.values())
            System.out.printf("%f %s %f = %f%n", x, op, y, op.eval(x, y));
        System.out.println("\n------------------------------------------------\n");
        for (States st : States.values())
            System.out.printf(" %s = %d%n", st, st.getStatuscode());
        //System.out.println( States.DEFINED.getStatuscode() );
        
        System.out.println(" SimapleEnumeration.CASTE :: "  + SimapleEnumeration.CASTE); 
	}
	
	public static Map<String, String> convertToHashMap(String [] stringArray){		  
		Map<String , String> hashMap = new HashMap<String, String>();
				
		for(String strAry : stringArray){
			String key = strAry.split("=")[0] != "" ? strAry.split("=")[0] : "";
			String value = ( strAry.split("=").length == 2 ) ? strAry.split("=")[1] : "";
			hashMap.put(key, value);
		}
		
		return hashMap;
	}
	
	

}
