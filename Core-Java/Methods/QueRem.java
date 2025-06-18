import java.util.Scanner;

public class QueRem {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2];
        result[0] = number / divisor;  // Quotient
        result[1] = number % divisor;  // Remainder
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();

        int[] output = findRemainderAndQuotient(number, divisor);
        System.out.println("Quotient: " + output[0]);
        System.out.println("Remainder: " + output[1]);
    }
}
