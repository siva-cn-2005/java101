package org.example.datatypes.practice;

public class ArithmeticOperation {

    public static long sum(int a, int b) {
        long re = a+b;
        print(re);
        return  re;
    }
    public static long sub(int a, int b) {
        return a - b;
    }
    public static long multi(int a, int b){
        return a * b;
    }
    public static long square (int a){
        return a*a;
    }
    public static long power(int base, int power){
        //return (long) Math.pow(base,power);
        long result = 1;
        for (int i=0; i<power; i++){
            result = result * base;
        }
        return result;
    }
    public static int diff(int a, int b){
        int result=a-b;
        if (result >= 0){
            System.out.println("positive");
            return result;
        }
        else {
           // result=b-a;
            System.out.println("negative");
            return result*-1;
        }

    }
    private static void print(long result) {
        System.out.println(result);
    }
}

