package String;

public class DeleteChar {
    // 🔸 In Java, strings are immutable — once created, they cannot be changed.
    // 🔸 So for operations like insertion or deletion, we use StringBuilder,
    // which is mutable and more efficient for such modifications.
    public static String deletechar(String s, char ch) {
        StringBuilder newstr = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != ch) {
                newstr.append(c);
            }
        }
        return newstr.toString();
    }

    public static void main(String args[]) {
        String s = "Hello";
        char ch = 'l';
        System.out.println(deletechar(s, ch)); // Output: Heo
    }
}
