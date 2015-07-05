package com.examples.generics;


public class Box<I> {

    private I t;          

    public void setValue(I t) {
        this.t = t;
    }
    
    public void setType(I t) {
        this.t = t;
    }

    public I getValue() {
        return t;
    }
    
    public I getType() {
        return t;
    }

    public I inspect(Box<I> boxObject){
        System.out.println("Integer Class Name: " + boxObject.getClass().getName());
        
        System.out.println("Integer Value: " + boxObject.getType());
        System.out.println("Integer Value: " + boxObject.getType());
        
        System.out.println("Integer Value: " + (boxObject.getType() instanceof Integer));
        
        return boxObject.getType();
        //return new Integer(10);
       
    }

    public static void main(String[] args) {
        Box<Integer> integerBoxFirst = new Box<Integer>();
        Box<Integer> integerBoxSecond = new Box<Integer>();
        integerBoxFirst.setValue(new Integer(10));
        integerBoxSecond.setValue(new Integer(20));
        integerBoxFirst.inspect(integerBoxFirst); 
        Integer integerObject = integerBoxFirst.inspect(integerBoxSecond);
        System.out.println(integerObject);
        
        Box<String> stringBox = new Box<String>();
        stringBox.setValue("MY-BOX");
        String str = stringBox.inspect(stringBox);
        
        Box<Box<String>> boxBox = new Box<Box<String>>();
        boxBox.setValue(stringBox);
        boxBox.inspect(boxBox);
        
    }
}