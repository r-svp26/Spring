package org.jsp.beanapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		/* Spring Object Creation */
		Student s1 = (Student) context.getBean("std");
		System.out.println(s1.hashCode());

		Student s2 = (Student) context.getBean("std");
		System.out.println(s2.hashCode());

		System.out.println("----------------------------");

		/* Java Object Creation */
		Student st1 = new Student();
		System.out.println(st1.hashCode());

		Student st2 = new Student();
		System.out.println(st2.hashCode());
	}

}
