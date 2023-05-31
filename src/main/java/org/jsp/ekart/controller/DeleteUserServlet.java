package org.jsp.ekart.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.jsp.ekart.dao.UserDao;
import org.jsp.ekart.dto.User;

@WebServlet("/delete")
public class DeleteUserServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		HttpSession s = req.getSession();
		User u = (User) s.getAttribute("user");
		if(u != null)
		{
			int id = u.getId();
			UserDao dao = new UserDao();
			dao.deleteUser(id);
			s.invalidate();
			req.setAttribute("msg", "Your Account is Deleted");
			RequestDispatcher d = req.getRequestDispatcher("login.jsp");
			d.forward(req, resp);
		}
		else 
		{
			resp.sendRedirect("login.jsp");
		}
	}
}
