/**
 * 
 */
package com.examples.mesc;

/**
 * @author JSRK
 *
 */
public class FloydTriangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		for (int i = 0 ; i < 10 ; i++){
			for (int y = i ; y <= i+1 ; y++){
				System.out.print(" ");
				System.out.print(y+1);
			}
			System.out.println();
		}

	}

}
