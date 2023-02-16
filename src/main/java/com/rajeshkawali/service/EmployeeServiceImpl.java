package com.rajeshkawali.service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rajeshkawali.model.Employee;
import com.rajeshkawali.model.Gender;
import com.rajeshkawali.repository.EmployeeRepository;

import jakarta.annotation.PostConstruct;
/**
 * 
 * @author Rajesh_Kawali
 *
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	
	@Override
	public String saveEmployee(Employee employee) {
		repository.save(employee);
		return "Employee added in the db";
	}

	@Override
	public List<Employee> getAllEmployee() {
		return repository.findAll();
	}

	@Override
	public Employee getEmployeeById(int id) {
		return repository.findById(id).get();
	}
	
	@PostConstruct
	public void saveAllEmployee() {
		List<Employee> employeeList = Arrays.asList(
				new Employee(1, "Rajesh", "Kawali",Gender.MALE, LocalDate.of(2015, 9, 9), 35, "rajesh@gmail.com", "9590955557", 45000, "software", Arrays.asList("Trimax", "Diebold", "Capgemini")),
				new Employee(2, "Mahesh", "Koli",Gender.MALE, LocalDate.of(1990, 5, 20), 33, "mahesh@yahoo.com", "8990955230", 70000, "admin", Arrays.asList("Dell", "Yantra")),
				new Employee(3, "Vidya", "Kawali",Gender.FEMALE, LocalDate.of(2008, 4, 10), 29, "vidya@gmail.com", "9590955557", 28000, "finance", Arrays.asList("BOM")),
				new Employee(4, "Vikram", "Konkal",Gender.MALE, LocalDate.of(2018, 1, 2), 6, "vikram@yahoo.com", "7890955557", 50000, "hr", Arrays.asList("Accenture", "Morgan", "TCS", "Reliance")),
				new Employee(5, "Keshav", "Koli",Gender.MALE, LocalDate.of(2021, 8, 20), 24, "keshav@gmail.com", "8590923557", 15000, "software", Arrays.asList("Xangar", "TCS")),
				new Employee(6, "Kiran", "Kamble",Gender.MALE, LocalDate.of(2014, 6, 30), 36, "kiran@gmail.com", "9590955644", 50000, "software", Arrays.asList("Takira", "Trimax", "Xangar")),
				new Employee(7, "Arjun", "Naik",Gender.MALE, LocalDate.of(2009, 7, 17), 36, "arjun@gmail.com", "8990955507", 35000, "finance", Arrays.asList("IBM", "Concentrix")),
				new Employee(8, "Laksh", "Kawali",Gender.MALE, LocalDate.of(2021, 9, 24), 2, "laksh@yahoo.com", "9596555557", 120000, "admin", Arrays.asList("Walmart", "Microsoft", "Amazon", "Google", "Apple")),
				new Employee(9, "Sachin", "Gaikwad",Gender.MALE, LocalDate.of(2002, 5, 10), 33, "sachin@gmail.com", "99855557", 10000, "admin", Arrays.asList("Zomato")),
				new Employee(10, "Arti", "Pantigi",Gender.FEMALE, LocalDate.of(2000, 5, 22), 21, "arti@gmail.com", "9590955457", 18000, "software", Arrays.asList("SBI","Axis")),
				new Employee(11, "Rajesh", "Nayak",Gender.MALE, LocalDate.of(2015, 9, 9), 33, "rajesh@yahoo.com", "9590955337", 30000, "admin", Arrays.asList("Capgemini")));
		repository.saveAll(employeeList);
	}

}
