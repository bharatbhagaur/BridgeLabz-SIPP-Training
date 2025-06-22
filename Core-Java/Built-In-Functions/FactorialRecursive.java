import java.util.Scanner;

public class FactorialRecursive {
    public static long factorial(int n) {
        return (n <= 1) ? 1 : n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println(num + "! = " + factorial(num));
    }
}
