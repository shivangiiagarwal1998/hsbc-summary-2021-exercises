package com.hsbc.dao;

import com.hsbc.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	private static Employee[] employeeDb = new Employee[10];
	private static int arrayIndexCounter = 0;

	@Override
	public void save(Employee employee) {
		employeeDb[arrayIndexCounter] = employee;
		arrayIndexCounter++;
	}

	@Override
	public Employee fetchEmployeeById(int id) {
		for (Employee emp : employeeDb) {
			if (id == emp.getId()) {
				return (emp);
			}
		}
		return null;

	}

	@Override
	public Employee[] findAllEmployees() {
		Employee[] tempDb = new Employee[arrayIndexCounter];
		for (int index = 0; index < arrayIndexCounter; index++) {
			tempDb[index] = employeeDb[index];
		}
		return tempDb;
	}

	public void updateEmployeeName(int id, String name) {
		Employee[] tempe = findAllEmployees();
		for (Employee emp : tempe) {
			if (emp.getId() == id) {
				emp.setName(name);
			}
		}
	}

	@Override
	public void updateEmployeeSalary(int id, double salary) {
		Employee[] tempe = findAllEmployees();
		for (Employee emp : tempe) {
			if (emp.getId() == id) {
				emp.setSalary(salary);
			}
		}
	}
}
