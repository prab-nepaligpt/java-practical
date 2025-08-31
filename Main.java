class Box {
    // Instance variables
    int length;
    int breadth;
    int height;

    // Method to print values of variables
    void printDimensions() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Height: " + height);
    }

    // Method to print volume
    void printVolume() {
        int volume = length * breadth * height;
        System.out.println("Volume of the box: " + volume);
    }
}

public class Main {
    public static void main(String[] args) {
        // First Box object
        Box box1 = new Box();
        box1.length = 5;
        box1.breadth = 4;
        box1.height = 3;

        System.out.println("Box 1:");
        box1.printDimensions();
        box1.printVolume();

        // Second Box object
        Box box2 = new Box();
        box2.length = 7;
        box2.breadth = 6;
        box2.height = 2;

        System.out.println("\nBox 2:");
        box2.printDimensions();
        box2.printVolume();

        // Printing student details
        System.out.println("\n--- Lab Report Details ---");
        System.out.println("Lab No.: 1");
        System.out.println("Name: ___________");
        System.out.println("Roll No./Section: ___________");
    }
}
