import java.util.Scanner;

public class Lab_2_5{
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the temperature in Fahrenheit
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Convert Fahrenheit to Celsius using the formula
        double celsius = (5.0 / 9.0) * (fahrenheit - 32);

        // Print the result
        System.out.println("The temperature in Celsius is: " + celsius + "°C");

        // Close the scanner
        scanner.close();
    }
}

