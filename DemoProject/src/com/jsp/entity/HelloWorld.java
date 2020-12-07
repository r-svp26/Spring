package com.jsp.entity;

public class HelloWorld {

	private String message = "I am Java Developer";

	public HelloWorld() {
		System.out.println("HelloWold Object has created using BeanFactory!");
	}

	public void displayMessage() {
		System.out.println("The Meassge is: " + message);
	}

}
