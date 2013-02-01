package org.fao.aoscs.child.client;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;

public class ChildWidget extends Composite{
	public ChildWidget(){
		Button b = new Button();
		b.setText("Button from child");
		initWidget(b);
	}
}
