package PracticeProgram;

abstract class Vehicle {
    String make;
    String model;

    Vehicle(String make, String model){
        this.make = make;
        this.model = model;
    }

    abstract void drive();

    void displayVehicleInfo(){
        System.out.println("Vechile Info:\nMake: " + make + "\nModel: " + model);
    }
}
class Bike extends Vehicle {

    Bike(String make, String model){
        super(make,model);
    }
    @Override
    void drive() {
        System.out.println("Driving the " + make + " " + model + " car .");
    }
}

class Motorcycle extends Vehicle {
     Motorcycle(String make, String model) {
         super(make, model);
     }

    @Override
    public void drive() {
         System.out.println("Riding the " + make + " " + model + " motorcycle."); }
}

class VehicleInfo {
    public static void main(String[] args) {
        Vehicle myVehicle = new Bike("Yamaha", "Mt15");
        Motorcycle mymotorcycle = new Motorcycle("Harley Devidson", "Iron 883");

        myVehicle.displayVehicleInfo();
        myVehicle.drive();

        System.out.println();

        mymotorcycle.displayVehicleInfo();
        mymotorcycle.drive();
    }
}






