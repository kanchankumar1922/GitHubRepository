/**
 * 
 */
package com.designpattern.visitordesignpattern;

import java.util.Arrays;


/**
 * @author JSRK
 *
 */
public class Computer extends ComputerPart{

	ComputerPart [] computerParts;
	
	
	public Computer() {
		computerParts = new ComputerPart [] { new KeyBoard()  , new Mouse() , new Monitor()};
	}


	@Override
	public void accept(ComputerPartVisitor visitor) {
		 Arrays.asList(computerParts).stream().forEach(a -> a.accept(visitor));
		 visitor.visit(this);
		
	}
	
	

}
