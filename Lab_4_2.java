import java.util.Scanner;

public class Lab_4_2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a line of text
        System.out.println("Enter a line of text:");
        String line = scanner.nextLine();

        // Initialize counters for vowels and consonants
        int vowelCount = 0;
        int consonantCount = 0;

        // Convert the line to lower case to make the check case-insensitive
        line = line.toLowerCase();

        // Iterate through each character in the line
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
            // Check if the character is a consonant (a letter that is not a vowel)
            else if (ch >= 'a' && ch <= 'z') {
                consonantCount++;
            }
        }

        // Output the result
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);

        scanner.close();
    }
}

