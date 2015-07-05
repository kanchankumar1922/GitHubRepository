package com.examples.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectClassTestMain {

	public static void main(String[] args) {

		ReflectTestingClass reflectTestingClass = new ReflectTestingClass();
		
		Method method = null;
		try {
			Class <?> clsRefTestingClass = reflectTestingClass.getClass();
			method = clsRefTestingClass.getDeclaredMethod("getNameOfClass");
			//Constructor<?> [] consRefTestingClass = clsRefTestingClass.getConstructors();
			Constructor<?> [] declConsRefTestingClass = clsRefTestingClass.getDeclaredConstructors();
			//method = clsRefTestingClass.get;
			//Field [] fields = clsRefTestingClass.getFields();
			Field [] decFields = clsRefTestingClass.getDeclaredFields();
			
			System.out.println( "--Fields-- " + decFields[0]);
			System.out.println("--Declaired Fields-- " +decFields[1]);
			
			System.out.println( "--Constructor-- " + declConsRefTestingClass[0]);
			System.out.println("--Declaired Constructor-- " + declConsRefTestingClass[1]);
			
			
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println("method --> " + method );
			method.invoke(reflectTestingClass);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
