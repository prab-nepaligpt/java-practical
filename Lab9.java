// Custom Exception
class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}

public class Lab9 {
    // Method demonstrating throws keyword
    static void division(int a, int b) throws ArithmeticException {
        System.out.println("Result: " + (a / b));
    }

    public static void main(String[] args) {
        System.out.println("--- Try, Catch, Finally ---");
        try {
            int data = 25 / 5;
            System.out.println("Data = " + data);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred");
        } finally {
            System.out.println("Finally block executed");
        }

        System.out.println("\n--- Multiple Catch Blocks ---");
        try {
            int arr[] = {1, 2, 3};
            System.out.println(arr[5]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception caught");
        }

        System.out.println("\n--- Nested Try Statements ---");
        try {
            int a = 10, b = 0;
            try {
                System.out.println(a / b);
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: Division by zero");
            }
        } catch (Exception e) {
            System.out.println("Outer catch: Some exception");
        }

        System.out.println("\n--- Throw Keyword ---");
        try {
            throw new ArithmeticException("Explicitly thrown exception");
        } catch (ArithmeticException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        System.out.println("\n--- Throws Keyword ---");
        try {
            division(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        System.out.println("\n--- Custom Exception ---");
        try {
            throw new MyException("This is a user-defined exception");
        } catch (MyException e) {
            System.out.println("Caught Custom Exception: " + e.getMessage());
        }

        // Lab Report details
        System.out.println("\n--- Lab Report Details ---");
        System.out.println("Lab No.: 9");
        System.out.println("Name: Prabesh Neupane");
        System.out.println("Roll No./Section: 72/078 Sec B");
    }
}
