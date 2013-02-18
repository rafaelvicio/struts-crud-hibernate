package com.ashok.mvc.bean;

import org.apache.struts.validator.ValidatorForm;

public class StudentFormBean extends ValidatorForm {

	private int id;
	private String name;
	private String course;
	private String address;

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

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "StudentFormBean [id=" + id + ", name=" + name + ", course="
				+ course + ", address=" + address + "]";
	}

}
