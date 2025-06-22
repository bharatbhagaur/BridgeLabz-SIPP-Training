import java.time.LocalDate;
import java.util.Scanner;

public class DateComparisonExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first date (YYYY-MM-DD): ");
        LocalDate date1 = LocalDate.parse(sc.nextLine());

        System.out.print("Enter the second date (YYYY-MM-DD): ");
        LocalDate date2 = LocalDate.parse(sc.nextLine());

        if (date1.isBefore(date2)) {
            System.out.println("Date1 is before Date2.");
        } else if (date1.isAfter(date2)) {
            System.out.println("Date1 is after Date2.");
        } else {
            System.out.println("Both dates are the same.");
        }
    }
}
