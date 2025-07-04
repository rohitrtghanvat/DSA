package String;

/*
 * 🔁 Reverse a String using Two Pointers Approach
 * -----------------------------------------------
 * ✅ Time Complexity: O(n)
 * ✅ Space Complexity: O(1)
 * 💡 Method 1: Use StringBuilder for mutable string operations
 * 💡 Method 2: Convert string to char[] and swap characters
 */

public class ReverseStringTwoPointers {

    // ✅ Method 1 - Using StringBuilder
    static String reverseUsingStringBuilder(String s) {
        int left = 0, right = s.length() - 1;
        StringBuilder res = new StringBuilder(s);

        while (left < right) {
            char temp = res.charAt(left);
            res.setCharAt(left, res.charAt(right));
            res.setCharAt(right, temp);
            left++;
            right--;
        }
        return res.toString();
    }

    // ✅ Method 2 - Using char[] (array)
    static String reverseUsingCharArray(String s) {
        int left = 0, right = s.length() - 1;
        char[] arr = s.toCharArray();

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }

    public static void main(String args[]) {
        String s = "abcdef";

        // You can test both methods:
        System.out.println("Reversed (StringBuilder): " + reverseUsingStringBuilder(s)); // fedcba
        System.out.println("Reversed (char array): " + reverseUsingCharArray(s)); // fedcba
    }
}
