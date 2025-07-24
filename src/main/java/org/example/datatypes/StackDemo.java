package org.example.datatypes;
    import java.util.Stack;

    public class StackDemo {
        public static void main(String[] args) {
            Stack<Integer> stack = new Stack<>();

            stack.push(100);
            stack.push(200);
            stack.push(300);

            System.out.println("Top element: " + stack.peek());

            stack.push(400);
            System.out.println(stack);


            stack.pop();
            System.out.println("Stack after pop:");

            for (int val : stack) {
                System.out.println(val);
            }
        }
    }



