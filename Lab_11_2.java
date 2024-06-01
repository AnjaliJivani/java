import java.io.File;

public class Lab_11_2 {
    public static void main(String[] args) {
        // Check if the filename or directory name is provided as an argument
        if (args.length < 1) {
            System.out.println("Please provide a file or directory name as an argument.");
            return;
        }

        String name = args[0];
        File file = new File(name);

        if (file.exists()) {
            if (file.isFile()) {
                // If it is a file, print the size of the file
                System.out.println("It is a file.");
                System.out.println("Size of the file: " + file.length() + " bytes");
            } else if (file.isDirectory()) {
                // If it is a directory, display the names of all files in it
                System.out.println("It is a directory.");
                String[] fileList = file.list();
                if (fileList != null) {
                    System.out.println("Files in the directory:");
                    for (String fileName : fileList) {
                        System.out.println(fileName);
                    }
                } else {
                    System.out.println("The directory is empty or an I/O error occurred.");
                }
            } else {
                System.out.println("The path is neither a file nor a directory.");
            }
        } else {
            System.out.println("The file or directory does not exist.");
        }
    }
}
