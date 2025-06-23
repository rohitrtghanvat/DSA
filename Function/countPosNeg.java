package Function;

import java.util.Scanner;

public class countPosNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positives = 0;
        int negatives = 0;
        int zeros = 0;
        char choice;

        do {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            // Count based on the number
            if (num > 0) {
                positives++;
            } else if (num < 0) {
                negatives++;
            } else {
                zeros++;
            }

            // Ask if user wants to continue
            System.out.print("Do you want to enter another number? (y/n): ");
            choice = sc.next().charAt(0); // read first character
        } while (choice == 'y' || choice == 'Y');

        // Print final result
        System.out.println("\n===== Summary =====");
        System.out.println("Positives: " + positives);
        System.out.println("Negatives: " + negatives);
        System.out.println("Zeros: " + zeros);

        sc.close();
    }
}
