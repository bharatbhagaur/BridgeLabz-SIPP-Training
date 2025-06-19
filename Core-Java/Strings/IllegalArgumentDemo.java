import java.util.Scanner;

public class IllegalArgumentDemo {

    public static void generateIllegalArgument(String text) {
        String result = text.substring(5, 2);
        System.out.println("Generated substring: " + result);
    }

    public static void handleIllegalArgument(String text) {
        try {
            String result = text.substring(5, 2);
            System.out.println("Generated substring: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String inputText = scanner.nextLine();

        System.out.println("\nTrying to generate exception (this will crash without handling):");
        try {
            generateIllegalArgument(inputText);
        } catch (Exception e) {
            System.out.println("Exception occurred in generateIllegalArgument(): " + e.getMessage());
        }

        System.out.println("\nTrying to handle exception safely:");
        handleIllegalArgument(inputText);
    }
}

