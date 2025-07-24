package org.example.datatypes;

import java.util.LinkedList;
import java.util.Queue;

public class HelpDesk {
    public static void main(String[] args) {
        Queue<String> ticketQueue = new LinkedList<>();

        ticketQueue.add("Ticket 1: Password reset");
        ticketQueue.add("Ticket 2: Login issue");
        ticketQueue.add("Ticket 3: Bug report");

        while (!ticketQueue.isEmpty()) {
            System.out.println(ticketQueue.poll());
        }
    }
}
