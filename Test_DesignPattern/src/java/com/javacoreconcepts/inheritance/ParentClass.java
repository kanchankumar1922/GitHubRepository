/**
 * 
 */
package com.javacoreconcepts.inheritance;

/**
 * @author JSRK
 *
 */
public class ParentClass extends AbstractClassForParent{

	/**
	 * 
	 */
	public ParentClass() {
		// TODO Auto-generated constructor stub
	}
	
	public String getParentClassName() {
		return "this is parent class";
	}

	@Override
	public void breath() {
		System.out.println("this is the Human creature");
	}

	@Override
	public String callAbstractMethod() {
		
		return "this is the parent class returning the overridden method of the abstract class";
	}

}
