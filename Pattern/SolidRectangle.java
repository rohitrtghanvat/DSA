// Enter how many rows you want :-5
// Enter how many column you want :-5
// *****
// *****
// *****
// *****
// *****
package Pattern;

import java.util.Scanner;

public class SolidRectangle {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many rows you want :-");
        int n = sc.nextInt(); // n = rows

        System.out.print("Enter how many column you want :-");
        int m = sc.nextInt();// m = column

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
