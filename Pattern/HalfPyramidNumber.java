// 6. print Half Pyramid with Numbers
// Enter value for print Half Pyramid with Numbers :- 6
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5
// 1 2 3 4 5 6
package Pattern;

import java.util.Scanner;

public class HalfPyramidNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value for print Half Pyramid with Numbers :- ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
