package org.kanchan.springmvc.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
 
public class HelloWorldController implements Controller {
 
	private static Logger log = Logger.getLogger(HelloWorldController.class.getName());
	
	public ModelAndView handleRequest(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException {
 
		//String aMessage = "Hello World MVC!";
		List<String> listOfStringMessages = new ArrayList<String>();
		listOfStringMessages.add("SHILA");
		listOfStringMessages.add("KAKA");
		listOfStringMessages.add("MAMA");
		ModelAndView modelAndView = new ModelAndView("hello_world");
		modelAndView.addObject("message", listOfStringMessages);
		log.info("List OF String Message Printed :: " + listOfStringMessages);
		return modelAndView;
	}
}
