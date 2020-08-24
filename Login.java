package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="log")
public class Login 
{
	
	/*
	 * @Id
	 * 
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
  private int lid;
  private String uname;
  private String pass;
  
public int getLid() {
	return lid;
}
public void setLid(int lid) {
	this.lid = lid;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
}
