package Function;

import java.util.Scanner;

public class FactorialFunction {
    public static void printFactorial(int n) {
        if (n < 0) {
            System.out.println("Invalid Number");
            return;
        }
        int factorial = 1; // start from 1 is necessary . If start with zero ans will be zero.

        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }

        System.out.print(factorial);
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number :-");
        int n = sc.nextInt();

        printFactorial(n);
        sc.close();
    }
}
