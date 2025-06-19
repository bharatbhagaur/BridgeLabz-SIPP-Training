import java.util.Scanner;

public class StringLengthFinder {

    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Do nothing, just break the loop when exception occurs
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();

        int customLength = findLength(input);
        int builtInLength = input.length();

        System.out.println("Custom calculated length: " + customLength);
        System.out.println("Built-in method length: " + builtInLength);
    }
}
