package Function;

import java.util.Scanner;

public class ProductFunction {
    public static int calculateProduct(int a, int b) {
        return a * b;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two number :- ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print("Product of two numbers :-" + calculateProduct(a, b));
        sc.close();
    }
}
