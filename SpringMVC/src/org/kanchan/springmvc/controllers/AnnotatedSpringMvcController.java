/**
 * 
 */
package org.kanchan.springmvc.controllers;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.kanchan.springmvc.models.Employee;
import org.kanchan.springmvc.springmvcutils.AnnotationConfigClass;
import org.kanchan.springmvc.springmvcutils.SpringJDBCDataBaseSupport;
import org.kanchan.springmvc.springmvcutils.SpringMVCUtil;
import org.kanchan.springmvc.springmvcutils.TracingPrintStream;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author kumark
 * 
 */
@Controller
@RequestMapping(value = "/")
public class AnnotatedSpringMvcController {

	private static Logger log = Logger.getLogger(AnnotatedSpringMvcController.class.getName());
	
	//private final static String SPRING_MVC_SERVLET_XML_FILE_PATH = "C://Users//kumark//Java-Helios-workspace//SpringMVC//WebContent//WEB-INF//springmvc-servlet.xml";
	private final static String SPRING_MVC_SERVLET_XML_FILE_PATH = "C://kanchan//Projects//SpringMVC//WebContent//WEB-INF//springmvc-servlet.xml";

	/**
	 * @return SpringJDBCDataBaseSupport
	 */
	private SpringJDBCDataBaseSupport getSpringJDBCDataBaseSupport(){
		log.info("in getSpringJDBCDataBaseSupport method :: ");
		Resource resource = new FileSystemResource(SPRING_MVC_SERVLET_XML_FILE_PATH);
		@SuppressWarnings("deprecation")
		BeanFactory xmlBeanFactory = new XmlBeanFactory(resource);
		//List list = Collections.EMPTY_LIST;
		//ApplicationContext ap = new XmlWebApplicationContext();
		//ap.getBean("springUtility");
		return (SpringJDBCDataBaseSupport) xmlBeanFactory.getBean("springUtility");
		//return (SpringJDBCDataBaseSupport) ap.getBean("springUtility");
	}
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView showHomePage() {
		// return "employee";
		return new ModelAndView("index", "command", "kk");
	}
	
