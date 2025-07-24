package org.example.datatypes.main;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(10);

        System.out.println(set.contains(20));

        System.out.println("Set contents:");
        for (int val : set) {
            System.out.println(val);
        }

        set.remove(10);
        System.out.println( set);
    }
}

