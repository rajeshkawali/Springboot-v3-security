package com.rajeshkawali.service;

import java.util.List;

import com.rajeshkawali.model.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployee();

	Employee getEmployeeById(int id);

	String saveEmployee(Employee employee);

}
