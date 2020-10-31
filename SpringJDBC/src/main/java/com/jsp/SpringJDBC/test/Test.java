package com.jsp.SpringJDBC.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.jsp.SpringJDBC.DAO.EmployeeDAO;
import com.jsp.SpringJDBC.entity.Employee;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		EmployeeDAO dao = (EmployeeDAO) context.getBean("employeeDAO");

		/* INSERT OPERATION */
		Employee emp1 = new Employee();
		emp1.setId(5);
		emp1.setFirstName("Ragni");
		emp1.setLastName("Yadav");
		int insert = dao.create(emp1);
		System.out.println("Number of Data Interted Successfully: " + insert);

		System.out.println("----------------------------------------");
		/* UPDATE OPERATION */
		Employee emp2 = new Employee();
		emp2.setId(1);
		emp2.setFirstName("Sarswati");
		emp2.setLastName("Yadav");
		int update = dao.update(emp2);
		System.out.println("Number of Data Updated Successfully: " + update);

		System.out.println("----------------------------------------");
		/* DELETE OPERATION */
		int delete = dao.delete(2);
		System.out.println("Number of Data Deleted Successfully: " + delete);

	}
}
