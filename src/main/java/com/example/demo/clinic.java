package com.example.demo;

import org.springframework.data.annotation.Id;

public class clinic {
	
	public clinic() {
		
	}
	public clinic(String firstname,String surname,int phone,String mail,int age) {
		this.firstname=firstname;
		this.surname=surname;
		this.phone=phone;
		this.mail=mail;
		this.age=age;
	}
	@Id
	private int id;
	private String firstname;
	private String surname;
	private int phone;
	private String mail;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
