package Array;

import java.util.Scanner;

public class BasicTwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input row & col
        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // 2D array
        int[][] numbers = new int[row][cols];

        // input elements
        System.out.print("Enter " + (row * cols) + " elements for the 2D array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        // output the 2D array
        System.out.println("\n2D Array is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
