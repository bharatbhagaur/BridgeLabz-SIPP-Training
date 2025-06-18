import java.util.Scanner;

public class BMICalculator {

    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        return weight / (heightM * heightM);
    }

    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal weight";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] people = new double[10][3]; // weight, height, BMI
        String[] statuses = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            people[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            people[i][1] = sc.nextDouble();

            people[i][2] = calculateBMI(people[i][0], people[i][1]);
            statuses[i] = getBMIStatus(people[i][2]);
        }

        System.out.println("\n--- BMI Results ---");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Person %d -> Weight: %.1f kg, Height: %.1f cm, BMI: %.2f, Status: %s\n",
                    (i + 1), people[i][0], people[i][1], people[i][2], statuses[i]);
        }
    }
}