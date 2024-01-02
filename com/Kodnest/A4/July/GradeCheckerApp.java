package com.Kodnest.A4.July;

import java.util.Scanner;
class GardeCheck{
	public static void gradeChecker(int mark) {
		if(mark>=90 && mark<100) {
			System.out.println("Grade A");
		}else if (mark>=70 && mark<89) {
			System.out.println("Grade B");
		}else if (mark>50 && mark<69) {
			System.out.println("Grade C");
		}else if (mark>0 && mark<=49) {
			System.out.println("Grade D");
		}else 
			System.out.println("Invalid Marks");
	}
}

public class GradeCheckerApp {

	public static void main(String[] args) {
       try (Scanner scanner = new Scanner(System.in)) {
		int mark = scanner.nextInt();
		   GardeCheck.gradeChecker(mark);
	}
	}

}
