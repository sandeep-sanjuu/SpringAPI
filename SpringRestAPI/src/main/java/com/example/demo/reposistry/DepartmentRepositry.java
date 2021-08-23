package com.example.demo.reposistry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.EmployeeDetails;

@Repository
public interface DepartmentRepositry extends JpaRepository<EmployeeDetails,Integer> {
     
}
