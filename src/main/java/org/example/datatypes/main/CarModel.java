package org.example.datatypes.main;

public class CarModel {
    String model;
    int year;

    CarModel(){
        model = "Unknown";
        year = 0;
    }

    CarModel(String m, int y){
        model = m;
        year = y;
    }

    void display(){
        System.out.println("Model: " + model + ", year: " + year);
    }
}

class Main{
    public static void main(String[] args){
        CarModel car1 = new CarModel();
        CarModel car2 = new CarModel("Honda", 2020);

        car1.display();
        car2.display();
    }
}
