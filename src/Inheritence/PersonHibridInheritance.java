package Inheritence;


interface Worker {
    void performDuties();
}

class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

class Chef extends Person implements Worker {
    String specialty;

    Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    public void performDuties() {
        System.out.println(name + " is cooking " + specialty + " dishes.");
    }
}

class Waiter extends Person implements Worker {
    int tablesAssigned;

    Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    public void performDuties() {
        System.out.println(name + " is serving " + tablesAssigned + " tables.");
    }
}

public class PersonHibridInheritance  {
    public static void main(String[] args) {
        Worker chef1 = new Chef("Arjun", 101, "Italian");
        Worker waiter1 = new Waiter("Ravi", 201, 5);

        Person[] staff = {
            (Person) chef1,
            (Person) waiter1
        };

        for (Person p : staff) {
            p.displayInfo();
            ((Worker) p).performDuties();
            System.out.println();
        }
    }
}
