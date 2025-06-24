package classandobject;

class StudentReport {
    String name;
    int rollNumber;
    int marks;

    void setDetails(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    String calculateGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 40) {
            return "D";
        } else {
            return "F";
        }
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
}

public class StudentReportClass {
    public static void main(String[] args) {
        StudentReport s1 = new StudentReport();
        s1.setDetails("Riya", 101, 87);

        StudentReport s2 = new StudentReport();
        s2.setDetails("Aman", 102, 55);

        System.out.println("--- Student 1 Details ---");
        s1.displayDetails();

        System.out.println("\n--- Student 2 Details ---");
        s2.displayDetails();
    }
}

