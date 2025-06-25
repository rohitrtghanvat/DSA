package Array;

import java.util.Scanner;

public class searchTwoDArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the row :- ");
        int row = sc.nextInt();
        System.out.print("Enter the columns :- ");
        int cols = sc.nextInt();

        int[][] numbers = new int[row][cols];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the number want finnd :-");
        int x = sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                if (numbers[i][j] == x) {
                    System.out.print("number found at location (" + i + " ," + j + ")");
                }
            }
        }
        sc.close();
    }
}