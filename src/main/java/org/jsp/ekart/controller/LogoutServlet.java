package org.jsp.ekart.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		HttpSession s = req.getSession();
		s.invalidate();
		req.setAttribute("msg", "You Are Logged Out");
		RequestDispatcher d = req.getRequestDispatcher("login.jsp");
		d.forward(req, resp);
	}
}
