/**
 * 
 */
package org.kanchan.springmvc.springmvcutils;

/**
 * @author kumark
 *
 */
public class SpringMVCUtil {
	
	public static final String POSTGRESQL_SELECT_EMPLOYEE_QUERY = "select * from \"Employee\"";
	public static final String POSTGRESQL_INSERT_EMPLOYEE_QUERY = "INSERT INTO \"Employee\"(emp_id, emp_name) VALUES (?, ?)";
	public static final String POSTGRESQL_UPDATE_EMPLOYEE_QUERY = "UPDATE \"Employee\"  SET emp_name = ?  WHERE emp_id = ?";
	public static final String POSTGRESQL_DELETE_EMPLOYEE_QUERY = "DELETE FROM \"Employee\" WHERE emp_id = ?";


}
