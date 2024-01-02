package oops.java.program;

import java.util.Scanner;

class Student{
	int rollNo ;
	String name;
	int age;
	Student(int rollNo, String name, int age){
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}
}
public class InsertObjectInArray {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the Number Of Student");
			int n = sc.nextInt();
			Student[] stuArr = new Student[n];
			
			for(int i=0; i<stuArr.length;i++) {
				System.out.println("Enter The Student Roll No "+(i+1));
				int roll = sc.nextInt();
				System.out.println("Enter The Student Name " +(i+1));
				String name = sc.next();
				System.out.println("Enter The Age Of Student "+(i+1));
				int age = sc.nextInt();
				stuArr[i] = new Student(roll, name,age );
			}
			
//		Student s1 = new Student(1, "kausar raza", 22);
//		Student s2 = new Student(2, "Faiz Raza" , 23);
//		Student s3 = new Student(3, "Rohit Gupta", 23);
//		Student[] arr = {s1, s2, s3};
			
			for(int i= 0 ; i<stuArr.length; i++) {
				System.out.println("Name : "+stuArr[i].name +" , "+" Roll No: " +stuArr[i].rollNo+" , "+ " Age: "+ stuArr[i].age);
			}
		}
	}

}
