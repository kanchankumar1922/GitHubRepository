/**
 * 
 */
package com.designpattern.filterdesignpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kumark
 *
 */
public class CriteriaMarried implements Criteria {

private List<Person> listMarriedCouple = new ArrayList<Person>();
	
	@Override
	public List<Person> meetCriterea(List<Person> persons) {
      
		for(Person persn : persons){
			if( persn.getMaritialStatus().equalsIgnoreCase("MARRIED") ){
				listMarriedCouple.add(persn);
			}
				
		}
		
		return listMarriedCouple;
	}

}
