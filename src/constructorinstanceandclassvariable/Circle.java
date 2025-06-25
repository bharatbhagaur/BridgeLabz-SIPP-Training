package constructorinstanceandclassvariable;

public class Circle {
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(int ignored) {
        this();
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void display() {
        System.out.println("Radius: " + radius + ", Area: " + getArea());
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.display();
    }
}
