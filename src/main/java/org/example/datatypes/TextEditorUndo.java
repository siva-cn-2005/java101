package org.example.datatypes;

import java.util.Stack;

public class TextEditorUndo {
    public static void main(String[] args) {
        Stack<String> history = new Stack<>();
        String current = "";

        current += "s";
        history.push(current);
        current += "i";
        history.push(current);
        current += "v";
        history.push(current);
        current += "a";
        history.push(current);;
        current += "!";
        history.push(current);

        System.out.println(current);

        history.pop();
        current = history.pop();
        System.out.println(current);
    }
}

