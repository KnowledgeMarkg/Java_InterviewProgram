package com.Assignmnet.July.A4;

   class Program {
	   static void display() {
		   System.out.println("Method Call");
	   }
   }
public class CallStaticMethodInAnotherClassCallInMainMethod {

	public static void main(String[] args) {
      Program.display();
	}

}
