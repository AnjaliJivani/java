public class Lab_4_6 {
    public static void main(String[] args) {
        // Check if there are any command-line arguments
        if (args.length == 0) {
            System.out.println("No command-line arguments found.");
            return;
        }

        // Iterate through the command-line arguments
        for (String arg : args) {
            // Check if the argument starts with an uppercase letter
            if (!Character.isUpperCase(arg.charAt(0))) {
                System.out.println("Error: Argument \"" + arg + "\" does not begin with an uppercase letter.");
                return; // Terminate the program
            }
        }

        // If all arguments start with an uppercase letter
        System.out.println("All arguments begin with an uppercase letter.");
    }
}

