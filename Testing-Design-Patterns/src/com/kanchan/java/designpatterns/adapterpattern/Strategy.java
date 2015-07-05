package com.kanchan.java.designpatterns.adapterpattern;

public interface Strategy {

	int doOperation(int x , int y);
}

class AddingStrategy implements Strategy{

	/* (non-Javadoc)
	 * @see com.kanchan.java.designpatterns.strategypattern.Strategy#doOperation(int, int)
	 */
	@Override
	public int doOperation(int x, int y) {
		System.out.println("IN Addition Strategy now adding");
		return x + y;
	}
	
}

class SubtractionStrategy implements Strategy{

	/* (non-Javadoc)
	 * @see com.kanchan.java.designpatterns.strategypattern.Strategy#doOperation(int, int)
	 */
	@Override
	public int doOperation(int x, int y) {
		System.out.println("IN Subtraction Strategy now subtracting");
		return x - y;
	}
	
}
