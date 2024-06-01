import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lab_10_3 {
    public static void main(String[] args) {
        // Check if the filename is provided as an argument
        if (args.length < 1) {
            System.out.println("Please provide a file name as an argument.");
            return;
        }

        String fileName = args[0];

        try {
            // Call the method to count the occurrences of digit '5'
            int count = countDigitFive(fileName);
            System.out.println("Number of occurrences of digit '5': " + count);
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }

    public static int countDigitFive(String fileName) throws IOException {
        int count = 0;

        // Use BufferedReader to read the file
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int character;
            while ((character = reader.read()) != -1) {
                if (character == '5') {
                    count++;
                }
            }
        } catch (IOException e) {
            // Handle the case where the file doesn't exist or cannot be read
            throw new IOException("File not found or cannot be read.");
        }

        return count;
    }
}
