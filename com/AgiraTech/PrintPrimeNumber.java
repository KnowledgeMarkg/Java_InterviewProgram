package com.AgiraTech;

import java.util.Scanner;

public class PrintPrimeNumber {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter The Num Value");
            int n = sc.nextInt();
            printPrimeNum(n);
        }
    }

    private static void printPrimeNum(int n) {
        for (int i = 2; i <= n; i++) {
            boolean isPrime = checkPrime(i);
            if (isPrime) {
                System.out.print(i);
                if (i != nPrime(n)) {
                    System.out.print(" , ");
                }
            }	
        }
    }

    private static boolean checkPrime(int i) {
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to find the last prime number less than or equal to n
    private static int nPrime(int n) {
        for (int i = n; i >= 2; i--) {
            if (checkPrime(i)) {
                return i;
            }
        }
        return -1; // No prime number found
    }
}
