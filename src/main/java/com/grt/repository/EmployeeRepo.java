package com.grt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grt.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
