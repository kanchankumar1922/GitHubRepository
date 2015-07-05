package com.designpattern.singletondesignpattern;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("safsdafsdf");

		TestingSingletonPattern testingSingletonPattern = new TestingSingletonPattern();
		MySingletonClass mySingletonClass = MySingletonClass
				.getSingleInstance();
		mySingletonClass.clone();

		System.out.println(mySingletonClass);
		System.out.println(mySingletonClass.clone());
	}

}
