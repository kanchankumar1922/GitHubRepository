package com.examples.mesc;

import java.util.regex.Pattern;

public class UCF {

	static String s;
	public static void main(String[] args) {

		int x =4;
		if(x<4) System.out.println("val = " +x);
		else System.out.println(s);
		
		//System.out.println( Pattern.compile("\\w").matcher("An egg") );
		
		String s = "ab" + "12"; 
		String t = "ab" + 12;
		String u = new String("ab12");
		System.out.println((s == t) + "" + (s == u));
		boolean b = false;
		/*while (b = Pattern.compile("\\w").matcher("An egg").find()){
			//System.out.println(Pattern.compile("\\w").matcher("An egg").start());
		}*/
		
		
	}

}
