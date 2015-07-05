/**
 * 
 */
package com.examples.lambdaexpression;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Stream;



/**
 * @author JSRK
 *
 */
public class TestLambdaExpression {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
         //int b = (a) -> {return a+1;};
		//(String s) -> System.out.println(s);
		//Add add = new Add() {(x , y) -> return x+y};
		//int x = 10;
		//int y = 20;
		Add add = (x , y) -> {return x+y;};
		
		System.out.println( add.add(10, 20) );
		addMethod(10 , 20);
		
		
		List<Person> javaProgrammers = new ArrayList<Person>() {
            {
                add(new Person("Elsdon", "Jaycob", "Java programmer", "male", 43, 2000));
                add(new Person("Tamsen", "Brittany", "Java programmer", "female", 23, 1500));
                add(new Person("Floyd", "Donny", "Java programmer", "male", 33, 1800));
                add(new Person("Sindy", "Jonie", "Java programmer", "female", 32, 1600));
                add(new Person("Vere", "Hervey", "Java programmer", "male", 22, 1200));
                add(new Person("Maude", "Jaimie", "Java programmer", "female", 27, 1900));
                add(new Person("Shawn", "Randall", "Java programmer", "male", 30, 2300));
                add(new Person("Jayden", "Corrina", "Java programmer", "female", 35, 1700));
                add(new Person("Palmer", "Dene", "Java programmer", "male", 33, 2000));
                add(new Person("Addison", "Pam", "Java programmer", "female", 34, 1300));
            }
        };
 
        List<Person> phpProgrammers = new ArrayList<Person>() {
            {
                add(new Person("Jarrod", "Pace", "PHP programmer", "male", 34, 1550));
                add(new Person("Clarette", "Cicely", "PHP programmer", "female", 23, 1200));
                add(new Person("Victor", "Channing", "PHP programmer", "male", 32, 1600));
                add(new Person("Tori", "Sheryl", "PHP programmer", "female", 21, 1000));
                add(new Person("Osborne", "Shad", "PHP programmer", "male", 32, 1100));
                add(new Person("Rosalind", "Layla", "PHP programmer", "female", 25, 1300));
                add(new Person("Fraser", "Hewie", "PHP programmer", "male", 36, 1100));
                add(new Person("Quinn", "Tamara", "PHP programmer", "female", 21, 1000));
                add(new Person("Alvin", "Lance", "PHP programmer", "male", 38, 1600));
                add(new Person("Evonne", "Shari", "PHP programmer", "female", 40, 1800));
            }
        };
        
        System.out.println("Show programmers names:");
        //Stream<Person> listJavaProgrammers = javaProgrammers.stream().sorted().limit(5).forEach(p -> System.out.println(p));;
        //javaProgrammers.forEach(p -> System.out.println(p));;
        //System.out.println(listJavaProgrammers. .get().getFirstName());
        //listJavaProgrammers.forEach(p -> System.out.println(p));
        try {
			Class<?> person = Person.class;
			Object rcvr = person.newInstance();
			Class<?> [] argTypes = new Class [] {};
			Method personPrivateMethod;
			Object [] agrs = null;
			
				
					personPrivateMethod = person.getDeclaredMethod("returnClassNamePrivateMethod", argTypes);
					personPrivateMethod.setAccessible(true);
					String resultsValue = (String) personPrivateMethod.invoke(rcvr, agrs);
					System.out.println(resultsValue);
		} catch (InstantiationException | IllegalAccessException
				| NoSuchMethodException | SecurityException
				| IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		//javaProgrammers.stream().filter(paramPredicate)
		
		Predicate<Person> personAgeFilter = (person) -> {			
			return person.getAge() < 30 ;
		};
		
		Predicate<Person> personMaleFilter = (person) -> {			
			return person.getGender().equalsIgnoreCase("male");
		};
        
		javaProgrammers.stream().filter(personAgeFilter.and(personMaleFilter)).forEach(p -> System.out.println(p.getFirstName()));;
        javaProgrammers.forEach((pk) -> System.out.printf("%s %s; ", pk.getFirstName(), pk.getLastName()));
        phpProgrammers.forEach((kk) -> System.out.printf("%s %s; ", kk.getFirstName(), kk.getLastName()));
        System.out.println();
        //phpProgrammers.forEach();
        
        BinaryOperator<Integer> accumulator = (acc, element) -> acc + element;
        int count = accumulator.apply( accumulator.apply( accumulator.apply(0, 1), 2), 3);
        System.out.println("Binary operator ::   " +count);
        
        int count1 = Stream.of(1, 2, 3)
        		           .reduce(0, (acc, element) -> acc + element);
        	List<String> listNames = Arrays.asList("Kanchan" , "kumar" , "Ganesh" , "Kuppa");
            Stream<Object> listOfCharacter = listNames.stream().filter(b -> b.startsWith("K")).map(c -> c.charAt(0));
            Object [] arrayObject = listOfCharacter.toArray();
            for (Object c : arrayObject){
            	System.out.println("listOfCharacter ::: " + c.toString());
            }
            System.out.println(arrayObject[1].toString().compareToIgnoreCase(arrayObject[0].toString()));
        	//listOfCharacter.forEach(c -> System.out.println(c));
            System.out.println(count1);
        
         System.out.println("-------------------------------------------------------------");
			
				try {
					getAverage(10 , 20 , 30 , 40);
					//getAverage(new Person(),new Person());
					 //getAverage("10" , "20" , "30");
				} catch (ClassNotFoundException | InstantiationException
						| IllegalAccessException | NoSuchMethodException
						| SecurityException | IllegalArgumentException
						| InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		
        
        
        
        //listNames.stream().filter(b -> b.startsWith("K")).collect(asList());
        		//assertEquals(6, count);
        
        
        
        /*Runnable printer = new Runnable() {
        	 
            @Override
            public void run() {
         
                System.out.println("Hello, I’m inside runnable class...");
            }
        };
         
        printer.run();
         
        printer = () -> System.out.println("Hello, I’m inside runnable lambda...");
         
        printer.run();*/
	}
	
	public static int addMethod(int x , int y){
		return x+y;
	}
	
	public static Person toList(){
		
		
		return null;
	}
	
	/*public void asList (){
		List<String> list = new ArrayList<>();
		list.add("l");
		//return list;
	}*/
	
	public static <T> T getAverage(T... t) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException{
		
		String typeOfParameter = t.getClass().getTypeName();
		System.out.println("Original Type of Parameter : " + typeOfParameter);
		typeOfParameter = typeOfParameter.substring(0, typeOfParameter.indexOf("["));
		System.out.println("Type OF passed Parameter :: " + typeOfParameter);
		
	    System.out.println( Arrays.asList(t).stream().count() );
		Class c = Class.forName(typeOfParameter);
		
		Collections.singleton(null);
		Constructor<Integer []> intArgsConstructor  = c.getConstructor(new Class[] {int.class});
		
		System.out.println(intArgsConstructor.getParameters());
		Object[]    intArgs             = new Object[] { new Integer (12)  };
		Object      object              = intArgsConstructor.newInstance(intArgs);
		
		System.out.println(object);
		System.out.println( int.class.getCanonicalName() );
		
		//System.out.println(c.isPrimitive() );
		//ClassUtils.
		//System.out.println(c.newInstance());
		Integer integer = new Integer(20);
		//System.out.println(integer.getClass());
		return null;
	}

}
