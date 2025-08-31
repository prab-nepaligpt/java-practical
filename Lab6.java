// Base class
class Figure {
    void area() {
        System.out.println("Area of figure not defined.");
    }
}

// Derived class - Rectangle
class Rectangle extends Figure {
    int length, breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    // Method overriding
    void area() {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }
}

// Derived class - Triangle
class Triangle extends Figure {
    int base, height;

    Triangle(int b, int h) {
        base = b;
        height = h;
    }

    // Method overriding
    void area() {
        System.out.println("Area of Triangle: " + (0.5 * base * height));
    }
}

// Main class
public class Lab6 {
    public static void main(String[] args) {
        System.out.println("--- Method Overriding & Runtime Polymorphism ---");

        Figure f1 = new Rectangle(10, 5); // Upcasting
        Figure f2 = new Triangle(8, 6);   // Upcasting

        f1.area(); // Calls Rectangle area
        f2.area(); // Calls Triangle area

        // Lab Report details
        System.out.println("\n--- Lab Report Details ---");
        System.out.println("Lab No.: 6");
        System.out.println("Name: Prabesh Neupane");
        System.out.println("Roll No./Section: 72/078 Sec B");
    }
}
