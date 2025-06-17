import java.util.Scanner;

public class LargestTwoDigitsLimited {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        while (num != 0 && index < maxDigit) {
            digits[index++] = num % 10;
            num /= 10;
        }

        int first = 0, second = 0;
        for (int i = 0; i < index; i++) {
            if (digits[i] > first) {
                second = first;
                first = digits[i];
            } else if (digits[i] > second && digits[i] != first) {
                second = digits[i];
            }
        }

        System.out.println("Largest: " + first + " Second Largest: " + second);
    }
}

