public class Lab_5_1 {
    private double radius;

    // Constructor to initialize the radius
    public Lab_5_1(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Main method to test the Lab_5_1 class
    public static void main(String[] args) {
        Lab_5_1 circle = new Lab_5_1(5.0); // Create a circle with radius 5.0
        double area = circle.calculateArea(); // Calculate the area
        System.out.println("The area of the circle is: " + area); // Print the area
    }
}
