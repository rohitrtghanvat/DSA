package String;

/*
 * 🔁 Left Rotate a String by d Positions
 * ---------------------------------------
 * ✅ Approach 1: Character-by-character shifting (Brute force)
 * ✅ Approach 2: Using temporary array (Efficient)
 * ✅ Time Complexity: O(n) for both
 * ✅ Space Complexity:
 *    - O(1) for shifting
 *    - O(n) for temp array
 */

public class LeftRotateUsingTempArrayString {

    // Approach 1: Rotate using character shifting
    static String rotateByShifting(String s, int d) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        d = d % n; // Handle if d > n

        for (int i = 0; i < d; i++) {
            char first = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = first;
        }

        return new String(arr);
    }

    // Approach 2: Rotate using temporary array
    static String rotateUsingTempArray(String s, int d) {
        int n = s.length();
        d = d % n;

        char[] temp = new char[n];

        // Copy remaining part
        for (int i = 0; i < n - d; i++) {
            temp[i] = s.charAt(d + i);
        }

        // Copy first d characters to end
        for (int i = 0; i < d; i++) {
            temp[n - d + i] = s.charAt(i);
        }

        return new String(temp);
    }

    public static void main(String[] args) {
        String s = "abcdef";
        int d = 2;

        System.out.println("🔹 Using shifting: " + rotateByShifting(s, d));
        System.out.println("🔹 Using temp array: " + rotateUsingTempArray(s, d));
    }
}
