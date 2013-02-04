package org.fao.aoscs.child.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;

public class ChildWidget extends Composite {
	private final GreetingServiceAsync greetingService = GWT
			.create(GreetingService.class);

	public ChildWidget() {
		final Button b = new Button();
		b.setText("Button from child");
		b.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				greetingService.greetServer("Tonssss", new AsyncCallback<String>() {
					
					public void onSuccess(String result) {
						b.setText(result);
					}
					
					public void onFailure(Throwable caught) {
						// TODO Auto-generated method stub
						
					}
				});
			}
		});
		initWidget(b);
	}
}
