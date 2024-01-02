package com.Kodnest.A4.July;

import java.util.Scanner;

public class ScannerClass_Practice {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter The Integer Value");
			int x = sc.nextInt();
			System.out.println("The Value Of X is "+x);
			System.out.println("Enter The Float Value");
			float y = sc.nextFloat();
			System.out.println("The Value Of Y Float is: "+y);
			System.out.println("Enter The Byte Value");
			byte b = sc.nextByte();
			System.out.println("The Value Of B Byte Is "+b);
			System.out.println("Enter The Short Value");
			short s = sc.nextShort();
			System.out.println("The Value Of S Short Is "+s);
			System.out.println("Enter The Double Value");
			double d = sc.nextDouble();
			System.out.println("The Value Of Double is "+d);
			System.out.println("Enter The long value");
			long l = sc.nextLong();
			System.out.println("The Value Of Long l is "+l);
			System.out.println("Enter the Boolean Value");
			boolean bool  = sc.nextBoolean();
			System.out.println("The Value Of Boolean B is "+bool);
		}
    }
}
