package PracticeProgram;

import java.util.Stack;

public class DataTypeExplorer {
    public static void main(String[] args){
        byte a = 119;
        a++;
        System.out.println("byte:" +a);

        String b = "A";
        System.out.println("Character:" +b);

        float v = 3.14f;
        System.out.println("Float:" +v);

        double s = 2.71828;
        System.out.println("Double:" +s);

        int x = 100000;
        System.out.println("Integer:" +x);

        long y = 90000000L;
        System.out.println("Long:" +y);

        String w = "The only way to do great work is to love what you do";
        System.out.println("My fav:" +w);

        int k = 10;
        int n = 20;

        if (k > n){
            System.out.println("Boolean: ");
            }
        else{
            System.out.println("Boolean: " + n);
        }

        int g = 10;
        int q = 5;

        int sum  = g + q ;
        System.out.println("Sum: " + sum);

        double r = 2.0;
        double u = 1.35914;
        double mul = r * u;
        System.out.println("Double: " + mul);





    }

}
