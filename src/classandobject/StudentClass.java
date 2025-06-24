package classandobject;
class Student{
    String name;
    int age;
    
    Student(){
        name = "John";
        age = 20;
    }
    
    void displayInfo(){
        System.out.println("Name: " + name);
                System.out.println("Age: " + age);

    }
}

public class StudentClass {
    public static void main(String[] args) {
        Student student = new Student();
        student.displayInfo();
    }
}

