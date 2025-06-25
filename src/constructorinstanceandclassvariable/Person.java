package constructorinstanceandclassvariable;

public class Person {
    private String name;
    private int age;

    public Person() {
        this.name = "John Doe";
        this.age = 30;
    }

    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person(p1);
        p1.display();
        p2.display();
    }
}
