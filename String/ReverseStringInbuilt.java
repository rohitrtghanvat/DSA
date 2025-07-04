package String;

public class ReverseStringInbuilt {
    static String stringReverse(String s) {
        // 🔹 Create a mutable StringBuilder with the original string
        StringBuilder res = new StringBuilder(s);

        // 🔹 Use built-in reverse() method of StringBuilder
        res.reverse();

        // 🔹 Convert back to string and return
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "abdcfe";
        System.out.println(stringReverse(s)); // Output: efcdba
    }
}
