import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

class BinaryFileWriter extends Thread {
    private String fileName;
    private int numBytes;

    public BinaryFileWriter(String fileName, int numBytes) {
        this.fileName = fileName;
        this.numBytes = numBytes;
    }

    @Override
    public void run() {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            Random random = new Random();
            for (int i = 0; i < numBytes; i++) {
                // Yield the CPU to other threads
                if (i % 100 == 0) {
                    Thread.yield();
                }
                dos.writeByte(random.nextInt(256));
            }
            System.out.println("Finished writing to " + fileName);
        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        }
    }
}

public class Lab_11_3 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Lab_11_3 <file1> <file2>");
            return;
        }

        String file1 = args[0];
        String file2 = args[1];

        BinaryFileWriter writer1 = new BinaryFileWriter(file1, 1000);
        BinaryFileWriter writer2 = new BinaryFileWriter(file2, 1000);

        writer1.start();
        writer2.start();

        try {
            // Demonstrate the use of join()
            writer1.join();
            System.out.println("Writer1 has finished.");

            // Demonstrate the use of interrupt()
            writer2.interrupt();

            // Join writer2 to wait for its completion
            writer2.join();
            System.out.println("Writer2 has finished.");

        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }
    }
}
