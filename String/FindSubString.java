package String;

public class FindSubString {

    // Static method to allow direct calling from main
    public static int FindString(String txt, String pat) {
        int n = txt.length();
        int m = pat.length();

        for (int i = 0; i <= n - m; i++) {

            // Check for substring match
            int j;
            for (j = 0; j < m; j++) {
                if (txt.charAt(i + j) != pat.charAt(j)) {
                    break;  // Mismatch
                }
            }

            // If full pattern was matched
            if (j == m) {
                return i;  // Match found at index i
            }
        }

        return -1;  // No match
    }

    public static void main(String args[]) {
        String txt = "Find text in String";
        String pat = "ring";

        int index = FindString(txt, pat);
        if (index != -1) {
            System.out.println("Substring found at index: " + index);
        } else {
            System.out.println("Substring not found.");
        }
    }
}
