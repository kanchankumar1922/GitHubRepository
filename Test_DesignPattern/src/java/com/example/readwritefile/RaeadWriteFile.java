/**
 * 
 */
package com.example.readwritefile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author JSRK
 *
 */
public class RaeadWriteFile {
	
	//private final static String FILE_PATH_NAME = "/Test_DesignPattern/src/java/com/example/readwritefile/testFile.txt";
	private final static String FILE_PATH_NAME = "C:\\kanchan\\Projects\\Test_DesignPattern\\src\\java\\com\\example\\readwritefile\\testFile.txt";
	private static String REG_EX = "(\\s+)?([0-9]+)?[A-Za-z]+[0-9]+\\@[A-Za-z]+\\.com";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Pattern pattern = Pattern.compile(REG_EX);
			
			writeFile(FILE_PATH_NAME, getCustomerDetails());
			
			BufferedReader br = readFile(FILE_PATH_NAME);
			System.out.println(br);
			String str;
			while ( (str = br.readLine()) != null){
				System.out.println( str );
				Matcher matcher = pattern.matcher(str);
				while(matcher.find()){
					System.out.println(matcher.group());
				}
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("the File not found exception occoured :: " +e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("the IO exception occoured :: " +e.getMessage());
			e.printStackTrace();
		}
		
		

	}
	
	
	public static BufferedReader readFile(String fileName) throws FileNotFoundException , IOException{
		
		return new BufferedReader(new FileReader(new File(fileName)));
	}
	
	public static void writeFile(String fileName , String content) throws FileNotFoundException , IOException{
		
      PrintWriter pw =  new PrintWriter(new BufferedWriter(new FileWriter(new File(fileName))));
      pw.println(content);
      pw.close();
     
	}
	
	public static String getCustomerDetails(){
		
		Customer [] customers = new Customer[5];
		customers[0] = new Customer("CUSTOMER 1", "52", "Cort Road 1", "1abc1@gmail.com");
		customers[1] = new Customer("CUSTOMER 2", "53", "Cort Road 2", "abc2@gmail.com");
		customers[2] = new Customer("CUSTOMER 3", "54", "Cort Road 3", "abc3@gmail.com");
		customers[3] = new Customer("CUSTOMER 4", "55", "Cort Road 4", "abc4@gmail.com");
		customers[4] = new Customer("CUSTOMER 5", "56", "Cort Road 5", "abc5@gmail.com");
		
		String str="";
		for (Customer customer : customers){
			str += "Customer Name : " + customer.getCustName() + " , Customer Age : " + customer.getCustAge() +
					" , Customer email : " + customer.getCustEmailAddress() +"\n";
		}
		
		return str;
	}

}

class Customer {
	
	private String custName;
	private String custAge;
	private String custAddress;
	private String custEmailAddress;
	
	
	public Customer(String custName, String custAge, String custAddress,String custEmailAddress) {
		this.custName = custName;
		this.custAge = custAge;
		this.custAddress = custAddress;
		this.custEmailAddress = custEmailAddress;
	}
	
	public String getCustName() {
		return custName;
	}
	public String getCustAge() {
		return custAge;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public String getCustEmailAddress() {
		return custEmailAddress;
	}
	
	
	
	
	
}
