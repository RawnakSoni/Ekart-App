package org.jsp.ekart.dto;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class User 
{	
	
	public User(String name, String password, String gender, int age, String email, long phone) 
	{
		super();
		this.name = name;
		this.password = password;
		this.gender = gender;
		this.age = age;
		this.email = email;
		this.phone = phone;
	}
	public User() 
	{

	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name, password, gender;
	private int age;
	@Column(unique = true)
	private String email;
	@Column(unique = true)
	private long phone;
	@OneToMany(mappedBy = "user")
	private List<Product> products;
	public int getId() {
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName() 	
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}
	public String getGender() 
	{
		return gender;
	}
	public void setGender(String gender) 
	{
		this.gender = gender;
	}
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public long getPhone() 
	{
		return phone;
	}
	public void setPhone(long phone) 
	{
		this.phone = phone;
	}
	public List<Product> getProducts() 
	{
		return products;
	}
	public void setProducts(List<Product> products) 
	{
		this.products = products;
	}
}
