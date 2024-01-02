package com.Kodnest.A4.July;

public class TypeCasting2 {
    public static void main(String[] args) {
        // Explicit Type Casting
        double d = 10.5;
        float f ;
        f=(float) d;
        System.out.println("The Value Of Double d : "+d);
        System.out.println("Double value type casting explicitly in float : "+f);
        int i ;
        i = (int)d;
        System.out.println("Double value type casting explicitly in int : "+i);

        short sh;
         sh = (short) d;
        System.out.println("Double value type casting explicitly in Short : "+sh);
    }
}
