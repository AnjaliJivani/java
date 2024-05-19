public class Lab_1_4 {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Command line arguments are:");
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + i + ": " + args[i]);
            }
        } else {
            System.out.println("No command line arguments found.");
        }
    }
}
