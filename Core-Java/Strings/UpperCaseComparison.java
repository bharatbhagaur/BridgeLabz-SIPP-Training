import java.util.Scanner;

public class UpperCaseComparison {

    
    public static String convertToUpperCaseManually(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                sb.append((char)(ch - 32)); 
            } else {
                sb.append(ch);
            }
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
        
        
        System.out.print("Enter the text: ");
        String input = scanner.nextLine();


        String manualUpper = convertToUpperCaseManually(input);

    
        String builtInUpper = input.toUpperCase();

    
        System.out.println("\nManual Uppercase:   " + manualUpper);
        System.out.println("Built-in Uppercase: " + builtInUpper);

        if (compareStrings(manualUpper, builtInUpper)) {
            System.out.println(" Both conversions match!");
        } else {
            System.out.println(" Conversions do NOT match!");
        }
    }
}
