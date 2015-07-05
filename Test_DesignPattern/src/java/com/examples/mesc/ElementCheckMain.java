/**
 * 
 */
package com.examples.mesc;

/**
 * @author kumark
 *
 */
public class ElementCheckMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Atom elementCarbon = new CarbonElement(1, 1, 2);
		ElementInterface elementInterface = new Atom(1, 1, 2);
        CarbonElement carbonElement = new CarbonElement(2, 2, 4);
        System.out.println( carbonElement.getWeightofAtom() );
		try {
			elementCarbon.getAtomicStructure();
		} catch (NoAtomicStructureFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println(elementCarbon.toString());
		
		elementCarbon.getWeightofAtom();
	}

}
