package org.example.datatypes;

import java.util.*;

public class GroupByClass {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> classMap = new HashMap<>();
/**
 *  siva - cs
 *  rajan - bba
 *  dhanush - cs
 *  ravi -cs
 *  kavi - bba
 */
        classMap.put("Class A", new ArrayList<>());
        classMap.put("Class B", new ArrayList<>());

        classMap.get("Class A").add("Arun");
        classMap.get("Class A").add("Priya");
        classMap.get("Class B").add("Rahul");

        for (String cls : classMap.keySet()) {
            System.out.println(cls + ": " + classMap.get(cls));
        }
    }
}

