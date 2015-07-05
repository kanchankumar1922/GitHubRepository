/**
 * 
 */
package com.designpattern.singletondesignpattern;

/**
 * @author kumark
 *
 */
public class TestingSingletonPattern implements Cloneable{

	/**
	 * @param args
	 */
	private String name = "HARI";
	public static void main(String[] args) {
		System.out.println("STARTING");
	  MySingletonClass mySingletonClass1 = MySingletonClass.getSingleInstance();
	  MySingletonClass mySingletonClass2 = MySingletonClass.getSingleInstance();
	  MySingletonClass mySingletonClass3 = MySingletonClass.getSingleInstance();
	  MySingletonClass mySingletonClass4 = MySingletonClass.getSingleInstance();
	  MySingletonClass mySingletonClass5 = MySingletonClass.getSingleInstance();
	  
	  
	  System.out.println("checking the hash code for the mySingletonClass1" + mySingletonClass1.toString());
	  System.out.println("checking the hash code for the mySingletonClass2" + mySingletonClass2.toString());
	  System.out.println("checking the hash code for the mySingletonClass3" + mySingletonClass3.toString());
	  System.out.println("checking the hash code for the mySingletonClass4" + mySingletonClass4.toString());
	  System.out.println("checking the hash code for the mySingletonClass5" + mySingletonClass5.toString());
	  
	  TestingSingletonPattern testingSingletonPattern = new TestingSingletonPattern();
	  //mySingletonClass1.
	  try {
		  TestingSingletonPattern cloneObject = (TestingSingletonPattern) testingSingletonPattern.clone();
		  System.out.println("Original  object " +testingSingletonPattern.toString());
		  System.out.println("Original  object " +testingSingletonPattern.name);
		  testingSingletonPattern.name = "WASEDEV";
		  System.out.println("Original  object " +testingSingletonPattern.name);
		  System.out.println("Clone object " +cloneObject.toString());
		  System.out.println("Original  object " +cloneObject.name);
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  //mySingletonClass1.clone();

	}

}
