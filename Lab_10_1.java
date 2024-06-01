import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lab_10_1 {
    public static void main(String[] args) {
        // Check if the filename is provided as an argument
        if (args.length < 1) {
            System.out.println("Please provide a file name as an argument.");
            return;
        }

        String fileName = args[0];

        try {
            // Call the method to count characters, words, and lines
            countFileContents(fileName);
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }

    public static void countFileContents(String fileName) throws IOException {
        // Initialize counters
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        // Use BufferedReader to read the file
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
        } catch (IOException e) {
            // Handle the case where the file doesn't exist or cannot be read
            throw new IOException("File not found or cannot be read.");
        }

        // Print the results
        System.out.println("Number of characters: " + charCount);
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of lines: " + lineCount);
    }
}
