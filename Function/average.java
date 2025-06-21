// Enter 3 numbers from the user & make a function to print their average.

package Function;

import java.util.Scanner;

public class average {
    public static float printaverage(float a, float b, float c) {
        return (a + b + c) / 3;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three number to print their average :-");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        System.out.print("average of three number is :-  " + printaverage(a, b, c));
        sc.close();
    }
}
