package String;

// Java program to reverse a string using backward traversal
public class ReverseString {

    // Function to reverse a string using backward loop
    static String reverseString(String s) {
        // StringBuilder is used for mutable string operations
        StringBuilder res = new StringBuilder();

        // Traverse the string from end to start
        for (int i = s.length() - 1; i >= 0; i--) {
            res.append(s.charAt(i)); // Add each character in reverse order
        }

        // Convert StringBuilder to String and return
        return res.toString();
    }

    public static void main(String args[]) {
        String s = "Hello World !";
        String res = reverseString(s);
        System.out.print(res); // Output: ! dlroW olleH
    }
}
