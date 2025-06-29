package Array;

import java.util.Scanner;

public class linearSearch {

    // Linear search method
    public static int findElement(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter size of array :- ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input key to search
        System.out.print("Enter value to find in array:- ");
        int key = sc.nextInt();

        // Call linear search method
        int result = findElement(arr, key);

        // Output result
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }

        sc.close();
    }
}
