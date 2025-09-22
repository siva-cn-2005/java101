package PracticeProgram;

public class StringDemo {
    public static void main(String[] args){
        String str = "    java Programming is FUN!";

        System.out.println("Orignal length: " + str.length());

        System.out.println("Character at index 7: " + str.charAt(7));

        System.out.println("Substring (5 to 15): " + str.substring(5, 15));

        System.out.println("Index of \"is\": " + str.indexOf("is"));

        System.out.println("Uppercase: " + str.toUpperCase());

        System.out.println("lowercase: " + str.toLowerCase());

        System.out.println("Trimmed: " + str.trim());

        System.out.println("Replaced: " + str.replace("FUN", "Awesome"));

        System.out.println("Words:");
        String[] words = str.trim().split(" ");
        for (String w : words) {
            System.out.println(w);
        }

        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        System.out.println("\nString Comparison:");
        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1.equals(s2): " + s1.equals(s2));
        System.out.println("s1 == s3: " + (s1 == s3));
        System.out.println("s1.equals(s3): " + s1.equals(s3));
    }
}
