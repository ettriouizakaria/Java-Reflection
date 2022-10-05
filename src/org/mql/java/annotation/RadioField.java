package org.mql.java.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RadioField {
	String label() default "";
	String[] items() default {"Choice 1","Choice 2"}; // un tab a un element
}
