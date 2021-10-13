package com.hsbc.service;

import com.hsbc.beans.Employee;
import com.hsbc.dao.EmployeeDao;
import com.hsbc.exception.EmployeeNotFoundException;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao dao = null;
//	public EmployeeServiceImpl() {
//		// this is wrong approach we need to use factory pattern
//		dao = new EmployeeDaoArrayImpl();
//	}

	public EmployeeServiceImpl(EmployeeDao dao) {
		this.dao = dao;
	}

	@Override
	public void store(Employee employee) {
		dao.save(employee);
	}

	@Override
	public Employee findEmployee(int id) throws EmployeeNotFoundException {
		Employee emp = dao.fetchEmployeeById(id);
		if (emp == null) {
			throw new EmployeeNotFoundException("Sorry employee with an id " + id + " not found");
		}
		return emp;
	}

	@Override
	public Employee[] findAllEmployees() {
		return dao.findAllEmployees();
	}

	@Override
	public void updateSalary(int id, double salary) throws EmployeeNotFoundException {
		Employee e = dao.fetchEmployeeById(id);
		if (e == null) {
			throw new EmployeeNotFoundException("Sorry employee with an id " + id + " not found");
		} else {
			e.setSalary(salary);
			dao.updateEmployee(id, e);

		}

	}

	@Override
	public void updateName(int id, String name) throws EmployeeNotFoundException {
		Employee e = dao.fetchEmployeeById(id);
		if (e == null) {
			throw new EmployeeNotFoundException("Sorry employee with an id " + id + " not found");
		} else {
			e.setName(name);
			dao.updateEmployee(id, e);

		}
	}

}
