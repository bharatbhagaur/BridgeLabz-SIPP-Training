package classandobject;

class Circle {
    double radius;

    void setRadius(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }
}

public class CircleClass {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(5.0);
        c.displayDetails();
    }
}
