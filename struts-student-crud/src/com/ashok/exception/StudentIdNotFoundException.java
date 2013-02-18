package com.ashok.exception;

public class StudentIdNotFoundException extends Exception {

	@Override
	public String toString() {
		return getMessage();
	}

	@Override
	public String getMessage() {
		
		return "Student ID Not Found";
	}
	
	
}
