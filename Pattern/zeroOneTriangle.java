// 9. 0-1 Triangle
// Enter value to print 0-1 Triangle :-5
// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1
package Pattern;

import java.util.Scanner;

public class zeroOneTriangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value to print 0-1 Triangle :-");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
