/**
 * 
 */
package com.designpattern.compositedesignpattern;

/**
 * @author kumark
 *
 */
public abstract class Employee {
	
	protected static String EMPLOYEE_POST = "Default employee post";
	
	public abstract void add(Employee employee);  
    public abstract void remove(Employee employee);  
    public abstract Employee getChild(int i);  
    public abstract String getName();  
    public abstract double getSalary();  
    public abstract void print(); 
    public String getEmployeePost(){
    	return EMPLOYEE_POST;
    }

}
