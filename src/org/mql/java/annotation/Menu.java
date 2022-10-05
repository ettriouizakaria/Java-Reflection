package org.mql.java.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME) //tavaille lors de l'execution
public @interface Menu {
	//marceur : Annotations sans attribut == moteur de traitement
	
}
