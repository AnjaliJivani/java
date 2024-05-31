// Class for printing odd numbers
class OddNumberRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 20; i += 2) {
            System.out.println("Odd Number: " + i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds to simulate work
            } catch (InterruptedException e) {
                System.out.println("Odd Number Thread interrupted.");
            }
        }
    }
}

// Class for printing even numbers
class EvenNumberRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println("Even Number: " + i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds to simulate work
            } catch (InterruptedException e) {
                System.out.println("Even Number Thread interrupted.");
            }
        }
    }
}

// Main class
public class Lab_9_2 {
    public static void main(String[] args) {
        // Create instances of the runnable objects
        Runnable oddNumberTask = new OddNumberRunnable();
        Runnable evenNumberTask = new EvenNumberRunnable();

        // Create threads with the runnable objects
        Thread oddNumberThread = new Thread(oddNumberTask);
        Thread evenNumberThread = new Thread(evenNumberTask);

        // Start the threads
        oddNumberThread.start();
        evenNumberThread.start();
    }
}
