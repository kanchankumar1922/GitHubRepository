package com.kanchan.hibernate.topics.onetomanymapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "onetomanymapping.Vehicle")
@Table(name = "VEHICLE_ONE_TO_MANY")
public class VehicleOneToMany {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "VEHICLE_ID")
	private int vehicleID;
	@Column(name = "VEHICLE_NAME")
	private String vehicleName;
	
	@ManyToOne
	@JoinColumn(name = "PERSON_ID")
	private PersonOneToMany person;
	
	public PersonOneToMany getPerson() {
		return person;
	}
	public void setPerson(PersonOneToMany person) {
		this.person = person;
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
