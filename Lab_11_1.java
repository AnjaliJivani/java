import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Student {
    String id;
    String name;
    int age;
    String grade;

    public Student(String id, String name, int age, String grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return id + "," + name + "," + age + "," + grade;
    }
}

public class Lab_11_1 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Lab_11_1 <inputFile> <outputFile>");
            return;
        }

        String inputFile = args[0];
        String outputFile = args[1];

        List<Student> students = new ArrayList<>();

        // Read students from the input file
        try {
            students = readStudentsFromFile(inputFile);
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
            return;
        }

        // Display existing students
        System.out.println("Existing students:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Add a new student
        students.add(new Student("004", "New Student", 20, "A"));

        // Write updated students to the output file
        try {
            writeStudentsToFile(outputFile, students);
        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e.getMessage());
        }
    }

    public static List<Student> readStudentsFromFile(String fileName) throws IOException {
        List<Student> students = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    String id = parts[0];
                    String name = parts[1];
                    int age = Integer.parseInt(parts[2]);
                    String grade = parts[3];
                    students.add(new Student(id, name, age, grade));
                }
            }
        }

        return students;
    }

    public static void writeStudentsToFile(String fileName, List<Student> students) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Student student : students) {
                writer.write(student.toString());
                writer.newLine();
            }
        }
    }
}
