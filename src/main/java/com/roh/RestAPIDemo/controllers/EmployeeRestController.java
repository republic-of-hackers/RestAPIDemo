package com.roh.RestAPIDemo.controllers;

import org.springframework.web.bind.annotation.*;

import com.roh.RestAPIDemo.Repositories.EmployeeRepository;
import com.roh.RestAPIDemo.models.Employee;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeRestController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping
    @RequestMapping("/look/{id}")
    public Employee get(@PathVariable Long id) {
        return employeeRepository.getOne(id);
    }
	
    @PostMapping(path = "", consumes = "application/json", produces = "application/json")
    @RequestMapping("/add")
    public Employee create(@RequestBody final Employee employee){
        return employeeRepository.saveAndFlush(employee);
    }
    
    @PutMapping
    @RequestMapping("/update/{id}")
    public Employee update(@PathVariable final Long id, @RequestBody final Employee employee){
    	Employee emp = employeeRepository.getOne(id);
    	emp.setEmp_name(employee.getEmp_name());
    	return employeeRepository.saveAndFlush(emp);
    }
    
    @DeleteMapping
    @RequestMapping("/delete/{id}")
    public void delete(@PathVariable final Long id) {
    	employeeRepository.deleteById(id);
    }
    
    

}
