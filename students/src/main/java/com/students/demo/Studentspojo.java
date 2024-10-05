package com.students.demo;



public class Studentspojo {
	private int id;
	private String name;
	private String email;
	private String major;
	private double gpa;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	
	private Studentspojo(int id, String name, String email, String major, double gpa) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.major = major;
		this.gpa = gpa;
		
	}
	private Studentspojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Studentspojo [id=" + id + ", name=" + name + ", email=" + email + ", major=" + major + ", gpa=" + gpa
				+ "]";
	}
	
	
	

}
