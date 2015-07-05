/**
 * 
 */
package com.examples.generics;

/**
 * @author kumark
 * 
 */
public class UseTwo<S , I> {
	private S one;
	private I two;

	UseTwo(S one, I two) {
		this.one = one;
		this.two = two;
	}

	S getS() {
		return one;
	}

	I getI() {
		return two;
	}

	// test it by creating it with <String, Integer>
	public static void main(String[] args) {
		UseTwo<String, Integer> twos = new UseTwo<String, Integer>("foo", 42);
		//twos.S;
		String str = twos.one;
		String theS = twos.getS(); // returns a String
		int theI = twos.getI(); // returns Integer, unboxes to int
		
		System.out.println(" She string-> " + theS + " \n She Integer-> " +theI );
	}
}