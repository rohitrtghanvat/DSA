// Enter value to print Number Pyramid:- 5
//     1
//    212
//   32123
//  4321234
// 543212345
package Pattern;

import java.util.Scanner;

public class numberPyramidEqual {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value to print Number Pyramid:- ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // print 1st half
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // print 2nd half
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }sc.close();
    }
}
