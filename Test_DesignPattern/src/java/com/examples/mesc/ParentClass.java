package com.examples.mesc;


public class ParentClass {
	
	public ParentClass(){
		//System.out.println("Parent Class");
	}
	
	public String getParentClassName(){
		return ParentClass.class.getSimpleName();
	}
	
	protected String methodToBeSubclassed(){
		return "";
	}
	

}
