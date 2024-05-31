public class Lab_8_1 {
    public static void main(String[] args) {
        try {
            // Ensure two arguments are passed
            if (args.length != 2) {
                throw new IllegalArgumentException("Exactly two arguments are required.");
            }

            // Parse the command line arguments
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);

            // Check for negative exponents
            if (y < 0) {
                throw new IllegalArgumentException("Exponent should not be negative.");
            }

            // Compute x^y using repetitive multiplication
            int result = power(x, y);
            System.out.println(x + " raised to the power of " + y + " is: " + result);
        } catch (NumberFormatException e) {
            System.err.println("Both arguments must be integers.");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    // Method to compute x^y using repetitive multiplication
    public static int power(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }
}
