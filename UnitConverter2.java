public class UnitConverter2 {
    public static double yards2feet(double yard) {
        double yardsToFeet = 3;
        return yard * yardsToFeet;
    }

    public static double feet2yards(double feet) {
        double feetToYard = 0.3333;
        return feet * feetToYard;
    }

    public static double meters2inches(double meters) {
        double metersToInches = 39.3701;
        return meters * metersToInches;
    }

    public static double inches2meters(double inches) {
        double inchesToMeters = 0.0254;
        return inches * inchesToMeters;
    }

    public static double inches2cm (double inches) {
        double inchesToCm  = 2.54;
        return inches * inchesToCm;
    }

    public static void main(String[] args) {
        System.out.println("10 yards to feet: " + yards2feet(10));
        System.out.println("10 feet to yards: " + feet2yards(10));
        System.out.println("10 meters to inches: " + meters2inches(10));
        System.out.println("10 inches to meters: " + inches2meters(10));
        System.out.println("10 inches to cm: " + inches2cm(10));
    }
}
