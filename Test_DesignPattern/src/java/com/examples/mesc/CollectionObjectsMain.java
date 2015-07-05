/**
 * 
 */
package com.examples.mesc;

import java.util.HashMap;
import java.util.Map;

/**
 * @author JSRK
 *
 */
public class CollectionObjectsMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Employee employee1 = new Employee("10001" , "RAMESHA");
		Employee employee2 = new Employee("10001" , "NARAYAN");
		
		System.out.println( "employee 1 :: " + employee1.hashCode() );
		
		Map<Employee, String> employeeMap = new HashMap<Employee , String>();
		employeeMap.put(employee1, "EMPLOYEE1");
		employeeMap.put(employee2, "EMPLOYEE2");
		
		System.out.println(employeeMap);
		

	}

}
