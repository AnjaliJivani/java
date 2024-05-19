import java.util.Scanner;

public class Lab_3_2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number or string
        System.out.print("Enter a number or string: ");
        String input = scanner.nextLine();

        // Check if the input is a palindrome
        boolean isPalindrome = checkPalindrome(input);

        // Output the result
        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }

        scanner.close();
    }

    // Function to check if a string is a palindrome
    public static boolean checkPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

