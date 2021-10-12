package com.hsbc.service;

import com.hsbc.dao.EmployeeDao;
import com.hsbc.dao.EmployeeDaoImpl;

public class FactoryPattern {
	public static EmployeeDao getDaoInstance(){
		return new EmployeeDaoImpl();
	}

}
