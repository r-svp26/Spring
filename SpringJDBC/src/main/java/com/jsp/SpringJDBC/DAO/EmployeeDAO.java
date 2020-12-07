package com.jsp.SpringJDBC.DAO;

import com.jsp.SpringJDBC.entity.Employee;

public interface EmployeeDAO {

	int create(Employee emp);
	int update(Employee emp);
	int delete(int id);

}
