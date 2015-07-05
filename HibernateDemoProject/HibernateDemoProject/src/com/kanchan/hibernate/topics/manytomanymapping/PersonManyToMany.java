package com.kanchan.hibernate.topics.manytomanymapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity(name = "manytomanymapping.Person")
@Table (name = "PERSON_MANY_TO_MANY")
public class PersonManyToMany {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	//@SequenceGenerator(name = "SOMETHING_SEQ")
	//@GeneratedValue(strategy = GenerationType.AUTO, generator = "SOMETHING_SEQ")	                
	@Column (name  = "PERSON_ID")
    private int id;
	@Column (name  = "PERSON_FNAME")
    private String fName;
	@Column (name  = "PERSON_LNAME")
    private String lName;
	@Column (name  = "GENDER")
    private String gender;
	@Column (name  = "AGE")
    private int age;

	/*
	 * Either way we can configure the Join Table name and the JoinColumn and InverseJoinColumn Attributes
	 * and Mapped By Also
	 */
	@ManyToMany  // (mappedBy = "listOfPerson")
	@JoinTable(name = "PERSON_VEHICLE" , joinColumns = @JoinColumn(name = "PERSON_ID") ,
	                                     inverseJoinColumns = @JoinColumn(name = "VEHICLE_ID"))
	
	private List<VehicleManyToMany> listOfVehicle = new ArrayList<VehicleManyToMany>();
	

	public List<VehicleManyToMany> getListOfVehicle() {
		return listOfVehicle;
	}

	public void setListOfVehicle(List<VehicleManyToMany> listOfVehicle) {
		this.listOfVehicle = listOfVehicle;
	}

	public PersonManyToMany() {
        System.out.println("person constructor called");
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getfName() {
        return fName;
    }

    public String getGender() {
        return gender;
    }

    public String getlName() {
        return lName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

}
