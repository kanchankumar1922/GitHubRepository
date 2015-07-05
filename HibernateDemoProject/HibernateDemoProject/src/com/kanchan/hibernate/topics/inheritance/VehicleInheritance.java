package com.kanchan.hibernate.topics.inheritance;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity(name = "inheritance.Vehicle" )
@Table(name = "VEHICLE_INHERITANCE")
@DiscriminatorColumn( name = "VEHICLE_TYPE" , discriminatorType = DiscriminatorType.STRING)
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Inheritance(strategy = InheritanceType.JOINED)
public class VehicleInheritance {
	
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
