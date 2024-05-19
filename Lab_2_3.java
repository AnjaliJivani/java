import java.util.Scanner;

public class Lab_2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Get the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Consume the leftover newline character
        scanner.nextLine();

        // Get the operation
        System.out.print("Enter the operation (+, -, *, /): ");
        String operation = scanner.nextLine();

        // Perform the operation
        double result;
        switch (operation) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    scanner.close();
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operation. Please enter one of +, -, *, /.");
                scanner.close();
                return;
        }

        // Print the result
        System.out.println("The result of " + num1 + " " + operation + " " + num2 + " is: " + result);

        // Close the scanner
        scanner.close();
    }
}

