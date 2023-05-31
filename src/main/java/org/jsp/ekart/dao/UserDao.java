package org.jsp.ekart.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.jsp.ekart.dto.User;

public class UserDao 
{
	EntityManager m = Persistence.createEntityManagerFactory("dev").createEntityManager();
	
	public User saveUSer(User user)
	{
		EntityTransaction t = m.getTransaction();
		m.persist(user);
		t.begin();
		t.commit();
		return user;
	}
	
	public User updateUser(User user)
	{
		EntityTransaction t = m.getTransaction();
		m.merge(user);
		t.begin();
		t.commit();
		return user;
	}
	
	public User findById(int id)
	{
		return m.find(User.class,id);
	}
	
	public User verifyUser(long phone, String password)
	{
		Query q = m.createQuery("select u from User u where u.phone=?1 and u.password=?2");
		q.setParameter(1, phone);
		q.setParameter(2, password);
		try
		{
			return (User) q.getSingleResult();
		} 
		catch (NoResultException e)
		{
			return null;
		}
	}
	
	public boolean deleteUser(int id)
	{
		User u = findById(id);
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
}
