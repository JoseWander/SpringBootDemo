package com.howtodoinjava.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.howtodoinjava.demo.model.Employee;

@RestController
@RequestMapping("spring-boot-demo")
public class EmployeeController {
	
	@RequestMapping("/list")
    public List<Employee> getEmployees() 
    {
		List<Employee> employeesList = new ArrayList<Employee>();
		employeesList.add(new Employee(1,"wander","nunes","jose.wander@embraer.com.br"));
		employeesList.add(new Employee(2,"john","smith","john.smith@embraer.com.br"));
		return employeesList;
    }
	
	@GetMapping("/{id}")
    public Employee findEmployeeById(@PathVariable int id) 
    {
		Employee e = new Employee(1,"wander","nunes","jose.wander@embraer.com.br");
		return e;
    }

}
