import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormattingExample {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        System.out.println("Current date in dd/MM/yyyy: " + today.format(formatter1));
        System.out.println("Current date in yyyy-MM-dd: " + today.format(formatter2));
        System.out.println("Current date in EEE, MMM dd, yyyy: " + today.format(formatter3));
    }
}
