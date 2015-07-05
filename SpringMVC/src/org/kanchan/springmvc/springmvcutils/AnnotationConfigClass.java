package org.kanchan.springmvc.springmvcutils;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AnnotationConfigClass {

	@Bean (initMethod = "initBean" , destroyMethod = "destroyBean")
	@Scope (value = "prototype")
	public AnnotatedConfigBean getSpringUtilityClass(){
		return new AnnotatedConfigBean();
	}
}
