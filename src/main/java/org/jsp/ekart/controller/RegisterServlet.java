package org.jsp.ekart.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.jsp.ekart.dao.UserDao;
import org.jsp.ekart.dto.User;

@WebServlet("/reg")
public class RegisterServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		long phone = Long.parseLong(req.getParameter("ph"));
		String password = req.getParameter("ps");
		String email = req.getParameter("em");
		String gender = req.getParameter("gender");
		String name = req.getParameter("nm");
		int age = Integer.parseInt(req.getParameter("age"));
		User u = new User(name, password, gender, age, email, phone);
		UserDao dao = new UserDao();
		u = dao.saveUSer(u);
		PrintWriter w = resp.getWriter();
		w.write("<html><body><h2>User Registered with id :"+u.getId()+"</h2></body></html>");
	}
}
