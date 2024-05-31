public class Lab_8_2 {
    public static void main(String[] args) {
        int sum = 0;

        for (String arg : args) {
            try {
                int number = Integer.parseInt(arg);

                // Check for negative numbers
                if (number < 0) {
                    throw new IllegalArgumentException("Number is negative: " + number);
                }

                // Check if the number is evenly divisible by 10
                if (number % 10 == 0) {
                    throw new IllegalArgumentException("Number is evenly divisible by 10: " + number);
                }

                // Check if the number is greater than 1000 and less than 2000
                if (number > 1000 && number < 2000) {
                    throw new IllegalArgumentException("Number is greater than 1000 and less than 2000: " + number);
                }

                // Check if the number is greater than 7000
                if (number > 7000) {
                    throw new IllegalArgumentException("Number is greater than 7000: " + number);
                }

                // Add valid number to sum
                sum += number;
            } catch (NumberFormatException e) {
                System.err.println("Invalid number format: " + arg);
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
            }
        }

        // Print the total sum of valid numbers
        System.out.println("Total sum of valid numbers: " + sum);
    }
}
