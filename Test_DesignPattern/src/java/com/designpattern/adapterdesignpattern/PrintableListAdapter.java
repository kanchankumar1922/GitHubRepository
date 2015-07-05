/**
 * 
 */
package com.designpattern.adapterdesignpattern;

import java.util.List;

/**
 * @author kumark
 *
 */
public class PrintableListAdapter implements PrintableList {

	/* (non-Javadoc)
	 * @see com.designpattern.adapterdesignpattern.PrintableList#printList(java.util.List)
	 */
	@Override
	public void printList(List<String> list) {

		String str = "";
		for(String s : list){
			str += s +'\t';
		}
		
		PrintString printString = new PrintString();
		printString.print(str);
	}

}
