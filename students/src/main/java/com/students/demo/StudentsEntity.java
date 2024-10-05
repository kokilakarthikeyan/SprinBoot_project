package com.students.demo;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="student")
public class StudentsEntity {
	@GeneratedValue(strategy=GenerationType.IDENTITY)
@Id
@Column(name="id")
	private int id;
@Column(name="name")
	private String name;
@Column(name="email")
	private String email;
@Column(name="major")
	private String major;
@Column(name="gpa")
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
	
	
	@SuppressWarnings("unused")
	private StudentsEntity(int id, String name, String email, String major, double gpa) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.major = major;
		this.gpa = gpa;
		
	}
	StudentsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Studentspojo [id=" + id + ", name=" + name + ", email=" + email + ", major=" + major + ", gpa=" + gpa
				+ "]";
	}

}
