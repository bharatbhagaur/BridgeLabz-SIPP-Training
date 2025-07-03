package Encapsulation;

import java.util.ArrayList;
import java.util.List;

abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPatientDetails() {
        return "ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }

    public abstract double calculateBill();
}

interface MedicalRecord {
    void addRecord(String record);
    List<String> viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private int numberOfDays;
    private double dailyRate;
    private List<String> medicalHistory;

    public InPatient(String patientId, String name, int age, int numberOfDays, double dailyRate) {
        super(patientId, name, age);
        this.numberOfDays = numberOfDays;
        this.dailyRate = dailyRate;
        this.medicalHistory = new ArrayList<>();
    }

    public double calculateBill() {
        return numberOfDays * dailyRate;
    }

    public void addRecord(String record) {
        medicalHistory.add(record);
    }

    public List<String> viewRecords() {
        return new ArrayList<>(medicalHistory);
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private List<String> medicalHistory;

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.medicalHistory = new ArrayList<>();
    }

    public double calculateBill() {
        return consultationFee;
    }

    public void addRecord(String record) {
        medicalHistory.add(record);
    }

    public List<String> viewRecords() {
        return new ArrayList<>(medicalHistory);
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Patient[] patients = new Patient[2];

        InPatient inPatient = new InPatient("IP001", "Alice", 45, 5, 2000);
        inPatient.addRecord("Appendicitis surgery - 2024");
        inPatient.addRecord("Routine blood test");

        OutPatient outPatient = new OutPatient("OP001", "Bob", 30, 500);
        outPatient.addRecord("Cold and flu checkup");

        patients[0] = inPatient;
        patients[1] = outPatient;

        for (Patient p : patients) {
            System.out.println(p.getPatientDetails());
            System.out.println("Bill Amount: " + p.calculateBill());

            if (p instanceof MedicalRecord) {
                List<String> records = ((MedicalRecord) p).viewRecords();
                System.out.println("Medical Records:");
                for (String record : records) {
                    System.out.println("- " + record);
                }
            }

            System.out.println();
        }
    }
}
