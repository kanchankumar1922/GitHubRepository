/**
 * 
 */
package com.examples.mesc;

/**
 * @author kumark
 *
 */
public class Atom implements ElementInterface {

	private int electron;
	private int proton;
	private int neutron;
	
	@Override
	public Atom getAtomicStructure() throws NoAtomicStructureFoundException {
		
		if(electron == 0){
			throw new NoAtomicStructureFoundException("Number of Electron is zero");
		}
		return null;
	}

	
	/**
	 * @param electron
	 * @param proton
	 * @param neutron
	 */
	public Atom(int electron, int proton, int neutron) {
		super();
		this.electron = electron;
		this.proton = proton;
		this.neutron = neutron;
	}


	/**
	 * @return the electron
	 */
	public int getElectron() {
		return electron;
	}

	/**
	 * @param electron the electron to set
	 */
	public void setElectron(int electron) {
		this.electron = electron;
	}

	/**
	 * @return the proton
	 */
	public int getProton() {
		return proton;
	}

	/**
	 * @param proton the proton to set
	 */
	public void setProton(int proton) {
		this.proton = proton;
	}

	/**
	 * @return the neutron
	 */
	public int getNeutron() {
		return neutron;
	}

	/**
	 * @param neutron the neutron to set
	 */
	public void setNeutron(int neutron) {
		this.neutron = neutron;
	}

	public String toString(){
		String str = "";
		str += "The Atom of this element contains [" +this.electron + "]" +
			   " electron(s) , [" +this.proton + "]" + " proton(s) , and [" + this.neutron + "]" + " neutrons";
		return str;
	}
	
	protected String getWeightofAtom(){
		return this.electron+this.neutron+this.proton +"";
	}
	

}
