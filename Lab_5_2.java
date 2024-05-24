public class Lab_5_2 {
    private int hours;
    private int minutes;

    // Constructor to initialize hours and minutes
    public Lab_5_2(int hours, int minutes) {
        // Normalize the time if minutes are 60 or more
        this.hours = hours + minutes / 60;
        this.minutes = minutes % 60;
    }

    // Method to add two Lab_5_2 objects
    public Lab_5_2 add(Lab_5_2 other) {
        int newHours = this.hours + other.hours;
        int newMinutes = this.minutes + other.minutes;

        // Normalize the time if minutes are 60 or more
        if (newMinutes >= 60) {
            newHours += newMinutes / 60;
            newMinutes = newMinutes % 60;
        }

        return new Lab_5_2(newHours, newMinutes);
    }

    // Method to display the time in HH:MM format
    @Override
    public String toString() {
        return String.format("%02d:%02d", hours, minutes);
    }

    // Main method to test the Lab_5_2 class
    public static void main(String[] args) {
        Lab_5_2 time1 = new Lab_5_2(2, 45); // Create first time object
        Lab_5_2 time2 = new Lab_5_2(1, 30); // Create second time object

        Lab_5_2 result = time1.add(time2); // Add the two time objects

        System.out.println("Time 1: " + time1); // Print first time object
        System.out.println("Time 2: " + time2); // Print second time object
        System.out.println("Sum of Time 1 and Time 2: " + result); // Print the result of addition
    }
}
