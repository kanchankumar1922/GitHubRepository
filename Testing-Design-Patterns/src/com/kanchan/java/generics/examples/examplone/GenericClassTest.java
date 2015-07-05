package com.kanchan.java.generics.examples.examplone;
import java.util.List;

/**
 * 
 */

/**
 * @author kumark
 *
 */
public class GenericClassTest implements BlankInterface{

	public GenericClassTest(){
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		GenericClass<Integer> genericClass = new GenericClass<Integer>(10001);
        List<Integer> list =  genericClass.getListOfObject();
        System.out.println(list);
        
        BlankInterface blankInterface = new GenericClassTest();
        GenericClassTest genericClassTest = (GenericClassTest) blankInterface;
        System.out.println( genericClassTest.getName() );
        System.out.println(Integer.class.getSimpleName());
	}
	
	public String getName(){
		String [] stringArray = new String[] {"GenericClassTest" , "" , ""};
		//stringArray[0] = {"" , "" , ""};
		//Class<GenericClassTest> class1 = new Class();
		
		GenericClassTest [] genericClassTests = new GenericClassTest[] {new GenericClassTest()};
		
		System.out.println(genericClassTests[0]);
		System.out.println(genericClassTests[1]);
		System.out.println(genericClassTests[2]);
		
		genericClassTests[3] = new  GenericClassTest();
		
		System.out.println(genericClassTests[3]);
		//System.out.println(genericClassTests[4]);
		
		return stringArray[0];
	}
	


}
