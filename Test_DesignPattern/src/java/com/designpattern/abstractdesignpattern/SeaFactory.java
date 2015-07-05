package com.designpattern.abstractdesignpattern;

public class SeaFactory implements AnimalFactory {

	@Override
	public Animal createAnimal() {		
		return new Shark();
	}

}
