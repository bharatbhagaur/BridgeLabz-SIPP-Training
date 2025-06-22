import java.util.Scanner;

public class TemperatureConverter {
    public static double celsiusToFahrenheit(double c) {
        return (c * 9/5) + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5/9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature and scale (C/F): ");
        double temp = sc.nextDouble();
        char scale = sc.next().toUpperCase().charAt(0);

        if (scale == 'C')
            System.out.println(temp + "°C = " + celsiusToFahrenheit(temp) + "°F");
        else if (scale == 'F')
            System.out.println(temp + "°F = " + fahrenheitToCelsius(temp) + "°C");
    }
}
