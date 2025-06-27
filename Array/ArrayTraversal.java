package Array;

/*
📘 Description:
This program demonstrates:
1. Sequential (left to right) traversal of an array
2. Reverse (right to left) traversal of an array

🔢 Input: {10, 20, 30, 40, 50}
📤 Output:
Sequential: 10 20 30 40 50
Reverse:    50 40 30 20 10
*/
public class ArrayTraversal {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };

        // Sequential Traversal
        System.out.print("Sequential: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // Reverse Traversal
        System.out.print("Reverse: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
