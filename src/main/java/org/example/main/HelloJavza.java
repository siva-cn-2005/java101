package org.example.main;

import org.example.practice.ArithmeticOperation;

public class HelloJavza {
    static String result = "jhjh";

    public static void main(String[] args) {

        for(int i=10; i>=0; i--) {
            System.out.println(i);
        }

        long result;
        result = ArithmeticOperation.sum(25,25);
        System.out.println("sum="+result);

        result = ArithmeticOperation.sub(60, 25);
        System.out.println("sub="+result);

        result=ArithmeticOperation.multi(13, 13);
        System.out.println("multi="+result);

        result=ArithmeticOperation.square(100);
        System.out.print("square="+result);

         result =ArithmeticOperation.sub(25,25);

         System.out.println(result);

    }
}
