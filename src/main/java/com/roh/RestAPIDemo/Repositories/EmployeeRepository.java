package com.roh.RestAPIDemo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.roh.RestAPIDemo.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
