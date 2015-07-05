/**
 * 
 */
package com.javacoreconcepts.inheritance;

/**
 * @author JSRK
 *
 */
public abstract class AbstractClassForParent implements Creature{

	/**
	 * 
	 */
	public AbstractClassForParent() {
		// TODO Auto-generated constructor stub
	}
	
	public void callNonAbstractMethod(ChildClass child){
		child.getParentClassName();
		System.out.println("this is the non abstract method of the abstract class");
	}
	public abstract String callAbstractMethod();

}
