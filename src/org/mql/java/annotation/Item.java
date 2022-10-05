package org.mql.java.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) //specifie le cible de cette annotation
public @interface Item {
	//attribut comme une methode
	//les types support�s: String, les types primitifs, les types enumir�s; le type Class , Annotations , tableaux
	String value();
}
