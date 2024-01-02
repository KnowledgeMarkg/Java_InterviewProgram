package com.createEmployee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private List<Employee> employees;
    private int capacity;
    public EmployeeManager(int capacity) {
       this.capacity = capacity;
       this.employees= new ArrayList<>();
	}
    public void addEmployee(String name , double salary) {
    	if(employees.size()<capacity) {
    	Employee emp = new Employee();
    	emp.setId(generateId());
    	emp.setName(name);
    	emp.setSalary(salary);
    	employees.add(emp);
    	System.out.println("Employee Added SuccessFully Of Id "+emp.getId());
    	}else {
    		System.out.println("Employee Manager Is at full Employee");
    	}
    }
	private int generateId() {
		return Employee.idGenrate+1;
	}
	public Employee searchEmp(int id) {
		for(Employee emp : employees) {
			if(emp.getId()==id) {
				return emp;
			}
		}
		return null;
	}
	public void displayEmp() {
		for(Employee emp : employees) {
			System.out.println("ID : "+emp.getId() +" ,Name : "+emp.getName() +" , Salary "+emp.getSalary());
		}
	}
    
}
