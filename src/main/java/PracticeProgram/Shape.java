package PracticeProgram;

public class Shape {
    void draw(){
        System.out.println("\nDrawing a generic Shape.");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing a Circle.");
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circle circumference: " + circumference);
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle.");
    }
}


class ShapePolymorphism {
    public static void main(String[] args) {

        Shape s1 = new Shape();
        Shape s2 = new Circle(5);
        Shape s3 = new Rectangle();

        s1.draw();
        s2.draw();
        s3.draw();
    }
}
