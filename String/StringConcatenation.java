package String;

public class StringConcatenation {

    // 🔸 Method 1: Manual concatenation using StringBuilder
    // 🔸 Useful in interviews to demonstrate understanding of string immutability
    public static String concat(String s1, String s2) {
        StringBuilder res = new StringBuilder();

        // Append s1 to res
        for (char c : s1.toCharArray()) {
            res.append(c);
        }

        // Append s2 to res
        for (char c : s2.toCharArray()) {
            res.append(c);
        }

        return res.toString();
    }

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = " world";

        // Call the function to concatenate the strings manually
        String res = concat(s1, s2);
        System.out.println(res); // Output: Hello world

        // 🔸 Method 2: Using '+' operator (quick and easy, recommended for basic use)
        // String res = s1 + s2;
        // System.out.println(res);
    }
}
