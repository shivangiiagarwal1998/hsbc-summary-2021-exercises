package com.hsbc.view;

import java.util.Scanner;

import com.hsbc.Employee;
import com.hsbc.exception.EmployeeAlreadyExists;
import com.hsbc.exception.EmployeeNotFoundException;
import com.hsbc.service.EmployeeService;
import com.hsbc.service.EmployeeServiceImpl;

public class EmployeeView {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		EmployeeService service = new EmployeeServiceImpl();
		int controllerOption = 0;
		do {
			System.out.println("Enter options:-");
			System.out.println(
					"1: Store employee 2: Find employee by id 3: Find All employees 4: Update Name 5: Update Salary 0: Exit");
			controllerOption = scan.nextInt();
			switch (controllerOption) {
			case 1:
				System.out.println("--- Enter employee details ------");
				Employee emp = new Employee();
				System.out.println("Enter id");
				emp.setId(scan.nextInt()); // instead of int id = scan.nextInt(); emp.setId(id);
				System.out.println("Enter name");
				emp.setName(scan.next());
				System.out.println("Enter salary");
				emp.setSalary(scan.nextDouble());
				try {
					service.store(emp);
				} catch (EmployeeAlreadyExists e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				System.out.println("Successfully stored.....");
				System.out.println("---------------------------------");
				break;
			case 2:
				System.out.println("Enter id to be searched");
				int ide = scan.nextInt();

				try {
					Employee empp = service.findEmployee(ide);
					System.out.println(empp.getId() + empp.getName() + empp.getSalary());
				} catch (EmployeeNotFoundException e1) {
					System.err.println(e1.getMessage());
				}
				break;
			case 3:
				Employee[] employees = service.findAllEmployees();
				for (Employee e : employees) {
					System.out.println("Hello " + e.getName() + ", Your salary is: " + e.getSalary() + " and id is : "
							+ e.getId());
				}
				break;
			case 4:
				System.out.println("Enter the employee id that you want to update");
				int empid = scan.nextInt();
				System.out.println("Enter the new name :");
				String name = scan.next();
				try {
					service.updateName(empid, name);
				} catch (EmployeeNotFoundException e1) {
					System.err.println(e1.getMessage());
				}
				System.out.println("Updated successfully");
				break;
			case 5:
				System.out.println("Enter Employee ID");
				int empid1 = scan.nextInt();
				System.out.println("Enter Updated Employee Salary");
				double salary = scan.nextDouble();
				try {
					service.updateSalary(empid1, salary);
				} catch (EmployeeNotFoundException e1) {

					System.err.println(e1.getMessage());
				}
				System.out.println("Updated Successfully!");
				break;
			}
		} while (controllerOption != 0);
		scan.close();
	}

}
