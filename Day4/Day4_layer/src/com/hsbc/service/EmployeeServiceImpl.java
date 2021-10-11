package com.hsbc.service;

import com.hsbc.Employee;
import com.hsbc.dao.EmployeeDao;
import com.hsbc.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao dao = null;

	public EmployeeServiceImpl() {
		// this is wrong approach we need to use factory pattern
		dao = new EmployeeDaoImpl();
	}

	@Override
	public void store(Employee employee) {
		dao.save(employee);
	}

	@Override
	public Employee findEmployee(int id) {
		return dao.fetchEmployeeById(id);
		
	}

	@Override
	public Employee[] findAllEmployees() {
		return dao.findAllEmployees();
	}

	@Override
	public void updateSalary(int id, double salary) {
		dao.updateEmployeeSalary(id, salary);

	}

	@Override
	public void updateName(int id, String name) {
	     dao.updateEmployeeName(id, name);
		
	}



}
