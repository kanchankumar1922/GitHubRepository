/**
 * 
 */
package com.designpattern.compositedesignpattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author kumark
 *
 */
public class Manager extends Employee {

	private float salary;
	private String name;
	private List<Employee> listEmployees = new ArrayList<Employee>();
	
	/**
	 * @param salary
	 * @param name
	 */
	public Manager(String name , float salary ) {
		EMPLOYEE_POST = "MANAGER";
		this.name = name;
		this.salary = salary;
	}


	/* (non-Javadoc)
	 * @see com.designpattern.compositedesignpattern.Employee#add(com.designpattern.compositedesignpattern.Employee)
	 */
	@Override
	public void add(Employee employee) {
		listEmployees.add(employee);

	}

	/* (non-Javadoc)
	 * @see com.designpattern.compositedesignpattern.Employee#remove(com.designpattern.compositedesignpattern.Employee)
	 */
	@Override
	public void remove(Employee employee) {
		listEmployees.remove(employee);

	}

	/* (non-Javadoc)
	 * @see com.designpattern.compositedesignpattern.Employee#getChild(int)
	 */
	@Override
	public Employee getChild(int i) {
		return listEmployees.get(i);
	}

	/* (non-Javadoc)
	 * @see com.designpattern.compositedesignpattern.Employee#getName()
	 */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	/* (non-Javadoc)
	 * @see com.designpattern.compositedesignpattern.Employee#getSalary()
	 */
	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return this.salary;
	}

	/* (non-Javadoc)
	 * @see com.designpattern.compositedesignpattern.Employee#print()
	 */
	@Override
	public void print() {

		System.out.println("------------------");
		System.out.println("NAME :: " + getName() + " ::" + getEmployeePost());
		System.out.println("SALARY :: " + getSalary());
		System.out.println("------------------");
		
		Iterator<Employee> iteratorEmployee = listEmployees.iterator();
		while(iteratorEmployee.hasNext()){
			iteratorEmployee.next().print();
		}
	}

}
