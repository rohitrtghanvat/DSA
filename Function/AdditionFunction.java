package Function;

import java.util.Scanner;

public class AdditionFunction {
    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two number :-");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculateSum(a, b);
        System.out.print("Sum of two number is :- " + sum);
        sc.close();
    }
}
