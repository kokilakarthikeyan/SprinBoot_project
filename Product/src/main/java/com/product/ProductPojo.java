package com.product;

import java.util.Date;

public class ProductPojo {
	private int id;
	private String name;
	private double price;
	private Date date;
	private String country;
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	private ProductPojo(int id, String name, double price, Date date, String country) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.date = date;
		this.country = country;
	}
	@Override
	public String toString() {
		return "ProductPojo [id=" + id + ", name=" + name + ", price=" + price + ", date=" + date + ", country="
				+ country + "]";
	}
	
	

}
