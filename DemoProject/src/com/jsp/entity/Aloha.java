package com.jsp.entity;

public class Aloha {

	private String message = "Welcome to Mirzapur!";

	public Aloha() {
		System.out.println("Aloha Object has creted Using ApplicationContext");
	}

	public void greet() {
		System.out.println("The Meassage is: " + message);
	}

}
