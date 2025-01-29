import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DataComparision {
    public static void compareDates(LocalDate date1, LocalDate date2) {
        if (date1.isBefore(date2)) System.out.println("First date is before second date");
        else if (date1.isAfter(date2)) System.out.println("First date is after second date");
        else System.out.println("Both dates are the same");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first date (yyyy-MM-dd): ");
        LocalDate date1 = LocalDate.parse(scanner.next());
        System.out.print("Enter second date (yyyy-MM-dd): ");
        LocalDate date2 = LocalDate.parse(scanner.next());
        compareDates(date1, date2);
    }
}