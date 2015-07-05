/**
 * 
 */
package com.example.serialization;

import java.io.Serializable;

/**
 * @author kumark
 *
 */
public class Employee implements Serializable{

	   private String name;
	   private String address;
	   //private transient int SSN;
	   private int SSN;
	   //private int SSN;
	   private int number;
	   public void mailCheck()
	   {
	      System.out.println("Mailing a check to " + name
	                           + " " + address);
	   }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSSN() {
		return SSN;
	}
	public void setSSN(int sSN) {
		SSN = sSN;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	   
	@Override
	public String toString (){
		 String emplString = "\n-------------------------------------\n";
	     emplString += " Employee Class location :: " + Employee.class.getName();
		 emplString += " \n Employee Hash Code :: " + Employee.class.hashCode();
		 emplString += "\n Employee Name: " + this.getName();
		 emplString += "\n Employee Address: " + this.getAddress();
		 emplString += "\n Employee SSN: " + this.getSSN();
		 emplString += "\n Employee Number: " + this.getNumber();
		 emplString += "\n--------------------------------------\n";
		return emplString;
	}

}
