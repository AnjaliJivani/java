// Superclass
class Animal {
    // Data member
    String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Method
    public void sound() {
        System.out.println("Animal makes a sound");
    }

    // Method to get the name
    public String getName() {
        return name;
    }
}

// Subclass
class Dog extends Animal {
    // Data member
    String breed;

    // Constructor
    public Dog(String name, String breed) {
        // Call to superclass constructor
        super(name);
        this.breed = breed;
    }

    // Overridden method
    @Override
    public void sound() {
        // Call to superclass method
        super.sound();
        System.out.println("Dog barks");
    }

    // Method to display details
    public void displayDetails() {
        // Access to superclass data member
        System.out.println("Name: " + super.getName());
        System.out.println("Breed: " + breed);
    }
}

// Main class
public class SuperKeywordDemo {
    public static void main(String[] args) {
        // Create a Dog object
        Dog dog = new Dog("Buddy", "Golden Retriever");

        // Call the overridden method
        dog.sound();

        // Display details of the dog
        dog.displayDetails();
        

    }
}
