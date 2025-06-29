package Array;

import java.util.Arrays;

public class BinarySearch {
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;

    }

    public static void main(String args[]) {
        int[] arr = { 10, 20, 70, 40, 30, 60 };
        Arrays.sort(arr);
        System.out.print("sorted array:- ");

        int key = 30;
        int index = binarySearch(arr, key);

        if (index != -1) {
            System.out.println("Elemnet found at index : " + index);
        } else {
            System.out.println("Elment not found.");
        }

    }
}
