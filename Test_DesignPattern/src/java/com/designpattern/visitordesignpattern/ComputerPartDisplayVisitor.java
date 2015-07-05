package com.designpattern.visitordesignpattern;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

	public ComputerPartDisplayVisitor() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void visit(ComputerPart part) {
			//part.accept(visitor);
		System.out.println("Displaying ::: " + part.getClass().getSimpleName() + " ::: " + part.getClass().getName() );
	}

}
