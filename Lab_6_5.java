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
}

class ThreeDPoint extends MyPoint {
    // Data field for z-coordinate
    private double z;

    // No-arg constructor that creates a point (0, 0, 0)
    public ThreeDPoint() {
        this(0, 0, 0.0);
    }

    // Constructor that constructs a point with three specified coordinates
    public ThreeDPoint(int x, int y, double z) {
        super(x, y);
        this.z = z;
    }

    // Getter method for z
    public double getZ() {
        return z;
    }

    // Override the distance method to return the distance between two points in the three-dimensional space
    @Override
    public double distance(MyPoint point) {
        if (point instanceof ThreeDPoint) {
            ThreeDPoint point3D = (ThreeDPoint) point;
            int deltaX = getX() - point3D.getX();
            int deltaY = getY() - point3D.getY();
            double deltaZ = z - point3D.getZ();
            return Math.sqrt(deltaX * deltaX + deltaY * deltaY + deltaZ * deltaZ);
        }
        return super.distance(point);
    }

    // Method to calculate the distance from this point to another point with specified x, y, and z coordinates
    public double distance(int x, int y, double z) {
        int deltaX = getX() - x;
        int deltaY = getY() - y;
        double deltaZ = this.z - z;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY + deltaZ * deltaZ);
    }
}

public class Lab_6_5 {
    public static void main(String[] args) {
        // Creating two ThreeDPoint objects
        ThreeDPoint point1 = new ThreeDPoint();
        ThreeDPoint point2 = new ThreeDPoint(10, 30, 25.5);

        // Displaying the distance between the two points
        System.out.println("Distance between point1 and point2: " + point1.distance(point2));
    }
}
