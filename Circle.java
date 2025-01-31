class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    void displayDetails() {
        System.out.println("Radius: " + radius + ", Area: " + calculateArea() + ", Circumference: " + calculateCircumference());
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.displayDetails();
    }
}
