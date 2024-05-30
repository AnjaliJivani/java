class MyPoint {
    // Data fields
    private int x;
    private int y;

    // No-arg constructor that creates a point (0, 0)
    public MyPoint() {
        this(0, 0);
    }

    // Constructor that constructs a point with specified coordinates
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter methods for x and y
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Method that returns the distance from this point to a specified point of the MyPoint type
    public double distance(MyPoint point) {
        return distance(point.x, point.y);
    }

    // Method that returns the distance from this point to another point with specified x- and y-coordinates
    public double distance(int x, int y) {
        int deltaX = this.x - x;
        int deltaY = this.y - y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    // Main method to test the class
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(); // Point (0, 0)
        MyPoint p2 = new MyPoint(3, 4); // Point (3, 4)

        // Testing the distance methods
        System.out.println("Distance from p1 to p2: " + p1.distance(p2));
        System.out.println("Distance from p2 to (6, 8): " + p2.distance(6, 8));
    }
}

public class Lab_6_4 {
    public static void main(String[] args) {
        MyPoint.main(args);
    }
}