	/**
	 * @returns ModelAndView
	 */
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView employee() {
		System.out.println(">>>>>> In employee Method");
		return new ModelAndView("addEmployee", "command", new Employee());
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView deletePage() {
		return new ModelAndView("deleteEmployee", "command", new Employee());
	}
	
	@RequestMapping(value = "/deleteEmployee", method = RequestMethod.POST)
	public ModelAndView deleteEmployee(final @ModelAttribute("Employee") Employee employee , ModelMap model) {
		System.out.println("employee object :: " + employee.getEmployeeID());
	     //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/WEB-INF/springmvc-servlet.xml");
		//AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("/WEB-INF/springmvc-servlet.xml");
		// ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[] {"/WEB-INF/springmvc-servlet.xml"});
		//ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AnnotationConfigClass.class);
		ConfigurableApplicationContext cApplicationContext = new ClassPathXmlApplicationContext();
		System.setOut(new TracingPrintStream(System.out));
		log.info(" Apache Log Info ");

		//List<Map<String, Object>> listOfEmployees = (List<Map<String, Object>>) springJDBCDataBaseSupport.getJdbcTemplate().queryForList(SpringMVCUtil.POSTGRESQL_SELECT_EMPLOYEE_QUERY);
		getSpringJDBCDataBaseSupport().getJdbcTemplate().update(SpringMVCUtil.POSTGRESQL_DELETE_EMPLOYEE_QUERY, new Object[] {employee.getEmployeeID()} );
		return new ModelAndView("employeeSuccess", "command", "EMPLOYEE DELETED SUCCESSFULLY");
	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public ModelAndView updatePage() {
		return new ModelAndView("updateEmployee", "command", new Employee());
	}
	
	@RequestMapping(value = "/updateEmployee", method = RequestMethod.POST)
	public ModelAndView updateEmployee(final @ModelAttribute("Employee") Employee employee , ModelMap model) {
		
		//List<Map<String, Object>> listOfEmployees = (List<Map<String, Object>>) springJDBCDataBaseSupport.getJdbcTemplate().queryForList(SpringMVCUtil.POSTGRESQL_SELECT_EMPLOYEE_QUERY);
		getSpringJDBCDataBaseSupport().getJdbcTemplate().update(SpringMVCUtil.POSTGRESQL_UPDATE_EMPLOYEE_QUERY, new Object[] { employee.getEmployeeName() , employee.getEmployeeID()} );
		return new ModelAndView("employeeSuccess", "command", "EMPLOYEE UPDATED SUCCESSFULLY");
	}
	/**
	 * @param employee
	 * @param model
	 * @return ModelAndView
	 */
	@RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
	public ModelAndView addEmployee(final @ModelAttribute("Employee") Employee employee , ModelMap model) {
		System.out.println("employee object :: " + employee.getEmployeeID());
		
		System.setOut(new TracingPrintStream(System.out));
		log.info(" Apache Log Info ");

		//List<Map<String, Object>> listOfEmployees = (List<Map<String, Object>>) springJDBCDataBaseSupport.getJdbcTemplate().queryForList(SpringMVCUtil.POSTGRESQL_SELECT_EMPLOYEE_QUERY);
		/*springJDBCDataBaseSupport.getJdbcTemplate().execute(SpringMVCUtil.POSTGRESQL_INSERT_EMPLOYEE_QUERY, new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps)throws SQLException, DataAccessException {
				System.out.println("Employee Object in doInPreparedStatement method ::: " + employee.getEmployeeID() + employee.getEmployeeName());
				ps.setInt(1, Integer.parseInt( employee.getEmployeeID() ) );
				ps.setString(2,	employee.getEmployeeName());
				return ps.execute();
			}
			
		});		*/
		
		/*
		 * ANOTHER WAY OF INSERTING DATA INTO DATA BASE BY SPRING
		 */
		getSpringJDBCDataBaseSupport().getJdbcTemplate().update(SpringMVCUtil.POSTGRESQL_INSERT_EMPLOYEE_QUERY , new Object [] {Integer.parseInt( employee.getEmployeeID() ) , employee.getEmployeeName()});

		return new ModelAndView("employeeSuccess", "command", "EMPLOYEE ADDED SUCCESSFULLY");
	}

	@RequestMapping(value = "/showEmployeePage", method = RequestMethod.GET)
	public ModelAndView showEmployeePage() {
		// return "employee";
		ModelAndView modelAndView = new ModelAndView();
		//modelAndView.getModelMap().entrySet();type name = new type(arguments);
		
		return new ModelAndView("employee", "command", "kk");
	}

	/*
	 * @RequestMapping(value="/searchEmployee" , method = RequestMethod.GET)
	 * public ModelAndView searchEmployee(){ //return "employee"; return new
	 * ModelAndView("searchEmployee", "command", "kk"); }
	 */
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public ModelAndView showSearchPage() {
		System.out.println(">>>>>> In searchEmployee Method");
		return new ModelAndView("searchEmployee", "command", new Employee());
	}
	
	@RequestMapping(value = "/searchEmployee", method = RequestMethod.GET)
    public String searchEmployee(@ModelAttribute("Employee") Employee employee, ModelMap modelMap) {
	System.out.println(">>>>>> In searchEmployee Method");
	
	List<Map<String, Object>> listOfEmployees = (List<Map<String, Object>>) getSpringJDBCDataBaseSupport().getJdbcTemplate().queryForList(SpringMVCUtil.POSTGRESQL_SELECT_EMPLOYEE_QUERY);
	System.out.println("List of Employees ::: " + listOfEmployees);
	modelMap.addAttribute("employeeObject", listOfEmployees);

	return "employeeResult";
    }
	
	@RequestMapping(value = "/searchEmployeeByID", method = RequestMethod.GET)
    public String searchEmployeeByID(@ModelAttribute("Employee") Employee employee, ModelMap modelMap) {
	System.out.println(">>>>>> In searchEmployeeID Method " + employee.getEmployeeID());
	
	List<Map<String, Object>> listOfEmployees = (List<Map<String, Object>>) getSpringJDBCDataBaseSupport().getJdbcTemplate().queryForList(SpringMVCUtil.POSTGRESQL_SELECT_EMPLOYEE_QUERY_BY_ID , new Object [] {employee.getEmployeeID()});
	System.out.println("List of Employees ::: " + listOfEmployees);
	modelMap.addAttribute("employeeObject", listOfEmployees);

	return "employeeResult";
    }
	
	

}
