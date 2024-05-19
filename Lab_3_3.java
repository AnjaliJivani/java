import java.util.Scanner;

public class Lab_3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three numbers
        System.out.println("Enter three numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // Find the maximum number
        int max = findMax(num1, num2, num3);

        // Output the maximum number
        System.out.println("The maximum number is: " + max);

        scanner.close();
    }

    // Function to find the maximum of three numbers
    public static int findMax(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
}
