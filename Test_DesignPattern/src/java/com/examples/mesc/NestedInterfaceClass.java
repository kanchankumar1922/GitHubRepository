/**
 * 
 */
package com.examples.mesc;

/**
 * @author kumark
 *
 */
public class NestedInterfaceClass {

	
	public static interface NestedInterfaceOne{		
		String nestedInterfaceMethodOne(String echo);
	}
	
	public static class NestedClassOne implements NestedInterfaceOne{

		@Override
		public String nestedInterfaceMethodOne(String echo) {			
			return "Hello " +echo + " !";
		}
		
	}

}
