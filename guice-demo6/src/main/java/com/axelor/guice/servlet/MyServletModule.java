package com.axelor.guice.servlet;

import com.google.inject.persist.PersistFilter;
import com.google.inject.servlet.ServletModule;

public class MyServletModule extends ServletModule {
	@Override
	protected void configureServlets() {
		serve("/*").with(MyServlet.class);
		// filter("/*").through(PersistFilter.class);

		
	}
}
