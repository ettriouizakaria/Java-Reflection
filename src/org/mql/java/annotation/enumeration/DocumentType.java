package org.mql.java.annotation.enumeration;

public enum DocumentType {
	PAPER(101, "Article"){
		
	},
	BOOK(120, "Livre"),
	JOURNAL(324, "Revue"),
	REPORT(321,"Rapport");
	
	private int id;
	private String nom;
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	private DocumentType(int id, String nom) {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
//	abstract public void print();
}
