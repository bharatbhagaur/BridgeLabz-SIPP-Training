import java.util.Scanner;

public class CustomStringSplit {

    // Method to find the length of a String without using length()
    public static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // do nothing
        }
        return count;
    }

    // Method to split the string into words manually
    public static String[] customSplit(String text) {
        int length = getLength(text);
        int wordCount = 1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int start = 0, index = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                words[index++] = text.substring(start, i);
                start = i + 1;
            }
        }

        // last word
        words[index] = text.substring(start, length);
        return words;
    }

    // Method to compare two string arrays
    public static boolean compareArrays(String[] a1, String[] a2) {
        if (a1.length != a2.length) return false;

        for (int i = 0; i < a1.length; i++) {
            if (!a1[i].equals(a2[i])) {
                return false;
            }
        }
        return true;
    }

    // Display the array
    public static void display(String[] arr) {
        for (String word : arr) {
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        String[] customWords = customSplit(input);
        String[] builtInWords = input.split(" ");

        System.out.println("\nCustom Split Result:");
        display(customWords);

        System.out.println("\nBuilt-in Split Result:");
        display(builtInWords);

        boolean same = compareArrays(customWords, builtInWords);
        System.out.println("\nAre both results the same? " + same);
    }
}
