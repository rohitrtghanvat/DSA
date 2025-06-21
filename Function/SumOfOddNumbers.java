// Write a function to print the sum of all odd numbers from 1 to n.
package Function;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static int sumoddnum(int n, int sum) {
        sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1 to n:-");
        int n = sc.nextInt();
        System.out.print("Addition of odd number :- " + sumoddnum(n, n));
        sc.close();
    }

}