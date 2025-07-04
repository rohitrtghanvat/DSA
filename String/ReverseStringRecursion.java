/*
 * 🔁 Reverse String using Recursion
 * -----------------------------------
 * ✅ Time Complexity: O(n)
 * ✅ Space Complexity: O(n) - due to recursion stack
 * 💡 We swap characters from left and right using a helper function,
 *     reducing the problem size at each recursive call.
 */

package String;

public class ReverseStringRecursion {
    // 1. Recursive helper function to reverse characters from index l to r
    static void reverseStringRec(char[] s, int l, int r) {
        if (l >= r)
            return; // 🛑 Base case

        // 🔁 Swap characters at positions l and r
        char temp = s[l];
        s[l] = s[r];
        s[r] = temp;

        // 🔁 Recur with reduced range
        reverseStringRec(s, l + 1, r - 1);
    }

    // 2. Main function that converts the string to char array and calls recursion
    static String reverseString(String s) {
        char[] arr = s.toCharArray(); // Convert string to array
        reverseStringRec(arr, 0, arr.length - 1); // Call recursion
        return new String(arr); // Convert back to string
    }

    public static void main(String[] args) {
        String s = "abdcfe";
        System.out.println(reverseString(s)); // Output: efcdba
    }
}
