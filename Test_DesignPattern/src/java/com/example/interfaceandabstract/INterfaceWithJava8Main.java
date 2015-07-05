/**
 * 
 */
package com.example.interfaceandabstract;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author JSRK
 *
 */
public class INterfaceWithJava8Main implements InterfaceWithJava8 {

	public static void main(String... args) {
		InterfaceWithJava8 interfaceWithJava8 = new INterfaceWithJava8Main();
		interfaceWithJava8.getInterfaceName();
		try {
			Double d = 45.7;
			double d1 = 35.7;
			float f = 45.47f;
			d1= f;
			getValue();
			Method method = interfaceWithJava8.getClass().getDeclaredMethod("getName" , String.class);
			System.out.println(method);
			System.out.println( method.getParameters().toString() );
			//method.setAccessible(true);
			
			method.invoke(interfaceWithJava8, "hi");
			
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}
	
	public static void getValue() {
		INterfaceWithJava8Main interfaceWithJava8 = new INterfaceWithJava8Main();
		interfaceWithJava8.getName("bye");
	}
	
	private String getName(String str){
		System.out.println("Method got invoked by java releftion");
		return "INterfaceWithJava8Main" +str;
	}
	

}
