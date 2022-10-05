package org.mql.java.annotation.models;

import org.mql.java.annotation.Form;
import org.mql.java.annotation.TextField;

@Form(title = "Nouvel Auteur")
public class Author {
	@TextField(size = 10)
	private int id;
	@TextField(label = "Prenom",size = 30)
	private String firstName;
	@TextField(label = "Nom",size = 30)
	private String lastName;
	@TextField(label = "Annee de naissance",size = 8)
	private int yearBorn;
	@TextField(label = "Pays d'origine",size = 20)
	private String country;
	public Author() {
		
	}

	
	
}
