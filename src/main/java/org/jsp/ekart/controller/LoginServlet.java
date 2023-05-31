package org.jsp.ekart.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.jsp.ekart.dao.UserDao;
import org.jsp.ekart.dto.User;

@WebServlet("/login")
public class LoginServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		long phone = Long.parseLong(req.getParameter("ph"));
		String password = req.getParameter("ps");
		UserDao dao  = new UserDao();
		User u = dao.verifyUser(phone, password);
		RequestDispatcher d = null;
		PrintWriter w = resp.getWriter();
		if(u!=null)
		{
			HttpSession s = req.getSession();
			s.setAttribute("user", u);
			d = req.getRequestDispatcher("home.jsp");
			d.forward(req, resp);
		}
		else
		{
			w.write("<html><body><h2>INVALID Number or Password</h2></body></html>");
			d = req.getRequestDispatcher("login.jsp");
			d.include(req, resp);
		}
	}	
}
