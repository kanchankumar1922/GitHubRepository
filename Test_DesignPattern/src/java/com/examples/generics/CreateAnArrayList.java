/**
 * 
 */
package com.examples.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author kumark
 *
 */
public class CreateAnArrayList<T , X> {

	private T elem; 
	public Map<String  , List> makeArrayList(T t , X x) { // take an object of an // unknown type and use a // "T" to represent the type
		List<T> listT = new ArrayList<T>(); // now we can create the // list using "T"
		List<X> listX = new ArrayList<X>(); // now we can create the // list using "X"
		Map<String , List> map  = new TreeMap<String, List>();
		listT.add(t);
		listX.add(x);
		map.put(getType(t), listT);
		map.put(getType(x), listX);
		this.elem = t;
		return map;
		}
	
	 public Map<String , List> addArrayListToMap(Map<String , List> map , T t){
		 //List<T> listT= map.get("StringT");
		 List<T> listT= map.get(getType(t));
		 listT.add(t);
		 map.put("StringT", listT);
		 return map;
		
	 }
	
	/**
	 * @param args
	 */
	
	public String getType(Object elem){
		if(elem instanceof String)return "StringT";
		else if(elem instanceof Integer)return "StringI";
		else{return "";}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CreateAnArrayList<String , Integer> createAnArrayList = new CreateAnArrayList<String , Integer>();
		Map<String , List> mapStringList =  createAnArrayList.makeArrayList(new String("KANCHAN") , new Integer(1) );
		System.out.println("list >>> " + mapStringList);
		
		mapStringList = createAnArrayList.addArrayListToMap(mapStringList, new String("KUMAR"));
		
		System.out.println(mapStringList);
		System.out.println(createAnArrayList.getType(""));

	}

}
