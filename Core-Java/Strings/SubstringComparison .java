import java.util.Scanner;

public class SubstringComparison {

    public static String createSubstringUsingCharAt(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end && i < text.length(); i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static boolean compareStringsUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.next();

        System.out.print("Enter start index: ");
        int start = scanner.nextInt();

        System.out.print("Enter end index: ");
        int end = scanner.nextInt();

        String userSubstring = createSubstringUsingCharAt(input, start, end);
        String builtInSubstring = input.substring(start, Math.min(end, input.length()));

        System.out.println("User-defined substring: " + userSubstring);
        System.out.println("Built-in substring:     " + builtInSubstring);

        boolean result = compareStringsUsingCharAt(userSubstring, builtInSubstring);
        System.out.println("Substrings match: " + result);
    }
}
