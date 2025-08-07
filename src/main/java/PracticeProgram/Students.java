package PracticeProgram;

public class Students {

        String name;
        String StudentID;
        int age;

        public static void main(String[] args){

            Students stu1 = new Students();

            stu1.name ="siva";
            stu1.StudentID ="RA2231";
            stu1.age = 20;

            System.out.println("\nStudent Info");
            System.out.println("Name: " +stu1.name);
            System.out.println("Student ID: " +stu1.StudentID);
            System.out.println("Age; " + stu1.age);

            stu1.name ="sivarajan";
            stu1.age=19;

            System.out.println("\nUpdated Student Info:");
            System.out.println("Name: " + stu1.name);
            System.out.println("Student ID: " + stu1.StudentID);
            System.out.println("Age: " + stu1.age);

        }
}





