package org.jsp.ekart.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.jsp.ekart.dao.ProductDao;
import org.jsp.ekart.dto.Product;
import org.jsp.ekart.dto.User;

@WebServlet("/addproduct")
public class AddProductServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("nm");
		String brand = req.getParameter("br");
		String description = req.getParameter("desc");
		String category = req.getParameter("cat");
		String image = req.getParameter("im");
		double cost = Double.parseDouble(req.getParameter("cost"));
		Product p = new Product(name, description, brand, category, cost, image);
		ProductDao dao = new ProductDao();
		User u = (User) req.getSession().getAttribute("user");
		p = dao.updateProduct(p, u.getId());
		PrintWriter w = resp.getWriter();
		w.write("<html><body><h2>Product added with ID :" + p.getId() + "</h2></body></html>");
	}
}
