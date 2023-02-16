package com.rajeshkawali.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rajeshkawali.model.Employee;
import com.rajeshkawali.service.EmployeeService;
/**
 * 
 * @author Rajesh_Kawali
 *
 */
@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@GetMapping
	public String welcome() {
		return "Welcome to the security endpoint";
	}

	@GetMapping("/all")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public List<Employee> getAllEmployee() {
		return service.getAllEmployee();
	}
	
	@PostMapping("/addNewEmployee")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public String saveEmployee(@RequestBody Employee employee) {
		return service.saveEmployee(employee);
	}

	@GetMapping("/{id}")
	@PreAuthorize("hasAuthority('ROLE_USER')")
	public Employee getEmployeeById(@PathVariable int id) {
		return service.getEmployeeById(id);
	}
}
