package com.Kodnest.A4.July;
   class CalculateSemMarkAvg{
	   double sem1, sem2, sem3, sem4, sem5, sem6, sem7, sem8;

	public CalculateSemMarkAvg(double sem1, double sem2, double sem3, double sem4, double sem5, double sem6,
			double sem7, double sem8) {
		super();
		this.sem1 = sem1;
		this.sem2 = sem2;
		this.sem3 = sem3;
		this.sem4 = sem4;
		this.sem5 = sem5;
		this.sem6 = sem6;
		this.sem7 = sem7;
		this.sem8 = sem8;
	}
	
	public void calculateAvg() {
		double avg = (sem1+sem2+sem3+sem4+sem5+sem6+sem7+sem8)/8;
		System.out.println("8 sem Marks AVG"+avg);
	}
	   
   }
public class Semester_Marks_Averager {

	public static void main(String[] args) {
		CalculateSemMarkAvg marksAvg = new CalculateSemMarkAvg(85, 79, 91, 76, 88, 95, 80, 85);
		marksAvg.calculateAvg();
	}

}
