/**
 * 
 */
package com.javacoreconcepts.inheritance;

/**
 * @author JSRK
 *
 */
public class ChildClass extends ParentClass{

	private static int count = 0;
	public static void main(String [] args) {

		ParentClass parentt = new ParentClass();
		System.out.println( parentt.getParentClassName() );
		
		ParentClass parent = new ChildClass();
		System.out.println( parent.getParentClassName() );
		
		ChildClass childClas = new ChildClass();
		System.out.println( childClas.getParentClassName());
		
		
	}
	/**
	 * 
	 */
	public ChildClass() {
		// TODO Auto-generated constructor stub
	}
	
	public String getChildClassName() {
		
		return "ChildName";
	}
	@Override
	public String getParentClassName() {
		System.out.println("overridden of getParentClass Called" + count);
		count ++;
		ChildClass child = new ChildClass();
		try {
			//if (count <5227)
				//child.callNonAbstractMethod(child);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
		
		//return super.getParentClassName();
		return "getParent Class Method Overridden";
	}
	
	

}
