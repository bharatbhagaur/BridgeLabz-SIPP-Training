import java.util.Scanner;

public class BMIStatus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] weights = new double[n];
        double[] heights = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextDouble();
            heights[i] = sc.nextDouble();
            while (weights[i] <= 0 || heights[i] <= 0) {
                weights[i] = sc.nextDouble();
                heights[i] = sc.nextDouble();
            }
            bmi[i] = weights[i] / (heights[i] * heights[i]);
            if (bmi[i] < 18.5) status[i] = "Underweight";
            else if (bmi[i] < 25) status[i] = "Normal";
            else if (bmi[i] < 30) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Height: " + heights[i] + " Weight: " + weights[i] + " BMI: " + bmi[i] + " Status: " + status[i]);
        }
    }
}
