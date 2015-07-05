/**
 * 
 */
package com.examples.mesc;

/**
 * @author kumark
 *
 */
public class NoAtomicStructureFoundException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoAtomicStructureFoundException(){
		super();
	}
	
	public NoAtomicStructureFoundException(String message){
		super(message);
	}
	
	public NoAtomicStructureFoundException(Throwable cause){
		super(cause);
	}

}
