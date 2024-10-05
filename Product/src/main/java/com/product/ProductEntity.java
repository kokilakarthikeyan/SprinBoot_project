package com.product;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.http.HttpStatus;


@Entity
@Table(name="product")
public class ProductEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="price")
	private double price;
	@Column(name="date")
	private Date date;
	@Column(name="country")
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
	private ProductEntity(int id, String name, double price, Date date, String country) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.date = date;
		this.country = country;
	}
	public ProductEntity() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ProductPojo [id=" + id + ", name=" + name + ", price=" + price + ", date=" + date + ", country="
				+ country + "]";
	}
	public static Object status(HttpStatus created) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
