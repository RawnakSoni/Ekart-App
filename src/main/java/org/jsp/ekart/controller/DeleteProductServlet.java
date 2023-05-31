package org.jsp.ekart.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.jsp.ekart.dao.ProductDao;
import org.jsp.ekart.dto.User;

@WebServlet("/deleteproduct")
public class DeleteProductServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		User u = (User) req.getSession().getAttribute("user");
		if(u!=null)
		{
			int id = Integer.parseInt(req.getParameter("pid"));
			ProductDao dao = new ProductDao();
			dao.deleteProduct(id);
			RequestDispatcher d = req.getRequestDispatcher("viewproducts");
			d.forward(req, resp);
		}
		else
		{
			resp.sendRedirect("login.jsp");
		}
	}
}
