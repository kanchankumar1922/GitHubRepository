/**
 * 
 */
package com.designpattern.builderdesignpattern;

import java.lang.reflect.Method;
import java.util.List;

import javax.jws.WebService;

import com.examples.mesc.ChildClass;

/**
 * @author kumark
 *
 */
@WebService
public class Cake {
	
	private static double sugar1;   //cup
	private final double sugar;   //cup
    private final double butter;  //cup
    private final int eggs;
    private final int vanila;     //spoon
    private final double flour;   //cup
    private final double bakingpowder; //spoon
    private final double milk;  //cup
    private final int cherry;
    
    public static class Builder{
    	
    	private double sugar;   //cup
        private double butter;  //cup
        private int eggs;
        private int vanila;     //spoon
        private double flour;   //cup
        private double bakingpowder; //spoon
        private double milk;  //cup
        private int cherry;
        
        public Builder sugar(double cup){ this.sugar = cup; System.out.println(sugar1); return this;}
        public Builder butter(double cup){ this.butter = cup; return this;}
        public Builder eggs(int cup){ this.eggs = cup; return this;}
        public Builder vanila(int cup){ this.vanila = cup; return this;}
        public Builder flour(double cup){ this.flour = cup; return this;}
        public Builder bakingpowder(double cup){ this.bakingpowder = cup; return this;}
        public Builder milk(double gallon){ this.milk = gallon; return this;}
        public Builder cherry(int cherry){ this.cherry = cherry; return this;}
        	
        public Cake build(){
        	return new Cake(this);
        }
    }
    
    private Cake(Builder builder){
    	this.sugar = builder.sugar;
    	this.butter = builder.butter;
    	this.eggs = builder.eggs;
    	this.vanila = builder.vanila;
    	this.flour = builder.flour;
    	this.bakingpowder = builder.bakingpowder;
    	this.milk = builder.milk;
    	this.cherry = builder.cherry;
    }
    
    public String toString(){
    	
    	//Method[] methods = Cake.class.getMethods();
    	for(Method method : Cake.class.getMethods()){
    		System.out.println( method.getName() );
    		 for(Class<?> parameter :  method.getParameterTypes()){
    			 System.out.println( parameter.getTypeParameters() );
    		 }
    	}
    	return "Cake{" + "sugar=" + this.sugar + 
    	       ", butter=" + this.butter + 
    	       ", eggs=" + this.eggs + 
    	       ", vanila=" + this.vanila + 
    	       ", flour=" + this.flour + 
    	       ", bakingpowder=" + this.bakingpowder + 
    	       ", milk=" + this.milk + 
    	       ", cherry=" + this.cherry + '}';

    }
    
    public List<ChildClass> getListOfChildClasses(){
    	return null;
    }
    public List<ChildClass> getListOfChildClasses2(){
    	return null;
    }
    public List<ChildClass> getListOfChildClasses3(){
    	return null;
    }
    public List<ChildClass> getListOfChildClasses4(int i){
    	return null;
    }


}
