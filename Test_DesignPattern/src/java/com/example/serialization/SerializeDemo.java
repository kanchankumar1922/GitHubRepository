/**
 * 
 */
package com.example.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author kumark
 *
 */
public class SerializeDemo {

	private static String SER_FILE_NAME = "src/java/com/example/serialization/employee.ser";
	public static void main(String [] args)
	   {
	      Employee e = new Employee();
	      e.setName("Kanchan Kumar");
	      e.setAddress("450 S Peachtree pkwy , Peachtree city , GA 30269");
	      e.setSSN(844475259);
	      e.setNumber(101);
	      try
	      {
	         FileOutputStream fileOut = new FileOutputStream(SER_FILE_NAME);
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(e);
	         out.close();
	         fileOut.close();
	         System.out.println("The Employee Object got Serialized");
	      }catch(IOException i)
	      {
	          i.printStackTrace();
	      }
	   }

}
