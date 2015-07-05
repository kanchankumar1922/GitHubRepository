/**
 * 
 */
package com.designpattern.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Date;

/**
 * @author kumark
 *
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {

    String author() default "ANONYMOUS";    // Annotation member
    String date();      // Annotation member
    String prefixPage() default "Hi reader";
}
