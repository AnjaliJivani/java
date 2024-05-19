import java.util.Scanner;

public class Lab_4_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Print the string in pyramid form
        for (int i = 1; i <= inputString.length(); i++) {
            System.out.println(inputString.substring(0, i));
        }

        scanner.close();
    }
}

