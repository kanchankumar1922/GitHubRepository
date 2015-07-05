/**
 * 
 */
package com.designpattern.compositedesignpattern;

/**
 * @author kumark
 *
 */
public class Developer extends Employee {

	private String name;
	private float salary;
	/**
	 * @param name
	 * @param salary
	 */
	public Developer(String name, float salary) {
		EMPLOYEE_POST = "DEVELOPER";
		this.name = name;
		this.salary = salary;
	}

	/* (non-Javadoc)
	 * @see com.designpattern.compositedesignpattern.Employee#add(com.designpattern.compositedesignpattern.Employee)
	 */
	@Override
	public void add(Employee employee) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.designpattern.compositedesignpattern.Employee#remove(com.designpattern.compositedesignpattern.Employee)
	 */
	@Override
	public void remove(Employee employee) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.designpattern.compositedesignpattern.Employee#getChild(int)
	 */
	@Override
	public Employee getChild(int i) {
		// TODO Auto-generated method stub
		return null;
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

	}

}
