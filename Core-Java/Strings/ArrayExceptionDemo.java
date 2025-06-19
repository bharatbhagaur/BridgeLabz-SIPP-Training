import java.util.Scanner;

public class ArrayExceptionDemo {

    public static void generateException(String[] names) {
        System.out.println("\nGenerating ArrayIndexOutOfBoundsException (without try-catch)...");
        System.out.println("Accessing index 10: " + names[10]);
    }

    public static void handleException(String[] names) {
        System.out.println("\nHandling ArrayIndexOutOfBoundsException using try-catch...");
        try {
            System.out.println("Accessing index 10: " + names[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught a generic Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[5];

        System.out.println("Enter 5 names:");
        for (int i = 0; i < names.length; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        handleException(names);

        System.out.println("\nProgram continues after handling the exception.");
    }
}

