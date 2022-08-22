package com.springcrud.beans;

public class Employee {

	private int id;
	private String name,designation;
	private float salary;
	public int getid() {
		return id;
	}
	public void setEid(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
}
