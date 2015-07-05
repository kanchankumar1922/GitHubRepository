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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "manytomanymapping.Vehicle")
@Table(name = "VEHICLE_MANY_TO_MANY")
public class VehicleManyToMany {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "VEHICLE_ID")
	private int vehicleID;
	@Column(name = "VEHICLE_NAME")
	private String vehicleName;
	/*
	 * Either way we can configure the Join Table name and the JoinColumn and InverseJoinColumn Attributes
	 */
	@ManyToMany (mappedBy = "listOfVehicle")
	/*@JoinTable(name = "VEHICLE_PERSON" , joinColumns = @JoinColumn(name = "VEHICLE_ID") ,
    inverseJoinColumns = @JoinColumn(name = "PERSON_ID"))*/
	private List<PersonManyToMany> listOfPerson = new ArrayList<PersonManyToMany>();
	
	public List<PersonManyToMany> getListOfPerson() {
		return listOfPerson;
	}
	public void setListOfPerson(List<PersonManyToMany> listOfPerson) {
		this.listOfPerson = listOfPerson;
	}
	public int getVehicleID() {
		return vehicleID;
	}
	public void setVehicleID(int vehicleID) {
		this.vehicleID = vehicleID;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	
	

}
