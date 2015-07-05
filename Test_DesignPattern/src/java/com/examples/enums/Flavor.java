package com.examples.enums;
/**
 * 
 */

/**
 * @author kumark
 *
 */
public enum Flavor {
    CHOCOLATE(100),
    VANILLA(120),
    STRAWBERRY(80);
    
    private int fCalories;
    
    /*private void setCalories(int aCalories){
      //changes the state of the enum 'constant'
      this.fCalories = aCalories;
    }*/
    public int getCalories(){
      return fCalories;
    }
    private Flavor(int aCalories){
      fCalories = aCalories;
    }
    public int setCalories(int calories){
        return this.fCalories = calories;
      }
    
    
    public String toString(){
    	return name() + " has " +  getCalories() + "  calories";
    	
    }
  }
