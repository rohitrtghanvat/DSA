package Array;

import java.util.Scanner;

public class InputSize {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of Array :- ");
        int size = sc.nextInt();
        int[] numbers = new int[size];

        System.out.print("Enter values of Array :-");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        // numbers[0] = 10; method 1
        // numbers[1] = 20;
        // numbers[2] = 30;
        // numbers[3] = 40;
        // numbers[4] = 50;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ":" + numbers[i]);
        }
        sc.close();
    }

}
