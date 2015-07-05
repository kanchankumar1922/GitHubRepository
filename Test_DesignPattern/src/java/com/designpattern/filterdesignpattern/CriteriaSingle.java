package com.designpattern.filterdesignpattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria {

private List<Person> listSinglePerson = new ArrayList<Person>();
	
	@Override
	public List<Person> meetCriterea(List<Person> persons) {
      
		for(Person persn : persons){
			if( persn.getMaritialStatus().equalsIgnoreCase("SINGLE") ){
				listSinglePerson.add(persn);
			}
				
		}
		
		return listSinglePerson;
	}
	
}
