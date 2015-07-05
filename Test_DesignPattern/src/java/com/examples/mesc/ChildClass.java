/**
 * 
 */
package com.examples.mesc;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.sun.xml.internal.ws.util.StringUtils;

/**
 * @author kumark
 *
 */
public class ChildClass extends ParentClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
           ParentClass parentClass  = new ParentClass();
           
           parentClass.methodToBeSubclassed();
           //ParentClass childClass  = new ChildClass();
           //ChildClass childClass2 = (ChildClass)(parentClass);
           System.out.println( parentClass.getParentClassName() );
           //System.out.println( childClass2.getParentClassName() );
           //System.out.println( childClass.getParentClassName() );
           
           
           Constructor<?> [] constructorPatrentClass = ParentClass.class.getConstructors();
           //constructorPatrentClass[0].newInstance(initargs)
           
           for(Constructor<?> constructor : constructorPatrentClass){
        	  
           }
           Map<String , List<ParentClass>> mapOfLists = new HashMap<String , List<ParentClass>>();
           
            Class<ParentClass> classParentClass = ParentClass.class; 
            System.out.println( "Package name ::" + classParentClass.getPackage().getName() );
           //ParentClass.class
            //String [] str = new String[20];
            String str1 = new String("NAME");
            String str2 = new String("NAME");
            Integer i = 10;
           
            List<ParentClass> listParentClasses = new ArrayList<ParentClass>();
            List<ParentClass> listParentClasses1 = new LinkedList<ParentClass>();
            //listParentClasses.
            
            listParentClasses.add(new ParentClass());
            listParentClasses1.add(new ParentClass());
            listParentClasses.add(new ParentClass());
            listParentClasses1.add(new ParentClass());
                      
            System.out.println("NAME equals NAME :: " + str1.equals(str2));
            System.out.println("NAME == NAME :: " + (str1 == str2));
            
            String[] asset = {"equity", "stocks", "gold", "foreign exchange","fixed income", "futures", "options"}; 
            List<String> assetList = Arrays.asList(asset);
            
            //int array to string conversion
            
            int [] intArray = {1, 2, 3 , 4};
            String intArratoToStringArray = Arrays.toString(intArray);
            
            System.out.println(intArratoToStringArray);

            //converting Arraylist to Array
            
            ArrayList<String> assetTradingList = new ArrayList();                       

            assetTradingList.add("Stocks trading");
            assetTradingList.add("futures and option trading");
            assetTradingList.add("electronic trading");
            assetTradingList.add("forex trading");
            assetTradingList.add("gold trading");
            assetTradingList.add("fixed income bond trading");
            String [] assetTradingArray = new String[assetTradingList.size()];
            System.out.println( assetTradingList.toArray(assetTradingArray));
            
            List<String> listString = Arrays.asList(asset);
            System.out.println("list String converted by stirng array :: " + listString);

            
            
            ParentClass parentClass1  = new ParentClass();
            ParentClass parentClass2  = new ParentClass();
            
            System.out.println("Parent Class 1 :: " + parentClass1);
            System.out.println("Parent Class 2 :: " + parentClass2);
            
            System.out.println("parentClass1 equals parentClass2 :: " + parentClass1.equals(parentClass2));
            System.out.println("parentClass1 == parentClass2 :: " + (parentClass1 == parentClass2));
            
            System.out.println("parentClass1 instanceof ParentClass :: " + (parentClass1 instanceof ParentClass));
            System.out.println( parentClass1.getClass().getSimpleName() );
            System.out.println( str2.getClass().getSimpleName());
            System.out.println( i.getClass().getSimpleName());
            System.out.println( listParentClasses.getClass().getSimpleName());
            System.out.println( listParentClasses1.getClass().getSimpleName());
            
            for(ParentClass pareClass : listParentClasses){
            	System.out.println("ArrayList :: "+ pareClass);
            }
            
            for(ParentClass pareClass : listParentClasses1){
            	System.out.println( "LinkedList ::" + pareClass);
            }
            
            
            Set<String> stringSet = new TreeSet<String>();
            Set<Character> charSet = new TreeSet<Character>();
            //args = {"dsdsad" , "asdsd"};
            String str = "KAMAL";
            System.out.println(str);
            char [] chart = str.toCharArray();
            Arrays.sort(chart);
            System.out.println("sorter char array " + chart);   
            for(char c : chart){
            	System.out.print(c);
            }
            
            //-----------------------------------------------------------------------------------
            
            String [] arrayString = {"i" , "came" ,  "i" , "saw" , "i" , "left"};
            char [] chararray     = {'Z' , 'X' , 'K' , 'L' , 'A' , 'C' , 'J' , 'D' , 'A' , 'X'};
            for (String a : arrayString)
                if (!stringSet.add(a))
                    System.out.println("Duplicate string detected: " + a);
            
            for (char c : chararray)
                if (!charSet.add(c))
                    System.out.println("Duplicate char detected: " + c);

            System.out.println(stringSet.size() + " distinct char: " + charSet);
            
            Set<String []> setStringsArray = new HashSet<String []>();
            setStringsArray.add(arrayString);
            
            
            Iterator<String []> iterator = setStringsArray.iterator();
            
            System.out.println("!!!!!" + arrayString.toString());
            while(iterator.hasNext()){
            	System.out.println("----"+ iterator.next()[2]);	
            }
            //-----------------------------------------------------------------------------------
            Set<String> setStrings = new HashSet<String>();
            
            setStrings.add(str1);
            setStrings.add(str2);
            setStrings.add(str1);
            setStrings.add(str2);
            setStrings.add("KM");
            setStrings.add("KK");
            
            for(String str12 : setStrings){
            	System.out.println("--" + setStrings.size() + " >>> " + str12);
            }
            
            //-----------------------------------------------------------------------------------
            
          Set<ParentClass> setParentObjects = new HashSet<ParentClass>();
            
          setParentObjects.add(parentClass1);
          setParentObjects.add(parentClass2);
          setParentObjects.add(parentClass1);
          setParentObjects.add(parentClass2);
          setParentObjects.add(new ParentClass());
          setParentObjects.add(new ParentClass());
            
            for(ParentClass prntobject : setParentObjects){
            	System.out.println("--" + setStrings.size() + " >>> " + prntobject);
            }
            
            
          //----------------------------------------------------------------------------------- 
            
            String [] srtArray = {"HI" , "BYE" } ;
            System.out.println("****" + srtArray.getClass().getSimpleName());
            ParentClass [] parentClassArray = new ParentClass[10];
            parentClassArray[0] = new ChildClass();
             for(ParentClass parentClassLocal : parentClassArray){
            	 if(null != parentClassLocal)
            	 System.out.println( parentClassLocal.hashCode() );
             }
           //constructorPatrentClass.getClass()
           //Ite
           @SuppressWarnings("unused")
		Class<ChildClass> classChildClass =  ChildClass.class;
           /*for(Class<ChildClass>  classChildClass : ChildClass.class){
       		System.out.println( classChildClass.getName() );*/
           comparissionStringStringBUfferStringBuilder();
           
       	}
           
	public static void comparissionStringStringBUfferStringBuilder(){
		
		String immutableStringObject = "Hi I am Immutable String";
		StringBuilder mutableStringBuilder = new StringBuilder("HI I am Muttable String Builder");
		StringBuffer mutableStringBuffer = new StringBuffer("Hi I am Muttable StringBuffer");
		
		String cpyOfImmutableStringObject = immutableStringObject;
		StringBuilder cpyOfMutableStringBuilder = mutableStringBuilder;
		StringBuffer cpyOfMutableStringBuffer = mutableStringBuffer;
		
		immutableStringObject += "got Appended";
		mutableStringBuilder.append(" got appended");
		mutableStringBuffer.append(" got appended");
		
		System.out.println("immutableStringObject :: " + immutableStringObject);
		System.out.println("mutableStringBuilder :: " + mutableStringBuilder);
		System.out.println("mutableStringBuffer :: " + mutableStringBuffer);
		
		System.out.println("cpyOfImmutableStringObject :: " + cpyOfImmutableStringObject);
		System.out.println("cpyOfMutableStringBuilder :: " + cpyOfMutableStringBuilder);
		System.out.println("cpyOfMutableStringBuffer :: " + cpyOfMutableStringBuffer);
		System.out.println(new String("KK") == new String("KK") );
		
		
		
		
	}

	public String getMyChildClassMethod(){
		return null;
	}
	public String getParentClassName(){
		
		return ChildClass.class.getSimpleName();
	}
	
	
}
