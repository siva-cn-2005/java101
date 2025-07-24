package org.example.datatypes;

public class EvenOdd {
    public static void main(String[] args){
        int number = 6;
        int rem = number %2;
        System.out.println(rem);
        boolean isEven = false;
        if(rem == 0) {
            isEven = true;
        }
        System.out.println("is even:" +isEven);
    }
}
