package com.afkghouri;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SpringUI
@Theme("valo")
public class VaadinUI extends UI{

	@Override
	protected void init(VaadinRequest request) {
		// TODO Auto-generated method stub
		TextField textField = new TextField("enter's something");
		Button button  = new Button("click");
		
		VerticalLayout verticalLayout = new VerticalLayout(textField,button);
		verticalLayout.setMargin(true);
		verticalLayout.setSpacing(true);
		setContent(verticalLayout);
		
		button.addClickListener(e->Notification.show("hello: "+textField.getValue()));
	}

}
