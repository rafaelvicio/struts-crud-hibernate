package com.ashok.mvc.bean;

import org.apache.struts.validator.ValidatorForm;

public class StudentIdFormBean extends ValidatorForm {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "StudentIdFormBean [id=" + id + "]";
	}

}
