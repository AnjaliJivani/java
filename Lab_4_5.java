import java.util.Scanner;

public class Lab_4_5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Find the length of the string
        int length = inputString.length();
        System.out.println("Length of the string: " + length);

        // Find the starting point of the second half
        int startIndex = length / 2;

        // Extract and print the second half of the string
        String secondHalf = inputString.substring(startIndex);
        System.out.println("Second half of the string: " + secondHalf);

        scanner.close();
    }
}

