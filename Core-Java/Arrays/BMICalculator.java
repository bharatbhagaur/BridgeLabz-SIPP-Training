import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[][] personData = new double[n][3];
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            double weight = sc.nextDouble();
            double height = sc.nextDouble();

            while (weight <= 0 || height <= 0) {
                weight = sc.nextDouble();
                height = sc.nextDouble();
            }

            double bmi = weight / (height * height);
            personData[i][0] = height;
            personData[i][1] = weight;
            personData[i][2] = bmi;

            if (bmi < 18.5) weightStatus[i] = "Underweight";
            else if (bmi < 25) weightStatus[i] = "Normal";
            else if (bmi < 30) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Height: " + personData[i][0] + " Weight: " + personData[i][1] + " BMI: " + personData[i][2] + " Status: " + weightStatus[i]);
        }
    }
}
