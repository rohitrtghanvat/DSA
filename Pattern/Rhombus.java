// Enter value to print Solid Rhombus :- 5
//     *****
//    *****
//   *****
//  *****
// *****
package Pattern;

import java.util.Scanner;

public class Rhombus {
    static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value to print Solid Rhombus :- ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
