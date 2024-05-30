class Book {
    // Private data member
    private String author_name;

    // Constructor
    public Book(String author_name) {
        this.author_name = author_name;
    }

    // Getter method for author_name
    public String getAuthorName() {
        return author_name;
    }

    // Method to display details (to be overridden by subclasses)
    public void display() {
        System.out.println("Author: " + author_name);
    }
}

class BookPublication extends Book {
    // Private data member
    private String title;

    // Constructor
    public BookPublication(String author_name, String title) {
        super(author_name);
        this.title = title;
    }

    // Method to display book publication details
    @Override
    public void display() {
        super.display();
        System.out.println("Book Title: " + title);
    }
}

class PaperPublication extends Book {
    // Private data member
    private String title;

    // Constructor
    public PaperPublication(String author_name, String title) {
        super(author_name);
        this.title = title;
    }

    // Method to display paper publication details
    @Override
    public void display() {
        super.display();
        System.out.println("Paper Title: " + title);
    }
}

public class Lab_6_2 {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java Lab_6_2 <type> <author_name> <title>");
            System.out.println("<type>: book or paper");
            return;
        }

        String type = args[0];
        String author_name = args[1];
        String title = args[2];

        // Using dynamic method dispatch to display the publication details
        Book publication;
        if (type.equalsIgnoreCase("book")) {
            publication = new BookPublication(author_name, title);
        } else if (type.equalsIgnoreCase("paper")) {
            publication = new PaperPublication(author_name, title);
        } else {
            System.out.println("Invalid type. Use 'book' or 'paper'.");
            return;
        }

        publication.display();
    }
}
