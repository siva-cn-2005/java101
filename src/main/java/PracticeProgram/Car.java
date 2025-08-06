package PracticeProgram;

public class Car {

    String make;
    String model;
    int year;
    String color;

    public static void main(String[] args) {

        Car car1 = new Car();

        car1.make = "Honda";
        car1.model = "civic";
        car1.year = 2001;
        car1.color = "Red";

        System.out.println("Name: " +car1.make);
        System.out.println("Model: " +car1.model);
        System.out.println("Year: " +car1.year);
        System.out.println("Color: " +car1.color);
        System.out.println("Toyota Camry engine stopped");
    }
}