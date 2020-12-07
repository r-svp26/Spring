package com.jsp.testapp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import com.jsp.entity.Aloha;
import com.jsp.entity.HelloWorld;

@SuppressWarnings("deprecation")
public class TestApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		/* Create the BeanFactory Object */
		Resource res = new ClassPathResource("Spring.xml");
		BeanFactory bef = new XmlBeanFactory(res);
		HelloWorld object = (HelloWorld) bef.getBean("hlw");
		object.displayMessage();

		/* Create the ApplicationContext Object */
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		Aloha aloha = (Aloha) context.getBean("aloha");
		aloha.greet();

	}
}
