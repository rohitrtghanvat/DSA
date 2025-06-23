package Function;

import java.util.Scanner;

public class GCDCalculator {
    // function to calculate GCD using Euclidean algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;  // when b becomes 0, a contains the GCD
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input two numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // find and print GCD
        int ans = gcd(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is " + ans);

        sc.close();
    }
}
