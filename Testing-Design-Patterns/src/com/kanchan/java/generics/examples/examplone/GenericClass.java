package com.kanchan.java.generics.examples.examplone;
import java.util.ArrayList;
import java.util.List;


public class GenericClass<T> {
	
	private List<T> list = new ArrayList<T>();
	
	private T t;
	public GenericClass (T t){
		this.t = t;
	}
	public List<T> getListOfObject(){
		list.add(t);
		return list;
	}
	

}
