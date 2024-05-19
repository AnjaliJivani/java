public class Lab_4_4 {
    public static void main(String[] args) {
        // Initialize an array with some elements
        int[] numbers = {1, 2, 3, 4, 5};

        // Print the original array
        System.out.print("Original array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Print the array in reverse order
        System.out.print("Reversed array: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
