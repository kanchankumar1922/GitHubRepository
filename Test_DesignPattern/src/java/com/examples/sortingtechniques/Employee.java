/**
 * 
 */
package com.examples.sortingtechniques;

import java.util.Comparator;

/**
 * @author kumark
 *
 */
public class Employee implements Comparable<Employee>{
	
	private int employeeId;
	private String employeeName;
	private int salary;
	
	public Employee(int id , String name , int salary){
		this.employeeId = id;
		this.employeeName = name;
		this.salary = salary;
	}
	/**
	 * @return the employeeId
	 */
	public int getEmployeeId() {
		return employeeId;
	}
	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}
	/**
	 * @param employeeName the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee o) {		
		return this.employeeName.compareTo(o.getEmployeeName());
	}
	
	public static Comparator<Employee> SalaryComparator = new Comparator<Employee>() {
		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getSalary() - o2.getSalary();
		}
		
	};
	
	public static Comparator<Employee> NameComparator = new Comparator<Employee>() {
		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getEmployeeName().compareTo(o2.getEmployeeName());
		}
		
	};
	
	public static Comparator<Employee> AgeComparator = new Comparator<Employee>() {
		@Override
		public int compare(Employee o1, Employee o2) {
			return 0;
		}
		
	};
	
	
	public static Comparator<Employee> IdComparator = new Comparator<Employee>() {
		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getEmployeeId() - o2.getEmployeeId();
		}
		
	};
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.employeeName + "-id-" + this.employeeId + "-salary-" + this.salary;
	}
	
	
	
	

}
