package com.kanchan.hibernate.topics.onetoonemapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "onetoonemapping.Vehicle")
@Table(name = "VEHICLE_ONE_TO_ONE")
public class VehicleOneToOne {
	
	@Column (name = "VEHICE_ID")
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int vehicleID;
	
	@Column (name = "VEHICE_NAME")
	private String vehicleName;
	
	
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
