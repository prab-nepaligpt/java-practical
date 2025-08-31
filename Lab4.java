import java.util.Scanner;

// Base class
class Student {
    int roll_no;

    void readRollNo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter roll number: ");
        roll_no = sc.nextInt();
    }

    void displayRollNo() {
        System.out.println("Roll Number: " + roll_no);
    }
}

// Derived class
class Test extends Student {
    int marks1, marks2;

    void readMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks for subject 1: ");
        marks1 = sc.nextInt();
        System.out.print("Enter marks for subject 2: ");
        marks2 = sc.nextInt();
    }

    void displayMarks() {
        System.out.println("Marks of Subject 1: " + marks1);
        System.out.println("Marks of Subject 2: " + marks2);
    }
}

// Derived class
class Result extends Test {
    int total;

    void calculateTotal() {
        total = marks1 + marks2;
    }

    void displayTotal() {
        System.out.println("Total Marks: " + total);
    }
}

// Main class
public class Lab4 {
    public static void main(String[] args) {
        Result student1 = new Result();
        student1.readRollNo();
        student1.readMarks();
        System.out.println("\n--- Student Details ---");
        student1.displayRollNo();
        student1.displayMarks();
        student1.calculateTotal();
        student1.displayTotal();

        // Lab Report Details
        System.out.println("\n--- Lab Report Details ---");
        System.out.println("Lab No.: 4");
        System.out.println("Name: Prabesh Neupane");
        System.out.println("Roll No./Section: 72/078 Sec B");
    }
}
