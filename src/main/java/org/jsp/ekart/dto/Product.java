package org.jsp.ekart.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Product 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name,description,brand,category;
	private double cost;
	private String image;
	@ManyToOne
	@JoinColumn
	private User user;
	
	public Product(String name, String description, String brand, String category, double cost, String image) 
	{
		super();
		this.name = name;
		this.description = description;
		this.brand = brand;
		this.category = category;
		this.cost = cost;
		this.image = image;
	}
	public Product()
	{
	}
	public int getId() 	
	{
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
	public String getDescription() 
	{
		return description;
	}
	public void setDescription(String description) 
	{
		this.description = description;
	}
	public String getBrand() 
	{
		return brand;
	}
	public void setBrand(String brand) 
	{
		this.brand = brand;
	}
	public String getCategory() 
	{
		return category;
	}
	public void setCategory(String category) 
	{
		this.category = category;
	}
	public double getCost() 
	{
		return cost;
	}
	public void setCost(double cost) 
	{
		this.cost = cost;
	}
	public String getImage() 
	{
		return image;
	}
	public void setImage(String image) 
	{
		this.image = image;
	}
	public User getUser() 
	{
		return user;
	}
	public void setUser(User user) 
{
		this.user = user;
	}
}
