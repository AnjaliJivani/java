public class Lab_1_6 {
    public static void main(String[] args) {
        // Check if the correct number of arguments is passed
        if (args.length != 2) {
            System.out.println("Please provide exactly two double numbers as arguments.");
            return;
        }

        try {
            // Parse the arguments to double
            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[1]);

            // Calculate the sum
            double sum = num1 + num2;

            // Print the result
            System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide valid double numbers.");
        }
    }
}

