/**
 * 
 */
package com.designpattern.annotations;

import java.lang.reflect.Method;

/**
 * @author kumark
 *
 */
@MyAnnotation(date="22/10/2011,23/10/2011" , prefixPage = "Hi My First Time Reader")
@EmployeeAnnotation(customizedString = "HI Mr Kanchan")
public class TestAnnotation {

	/**
	 * @param args
	 */

		// Applying annotation to the method
	    @MyAnnotation(author="Kumar",date="22/10/2011")
	    public static void testMethod()
	    {
	        System.out.println("Welcome to Java");
	        System.out.println("This is an example of Annotations");
	    }
	    public static void main(String args[])
	    {
	        testMethod();
	        String strNotNullCheck = null;
	        showAnnotations(strNotNullCheck);
	        
	    }
	

	public static void showAnnotations(String str)
	// Function to show annotation information
	{
		TestAnnotation test= new TestAnnotation(); // Instantiating Test class
	    try
	    {
	        Class<? extends TestAnnotation> c = test.getClass(); // Getting Class reference
	        
	        Method m = c.getMethod("testMethod"); // Getting Method reference
	        // Getting Class annotation
	        MyAnnotation myAnnotation1 = c.getAnnotation(MyAnnotation.class);
	        // Getting Method annotation
	        MyAnnotation myAnnotation2 = m.getAnnotation(MyAnnotation.class);
	        
	        EmployeeAnnotation employeeAnnotation = c.getAnnotation(EmployeeAnnotation.class);
	        // Displaying annotation information
	        System.out.println("Author of the class: "+myAnnotation1.author());
	        // Displaying annotation information
	        System.out.println("Date of Writing the class: "+myAnnotation1.date());
	        // Displaying annotation information
	        System.out.println("Author of the method: "+myAnnotation2.author());
	        // Displaying annotation information
	        System.out.println("Date of Writing the method: "+myAnnotation2.date());
	        
	        System.out.println("annotation1.prefixPage() :: " + myAnnotation1.prefixPage());
	        System.out.println("Employee Annotataion  :: " + employeeAnnotation.customizedString());
	        
	        
	        System.gc();
	        //TestAnnotation.class.
	       
	    }
	    catch(NoSuchMethodException ex)
	    {
	        System.out.println("Invalid Method..."+ex.getMessage());
	    }
	}
	
	public String getName(){
		return "kanchan";
	}
	
	protected void finalize(){
		System.out.println("Finalize called");
	}
	
	

}
