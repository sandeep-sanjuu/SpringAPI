package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.EmployeeDetails;
import com.example.demo.service.DepartmentService;

@RestController
public class DepartmentControll {
	@Autowired
	private DepartmentService departmentservice;
	@PostMapping("/employes	")
	public EmployeeDetails save(@RequestBody EmployeeDetails details) {
		return departmentservice.saveDepartment(details);
	}
}
