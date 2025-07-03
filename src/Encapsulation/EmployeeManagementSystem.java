package Encapsulation;

//Abstract Employee class
abstract class Employee {
 private int employeeId;
 private String name;
 private double baseSalary;

 public Employee(int employeeId, String name, double baseSalary) {
     this.employeeId = employeeId;
     this.name = name;
     this.baseSalary = baseSalary;
 }

 public int getEmployeeId() {
     return employeeId;
 }

 public void setEmployeeId(int employeeId) {
     this.employeeId = employeeId;
 }

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public double getBaseSalary() {
     return baseSalary;
 }

 public void setBaseSalary(double baseSalary) {
     this.baseSalary = baseSalary;
 }

 public abstract double calculateSalary();

 public void displayDetails() {
     System.out.println("ID: " + employeeId + ", Name: " + name + ", Base Salary: " + baseSalary + ", Total Salary: " + calculateSalary());
 }
}

//Department interface
interface Department {
 void assignDepartment(String deptName);
 String getDepartmentDetails();
}

//FullTimeEmployee class
class FullTimeEmployee extends Employee implements Department {
 private String department;
 private double fixedBonus;

 public FullTimeEmployee(int employeeId, String name, double baseSalary, double fixedBonus) {
     super(employeeId, name, baseSalary);
     this.fixedBonus = fixedBonus;
 }

 public double getFixedBonus() {
     return fixedBonus;
 }

 public void setFixedBonus(double fixedBonus) {
     this.fixedBonus = fixedBonus;
 }

 public double calculateSalary() {
     return getBaseSalary() + fixedBonus;
 }

 public void assignDepartment(String deptName) {
     this.department = deptName;
 }

 public String getDepartmentDetails() {
     return "Department: " + department;
 }
}

//PartTimeEmployee class
class PartTimeEmployee extends Employee implements Department {
 private String department;
 private int hoursWorked;
 private double hourlyRate;

 public PartTimeEmployee(int employeeId, String name, double baseSalary, int hoursWorked, double hourlyRate) {
     super(employeeId, name, baseSalary);
     this.hoursWorked = hoursWorked;
     this.hourlyRate = hourlyRate;
 }

 public int getHoursWorked() {
     return hoursWorked;
 }

 public void setHoursWorked(int hoursWorked) {
     this.hoursWorked = hoursWorked;
 }

 public double getHourlyRate() {
     return hourlyRate;
 }

 public void setHourlyRate(double hourlyRate) {
     this.hourlyRate = hourlyRate;
 }

 public double calculateSalary() {
     return getBaseSalary() + (hoursWorked * hourlyRate);
 }

 public void assignDepartment(String deptName) {
     this.department = deptName;
 }

 public String getDepartmentDetails() {
     return "Department: " + department;
 }
}

public class EmployeeManagementSystem {
 public static void main(String[] args) {
     Employee[] employees = new Employee[2];

     FullTimeEmployee fte = new FullTimeEmployee(101, "Alice", 50000, 10000);
     fte.assignDepartment("HR");

     PartTimeEmployee pte = new PartTimeEmployee(102, "Bob", 20000, 80, 200);
     pte.assignDepartment("IT");

     employees[0] = fte;
     employees[1] = pte;

     for (Employee emp : employees) {
         emp.displayDetails();
         if (emp instanceof Department) {
             System.out.println(((Department) emp).getDepartmentDetails());
         }
     }
 }
}
