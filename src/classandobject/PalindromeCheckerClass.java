package classandobject;

import java.util.Scanner;

class PalindromeChecker {
    String text;

    void setText(String text) {
        this.text = text;
    }

    boolean isPalindrome() {
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    void displayResult() {
        if (isPalindrome()) {
            System.out.println("The text \"" + text + "\" is a palindrome.");
        } else {
            System.out.println("The text \"" + text + "\" is not a palindrome.");
        }
    }
}

public class PalindromeCheckerClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PalindromeChecker checker = new PalindromeChecker();

        System.out.print("Enter text: ");
        String input = sc.nextLine();

        checker.setText(input);
        checker.displayResult();
    }
}
