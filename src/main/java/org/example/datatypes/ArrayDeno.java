package org.example.datatypes;

public class ArrayDeno {
    public static void main(String[] args) {
        int[] val = {10, 20, 30, 40, 50};
        System.out.println( val.length);
        System.out.println(val[4]);

        System.out.println("All elements:");
        for (int num : val) {
            System.out.println(num);


        }
    }
}

