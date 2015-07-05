/**
 * 
 */
package com.kanchan.java.volatilecheck;

/**
 * @author kumark
 *
 */
public class VolatileTest {

	
	private static volatile int counter = 0;
	
    private static void concurrentMethodWrong() {
         counter = counter + 5;
         //do something
         counter = counter - 5;
    }
    
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		concurrentMethodWrong();
		//for (;;){
			System.out.println(counter);
			//if(counter != 0) break;
		//}
	}
	
	

}
