package com.cjc.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student 
{
	
	/*
	 * @Id
	 * 
	 * @GeneratedValue(strategy=GenerationType.IDENTITY)
	 */
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
   private int rno;
   private String name;
   private String address;
   
   @OneToOne(cascade=CascadeType.ALL)
   private Login login;

public int getRno() {
	return rno;
}

public void setRno(int rno) {
	this.rno = rno;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public Login getLogin() {
	return login;
}

public void setLogin(Login login) {
	this.login = login;
}
}
