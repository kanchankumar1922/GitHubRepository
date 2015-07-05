package com.examples.sortingtechniques;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SortingTestMain {
	
	public static void main(String agrs []){
		
		
		Employee employee1 = new Employee(1007 , "DIKSHIT" , 5000);
		Employee employee2 = new Employee(1002 , "RAMU" , 12000);
		Employee employee3 = new Employee(1006 , "UMESHA" , 8000);
		Employee employee4 = new Employee(1004 , "KALICHARAN" , 9000);
		Employee employee5 = new Employee(1001 , "YOGESH" , 6300);
		Employee employee6 = new Employee(1003 , "SHALINI" , 21000);
		Employee employee7 = new Employee(1005 , "AMAR" , 15000);
		
		List<Employee> listEmployees = new ArrayList<Employee>();
		listEmployees.add(employee1);
		listEmployees.add(employee2);
		listEmployees.add(employee3);
		listEmployees.add(employee4);
		listEmployees.add(employee5);
		listEmployees.add(employee6);
		listEmployees.add(employee7);
		
		Employee [] employeesArray = listEmployees.toArray(new Employee[listEmployees.size()]);
		//Employee [] employeesArray = new Employee[10];
		
		/*System.out.println(" :: BEFORE SORTING :: " + listEmployees);
		Collections.sort(listEmployees);
		System.out.println(" :: AFTER SORTING :: " + listEmployees);*/
		
		System.out.println(" :: BEFORE SORTING BYNAME :: " + Arrays.toString(employeesArray));
		Arrays.sort(employeesArray, Employee.NameComparator);
		System.out.println(" :: AFTER SORTING BY NAME :: " + Arrays.toString(employeesArray));
		
		System.out.println("----#########################################----");
		
		System.out.println(" :: BEFORE SORTING BY ID :: " + Arrays.toString(employeesArray));
		Arrays.sort(employeesArray, Employee.IdComparator);
		System.out.println(" :: AFTER SORTING BY ID :: " + Arrays.toString(employeesArray));
		
		System.out.println("----#########################################----");
		
		System.out.println(" :: BEFORE SORTING BY SALARY :: " + Arrays.toString(employeesArray));
		Arrays.sort(employeesArray, Employee.SalaryComparator);
		System.out.println(" :: AFTER SORTING BY SALARY :: " + Arrays.toString(employeesArray) + "\n");
		
		
		Set<Employee> setOfEmployee = new HashSet<Employee>(listEmployees);
		System.out.println("SET :: " + setOfEmployee.toString());
 	}

}
