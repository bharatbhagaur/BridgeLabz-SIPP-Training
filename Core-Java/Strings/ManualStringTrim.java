import java.util.Scanner;

public class ManualStringTrim {

    
    public static int[] getTrimIndices(String str) {
        int start = 0;
        int end = str.length() - 1;

    
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    
    public static String manualSubstring(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text with leading and trailing spaces: ");
        String input = scanner.nextLine();

        int[] indices = getTrimIndices(input);
        String trimmedManual = manualSubstring(input, indices[0], indices[1]);
        String trimmedBuiltIn = input.trim();

        boolean isSame = compareStrings(trimmedManual, trimmedBuiltIn);

        System.out.println("\nManual Trim Result: '" + trimmedManual + "'");
        System.out.println("Built-in Trim Result: '" + trimmedBuiltIn + "'");
        System.out.println("Are both equal? " + isSame);
    }
}
