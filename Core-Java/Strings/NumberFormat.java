import java.util.Scanner;

public class NumberFormat {

    public static void generateNumberFormatException(String input) {
        int number = Integer.parseInt(input);
        System.out.println("Parsed number: " + number);
    }

    public static void handleNumberFormatException(String input) {
        try {
            int number = Integer.parseInt(input);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught generic Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to convert to integer: ");
        String input = scanner.nextLine();

        // generateNumberFormatException(input); // Uncomment to see program crash

        handleNumberFormatException(input);

        System.out.println("Program continues after handling the exception.");
    }
}

