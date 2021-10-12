package com.hsbc.service;

import com.hsbc.Employee;
import com.hsbc.exception.EmployeeAlreadyExists;
import com.hsbc.exception.EmployeeNotFoundException;

public interface EmployeeService {
	public void store(Employee employee) throws EmployeeAlreadyExists;

	public Employee findEmployee(int id) throws EmployeeNotFoundException;

	public Employee[] findAllEmployees();

	public void updateSalary(int id, double salary) throws EmployeeNotFoundException;

	public void updateName(int id, String name) throws EmployeeNotFoundException;

}
