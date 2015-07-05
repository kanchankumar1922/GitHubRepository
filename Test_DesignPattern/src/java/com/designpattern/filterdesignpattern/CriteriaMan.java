package com.designpattern.filterdesignpattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMan implements Criteria {

	private List<Person> listSingleMan = new ArrayList<Person>();
	
	@Override
	public List<Person> meetCriterea(List<Person> persons) {
      
		for(Person persn : persons){
			if( persn.getGrnder().equalsIgnoreCase("MALE") ){
				listSingleMan.add(persn);
			}
				
		}
		
		return listSingleMan;
	}

}
