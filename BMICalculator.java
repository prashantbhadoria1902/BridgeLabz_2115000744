import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // a. Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numPersons = scanner.nextInt();

        // b. Create arrays to store weight, height, BMI, and weight status
        double[] weights = new double[numPersons];
        double[] heights = new double[numPersons];
        double[] bmis = new double[numPersons];
        String[] weightStatuses = new String[numPersons];

        // c. Take input for the weight and height of the persons
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter weight (in kg) and height (in cm) for person " + (i + 1) + ": ");
            weights[i] = scanner.nextDouble();
            heights[i] = scanner.nextDouble();
        }

        // d. Calculate BMI and determine weight status
        for (int i = 0; i < numPersons; i++) {
            double heightInMeters = heights[i] / 100; // Convert height from cm to meters
            bmis[i] = weights[i] / (heightInMeters * heightInMeters); // Calculate BMI

            // Determine weight status based on BMI
            if (bmis[i] >= 40.0) {
                weightStatuses[i] = "Obese";
            } else if (bmis[i] >= 25.0) {
                weightStatuses[i] = "Overweight";
            } else if (bmis[i] >= 18.5) {
                weightStatuses[i] = "Normal";
            } else {
                weightStatuses[i] = "Underweight";
            }
        }

        // e. Display the height, weight, BMI, and weight status of each person
        System.out.println("\nDetails of all persons:");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(cm)", "Weight(kg)", "BMI", "Weight Status");
        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n", heights[i], weights[i], bmis[i], weightStatuses[i]);
        }
    }
}
