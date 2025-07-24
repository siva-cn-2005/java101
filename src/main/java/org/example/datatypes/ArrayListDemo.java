package org.example.datatypes;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list.get(2));

        System.out.println("List contents:");
        for (int temp : list){
            System.out.println(temp);
        }
        list.add(40);
        System.out.println(list);
        list.remove(1);
        System.out.println("remove 1: ");
        for (int val : list){
            System.out.println(val);
        }
    }

}
