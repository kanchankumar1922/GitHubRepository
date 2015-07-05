/**
 * 
 */
package com.designpattern.singletondesignpattern;

/**
 * @author kumark
 *
 */
public class MySingletonClass implements Cloneable{
	
	//private static MySingletonClass mySingletonClass = new MySingletonClass();
	private static MySingletonClass mySingletonClass;
	
	private MySingletonClass(){};
	
	// This is teh type of Early Istantiation in Singleton pattern
	/*public static MySingletonClass getSingletonClass(){
		return mySingletonClass;
	}*/
	
	// This is teh type of Lazy Istantiation in Singleton pattern
	public static MySingletonClass getSingleInstance() {
	    if (mySingletonClass == null) {
	    	System.out.println("SingleTon Class is null first time for Lazy Instantiation");
	      synchronized (MySingletonClass.class) {
	        if (mySingletonClass == null) {
	        	mySingletonClass = new MySingletonClass();
	        }
	      }
	    }
	    return mySingletonClass;
	  }
	
	@Override
	public MySingletonClass clone(){
		//if(mySingletonClass !=null)
		return MySingletonClass.getSingleInstance();
	}

}
