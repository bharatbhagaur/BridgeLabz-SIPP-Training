import java.util.Scanner;

public class WordLengthFinder {


    public static int getStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    
    public static String[] splitTextToWords(String text) {
        int len = getStringLength(text);
        int wordCount = 0;

    
        boolean inWord = false;
        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            if (ch != ' ' && !inWord) {
                wordCount++;
                inWord = true;
            } else if (ch == ' ') {
                inWord = false;
            }
        }

    
        String[] words = new String[wordCount];
        int wordIndex = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                sb.append(ch);
            }
            if ((ch == ' ' || i == len - 1) && sb.length() > 0) {
                words[wordIndex++] = sb.toString();
                sb.setLength(0);
            }
        }

        return words;
    }

    
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getStringLength(words[i]));
        }
        return result;
    }

    // Method 4: Display 2D array
    public static void displayWordsAndLengths(String[][] data) {
        System.out.printf("%-15s%-10s\n", "Word", "Length");
        System.out.println("------------------------");
        for (String[] row : data) {
            System.out.printf("%-15s%-10d\n", row[0], Integer.parseInt(row[1]));
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a line of text: ");
        String input = sc.nextLine();

        String[] words = splitTextToWords(input);
        String[][] result = getWordsWithLengths(words);

        System.out.println("\nWords and their lengths:");
        displayWordsAndLengths(result);
    }
}
