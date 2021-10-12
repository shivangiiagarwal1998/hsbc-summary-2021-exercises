package com.hsbc.exception;

@SuppressWarnings("serial")
public class EmployeeAlreadyExists extends Exception{

	public EmployeeAlreadyExists() {
		super();
	}

	public EmployeeAlreadyExists(String message) {
		super(message);
	}
	

}
