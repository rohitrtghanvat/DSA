package Array;

import java.util.Arrays;

public class BasicArray {
    public static void main(String args[]) {
        
        // numbers[0] = 10; method 1
        // numbers[1] = 20;
        // numbers[2] = 30;
        // numbers[3] = 40;
        // numbers[4] = 50;
        int[] number = { 10, 20, 30, 40, 50, 60, 70 }; //method 2

        System.out.println(Arrays.toString(number)); // method 1

        for (int i = 0; i < number.length; i++) { // method 2
            System.out.println("Element at index " + i + ":" + number[i]);
        }
    }
}