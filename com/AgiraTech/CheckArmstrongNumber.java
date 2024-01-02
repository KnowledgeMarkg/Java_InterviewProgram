package com.AgiraTech;

public class CheckArmstrongNumber {

	public static void main(String[] args) {
		int num = 1634;
		
		String st = String.valueOf(num);
		int  n = st.length();
		int res =0;
		int temp = num;
		while(num>0) {
			int rem = num % 10;
			res += Math.pow(rem, n);
			num/=10;
		}
		if(temp == res) {
			System.out.println("The Number Is ArmStrong " +temp);
		}else {
			System.out.println("The Number is not ArmStrong " + temp);
		}
	}

}
