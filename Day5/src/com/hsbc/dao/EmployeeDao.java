package com.hsbc.dao;

import com.hsbc.Employee;
import com.hsbc.exception.EmployeeAlreadyExists;

public interface EmployeeDao {
	public void save(Employee employee) throws EmployeeAlreadyExists;

	public Employee fetchEmployeeById(int id);

	public Employee[] findAllEmployees();

	public void updateEmployee(int id, Employee employee);

}
