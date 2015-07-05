package com.examples.mesc;

public class NestedInterfaceClassMain {

	private static final String NESTED_NAME = "KK";
	public static void main(String[] args) {
		
	       NestedInterfaceClass.NestedClassOne nestedClassOne = new NestedInterfaceClass.NestedClassOne();
	       System.out.println( nestedClassOne.nestedInterfaceMethodOne(NestedInterfaceClassMain.NESTED_NAME) );
	       
	       NestedInterfaceClass.NestedInterfaceOne nestedInterfaceOne = new NestedInterfaceClassImpl();
	       nestedInterfaceOne.nestedInterfaceMethodOne(NestedInterfaceClassMain.NESTED_NAME);
	       
		}

}
