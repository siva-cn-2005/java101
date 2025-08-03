package PracticeProgram;

import java.util.List;

public class Printer {

    public static void print(String name, int count) {
        for(int i=0; i<count; i++) {
            System.out.println(name);
        }
    }

    public static void print(List<String> name, int count) {
        for(int i=0; i<count; i++) {
            System.out.println(name);
        }
    }
    public static void print(String firstName, String lastName, int count) {
        for(int i=0; i<count; i++) {
            String s = " ";
            System.out.println(firstName+ s +lastName);
        }
    }
    public static void main(String[] args){
        String name1 = "Siva";
        String name2 = "azhagiri";
        String name3 = "munish";

        print(name1, 3);
        print(name2, 2);
        print(name3, 4);
        print(List.of("Siva", "Azhagiri"), 3);
        print(name1, "Chidambaram", 4);
    }
}
