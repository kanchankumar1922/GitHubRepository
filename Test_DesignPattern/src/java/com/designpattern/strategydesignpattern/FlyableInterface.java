package com.designpattern.strategydesignpattern;

public interface FlyableInterface {
	
	public String fly();

}

class ICanFly implements FlyableInterface{

	public String fly() {
		return "I CAN FLY";
	}
	
}

class ICanNotFly implements FlyableInterface{

	public String fly() {
		return "I CAN NOT FLY";
	}
	
}