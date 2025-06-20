// 8.Floyd's Triangle
// Enter value to print Floyd's Triangle :- 5
// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15
package Pattern;

import java.util.Scanner;

public class FloydTriangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value to print Floyd's Triangle :- ");
        int n = sc.nextInt();
        int number = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++; // number = number + 1
            }
            System.out.println();
        }
        sc.close();
    }
}
