// 3. Half Pyramid
// Enter value to print Half Pyramid format :-5
// *
// **
// ***
// ****
// *****
package Pattern;

import java.util.Scanner;

public class HalfPyramid {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value to print Half Pyramid format :-");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}