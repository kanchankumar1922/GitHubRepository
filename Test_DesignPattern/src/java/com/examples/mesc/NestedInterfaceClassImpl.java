package com.examples.mesc;


public class NestedInterfaceClassImpl implements  NestedInterfaceClass.NestedInterfaceOne{

	@Override
	public String nestedInterfaceMethodOne(String echo) {
		return "HI " + echo;
	}

}
