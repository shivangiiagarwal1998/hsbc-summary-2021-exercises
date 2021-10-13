
package com.hsbc.factory;

import com.hsbc.dao.EmployeeDao;
import com.hsbc.dao.EmployeeDaoArrayImpl;
import com.hsbc.dao.EmployeeDaoArrayListImpl;
import com.hsbc.dao.EmployeeDaoJdbcImpl;
import com.hsbc.dao.EmployeeDaoTreeSetImpl;
import com.hsbc.service.EmployeeService;
import com.hsbc.service.EmployeeServiceImpl;

public class ObjectFactory {
	public static EmployeeDao getDaoInstance(int option) {
		if (option == 1)
			return new EmployeeDaoArrayImpl();
		else if (option == 2)
			return new EmployeeDaoArrayListImpl();
		else if (option == 3)
			return new EmployeeDaoTreeSetImpl();
		else if (option == 4)
			return new EmployeeDaoJdbcImpl();
		else
			return new EmployeeDaoArrayListImpl();
	}

	public static EmployeeService getServiceInstance(EmployeeDao dao) {
		return new EmployeeServiceImpl(dao);
	}
}