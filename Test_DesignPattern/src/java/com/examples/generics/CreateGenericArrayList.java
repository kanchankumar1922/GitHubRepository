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
public class CreateGenericArrayList<T , X> {

	private T elem; 
	public Map<String  , List<T>> makeGenericArrayList(T t , X x) { // take an object of an // unknown type and use a // "T" to represent the type
		List<T> listT = new ArrayList<T>(); // now we can create the // list using "T"
		List<X> listX = new ArrayList<X>(); // now we can create the // list using "X"
		Map<String , List<T>> mapT  = new TreeMap<String, List<T>>();
		Map<String , List<X>> mapX  = new TreeMap<String, List<X>>();
		listT.add(t);
		listX.add(x);
		mapT.put(getAnimalType(t), listT);
		mapX.put(getAnimalType(x), listX);
		
		List<Map<String , List<T>>> listMap = new ArrayList<Map<String,List<T>>>();
		listMap.add(mapT);
		this.elem = t;
		return mapT;
		}
	
	 public Map<String , List<? super Animal>> addArrayListToMap(Map<String , List<? super Animal>> map , T t){
		 //List<T> listT= map.get("StringT");
		 List<? super Animal> listT= map.get(getAnimalType(t));
		 //listT.add(t);
		 map.put("StringT", listT);
		 return map;
		
	 }
	
	/**
	 * @param args
	 */
	
	public String getAnimalType(Object elem){
		boolean isAnimal = elem instanceof Animal;
		System.out.println("elem instanceof Animal " + isAnimal);
		if(elem instanceof Animal)return "dog";
		else if(elem instanceof Cat)return "cat";
		else{return "";}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("############");
		CreateGenericArrayList<Dog , Cat> createGenericArrayList = new CreateGenericArrayList<Dog , Cat>();
		Map<String , List<Dog>> mapStringList =  createGenericArrayList.makeGenericArrayList(new Dog() , new Cat() );
		Dog dog = new Dog();
		Cat cat = new Cat();
		//mapStringList = createGenericArrayList.addArrayListToMap(mapStringList, cat);
		System.out.println("list >>> " + mapStringList);
		
		//mapStringList = createAnArrayList.addArrayListToMap(mapStringList, new String("KUMAR"));
		
		//System.out.println(mapStringList);
		//System.out.println(createAnArrayList.getType(""));

	}

}
