// Input:
// x = 3
// n = 4

// Loop:
// result = 1
// → result = 1 * 3 = 3
// → result = 3 * 3 = 9
// → result = 9 * 3 = 27
// → result = 27 * 3 = 81

// Output:
// 3^4 = 81

package Function;

import java.util.Scanner;

public class Xncalculate {
    public static double power(int x, int n) {
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result *= x; // multiply x for n times
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take input
        System.out.print("Enter base (x): ");
        int x = sc.nextInt();

        System.out.print("Enter exponent (n): ");
        int n = sc.nextInt();

        // call power function
        double ans = power(x, n);

        // print the result
        System.out.println(x + "^" + n + " = " + ans);

        sc.close();
    }
}
