package com.createEmployee;

import java.util.Scanner;

public class ManageAllEmployee {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			EmployeeManager employeeMng = new EmployeeManager(5);
			boolean b = true;
			
			while(b) {
				System.out.println("Enter 1 For Add Employee");
				System.out.println("Enter 2 For Search Employee");
				System.out.println("Enter 3 For Display All Employee");
				System.out.println("Enter 4 For Exit Employee App");
				System.out.println("=================================");
				System.out.println();
				int n = sc.nextInt();
				switch (n) {
				case 1: {
					System.out.println("Enter The Name Of Emp");
					String name = sc.next();
					System.out.println("Enter The salary Of Emp");
					double sal = sc.nextDouble();
					employeeMng.addEmployee(name, sal);
					break;
				}
				case 2: {
					System.out.println("Enter The Id For Search Of A Emp");
					int searchId = sc.nextInt();
					Employee foundEmp = employeeMng.searchEmp(searchId);
					if(foundEmp !=null) {
						System.out.println("Employee found - ID: " + foundEmp.getId() +
			                    ", Name: " + foundEmp.getName() +
			                    ", Salary: " + foundEmp.getSalary());
						System.out.println();
					}else {
						System.out.println("Employee with ID " + searchId + " not found");
						System.out.println();
					}
					break;
				}
				
				case 3 : {
					employeeMng.displayEmp();
					System.out.println();
					break;
				}
				case 4 : {
					b = false;
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: ");
				}
			}
		}
	}
}
