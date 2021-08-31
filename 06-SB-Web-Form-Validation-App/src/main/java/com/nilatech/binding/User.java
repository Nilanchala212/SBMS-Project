package com.nilatech.binding;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class User {
	
	@NotEmpty(message = "Please Enter user name")
	private String uname;
	@NotEmpty(message = "Please Enter pwd")
	private String pwd;
	@NotEmpty(message = "Please Enter a mail")
	@Email(message = "Enter valid mail")
	private String email;
	private Long phno;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhno() {
		return phno;
	}
	public void setPhno(Long phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "User [uname=" + uname + ", pwd=" + pwd + ", email=" + email + ", phno=" + phno + "]";
	}
	
	

}
