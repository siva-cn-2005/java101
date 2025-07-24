package org.example.datatypes.main;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();

        map.put('a', 2);
        map.put('b', 4);

        System.out.println(map.get('a'));

        System.out.println("Map contents:");
        for (char key : map.keySet()) {
            System.out.println(map.get(key));
        }

        map.remove('a');
        System.out.println(  map);
    }
}

