package org.example.datatypes.main;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println(queue.peek());

        System.out.println(queue.poll());

        System.out.println("Queue after poll:");
        for (int val : queue) {
            System.out.println(val);
        }
    }
}

