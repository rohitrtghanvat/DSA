package String;

public class SearchChar {
    // function to find the first occurrence of ch in s
    static int findChar(String s, char ch) {
        int n = s.length();
        for (int i = 0; i < n; i++) {
            // If the current character is equal to ch,
            // return the current index
            if (s.charAt(i) == ch) {
                return i;
            }
        }
        // If we did not find any occurrence of ch,
        // return -1
        return -1;
    }

    public static void main(String args[]) {
        String s = "Search using index match";
        // 0123456789
        char ch = 'i';

        System.out.print(" index :- " + findChar(s, ch));
    }
}

// Time Comlixty :- Best Case = O(1)
// Worst Case = O(n)
// output
// index :- 9
