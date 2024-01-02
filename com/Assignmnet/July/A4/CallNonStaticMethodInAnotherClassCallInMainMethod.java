package com.Assignmnet.July.A4;
   class Program1{
	   void display() {
		   System.out.println("Method Call In Main Methods");
	   }
   }
public class CallNonStaticMethodInAnotherClassCallInMainMethod {

	public static void main(String[] args) {
      Program1 program = new Program1();
      program.display();
	}

}
