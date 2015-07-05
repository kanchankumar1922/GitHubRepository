package com.kanchan.hibernate.topics.inheritance;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "VEHICLE_FOUR_WHEELER")
@DiscriminatorValue("FOUR_WHEELER_CAR")
public class VehicleFourWheeler extends VehicleInheritance {
	
	@Column(name = "STEERING_WHEEL")
	private String steeringWheel;

	public String getSteeringWheel() {
		return steeringWheel;
	}

	public void setSteeringWheel(String steeringWheel) {
		this.steeringWheel = steeringWheel;
	}
	
	

}
