package org.mql.java.annotation.models;

import org.mql.java.annotation.Form;
import org.mql.java.annotation.RadioField;
import org.mql.java.annotation.TextField;
import org.mql.java.annotation.enumeration.DocumentType;

@Form(title = "Nouveau Document", labelWidth = 140)
public class Document {
	@TextField // (label = "identificateur",size = 10)
	private int id;
	@TextField(label = "Titre du document", size = 30)
	private String title;
	private DocumentType type;
	@RadioField(label = "Format", items = { "Papier", "Electronique" })
	private String nature;
	@TextField(label = "prix", size = 8)
	private String price;
//	@TextField
	@RadioField(label = "Editeur", items = { "Eyrolles", "XXXX", "XXXX", "XXXX" })
	private String publisher;

	public Document() {

	}

	public Document(int id, String title, DocumentType type, String nature, String price, String publisher) {
		this.id = id;
		this.title = title;
		this.type = type;
		this.nature = nature;
		this.price = price;
		this.publisher = publisher;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public DocumentType getType() {
		return type;
	}

	public void setType(DocumentType type) {
		this.type = type;
	}

	public String getNature() {
		return nature;
	}

	public void setNature(String nature) {
		this.nature = nature;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "Document [id=" + id + ", title=" + title + ", type=" + type + ", nature=" + nature + ", price=" + price
				+ ", publisher=" + publisher + "]";
	}

}
