package Function;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take number of terms as input
        System.out.print("Enter number of terms for Fibonacci series: ");
        int n = sc.nextInt();

        // First two terms of the series
        int first = 0;
        int second = 1;

        // Print the Fibonacci series
        System.out.print(first + " " + second); // print first two terms

        for (int i = 3; i <= n; i++) {
            int next = first + second;  // next number
            System.out.print(" " + next); // print next number
            first = second;              // shift terms
            second = next;
        }

        sc.close();
    }
}
