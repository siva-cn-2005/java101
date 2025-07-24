package org.example.datatypes;

import java.util.Arrays;

public class ByteOverflow {
    public static void main(String[] args ){
        byte a = -1;
        a++;
        System.out.println("Byte after overflow:" +a);

    }
}

