package com.axelor.guice.servlet;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;

public class GuiceListener extends GuiceServletContextListener {

	@Override
	protected Injector getInjector() {

		return Guice.createInjector(new MyServletModule());
	}

}
