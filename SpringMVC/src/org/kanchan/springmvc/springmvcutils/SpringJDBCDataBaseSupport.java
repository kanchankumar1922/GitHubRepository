/**
 * 
 */
package org.kanchan.springmvc.springmvcutils;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * @author JSRK
 *
 */
@Component
public class SpringJDBCDataBaseSupport {
	
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	
	public JdbcTemplate getJdbcTemplate() {
		System.out.println("in getter method of getJDBC Template :: " + this.jdbcTemplate);
		return this.jdbcTemplate;
	}
	
	public DataSource getDataSource() {
		return this.dataSource;
	}

	@Autowired
	public void setDataSource(DataSource dataSource) {
		System.out.println("DATASOURCE LOADED :::: " + dataSource);
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(getDataSource());
		System.out.println("JDBC TEMPLATE LOADED ::: " + this.jdbcTemplate);
		
	}
	
	
	

}
