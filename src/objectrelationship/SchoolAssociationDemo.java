package objectrelationship;

import java.util.ArrayList;

//Course class
class Course {
 private String courseName;
 private ArrayList<Student> enrolledStudents;

 public Course(String courseName) {
     this.courseName = courseName;
     enrolledStudents = new ArrayList<>();
 }

 public String getCourseName() {
     return courseName;
 }

 public void enrollStudent(Student student) {
     if (!enrolledStudents.contains(student)) {
         enrolledStudents.add(student);
     }
 }

 public void displayEnrolledStudents() {
     System.out.println("Course: " + courseName + " | Enrolled Students:");
     for (Student student : enrolledStudents) {
         System.out.println("- " + student.getName());
     }
     System.out.println();
 }
}

//Student class
class Student {
 private String name;
 private ArrayList<Course> courses;

 public Student(String name) {
     this.name = name;
     courses = new ArrayList<>();
 }

 public String getName() {
     return name;
 }

 public void enrollInCourse(Course course) {
     if (!courses.contains(course)) {
         courses.add(course);
         course.enrollStudent(this);
     }
 }

 public void viewCourses() {
     System.out.println("Student: " + name + " | Enrolled Courses:");
     for (Course course : courses) {
         System.out.println("- " + course.getCourseName());
     }
     System.out.println();
 }
}

//School class
class School {
 private String name;
 private ArrayList<Student> students;

 public School(String name) {
     this.name = name;
     students = new ArrayList<>();
 }

 public void addStudent(Student student) {
     if (!students.contains(student)) {
         students.add(student);
     }
 }

 public void displayStudents() {
     System.out.println("School: " + name + " | Students:");
     for (Student student : students) {
         System.out.println("- " + student.getName());
     }
     System.out.println();
 }
}

//Main class
public class SchoolAssociationDemo {
 public static void main(String[] args) {
     School school = new School("Greenwood High");

     Student s1 = new Student("Alice");
     Student s2 = new Student("Bob");

     Course math = new Course("Mathematics");
     Course science = new Course("Science");

     school.addStudent(s1);
     school.addStudent(s2);

     s1.enrollInCourse(math);
     s1.enrollInCourse(science);

     s2.enrollInCourse(science);

     school.displayStudents();
     s1.viewCourses();
     s2.viewCourses();

     math.displayEnrolledStudents();
     science.displayEnrolledStudents();
 }
}
