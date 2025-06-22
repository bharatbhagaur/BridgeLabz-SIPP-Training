import java.time.ZonedDateTime;
import java.time.ZoneId;

public class TimeZonesExample {
    public static void main(String[] args) {
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        System.out.println("Current GMT time: " + gmtTime);
        System.out.println("Current IST time: " + istTime);
        System.out.println("Current PST time: " + pstTime);
    }
}
