/**
 * 
 */
package com.examples.regularexpression;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author kumark
 *
 */
public class RegularExpressionTestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String EXAMPLE_TEST = " this is test email 23@test .com ";
		String phoneNumberString = " +1-(262) +1-(262)955-4400 1-(262) 955@-4400 1 (262) 9554400 1(262)9554400 (262) 955 4400 262 955 4400 2629554400";
		//String phoneNumberString = " +1-(262) 262 ";
		Pattern pattern =  Pattern.compile("(\\s[A-Za-z]+)?(\\.[A-Za-z]+)?");
		//String str1 = 
		Pattern phoneNumberPatternOld = Pattern.compile("(\\s(\\+)?[0-9]{1}( |-)?)?(\\()?[0-9]{3}(\\))?(\\s)?[0-9]{3}@?( |-)?[0-9]{4}?");
		Pattern phoneNumberPatternNew = Pattern.compile("\\s?\\+?([0-9]{1})?\\-?\\s?\\(?[0-9]{3}?\\)?\\s?[0-9]{3}?\\@?\\-?\\s?\\-?[0-9]{4}?");
		//Pattern phoneNumberPattern = Pattern.compile("\\s[0-9]{3}\\s");
		Matcher matcher = pattern.matcher(EXAMPLE_TEST);
		Matcher PhoneNumbermatcherOld = phoneNumberPatternOld.matcher(phoneNumberString);
		Matcher PhoneNumbermatcherNew = phoneNumberPatternNew.matcher(phoneNumberString);
		
		
		String REGEX = "(( )?[a-zA-Z]{3}( )?)+";
	    String INPUT = " foo foo ";
	    
	       pattern = Pattern.compile(REGEX);
	       matcher = pattern.matcher(INPUT);

	       System.out.println("Current REGEX is: "+REGEX);
	       System.out.println("Current INPUT is: "+INPUT);

	       System.out.println("lookingAt(): "+matcher.lookingAt());
	       System.out.println("matches(): "+matcher.matches());
	   
		while (PhoneNumbermatcherOld.find()) {
		      System.out.print("Start index: " + PhoneNumbermatcherOld.start());
		      System.out.print(" End index: " + PhoneNumbermatcherOld.end() + " ");
		      System.out.println("Matched String :: " + PhoneNumbermatcherOld.group());
		    }
		System.out.println("--------------------------------------------------------------------");
		while (PhoneNumbermatcherNew.find()) {
		      System.out.print("Start index: " + PhoneNumbermatcherNew.start());
		      System.out.print(" End index: " + PhoneNumbermatcherNew.end() + " ");
		      System.out.println("Matched String :: " + PhoneNumbermatcherNew.group());
		    }
		/*while (matcher.find()) {
		      System.out.print("Start index: " + matcher.start());
		      System.out.print(" End index: " + matcher.end() + " ");
		      System.out.println("Matched String :: " + matcher.group());
		    }*/
		
		
		    // Now create a new pattern and matcher to replace whitespace with tabs
		    /*Pattern replace = Pattern.compile("\\s+");
		    Matcher matcher2 = replace.matcher(EXAMPLE_TEST);
		    System.out.println(matcher2.replaceAll("\t"));*/
	     
		System.out.println("NO MATCH FOUND");
		String str = "5 * x^3 - 6 * x^1 + 1";
		String replacedStr = str.replaceAll("(\\w+)", "\"<sup>\\$1</sup>\"");
		System.out.println(replacedStr);
		
		String input = "hello I'm a java dev no job experience needed senior software engineer java job available for senior software engineer";
		String fixedInput = input.replaceAll("(java|job|senior)", "<b>$1</b>");
		System.out.println(fixedInput);
		
		String replacedStringM = str.replaceAll("\\^([0-9]+)", "<sup>$1</sup>");
		System.out.println(replacedStringM);
		
		String option=null;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try {
			option=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		/*ParentClass parentClass = new ParentClass();
		ChildClass childClass  = (ChildClass) parentClass;
		childClass.parentMethod();*/
		
		
		
	}


}
