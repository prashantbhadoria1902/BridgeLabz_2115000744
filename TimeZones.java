import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TimeZones {
    public static void displayTimeZones() {
        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime ist = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime pst = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("GMT: " + gmt);
        System.out.println("IST: " + ist);
        System.out.println("PST: " + pst);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        displayTimeZones();
    }
}
