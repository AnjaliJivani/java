import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lab_10_2 {
    public static void main(String[] args) {
        // Check if the correct number of arguments are provided
        if (args.length < 4) {
            System.out.println("Usage: java Lab_10_2 <file1> <file2> <word1> <word2>");
            return;
        }

        String file1 = args[0];
        String file2 = args[1];
        String word1 = args[2];
        String word2 = args[3];

        try {
            // Call the method to replace words and get the replacement count
            int replacementCount = replaceWordsInFile(file1, file2, word1, word2);
            System.out.println("Number of replacements: " + replacementCount);
        } catch (IOException e) {
            System.out.println("Error processing the file: " + e.getMessage());
        }
    }

    public static int replaceWordsInFile(String file1, String file2, String word1, String word2) throws IOException {
        int replacementCount = 0;

        // Use BufferedReader to read the input file and BufferedWriter to write to the output file
        try (BufferedReader reader = new BufferedReader(new FileReader(file1));
             BufferedWriter writer = new BufferedWriter(new FileWriter(file2))) {

            String line;
            while ((line = reader.readLine()) != null) {
                // Replace all occurrences of word1 with word2 in the line
                String replacedLine = line.replace(word1, word2);

                // Count the number of replacements in the current line
                int lineReplacementCount = (line.length() - replacedLine.length()) / word1.length();
                replacementCount += lineReplacementCount;

                // Write the replaced line to the output file
                writer.write(replacedLine);
                writer.newLine();
            }
        } catch (IOException e) {
            // Handle the case where the file doesn't exist or cannot be read
            throw new IOException("File not found or cannot be read/written.");
        }

        return replacementCount;
    }
}
