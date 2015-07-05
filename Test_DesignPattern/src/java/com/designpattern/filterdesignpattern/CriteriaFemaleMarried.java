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
public class CriteriaFemaleMarried implements Criteria {

	private List<Person> listPersons = new ArrayList<Person>();
	/* (non-Javadoc)
	 * @see com.designpattern.filterdesignpattern.Criteria#meetCriterea(java.util.List)
	 */
	@Override
	public List<Person> meetCriterea(List<Person> persons) {
		for(Person person : persons){
			if( person.getGrnder().equalsIgnoreCase("FEMALE") && person.getMaritialStatus().equalsIgnoreCase("MARRIED") )
				listPersons.add(person);
		}
		return listPersons;
	}

}
