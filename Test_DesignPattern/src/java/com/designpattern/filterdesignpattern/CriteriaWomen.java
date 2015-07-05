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
public class CriteriaWomen implements Criteria {

private List<Person> listSingleWomen = new ArrayList<Person>();
	
	@Override
	public List<Person> meetCriterea(List<Person> persons) {
      
		for(Person persn : persons){
			if( persn.getGrnder().equalsIgnoreCase("FEMALE") ){
				listSingleWomen.add(persn);
			}
				
		}
		
		return listSingleWomen;
	}
}
