// Demonstration of static concepts
class StaticDemo {
    static int count = 0; // static variable

    static { // static block
        System.out.println("Static block executed.");
    }

    static void showCount() { // static method
        System.out.println("Static count: " + count);
    }
    // I did it prabesh Neupane

    void increment() {
        count++;
    }
}

// Demonstration of final keyword
final class FinalClassDemo { // final class
    final int value = 100; // final variable

    final void display() { // final method
        System.out.println("Final value: " + value);
    }
}

public class Lab3 {
    public static void main(String[] args) {
        System.out.println("--- Static Demo ---");
        StaticDemo obj1 = new StaticDemo();
        StaticDemo obj2 = new StaticDemo();

        obj1.increment();
        obj2.increment();

        StaticDemo.showCount(); // calls static method

        System.out.println("\n--- Final Demo ---");
        FinalClassDemo finalObj = new FinalClassDemo();
        finalObj.display();

        // Lab report details
        System.out.println("\n--- Lab Report Details ---");
        System.out.println("Lab No.: 3");
        System.out.println("Name: Prabesh Neupane");
        System.out.println("Roll No./Section: 72/078 Sec B");
    }
}
