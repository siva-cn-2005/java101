package org.example.datatypes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class SortListExample {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(55);
        marks.add(88);
        marks.add(33);
        System.out.println("Sorted Asc: " + marks);

        Collections.sort(marks);
        System.out.println(marks);

        Collections.sort(marks, Collections.reverseOrder());
        System.out.println(marks);
    }
}

