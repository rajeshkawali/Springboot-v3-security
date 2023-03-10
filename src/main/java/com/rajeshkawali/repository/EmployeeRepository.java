package com.rajeshkawali.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rajeshkawali.model.Employee;
/**
 * 
 * @author Rajesh_Kawali
 *
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
