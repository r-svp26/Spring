package com.btm.jspider.SpringCore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {
	public static void main(String[] args) {
		
		/* Create Spring container */
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml"); 
						
		/* To get the bean */
		Employee emp = (Employee) ctx.getBean("emp");
		System.out.println("Employee Id: "+emp.getId());
		System.out.println("Employee Name: "+emp.getName());
		System.out.println("Employee Id: "+emp.getSal());
		System.out.println("Employee Id: "+emp.getLoc());
	}
}