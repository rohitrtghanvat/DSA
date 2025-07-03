package String;

public class CompareString {

    // Method 1: Using built-in equals (commented out)
    // public static boolean areStringsSame(String s1, String s2) {
    // return s1.equals(s2);
    // }

    // 🔸 Method 2: Manual character-by-character comparison
    public static boolean StringsEqual(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]) {
        String s1 = "Hello";
        String s2 = "Hello";

        if (StringsEqual(s1, s2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
