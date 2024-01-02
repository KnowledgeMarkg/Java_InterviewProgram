package com.Assignmnet.July.A4;

public class FinanceCalculator {
     double principalAmt, time, rate;
     double si;
	public FinanceCalculator(double principalAmt, double time, double rate) {
		super();
		this.principalAmt = principalAmt;
		this.time = time;
		this.rate = rate;
	}
     
	public void calculateSimpleInterest() {
	    si = (principalAmt*rate*time);
	}
	public void showInterest() {
		System.out.println("Simple Interest is : " +si);
	}
	public static void main(String[] args) {
      FinanceCalculator financeCalculator = new FinanceCalculator(1000.0,0.05,2.0);
      financeCalculator.calculateSimpleInterest();
      financeCalculator.showInterest();
	}

}
