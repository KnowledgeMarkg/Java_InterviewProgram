package collections;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {
	private int id;
	private String name;
	private double salary;

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}

public class PredicateAndFunction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> empList = new ArrayList<>();
		System.out.println("Enter The How Many Employee You Want To add ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter Employee Id ");
			int id = sc.nextInt();
			System.out.println("Enter Employee Name ");
			String name = sc.next();
			System.out.println("Enter Employee Salary ");
			double salary = sc.nextDouble();
			Employee emp = new Employee(id, name, salary);
			empList.add(emp);
		}
		sc.close();
		System.out.println("Before Increase Salary ");
		System.out.println(empList);
		
		Predicate<Employee> p1 = e-> e.getSalary()>=2000;
		Predicate<Employee> p2 = e1-> e1.getName().charAt(0)=='K';
		Function<Employee, Employee> f = e -> {
			e.setSalary(e.getSalary()+777);
			return e;
		};
		
		for(Employee emp : empList) {
			if(p1.and(p2).test(emp)) {
				empList.set(empList.indexOf(emp), f.apply(emp));
			}
		}
		
		System.out.println("After Increase Salary Of Employee");
		System.out.println(empList);

		
	}
	

}
