package com.AgiraTech;

public class CountEvenDigitAndOddDigitCountInNumber {

	public static void main(String[] args) {
		int num = 232166;
		int evenCount =0; 
		int oddCount = 0;
		
		while(num>0) {
			int rem = num%10;
			if(rem % 2==0) {
				evenCount++;
			}else {
				oddCount++;
			}
			num/=10;
		}
		System.out.println("Even Digit Count " +evenCount);
		System.out.println("Odd Digit Count " +oddCount);
	}

}
