// Class for displaying "Good Morning" message
class GoodMorningRunnable implements Runnable {
    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Good Morning");
                Thread.sleep(1000); // Sleep for 1000 milliseconds (1 second)
            }
        } catch (InterruptedException e) {
            System.out.println("Good Morning Thread interrupted.");
        }
    }
}

// Class for displaying "Good Afternoon" message
class GoodAfternoonRunnable implements Runnable {
    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Good Afternoon");
                Thread.sleep(3000); // Sleep for 3000 milliseconds (3 seconds)
            }
        } catch (InterruptedException e) {
            System.out.println("Good Afternoon Thread interrupted.");
        }
    }
}

// Main class
public class Lab_9_1 {
    public static void main(String[] args) {
        // Create instances of the runnable objects
        Runnable goodMorningTask = new GoodMorningRunnable();
        Runnable goodAfternoonTask = new GoodAfternoonRunnable();

        // Create threads with the runnable objects
        Thread goodMorningThread = new Thread(goodMorningTask);
        Thread goodAfternoonThread = new Thread(goodAfternoonTask);

        // Start the threads
        goodMorningThread.start();
        goodAfternoonThread.start();
    }
}
