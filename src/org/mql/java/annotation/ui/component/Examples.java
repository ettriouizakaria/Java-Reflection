package org.mql.java.annotation.ui.component;

import java.awt.Container;

import javax.swing.JFrame;

import org.mql.java.annotation.FormEngine;
import org.mql.java.annotation.models.Author;
import org.mql.java.annotation.models.Document;

public class Examples extends JFrame {

	private static final long serialVersionUID = 1L;

	public Examples() {
		exp1();
	}

	public void createFrame(Container container) {
		setContentPane(container);
		setTitle(Document.class.getSimpleName()); // added by Zakaria
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();// prefered size
		setVisible(true);
	}

	void exp1() {
		FormEngine engine = new FormEngine(Document.class);
		Form form = engine.getForm();
		createFrame(form);
	}

	void exp2() {
		FormEngine engine = new FormEngine(Author.class);
		Form form = engine.getForm();
		createFrame(form);
	}

	public static void main(String[] args) {
		new Examples();
	}

}
