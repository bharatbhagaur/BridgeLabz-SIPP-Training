import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmeticExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a date (YYYY-MM-DD): ");
        String dateInput = sc.nextLine();

        LocalDate date = LocalDate.parse(dateInput);
        LocalDate updatedDate = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);

        System.out.println("Updated date: " + updatedDate);
    }
}
