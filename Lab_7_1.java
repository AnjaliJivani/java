// Define the abstract class Vegetable
abstract class Vegetable {
    protected String color; // instance variable for color

    // Constructor to initialize color
    public Vegetable(String color) {
        this.color = color;
    }

    // Abstract method to be implemented by subclasses
    public abstract String toString();
}

// Subclass Potato extending Vegetable
class Potato extends Vegetable {
    public Potato(String color) {
        super(color);
    }

    // Override the toString() method
    @Override
    public String toString() {
        return "Potato: Color = " + color;
    }
}

// Subclass Brinjal extending Vegetable
class Brinjal extends Vegetable {
    public Brinjal(String color) {
        super(color);
    }

    // Override the toString() method
    @Override
    public String toString() {
        return "Brinjal: Color = " + color;
    }
}

// Subclass Tomato extending Vegetable
class Tomato extends Vegetable {
    public Tomato(String color) {
        super(color);
    }

    // Override the toString() method
    @Override
    public String toString() {
        return "Tomato: Color = " + color;
    }
}

// Main class to create and display instances
public class Lab_7_1 {
    public static void main(String[] args) {
        // Create instances of each vegetable
        Vegetable potato = new Potato("Brown");
        Vegetable brinjal = new Brinjal("Purple");
        Vegetable tomato = new Tomato("Red");

        // Display the instances
        System.out.println(potato);
        System.out.println(brinjal);
        System.out.println(tomato);
    }
}
