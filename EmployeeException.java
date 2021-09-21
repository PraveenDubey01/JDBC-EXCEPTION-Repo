package edu.exception;

@SuppressWarnings("serial")
public class EmployeeException extends Exception {
	public EmployeeException() {
		super("employee Error!");
	}
	public EmployeeException(String msg) {
		super(msg);
	}
}
