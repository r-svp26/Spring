package org.jsp.test;

import org.jsp.controller.Flipkart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Flipkart fkart = context.getBean(Flipkart.class);
		fkart.purchase();
	}

}
