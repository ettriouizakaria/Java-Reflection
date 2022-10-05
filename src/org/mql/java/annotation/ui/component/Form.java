package org.mql.java.annotation.ui.component;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class Form extends JPanel {

	private static final long serialVersionUID = 1L;

	private String title;
	private int labelWidth = 100;
	private int labelHeight = 25;

	public Form(String title) {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.title = title;
		Border border = new EtchedBorder();
		setBorder(new TitledBorder(border, " " + title + " "));

	}
	
	

	public Form(String title, int labelWidth, int labelHeight) {
		this(title);
		this.labelWidth = labelWidth;
		this.labelHeight = labelHeight;
	}



	public String getTitle() {
		return title;
	}

	public void addTextField(LabeledTextField field) {
		add(field);
	}

	public void addTextField(String label,int size) {
		add(new LabeledTextField(label, size,labelWidth,labelHeight));
	}
	
	public void addRadioField(String label, String...items) {
		add(new ChoicePanel(label, labelWidth,labelHeight,items));
	}
	
}
