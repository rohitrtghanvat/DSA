// Inverted Half Pyramid (rotate by 180 degree)
// *
// **
// ***
// ****
// *****
package Pattern;

import java.util.Scanner;

public class InvertedHalfPyramid {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value to print Inverted Half Pyramid (rotate by180degree) :- ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
