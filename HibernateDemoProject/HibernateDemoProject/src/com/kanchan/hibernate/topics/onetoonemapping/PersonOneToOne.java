package com.kanchan.hibernate.topics.onetoonemapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "onetoonemapping.Person")
@Table (name = "PERSON_ONE_TO_ONE" , schema = "public")
public class PersonOneToOne {

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

	@OneToOne
	@JoinColumn(name = "VEHICLE_ID")
	private VehicleOneToOne vehicle;
	
	
	public VehicleOneToOne getVehicle() {
		return vehicle;
	}

	public void setVehicle(VehicleOneToOne vehicle) {
		this.vehicle = vehicle;
	}

	public PersonOneToOne() {
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
