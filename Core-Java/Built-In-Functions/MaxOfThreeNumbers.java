import java.util.Scanner;

public class MaxOfThreeNumbers {
    public static int getMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three integers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int max = getMax(num1, num2, num3);
        System.out.println("Maximum number is: " + max);
    }
}
