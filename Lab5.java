// Base class
class Parent {
    int x = 10;

    Parent() {
        System.out.println("Parent constructor called.");
    }

    void display() {
        System.out.println("Parent x = " + x);
    }
}

// Derived class
class Child extends Parent {
    int x = 20; // hides parent x

    Child() {
        super(); // calls parent constructor
        System.out.println("Child constructor called.");
    }

    void show() {
        System.out.println("Child x = " + x);
        System.out.println("Access parent x using super: " + super.x); // name hiding
    }
}

// Multilevel inheritance
class GrandChild extends Child {
    void displayMessage() {
        System.out.println("GrandChild class extending Child (multilevel inheritance).");
    }
}

// Main class
public class Lab5 {
    public static void main(String[] args) {
        System.out.println("--- Super Keyword Demo ---");
        Child c = new Child();
        c.show();

        System.out.println("\n--- Multilevel Inheritance Demo ---");
        GrandChild gc = new GrandChild();
        gc.displayMessage();
        gc.show(); // inherits from Child and Parent

        // Lab Report details
        System.out.println("\n--- Lab Report Details ---");
        System.out.println("Lab No.: 5");
        System.out.println("Name: Prabesh Neupane");
        System.out.println("Roll No./Section: 72/078 Sec B");
    }
}
