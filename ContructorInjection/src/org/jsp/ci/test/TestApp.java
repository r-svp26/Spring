package org.jsp.ci.test;

import org.jsp.ci.service.ICar;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		ICar i1 = (ICar) context.getBean("bm");
		i1.drive();

		ICar i2 = (ICar) context.getBean("ad");
		i2.drive();
	}

}
