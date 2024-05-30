class Lab_6_1 {
    // Data members
    private int id_no;
    private int no_of_subjects_registered;
    private String[] subject_code;
    private int[] subject_credits;
    private char[] grade_obtained;
    private double spi;

    // Constructor
    public Lab_6_1(int id_no, int no_of_subjects_registered, String[] subject_code, int[] subject_credits, char[] grade_obtained) {
        this.id_no = id_no;
        this.no_of_subjects_registered = no_of_subjects_registered;
        this.subject_code = subject_code;
        this.subject_credits = subject_credits;
        this.grade_obtained = grade_obtained;
        calculate_spi();
    }

    // Method to calculate SPI
    private void calculate_spi() {
        double totalCredits = 0;
        double totalPoints = 0;

        for (int i = 0; i < no_of_subjects_registered; i++) {
            totalCredits += subject_credits[i];
            totalPoints += gradeToPoint(grade_obtained[i]) * subject_credits[i];
        }

        if (totalCredits != 0) {
            spi = totalPoints / totalCredits;
        } else {
            spi = 0;
        }
    }

    // Helper method to convert grade to points
    private double gradeToPoint(char grade) {
        switch (grade) {
            case 'A': return 10;
            case 'B': return 8;
            case 'C': return 6;
            case 'D': return 4;
            case 'E': return 2;
            case 'F': return 0;
            default: return 0;
        }
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("ID No: " + id_no);
        System.out.println("No. of Subjects Registered: " + no_of_subjects_registered);
        System.out.print("Subject Codes: ");
        for (String code : subject_code) {
            System.out.print(code + " ");
        }
        System.out.println();
        System.out.print("Subject Credits: ");
        for (int credits : subject_credits) {
            System.out.print(credits + " ");
        }
        System.out.println();
        System.out.print("Grades Obtained: ");
        for (char grade : grade_obtained) {
            System.out.print(grade + " ");
        }
        System.out.println();
        System.out.println("SPI: " + spi);
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        Lab_6_1[] students = new Lab_6_1[n];
        int index = 1;

        for (int i = 0; i < n; i++) {
            int id_no = Integer.parseInt(args[index++]);
            int no_of_subjects_registered = Integer.parseInt(args[index++]);
            String[] subject_code = new String[no_of_subjects_registered];
            int[] subject_credits = new int[no_of_subjects_registered];
            char[] grade_obtained = new char[no_of_subjects_registered];

            for (int j = 0; j < no_of_subjects_registered; j++) {
                subject_code[j] = args[index++];
                subject_credits[j] = Integer.parseInt(args[index++]);
                grade_obtained[j] = args[index++].charAt(0);
            }

            students[i] = new Lab_6_1(id_no, no_of_subjects_registered, subject_code, subject_credits, grade_obtained);
        }

        // Display details of each student
        for (Lab_6_1 student : students) {
            student.displayDetails();
            System.out.println();
        }
    }
}