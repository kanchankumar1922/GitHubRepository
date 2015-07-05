package com.examples.reflect;

public class ReflectTestingClass {
	
	private String privateSimpleNameOfClass = ReflectClassTestMain.class.getSimpleName();
	public String publicCanonicalName = ReflectClassTestMain.class.getCanonicalName();
	
	
	
	/**
	 * 
	 */
	public ReflectTestingClass() {
		super();
		//new ReflectTestingClass("name1" , "name2");
	}


	

	/**
	 * @param privateSimpleNameOfClass
	 * @param publicCanonicalName
	 */
	private ReflectTestingClass(String privateSimpleNameOfClass,String publicCanonicalName) {
		//super();
		this.privateSimpleNameOfClass = privateSimpleNameOfClass;
		this.publicCanonicalName = publicCanonicalName;
	}




	private String getNameOfClass(){
		//ReflectTestingClass reflectTestingClass = new ReflectTestingClass(privateSimpleNameOfClass, publicCanonicalName);
		return  "Hi The class Name is ::  " + privateSimpleNameOfClass + "   And canonical Name is " + publicCanonicalName;
	}

}
