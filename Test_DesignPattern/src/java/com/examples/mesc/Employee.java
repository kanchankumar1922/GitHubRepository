/**
 * 
 */
package com.examples.mesc;

/**
 * @author JSRK
 *
 */
public class Employee {
	
	private String name;
	private String Id;
	
	
	public Employee(String name, String id) {
		super();
		this.name = name;
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	
	@Override
	public int hashCode() {
		System.out.println("ID HASH CODE : " + Id.hashCode());
		System.out.println("NAME hash code :"  + name.hashCode());
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Employee other = (Employee) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.getId()))
			return false;/*
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;*/
		return true;
	}
	
	
	

}
