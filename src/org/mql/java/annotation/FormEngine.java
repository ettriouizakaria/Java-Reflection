package org.mql.java.annotation;

import java.lang.reflect.Field;

public class FormEngine {
	private org.mql.java.annotation.ui.component.Form form;

	public FormEngine(Class<?> cls) {
		Form fa = cls.getDeclaredAnnotation(Form.class);
		if(fa !=null) {
			System.out.println(fa.title());
			form = new org.mql.java.annotation.ui.component.Form(fa.title(),fa.labelWidth(),fa.labelHeight());
			Field[] f= cls.getDeclaredFields();
			for (Field field : f) {
				TextField tf = field.getDeclaredAnnotation(TextField.class);
				if(tf !=null) {
					System.out.println(field.getName());
					String label = tf.label();
					if(label.equals("")) label = field.getName();
					form.addTextField(label,tf.size());
				}
				else {
					RadioField rf = field.getDeclaredAnnotation(RadioField.class);
					if(rf!=null) {
						String label = rf.label();
						if(label.equals("")) label = field.getName();
						form.addRadioField(label, rf.items());
					}
				}
			}
		}
	}

	public org.mql.java.annotation.ui.component.Form getForm() {
		return form;
	}
}
