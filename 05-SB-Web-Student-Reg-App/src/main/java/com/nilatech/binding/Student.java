package com.nilatech.binding;

import java.util.Arrays;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;



public class Student {
	
	@NotEmpty(message = "Please Enter Name")
	private String name;
	@NotEmpty(message = "Please Enter Email")
	@Email
	private String email;
	private Long phnum;
	private String gender;
	private String course;
	private String[] timings;
	
	
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

	public Long getPhnum() {
		return phnum;
	}


	public void setPhnum(Long phnum) {
		this.phnum = phnum;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	public String[] getTimings() {
		return timings;
	}


	public void setTimings(String[] timings) {
		this.timings = timings;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + ", phnum=" + phnum + ", gender=" + gender + ", course="
				+ course + ", timings=" + Arrays.toString(timings) + "]";
	}


	

}
