import java.util.Scanner;

public class BasicCalculator {
    public static double add(double a, double b) { return a + b; }
    public static double subtract(double a, double b) { return a - b; }
    public static double multiply(double a, double b) { return a * b; }
    public static double divide(double a, double b) { return a / b; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose operation (+, -, *, /): ");
        char op = sc.next().charAt(0);

        System.out.println("Enter two numbers: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        switch (op) {
            case '+': System.out.println("Result: " + add(num1, num2)); break;
            case '-': System.out.println("Result: " + subtract(num1, num2)); break;
            case '*': System.out.println("Result: " + multiply(num1, num2)); break;
            case '/': System.out.println(num2 != 0 ? "Result: " + divide(num1, num2) : "Error: Division by zero"); break;
            default: System.out.println("Invalid operator");
        }
    }
}
