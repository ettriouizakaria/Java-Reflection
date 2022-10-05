package org.mql.java.annotation.ui.component;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LabeledTextField extends JPanel {

	private static final long serialVersionUID = 1L;

	public LabeledTextField(String label, int size) {
		//design pattern facade
		setLayout(new FlowLayout(FlowLayout.LEFT));
		if(!label.contains(":")) label = label+":";
		JLabel l1= new JLabel(label);
		JTextField t1 = new JTextField(size);
		add(l1);
		add(t1);
	}
	public LabeledTextField(String label, int size, int labelWidth,int labelHeight) {
		this(label, size);
		JLabel l1 = (JLabel)getComponent(0);
		l1.setPreferredSize(new Dimension(labelWidth,labelHeight)); // setsize,setLocation si layout est null
	}
	

}
