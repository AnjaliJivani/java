
    import java.util.Scanner;

public class Lab_2_1{
    public static void main(String[] args) {
        double num1, num2;
        
        if (args.length == 2) {
            // Use command line arguments
            try {
                num1 = Double.parseDouble(args[0]);
                num2 = Double.parseDouble(args[1]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input from command line. Please provide valid double numbers.");
                return;
            }
        } else {
            // Use Scanner to get input from user
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid double number.");
                scanner.next(); // clear the invalid input
                System.out.print("Enter the first number: ");
            }
            num1 = scanner.nextDouble();
            
            System.out.print("Enter the second number: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid double number.");
                scanner.next(); // clear the invalid input
                System.out.print("Enter the second number: ");
            }
            num2 = scanner.nextDouble();
            scanner.close();
        }
        
        // Calculate the sum
        double sum = num1 + num2;
        
        // Print the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}


