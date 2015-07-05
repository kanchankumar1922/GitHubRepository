/**
 * 
 */
package com.designpattern.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author kumark
 *
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface EmployeeAnnotation {
	
	public String employeeName = "UN NAMED";
	
	public String customizedString() default "Hi ..." + employeeName ; 
	

}
