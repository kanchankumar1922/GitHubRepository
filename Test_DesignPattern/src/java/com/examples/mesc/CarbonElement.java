/**
 * 
 */
package com.examples.mesc;

/**
 * @author kumark
 *
 */
public class CarbonElement extends Atom {

	public CarbonElement(int electron ,  int proton , int neutron){
		super(electron , proton , neutron);
	}
	
	public String getWeightofAtom(){
		System.out.println("This is the weight calculated for Carbon Element");
		return super.getWeightofAtom();
	}
}
