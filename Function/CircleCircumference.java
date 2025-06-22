package Function;

import java.util.Scanner;

public class CircleCircumference {
    public static double circumference(double r) {
        return 2 * 3.14 * r; // you can use also Math.PI.
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle :- ");
        double r = sc.nextDouble();

        System.out.print("Circumference ans is :- " + circumference(r));
        sc.close();
    }
}
