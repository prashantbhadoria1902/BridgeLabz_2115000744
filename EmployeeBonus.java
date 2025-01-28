import java.util.Random;

public class EmployeeBonus {

    public static void main(String[] args) {
        Random random = new Random();
        double totalOldSalary = 0;
        double totalBonus = 0;

        System.out.println("---------------------------------------------------------");
        System.out.printf("%-10s %-15s %-15s %-15s\n", "Employee", "Old Salary", "Years", "Bonus");
        System.out.println("---------------------------------------------------------");

        for (int i = 1; i <= 10; i++) {
            double salary = 10000 + random.nextInt(90000); // 5-digit salary
            int years = 1 + random.nextInt(10);             // Years of service
            double bonusPercentage = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusPercentage;

            System.out.printf("%-10d %-15.2f %-15d %-15.2f\n", i, salary, years, bonus);

            totalOldSalary += salary;
            totalBonus += bonus;
        }

        System.out.println("---------------------------------------------------------");
        System.out.printf("%-10s %-15.2f %-15s %-15.2f\n", "Total", totalOldSalary, "", totalBonus);
        System.out.println("---------------------------------------------------------");
    }
}