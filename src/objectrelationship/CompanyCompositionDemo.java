package objectrelationship;

import java.util.ArrayList;

class Employee {
    private String name;
    private String role;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public void display() {
        System.out.println("Employee: " + name + " | Role: " + role);
    }
}

class Department {
    private String deptName;
    private ArrayList<Employee> employees;

    public Department(String deptName) {
        this.deptName = deptName;
        employees = new ArrayList<>();
    }

    public void addEmployee(String name, String role) {
        employees.add(new Employee(name, role));
    }

    public void display() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) {
            e.display();
        }
        System.out.println();
    }
}

class Company {
    private String companyName;
    private ArrayList<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        departments = new ArrayList<>();
    }

    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    public void displayStructure() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            d.display();
        }
    }

    public void shutdown() {
        departments.clear();
        System.out.println("Company " + companyName + " and all departments/employees have been deleted.\n");
    }
}

public class CompanyCompositionDemo {
    public static void main(String[] args) {
        Company techCorp = new Company("TechCorp");

        Department dev = new Department("Development");
        dev.addEmployee("Alice", "Software Engineer");
        dev.addEmployee("Bob", "Senior Developer");

        Department hr = new Department("Human Resources");
        hr.addEmployee("Carol", "HR Manager");

        techCorp.addDepartment(dev);
        techCorp.addDepartment(hr);

        techCorp.displayStructure();

        techCorp.shutdown();

        techCorp.displayStructure();
    }
}

