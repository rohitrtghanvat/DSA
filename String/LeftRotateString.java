package String;

/*
 * 🔄 Left Rotate String by d Positions
 * ------------------------------------
 * ✅ Time Complexity: O(n * d)
 * ✅ Space Complexity: O(n)
 * 💡 This method shifts characters to the left one at a time for d rotations.
 * ⚠️ This can be optimized to O(n) using slicing or reversal algorithm.
 */

public class LeftRotateString {
    // Function to left-rotate a string by d positions
    static String rotateString(String s, int d) {
        char[] charArray = s.toCharArray(); // Convert string to char array
        int n = charArray.length;

        // Perform left rotation d times
        for (int i = 0; i < d; i++) {
            char first = charArray[0]; // Store the first character

            // Shift characters to the left
            for (int j = 0; j < n - 1; j++) {
                charArray[j] = charArray[j + 1];
            }

            // Place the first character at the end
            charArray[n - 1] = first;
        }

        return new String(charArray); // Convert back to string
    }

    public static void main(String[] args) {
        String s = "GeeksforGeeks";
        int d = 2;

        String rotatedString = rotateString(s, d);
        System.out.println("Rotated String: " + rotatedString); // Output: eksforGeeksGe
    }
}
