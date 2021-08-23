package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class EmployeeDetails {
	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int Id;
	private String Name;
	private String Location;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public EmployeeDetails(int id, String name, String location) {
		super();
		Id = id;
		Name = name;
		Location = location;
	}
	public EmployeeDetails() {
		super();
	}
	@Override
	public String toString() {
		return "EmployeeDetails [Id=" + Id + ", Name=" + Name + ", Location=" + Location + "]";
	}
	
}
