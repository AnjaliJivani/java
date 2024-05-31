import java.util.Scanner;

// Class for computing the sum of elements in a specific row of the matrix
class RowSumRunnable implements Runnable {
    private int[] row;
    private int rowIndex;
    private int[] result;

    public RowSumRunnable(int[] row, int rowIndex, int[] result) {
        this.row = row;
        this.rowIndex = rowIndex;
        this.result = result;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int num : row) {
            sum += num;
        }
        result[rowIndex] = sum;
        System.out.println("Sum of row " + rowIndex + " is: " + sum);
    }
}

// Main class
public class Lab_9_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read matrix dimensions
        System.out.print("Enter the number of rows (m): ");
        int m = scanner.nextInt();
        System.out.print("Enter the number of columns (n): ");
        int n = scanner.nextInt();

        // Initialize the matrix
        int[][] matrix = new int[m][n];
        System.out.println("Enter the elements of the matrix:");

        // Read matrix elements
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Array to store results
        int[] result = new int[m];

        // Create and start threads
        Thread[] threads = new Thread[m];
        for (int i = 0; i < m; i++) {
            threads[i] = new Thread(new RowSumRunnable(matrix[i], i, result));
            threads[i].start();
        }

        // Wait for all threads to finish
        for (int i = 0; i < m; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }

        // Print final results
        System.out.println("Final Results:");
        for (int i = 0; i < m; i++) {
            System.out.println("Sum of row " + i + ": " + result[i]);
        }

        scanner.close();
    }
}
