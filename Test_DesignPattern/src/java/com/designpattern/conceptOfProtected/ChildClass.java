/**
 * 
 */
package com.designpattern.conceptOfProtected;

import com.designpattern.latch.ParentClass;

/**
 * @author kumark
 *
 */
public class ChildClass extends ParentClass{

	public static String childString = parentProtectedString;
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ParentClass parentClass = new ChildClass();
		parentClass.printParentName();
		System.out.println(parentProtectedString);
	}
	
	public void printChildName(){
		System.out.println("Hi i am child of Parent class");
	}
	@Override
	public void printParentName(){
		System.out.println("Hi i am child class and i have overwridden the parent class method printParentName");
	}

}
