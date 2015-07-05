/**
 * 
 */
package com.examples.mesc;

import java.util.List;

/**
 * @author kumark
 *
 */
public class CollectionUtilsMain {

	
	private static String [] stringArrayObject = {"MOHAN" , "KAMAL" , "KANUA"};
	private static String stringObject = "MOHAN";
	private static int i = 100;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		
		CollectionUtils<List<String[]> , String[]> listStringsArray = new CollectionUtils<List<String[]> , String[]>();
		CollectionUtils<List<String> , String> listStrings = new CollectionUtils<List<String> , String>();
		CollectionUtils<List<Integer> , Integer> listIntegers = new CollectionUtils<List<Integer> , Integer>();
		
		List<String[]> lsa = listStringsArray.getCollectionObject(stringArrayObject);
		List<String> ls =  listStrings.getCollectionObject(stringObject);
		List<Integer> li =  listIntegers.getCollectionObject(i);
		
		System.out.println(lsa + "\n");
		System.out.println(ls + "\n");
		System.out.println(li + "\n");
		
		

	}

}
