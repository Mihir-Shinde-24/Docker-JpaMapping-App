package com.grt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grt.entity.Employee;
import com.grt.repository.EmployeeRepo;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	EmployeeRepo employeeRepo;
	
	@PostMapping
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee newEmployee)
	{
		return ResponseEntity.status(HttpStatus.OK).body(employeeRepo.save(newEmployee));
	}
	
	
	@GetMapping
	public ResponseEntity<List<Employee>> getEmployees()
	{
		return ResponseEntity.status(HttpStatus.OK).body(employeeRepo.findAll());
	}
	
	@GetMapping("/{e_id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("e_id") int id)
	{
		return ResponseEntity.status(HttpStatus.OK).body(employeeRepo.findById(id).get());
	}
	
}
