package org.jsp.ekart.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.jsp.ekart.dao.UserDao;
import org.jsp.ekart.dto.User;

@WebServlet("/edit")
public class EditUserServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		int id = Integer.parseInt(req.getParameter("id"));
		long phone = Long.parseLong(req.getParameter("ph"));
		String password = req.getParameter("ps");
		String email = req.getParameter("em");
		String gender = req.getParameter("gender");
		String name = req.getParameter("nm");
		int age = Integer.parseInt(req.getParameter("age"));
		User u = new User(name, password, gender, age, email, phone);
		u.setId(id);
		UserDao dao = new UserDao();
		u = dao.updateUser(u);
		HttpSession s = req.getSession();
		s.setAttribute("user", u);
		PrintWriter w = resp.getWriter();
		w.write("<html><body><h2>User Updated Succesfully</h2></body></html>");
	}
}
