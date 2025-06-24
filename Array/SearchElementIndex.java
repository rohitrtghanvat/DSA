package Array;

import java.util.Scanner;

public class SearchElementIndex {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array :-");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        System.out.print("Enter values of Array:- ");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Which number you want to find ? = ");
        int x = sc.nextInt();

        boolean found = false ;
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                System.out.println("The number " + x + " is found at index: " + i);
                found = true;
            }
        }
        if (!found) {
            System.out.println("The number " + x + " is not present in the array.");
        }
        sc.close();
    }
}
