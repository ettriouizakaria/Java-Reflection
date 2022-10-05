package org.mql.java.annotation.ui.component;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ChoicePanel extends JPanel {

	private static final long serialVersionUID = 1L;

	public ChoicePanel(String label, String... items) {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		if (!label.contains(":"))
			label = label + " :";

		JLabel l1 = new JLabel(label);
		add(l1);

		ButtonGroup g1 = new ButtonGroup();
		for (String item : items) {
			JRadioButton b1 = new JRadioButton(item);
			add(b1);
			g1.add(b1);
		}

	}

	public ChoicePanel(String label, int labelWidth, int labelHeight, String... items) { 
		//String...items : listes des parametres variables, apres jdk 5 (2004)
		this(label, items);
		JLabel l1 = (JLabel) getComponent(0);
		l1.setPreferredSize(new Dimension(labelWidth, labelHeight));
	}

}
