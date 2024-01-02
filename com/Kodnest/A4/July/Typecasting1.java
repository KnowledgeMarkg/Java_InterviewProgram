package com.Kodnest.A4.July;

public class Typecasting1 {
    public static void main(String[] args) {
        // Byte , Short , Int , Long, Float, Double, Char, Boolean
        // Implicit Type Casting
        byte x =10;
        short y;
        y=x;
        System.out.println("Value Of X is : "+x);
        System.out.println("Value Of Y is Short Implicit Value Of x is byte, : Y= "+y);
        int z;
        z=x;
        System.out.println("Value Of X is : "+x);
        System.out.println("Value Of Z is INT Implicit Value Of x is byte : Z= "+z);

        long a;
        a=x;
        System.out.println("Value Of X is : "+x);
        System.out.println("Value Of A is Long Implicit Value Of x is byte : a= "+a);

        float b;
        b=x;
        System.out.println("Value Of X is : "+x);
        System.out.println("Value Of Y is Float Implicit Value Of x is byte :B= "+b);

        double c;
        c= x;
        System.out.println("Value Of X is : "+x);
        System.out.println("Value Of c is Double Implicit Value Of x is byte :C= "+c);

        char ch ;
        //ch=x;  byte data type not converted into ChAR data type;

        //boolean b ;
        //b=x; byte data type not implicit converted into boolean data type
    }
}
