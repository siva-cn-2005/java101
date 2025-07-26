package PracticeProgram;

public class HelloWorldAndInfo {
    public static void main(String[] args) {

        System.out.println("Hello, Java learner!");

        String a = "siva";
        String name = a;

        System.out.println("My name is: [" + name +"]");

        String javaVersion = System.getProperty("java.version");
        System.out.println("java version: [" +javaVersion + "]");

    }
}
