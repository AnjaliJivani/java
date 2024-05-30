// Define the Transport interface with a deliver method
interface Transport {
    void deliver();
}

// Define the abstract Animal class
abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Define the Tiger class extending Animal
class Tiger extends Animal {
    public Tiger(String name) {
        super(name);
    }
}

// Define the Camel class extending Animal and implementing Transport
class Camel extends Animal implements Transport {
    public Camel(String name) {
        super(name);
    }

    // Implement the deliver method
    @Override
    public void deliver() {
        System.out.println(name + " the Camel is delivering goods.");
    }
}

// Define the Deer class extending Animal
class Deer extends Animal {
    public Deer(String name) {
        super(name);
    }
}

// Define the Donkey class extending Animal and implementing Transport
class Donkey extends Animal implements Transport {
    public Donkey(String name) {
        super(name);
    }

    // Implement the deliver method
    @Override
    public void deliver() {
        System.out.println(name + " the Donkey is delivering goods.");
    }
}

// Main class to test the functionality
public class Lab_7_3 {
    public static void main(String[] args) {
        // Initialize an array of Animal objects
        Animal[] animals = {
            new Tiger("Tony"),
            new Camel("Cammie"),
            new Deer("Bambi"),
            new Donkey("Donny")
        };

        // Iterate through the array and invoke the deliver method if applicable
        for (Animal animal : animals) {
            if (animal instanceof Transport) {
                ((Transport) animal).deliver();
            }
        }
    }
}
