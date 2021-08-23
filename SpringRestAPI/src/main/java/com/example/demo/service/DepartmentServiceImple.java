package com.example.demo.service;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.EmployeeDetails;
import com.example.demo.reposistry.DepartmentRepositry;

@Service
public class DepartmentServiceImple implements DepartmentService{
	@Autowired
    public DepartmentRepositry departmentreposotry;
	@Override
	public EmployeeDetails saveDepartment(EmployeeDetails details) {
		// TODO Auto-generated method stub
		return departmentreposotry.save(details);
	}

}
