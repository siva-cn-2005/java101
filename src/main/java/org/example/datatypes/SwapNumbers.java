package org.example.datatypes;

public class SwapNumbers {
   public static void main(String[] args){
   int a = 20;
   int b = 200;
   int t = b;
   b = a;
   a = t;
   System.out.println("a = " + a);
   System.out.println("b = " + b);
   System.out.println(a * b);
   }
}
