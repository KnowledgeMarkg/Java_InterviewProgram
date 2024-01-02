package com.Assignmnet.July.A4;

public class CallNonStaticMethodInMainMethod {
          void display() {
    	 System.out.println("Inside not Static Method call in Main Method");
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          CallNonStaticMethodInMainMethod n = new CallNonStaticMethodInMainMethod();
          n.display();
	}

}
