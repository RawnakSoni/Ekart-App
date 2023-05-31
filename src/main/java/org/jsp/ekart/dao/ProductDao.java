package org.jsp.ekart.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.jsp.ekart.dto.Product;
import org.jsp.ekart.dto.User;

public class ProductDao 
{
EntityManager m = Persistence.createEntityManagerFactory("dev").createEntityManager();
	
	public Product saveProduct(Product product, int user_id)
	{
		User u = m.find(User.class, user_id);
		if(u!=null)
		{
			u.getProducts().add(product);
			product.setUser(u);
			EntityTransaction t = m.getTransaction();
			m.persist(product);
			t.begin();
			t.commit();
			return product;
		}
		return null;
	}
	
	public Product updateProduct(Product product, int user_id)
	{
		User u = m.find(User.class, user_id);
		if(u!=null)
		{
			u.getProducts().add(product);
			product.setUser(u);
			EntityTransaction t = m.getTransaction();
			m.merge(product);
			t.begin();
			t.commit();
			return product;
		}
		return null;
	}
	
	public Product findProductById(int id)
	{
		return m.find(Product.class,id);
	}
	
	public boolean deleteProduct(int id)
	{
		Product u = findProductById(id);
		if(u!=null)
		{
			EntityTransaction t = m.getTransaction();
			m.remove(u);
			t.begin();
			t.commit();
			return true;
		}
		return false;
	}
	
	public List<Product> findUserByUserId(int user_id)
	{
		Query q = m.createQuery("select u.products from User u where u.id=?1");
		q.setParameter(1, user_id);
		return q.getResultList();
	}
}

