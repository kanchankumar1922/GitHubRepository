package com.kanchan.hibernate.topics.inheritance;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "VEHICLE_TWO_WHEELER")
@DiscriminatorValue("TWO_WHEELER_BIKE")
public class VehicleTwoWheeler extends VehicleInheritance {
	
	@Column(name = "HANDLE")
	private String steeringHandle;

	public String getSteeringWheel() {
		return steeringHandle;
	}

	public void setSteeringHandle(String steeringHandle) {
		this.steeringHandle = steeringHandle;
	};
	
	

}
