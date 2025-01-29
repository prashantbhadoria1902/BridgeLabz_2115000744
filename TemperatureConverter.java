import java.util.Scanner;

public class TemperatureConverter {
    public static double celsiusToFahrenheit(double c) {
        return (c * 9/5) + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5/9;
    }

    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.println("Temperature Converter: Enter Celsius");
        System.out.println("Fahrenheit: " + celsiusToFahrenheit(cin.nextDouble()));

        System.out.println("Enter Fahrenheit");
        System.out.println("Celsius: " + fahrenheitToCelsius(cin.nextDouble()));
    }
}
