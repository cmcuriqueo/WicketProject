package com.mycompany;

import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;

public class HomePage extends WebPage {	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public HomePage() {
	add(new Label("helloMessage", "Hello WicketWorld!"));
    }
}