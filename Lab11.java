import java.io.*;
import java.util.Scanner;

// Serializable class
class Student implements Serializable {
    String name;
    int roll;

    Student(String n, int r) {
        name = n;
        roll = r;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No.: " + roll);
    }
}

public class Lab11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a) RandomAccessFile demo
        try {
            RandomAccessFile raf = new RandomAccessFile("randomfile.txt", "rw");
            raf.writeUTF("Hello RandomAccessFile");
            raf.seek(0); // move to start
            System.out.println("RandomAccessFile content: " + raf.readUTF());
            raf.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

        // b) Read from keyboard and write to file
        try {
            System.out.print("Enter text to write to file: ");
            String input = sc.nextLine();
            FileWriter fw = new FileWriter("userinput.txt");
            fw.write(input);
            fw.close();
            System.out.println("Text written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

        // c) Serialization and Deserialization
        try {
            Student s1 = new Student("Prabesh Neupane", 72);
            // Serialization
            FileOutputStream fos = new FileOutputStream("student.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            oos.close();
            fos.close();
            System.out.println("Object serialized successfully.");

            // Deserialization
            FileInputStream fis = new FileInputStream("student.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student s2 = (Student) ois.readObject();
            ois.close();
            fis.close();
            System.out.println("Deserialized Object:");
            s2.display();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e);
        }

        // Lab Report details
        System.out.println("\n--- Lab Report Details ---");
        System.out.println("Lab No.: 11");
        System.out.println("Name: Prabesh Neupane");
        System.out.println("Roll No./Section: 72/078 Sec B");

        sc.close();
    }
}
