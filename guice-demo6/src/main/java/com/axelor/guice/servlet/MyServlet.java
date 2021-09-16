package com.axelor.guice.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.axelor.guice.app.App;
import com.axelor.guice.entity.User;
import com.google.inject.Singleton;

@Singleton
@WebServlet("/my")
public class MyServlet extends HttpServlet {

	

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Service..");

		// System.out.println("Inserting ");
		// String firstName = req.getParameter("firstName");
		// String lastName = req.getParameter("lastName");
		// String username = req.getParameter("username");
		// String password = req.getParameter("password");
		// User user = new User(firstName,lastName,username,password);
		// App.saveUser(user);
		// System.out.println("UserSaved");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doget");
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		 pw.println("<html><body>");
		pw.println("Welcome to servlet");
		pw.println("</body></html>");
		pw.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("dopost....");
		service(req, resp);

	}
}
