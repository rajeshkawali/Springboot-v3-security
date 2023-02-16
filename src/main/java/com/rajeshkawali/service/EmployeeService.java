package com.rajeshkawali.service;

import java.util.List;

import com.rajeshkawali.model.Employee;
/**
 * 
 * @author Rajesh_Kawali
 *
 */
public interface EmployeeService {

	List<Employee> getAllEmployee();

	Employee getEmployeeById(int id);

	String saveEmployee(Employee employee);

}
