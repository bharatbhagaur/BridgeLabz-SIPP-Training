import java.util.*;

class FactorOperations {
    public static int[] findFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) factors[index++] = i;
        }
        return factors;
    }

    public static int findGreatestFactor(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) max = Math.max(max, num);
        return max;
    }

    public static int sumFactors(int[] arr) {
        int sum = 0;
        for (int num : arr) sum += num;
        return sum;
    }

    public static long productFactors(int[] arr) {
        long product = 1;
        for (int num : arr) product *= num;
        return product;
    }

    public static double cubeProductFactors(int[] arr) {
        double product = 1;
        for (int num : arr) product *= Math.pow(num, 3);
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int[] factors = findFactors(n);
        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Greatest Factor: " + findGreatestFactor(factors));
        System.out.println("Sum of Factors: " + sumFactors(factors));
        System.out.println("Product of Factors: " + productFactors(factors));
        System.out.println("Product of Cube of Factors: " + cubeProductFactors(factors));
    }
}
