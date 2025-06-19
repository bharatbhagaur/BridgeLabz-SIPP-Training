import java.util.Scanner;

public class LowercaseConverter {


    public static String convertToLowercase(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result.append((char)(ch + 32));
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }

        public static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your text: ");
        String input = scanner.nextLine();

        String builtInLower = input.toLowerCase();
        String customLower = convertToLowercase(input);

        System.out.println("\nLowercase using built-in method: " + builtInLower);
        System.out.println("Lowercase using custom method:   " + customLower);

        boolean isSame = compareStrings(builtInLower, customLower);
        System.out.println("\nAre both lowercase strings the same? " + isSame);
    }
}
