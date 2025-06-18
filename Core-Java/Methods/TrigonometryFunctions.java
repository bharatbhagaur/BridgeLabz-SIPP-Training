import java.util.Scanner;

public class TrigonometryFunctions {
    public static double[] calculateTrigonometricFunctions(double angleInDegrees) {
        double radians = Math.toRadians(angleInDegrees);
        double[] result = new double[3];
        result[0] = Math.sin(radians);
        result[1] = Math.cos(radians);
        result[2] = Math.tan(radians);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        double[] trigValues = calculateTrigonometricFunctions(angle);
        System.out.println("Sine: " + trigValues[0]);
        System.out.println("Cosine: " + trigValues[1]);
        System.out.println("Tangent: " + trigValues[2]);
    }
}