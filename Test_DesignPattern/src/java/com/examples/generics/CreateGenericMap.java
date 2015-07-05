/**
 * 
 */
package com.examples.generics;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

/**
 * @author kumark
 *
 */
public class CreateGenericMap<T , X> {

	private static Logger log = Logger.getLogger(CreateStaticMap.class.getName());
	private T t;
	private X x;
	private Map<T , X> map = new HashMap<T, X>();
	public CreateGenericMap(T t, X x) {
		this.t = t;
		this.x = x;
		map.put(t, x);
	}
	
	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public X getX() {
		return x;
	}

	public void setX(X x) {
		this.x = x;
	}

	public String toString(){
		return "String " + this.t + " Has " + this.x.toString();
	}
	
	public Map<T, X> getMapObject(){
		return this.map;
	}
	
	public Map<T, X> addObjectToMap(T t , X x , Map<T, X> map){
		this.map.put(t, x);
		return this.map;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		CreateGenericMap<String , Animal> createGenericMap = new CreateGenericMap<String , Animal>("CAT", new Cat());
		String str = createGenericMap.getT();
		Animal animal = createGenericMap.getX();
		
		log.info(animal.toString());
		log.info("String " + str + " Has Class " + animal);
		
		System.out.println(createGenericMap.getMapObject());
		
		Map<String , Animal> updatedMap = createGenericMap.addObjectToMap("DOG", new Dog(), createGenericMap.getMapObject());
		log.info(createGenericMap.getMapObject());
		log.info("updatedMap :: " + updatedMap);
		System.out.println(createGenericMap.getT() + createGenericMap.getX());

	}

}
