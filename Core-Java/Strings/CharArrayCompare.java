import java.util.Scanner;

public class CharArrayCompare {

    public static char[] getCharsFromString(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        return chars;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();

        char[] userDefinedChars = getCharsFromString(input);
        char[] builtInChars = input.toCharArray();

        System.out.println("User-defined method characters:");
        for (char c : userDefinedChars) {
            System.out.print(c + " ");
        }

        System.out.println("\nBuilt-in toCharArray() method characters:");
        for (char c : builtInChars) {
            System.out.print(c + " ");
        }

        boolean result = compareCharArrays(userDefinedChars, builtInChars);
        System.out.println("\nArrays match: " + result);
    }
}
