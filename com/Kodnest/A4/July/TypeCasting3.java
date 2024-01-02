package com.Kodnest.A4.July;

public class TypeCasting3 {
    public static void main(String[] args) {
        long l = 10l;
        int a ;
        a=(int)l;
        System.out.println(l);
        System.out.println("the Value Of long Type converted into int data type : " +a);

        boolean b = false;
        char ch ;
       // ch=(char)b; // Inconvertible types; cannot cast 'boolean' to 'char'

        char ch1 = 'A';
        int c ;
         c = ch1;
        System.out.println("Char Value A is converted into int data type is A = : "+c);

        short sh;
        sh=(short) ch1;
        System.out.println("Char Value A is converted into Short data type is A = : "+sh);
    }
}
