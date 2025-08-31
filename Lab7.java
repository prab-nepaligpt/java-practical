// Outer class
class Outer {
    static int staticVar = 100;
    int instanceVar = 50;

    // a) Static nested class
    static class StaticNested {
        void display() {
            System.out.println("Static Nested Class: staticVar = " + staticVar);
        }
    }

    // b) Non-static nested class (Inner class)
    class Inner {
        void display() {
            System.out.println("Inner Class: instanceVar = " + instanceVar);
        }
    }

    // c) Local inner class
    void localInnerDemo() {
        final int localVar = 25;
        class LocalInner {
            void display() {
                System.out.println("Local Inner Class: localVar = " + localVar);
            }
        }
        LocalInner li = new LocalInner();
        li.display();
    }
}

// Main class
public class Lab7 {
    public static void main(String[] args) {
        System.out.println("--- Static Nested Class ---");
        Outer.StaticNested sn = new Outer.StaticNested();
        sn.display();

        System.out.println("\n--- Inner Class ---");
        Outer outer = new Outer();
        Outer.Inner in = outer.new Inner();
        in.display();

        System.out.println("\n--- Local Inner Class ---");
        outer.localInnerDemo();

        // Lab Report details
        System.out.println("\n--- Lab Report Details ---");
        System.out.println("Lab No.: 7");
        System.out.println("Name: Prabesh Neupane");
        System.out.println("Roll No./Section: 72/078 Sec B");
    }
}
// I did it prabesh Neupane
