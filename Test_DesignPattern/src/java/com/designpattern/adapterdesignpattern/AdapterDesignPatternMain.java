/**
 * 
 */
package com.designpattern.adapterdesignpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kumark
 *
 */
public class AdapterDesignPatternMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
      
		List<String> stringList = new ArrayList<String>();
		stringList.add("NAME");
		stringList.add("HOME-ADDRESS");
		stringList.add("EMAIL-ADDRESS");
		stringList.add("DEPARTMENT");
		
		PrintableList printableList = new PrintableListAdapter();
		printableList.printList(stringList);
	}

}
