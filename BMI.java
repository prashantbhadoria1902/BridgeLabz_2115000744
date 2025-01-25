import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int numPersons = scanner.nextInt();

        double[][] personData = new double[numPersons][3];
        String[] weightStatus = new String[numPersons];

        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter weight (in kg) and height (in cm) for person " + (i + 1) + ": ");
            double weight, height;
            do {
                System.out.print("Weight (kg): ");
                weight = scanner.nextDouble();
                if (weight <= 0) {
                    System.out.println("Weight must be positive. Please enter again.");
                }
            } while (weight <= 0);

            do {
                System.out.print("Height (cm): ");
                height = scanner.nextDouble();
                if (height <= 0) {
                    System.out.println("Height must be positive. Please enter again.");
                }
            } while (height <= 0);

            personData[i][0] = weight;
            personData[i][1] = height;
        }

        for (int i = 0; i < numPersons; i++) {
            double weight = personData[i][0];
            double height = personData[i][1] / 100;
            double bmi = weight / (height * height);

            personData[i][2] = bmi;

            if (bmi >= 40.0) {
                weightStatus[i] = "Obese";
            } else if (bmi >= 25.0) {
                weightStatus[i] = "Overweight";
            } else if (bmi >= 18.5) {
                weightStatus[i] = "Normal";
            } else {
                weightStatus[i] = "Underweight";
            }
        }

        System.out.println("\nDetails of all persons:");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(cm)", "Weight(kg)", "BMI", "Weight Status");
        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n",
                    personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }
    }
}
