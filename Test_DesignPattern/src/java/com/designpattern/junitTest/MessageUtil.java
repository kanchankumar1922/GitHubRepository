/**
 * 
 */
package com.designpattern.junitTest;

/**
 * @author kumark
 *
 */
public class MessageUtil {

	   private String message;

	   //Constructor
	   //@param message to be printed
	   public MessageUtil(String message){
	      this.message = message; 
	   }

	   // prints the message
	   public String getMessageToPrint(){
	      System.out.println(message);
	      return message;
	   }   

	   // add "Hi!" to the message
	   public String salutationMessage(){
	      message = "Hi!" + message;
	      System.out.println(message);
	      return message;
	   }   
	}  
