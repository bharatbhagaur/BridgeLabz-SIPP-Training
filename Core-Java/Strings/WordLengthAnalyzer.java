import java.util.Scanner;

public class WordLengthAnalyzer {

    
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
        StringBuilder sb = new StringBuilder();
        int wordIndex = 0;

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

    
    public static String[] findShortestAndLongest(String[][] wordData) {
        String shortest = wordData[0][0];
        String longest = wordData[0][0];
        int minLen = Integer.parseInt(wordData[0][1]);
        int maxLen = Integer.parseInt(wordData[0][1]);

        for (int i = 1; i < wordData.length; i++) {
            int length = Integer.parseInt(wordData[i][1]);
            if (length < minLen) {
                minLen = length;
                shortest = wordData[i][0];
            }
            if (length > maxLen) {
                maxLen = length;
                longest = wordData[i][0];
            }
        }

        return new String[]{shortest, longest};
    }

    
    public static void displayWordsAndLengths(String[][] wordData) {
        System.out.printf("%-15s%-10s\n", "Word", "Length");
        System.out.println("------------------------");
        for (String[] row : wordData) {
            System.out.printf("%-15s%-10d\n", row[0], Integer.parseInt(row[1]));
        }
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String input = sc.nextLine();

        String[] words = splitTextToWords(input);
        String[][] wordData = getWordsWithLengths(words);

        System.out.println("\nWords and their lengths:");
        displayWordsAndLengths(wordData);

        String[] result = findShortestAndLongest(wordData);
        System.out.println("\nShortest Word: " + result[0]);
        System.out.println("Longest Word : " + result[1]);
    }
}
    
}
