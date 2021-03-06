package com.jsp.SpringJDBC.DAO.impl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.jsp.SpringJDBC.DAO.EmployeeDAO;
import com.jsp.SpringJDBC.entity.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Employee emp) {
		String sql = "INSERT INTO EMPLOYEE VALUES(?,?,?)";
		int data = jdbcTemplate.update(sql, emp.getId(), emp.getFirstName(), emp.getLastName());

		return data;
	}

	@Override
	public int update(Employee emp) {
		String sql = "UPDATE EMPLOYEE SET FIRSTNAME=?, LASTNAME=? WHERE ID=?";
		int data = jdbcTemplate.update(sql, emp.getFirstName(), emp.getLastName(), emp.getId());
		return data;
	}

	@Override
	public int delete(int id) {
		String sql = "DELETE FROM EMPLOYEE WHERE ID=?";
		int data = jdbcTemplate.update(sql, id);
		return data;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
