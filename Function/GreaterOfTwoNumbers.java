// Write a function which takes in 2 numbers and returns the greater of those two.
package Function;

import java.util.Scanner;

public class GreaterOfTwoNumbers {
    public static int greaternum(int a, int b) {
        if (a > b) {
            return a;
        } else if (b > a) {
            return b;
        } else {
            return a;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int greater = greaternum(num1, num2); // store return value
        System.out.println(greater + " is the greater number.");
        sc.close();
    }
}
