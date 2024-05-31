import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Lab_9_4 {
    public static void main(String[] args) {
        BlockingQueue<Integer> buffer = new ArrayBlockingQueue<>(1);

        Thread thread1 = new Thread(new Worker(buffer, true), "Thread-1");
        Thread thread2 = new Thread(new Worker(buffer, false), "Thread-2");

        thread1.start();
        thread2.start();
    }
}

class Worker implements Runnable {
    private BlockingQueue<Integer> buffer;
    private boolean initiator;

    public Worker(BlockingQueue<Integer> buffer, boolean initiator) {
        this.buffer = buffer;
        this.initiator = initiator;
    }

    @Override
    public void run() {
        try {
            if (initiator) {
                buffer.put(1);
                System.out.println(Thread.currentThread().getName() + " sent: 1");
                int received = buffer.take();
                System.out.println(Thread.currentThread().getName() + " received: " + received);
                for (int i = 1; i <= 3; i++) {
                    buffer.put(i);
                    System.out.println(Thread.currentThread().getName() + " sent: " + i);
                }
            } else {
                int received = buffer.take();
                System.out.println(Thread.currentThread().getName() + " received: " + received);
                buffer.put(2);
                System.out.println(Thread.currentThread().getName() + " sent: 2");
                for (int i = 1; i <= 3; i++) {
                    int number = buffer.take();
                    System.out.println(Thread.currentThread().getName() + " received: " + number);
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println(Thread.currentThread().getName() + " was interrupted");
        }
    }
}
