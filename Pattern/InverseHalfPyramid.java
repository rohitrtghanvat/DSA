// 4. Inverse/Inverted Half Pyramid
// Enter value to print Inverse/Inverted Half Pyramid format :-5
// *****
// ****
// ***
// **
// *
package Pattern;

import java.util.Scanner;

public class InverseHalfPyramid {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value to print Inverse/Inverted Half Pyramid format:-");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}