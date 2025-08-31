// Interface
interface Shape {
    void area(double x, double y);
    void perimeter(double x, double y);
}

// Rectangle class implementing Shape
class Rectangle implements Shape {
    double length;
    double breadth;

    // Constructor
    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    // Implement area method
    public void area(double x, double y) {
        double a = x * y;
        System.out.println("Area of Rectangle: " + a);
    }

    // Implement perimeter method
    public void perimeter(double x, double y) {
        double p = 2 * (x + y);
        System.out.println("Perimeter of Rectangle: " + p);
    }
}

// Main class
public class Lab8 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 5);
        System.out.println("--- Rectangle using Interface ---");
        rect.area(rect.length, rect.breadth);
        rect.perimeter(rect.length, rect.breadth);

        // Lab Report details
        System.out.println("\n--- Lab Report Details ---");
        System.out.println("Lab No.: 8");
        System.out.println("Name: Prabesh Neupane");
        System.out.println("Roll No./Section: 72/078 Sec B");
    }
}
