import java.util.Scanner;

public class MatrixAndJaggedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Part a: Matrix input and diagonal elements
        int[][] matrix = new int[3][3];
        System.out.println("Enter elements of 3x3 matrix:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nThe 3x3 Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nDiagonal Elements:");
        for (int i = 0; i < 3; i++) {
            System.out.print(matrix[i][i] + " ");
        }

        // Part b: Jagged Array
        System.out.println("\n\nJagged Array Demonstration:");
        int[][] jagged = new int[3][]; // declare 3 rows

        jagged[0] = new int[3]; // row 1 has 3 elements
        jagged[1] = new int[2]; // row 2 has 2 elements
        jagged[2] = new int[4]; // row 3 has 4 elements

        int value = 1;
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                jagged[i][j] = value++;
            }
        }

        System.out.println("Jagged Array Elements:");
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }

        // Lab Report details
        System.out.println("\n--- Lab Report Details ---");
        System.out.println("Lab No.: 2");
        System.out.println("Name: Prabesh Neupane");
        System.out.println("Roll No./Section: B");

        sc.close();
    }
}
