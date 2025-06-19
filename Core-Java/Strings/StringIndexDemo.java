import java.util.Scanner;

public class StringIndexDemo {

    public static void generateException(String text) {
        char ch = text.charAt(text.length());
        System.out.println("Character at invalid index: " + ch);
    }

    public static void handleException(String text) {
        try {
            char ch = text.charAt(text.length());
            System.out.println("Character at invalid index: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught General Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String input = scanner.nextLine();
        // generateException(input);
        handleException(input);
    }
}
