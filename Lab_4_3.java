public class Lab_4_3 {
    public static void main(String[] args) {
        // Initialize an array with four integer elements
        int[] numbers = {10, 20, 30, 40};

        // Calculate the sum of the array elements
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        // Calculate the average
        double average = (double) sum / numbers.length;

        // Display the average
        System.out.println("The average of the array values is: " + average);
    }
}

