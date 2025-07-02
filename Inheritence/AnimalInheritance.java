package Inheritence;

class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age);
    }

    void makeSound() {
        System.out.println(name + " barks: Woof Woof!");
    }
}

class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }

    void makeSound() {
        System.out.println(name + " meows: Meow Meow!");
    }
}

class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);
    }

    void makeSound() {
        System.out.println(name + " chirps: Tweet Tweet!");
    }
}

public class AnimalInheritance {
    public static void main(String[] args) {
        Animal a1 = new Dog("Bruno", 5);
        Animal a2 = new Cat("Whiskers", 3);
        Animal a3 = new Bird("Tweety", 2);

        a1.makeSound();
        a2.makeSound();
        a3.makeSound();
    }
}
