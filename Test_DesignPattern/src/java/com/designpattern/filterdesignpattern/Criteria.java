/**
 * 
 */
package com.designpattern.filterdesignpattern;

import java.util.List;

/**
 * @author kumark
 *
 */
public interface Criteria {
	
	List<Person> meetCriterea(List<Person> persons);

}
